package lk.ijse.cmjd108.LibMgmt.service.impl;

import lk.ijse.cmjd108.LibMgmt.dao.BookDao;
import lk.ijse.cmjd108.LibMgmt.dao.LendingDao;
import lk.ijse.cmjd108.LibMgmt.dao.MemberDao;
import lk.ijse.cmjd108.LibMgmt.dto.LendingDto;
import lk.ijse.cmjd108.LibMgmt.entities.BookEntity;
import lk.ijse.cmjd108.LibMgmt.entities.MemberEntity;
import lk.ijse.cmjd108.LibMgmt.exception.BookNotFoundException;
import lk.ijse.cmjd108.LibMgmt.exception.EnoughBooksNotFoundException;
import lk.ijse.cmjd108.LibMgmt.exception.MemberNotFoundException;
import lk.ijse.cmjd108.LibMgmt.service.LendingService;
import lk.ijse.cmjd108.LibMgmt.util.EntityDTOConvertion;
import lk.ijse.cmjd108.LibMgmt.util.LendingMapping;
import lk.ijse.cmjd108.LibMgmt.util.UtilData;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.List;

@Service
public class LendingSerivceImpl implements LendingService {

    @Value("${finePerDay}")
    private Double finePerDay;
    private final LendingMapping lendingMapping;
    private final BookDao bookDao;
    private final MemberDao memberDao;
    private final LendingDao lendingDao;
    private final EntityDTOConvertion entityDTOConvertion;

    public LendingSerivceImpl(LendingMapping lendingMapping, BookDao bookDao, MemberDao memberDao, LendingDao lendingDao, EntityDTOConvertion entityDTOConvertion) {
        this.lendingMapping = lendingMapping;
        this.bookDao = bookDao;
        this.memberDao = memberDao;
        this.lendingDao = lendingDao;
        this.entityDTOConvertion = entityDTOConvertion;
    }


    @Override
    public void addLendingData(LendingDto lendingDto) {
        //relevant book
        //relevant member
        String bookId = lendingDto.getBook();
        String memberId = lendingDto.getMember();
        BookEntity bookEntity = bookDao.findById(bookId).orElseThrow(()-> new BookNotFoundException("Book not Found"));
        MemberEntity memberEntity = memberDao.findById(memberId).orElseThrow(()-> new MemberNotFoundException("Member not found"));

        //check the availability of book
        if (bookDao.availableQty(bookId)>0){
            //Books are available

        }else{
            throw new EnoughBooksNotFoundException("Not enough books to proceed")
        }


        lendingDto.setLendingId(UtilData.generateLendingId());
        lendingDto.setLendingDate(UtilData.generateTodayDate());
        lendingDto.setReturnDate(UtilData.generateReturnDate());
        lendingDto.setActiveLending(true);
        lendingDto.setFineAmount(0.00);
        lendingDto.setOverDueDays(0L);
        System.out.okility of boprintln(lendingDto);
    }

    @Override
    public void handOverBook(String lendingId) {

    }

    @Override
    public void deleteLendingData(String lendingId) {

    }

    @Override
    public LendingDto getSelectedLendingData(String lendingId) {
      return null;
    }

    @Override
    public List<LendingDto> getAllLendingData() {
        return null;

    }
    private Long calOverDue(){
        LocalDate today = UtilData.generateTodayDate();
        LocalDate returnDate = UtilData.calReturnDate();
        if(returnDate.isBefore(today)){
            return ChronoUnit.DAYS.between(today,returnDate);
        }
        return 0L;
    }

    private Double calFine(Long dayCount){
        return dayCount*finePerDay;
    }
}
