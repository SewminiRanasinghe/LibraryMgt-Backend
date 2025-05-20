package lk.ijse.cmjd108.LibMgmt.service;

import lk.ijse.cmjd108.LibMgmt.dto.StaffDto;

import java.util.List;

public interface StaffService {
    void saveStaff(StaffDto staffDto);
    void updateStaff(String staffId,StaffDto staffDto);
    void deleteStaff(String staffId);
    StaffDto getSelectedStaff(String staffId);
    List<StaffDto> getAllStaff();
}
