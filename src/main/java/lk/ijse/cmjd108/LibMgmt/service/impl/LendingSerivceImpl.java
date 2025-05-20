package lk.ijse.cmjd108.LibMgmt.service.impl;

import lk.ijse.cmjd108.LibMgmt.dto.LendingDto;
import lk.ijse.cmjd108.LibMgmt.service.LendingService;
import lk.ijse.cmjd108.LibMgmt.util.UtilData;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class LendingSerivceImpl implements LendingService {
    @Override
    public void addLendingData(LendingDto lendingDto) {
        lendingDto.setLendingId(UtilData.generateLendingId());
        System.out.println(lendingDto);
    }

    @Override
    public void handOverBook(String lendingId, LendingDto lendingDto) {

    }

    @Override
    public void deleteLendingData(String lendingId) {

    }

    @Override
    public LendingDto getSelectedLendingData(String lendingId) {
        LendingDto lendingData = new LendingDto();
        lendingData.setLendingId("L123");
        lendingData.setBook("The Greate Gatsby");
        lendingData.setMember("M1234");
        lendingData.setLendingDate("01-01-2025");
        lendingData.setReturnDate("14-01-2025");
        lendingData.setOverDueDays(2L);
        lendingData.setFineAmount(5.00);
        return lendingData;
    }

    @Override
    public List<LendingDto> getAllLendingData() {
        List<LendingDto> lendingDtos= new ArrayList<>();

        LendingDto lendingData1 = new LendingDto();
        lendingData1.setLendingId("L001");
        lendingData1.setBook("The Greate Gatsby");
        lendingData1.setMember("M1234");
        lendingData1.setLendingDate("01-01-2025");
        lendingData1.setReturnDate("14-01-2025");
        lendingData1.setOverDueDays(2L);
        lendingData1.setFineAmount(5.00);
        lendingDtos.add(lendingData1);

        LendingDto lendingData2 = new LendingDto();
        lendingData2.setLendingId("L002");
        lendingData2.setBook("The Greate Gatsby");
        lendingData2.setMember("M1234");
        lendingData2.setLendingDate("01-01-2025");
        lendingData2.setReturnDate("14-01-2025");
        lendingData2.setOverDueDays(2L);
        lendingData2.setFineAmount(5.00);
        lendingDtos.add(lendingData2);

        LendingDto lendingData3 = new LendingDto();
        lendingData3.setLendingId("L003");
        lendingData3.setBook("The Greate Gatsby");
        lendingData3.setMember("M1234");
        lendingData3.setLendingDate("01-01-2025");
        lendingData3.setReturnDate("14-01-2025");
        lendingData3.setOverDueDays(2L);
        lendingData3.setFineAmount(5.00);
        lendingDtos.add(lendingData3);

        LendingDto lendingData4 = new LendingDto();
        lendingData4.setLendingId("L004");
        lendingData4.setBook("The Greate Gatsby");
        lendingData4.setMember("M1234");
        lendingData4.setLendingDate("01-01-2025");
        lendingData4.setReturnDate("14-01-2025");
        lendingData4.setOverDueDays(2L);
        lendingData4.setFineAmount(5.00);
        lendingDtos.add(lendingData4);

        return lendingDtos;

    }
}
