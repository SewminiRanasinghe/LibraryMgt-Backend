package lk.ijse.cmjd108.LibMgmt.service;

import lk.ijse.cmjd108.LibMgmt.dto.LendingDto;

import java.util.List;

public interface LendingService {
    void addLendingData(LendingDto lendingDto);
    void handOverBook(String lendingId, LendingDto lendingDto);
    void deleteLendingData(String lendingId);
    LendingDto getSelectedLendingData(String lendingId);
    List<LendingDto> getAllLendingData();
}
