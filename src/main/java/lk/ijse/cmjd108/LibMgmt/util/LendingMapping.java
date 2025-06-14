package lk.ijse.cmjd108.LibMgmt.util;

import lk.ijse.cmjd108.LibMgmt.dto.LendingDto;
import lk.ijse.cmjd108.LibMgmt.entities.BookEntity;
import lk.ijse.cmjd108.LibMgmt.entities.LendingEntity;
import lk.ijse.cmjd108.LibMgmt.entities.MemberEntity;
import org.springframework.stereotype.Component;

@Component
public class LendingMapping {
    public static LendingDto toLendingDto(LendingEntity lendingEntity){
        var lendingDto = new LendingDto();
        lendingDto.setLendingId(lendingEntity.getLendingId());
        lendingDto.setBook(lendingEntity.getBook().getBookId());
        lendingDto.setMember(lendingEntity.getMember().getMemberId());
        lendingDto.setLendingDate(lendingEntity.getLendingDate());
        lendingDto.setReturnDate(lendingEntity.getReturnDate());
        lendingDto.setActiveLending(lendingEntity.getActiveLending());
        lendingDto.setOverDueDays(lendingEntity.getOverDueDays());
        lendingDto.setFineAmount(lendingEntity.getFineAmount());
        return lendingDto;
    }

    public static LendingEntity toLendingEntity(LendingDto lendingDto, BookEntity bookEntity, MemberEntity memberEntity){
        var lendingEntity = new LendingEntity();
        lendingEntity.setLendingId(lendingDto.getLendingId());
        lendingEntity.setBook(bookEntity);
        lendingEntity.setMember(memberEntity);
        lendingEntity.setLendingDate(lendingDto.getLendingDate());
        lendingEntity.setReturnDate(lendingDto.getReturnDate());
        lendingEntity.setActiveLending(lendingDto.getActiveLending());
        lendingEntity.setOverDueDays(lendingDto.getOverDueDays());
        lendingEntity.setFineAmount(lendingDto.getFineAmount());
        return lendingEntity;
    }
}
