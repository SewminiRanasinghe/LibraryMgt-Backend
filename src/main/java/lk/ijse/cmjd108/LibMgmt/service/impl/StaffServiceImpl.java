package lk.ijse.cmjd108.LibMgmt.service.impl;

import lk.ijse.cmjd108.LibMgmt.dao.StaffDao;
import lk.ijse.cmjd108.LibMgmt.dto.StaffDto;
import lk.ijse.cmjd108.LibMgmt.service.StaffService;
import lk.ijse.cmjd108.LibMgmt.util.EntityDTOConvertion;
import lk.ijse.cmjd108.LibMgmt.util.UtilData;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StaffServiceImpl implements StaffService {
    private final StaffDao staffDao;
    private final EntityDTOConvertion entityDTOConvertion;

    public StaffServiceImpl(StaffDao staffDao, EntityDTOConvertion entityDTOConvertion) {
        this.staffDao = staffDao;
        this.entityDTOConvertion = entityDTOConvertion;
    }


    @Override
    public void saveStaff(StaffDto staffDto) {
        staffDto.setStaffId(UtilData.generateStaffId());
        staffDto.setJoinDate(UtilData.generateTodayDate());
        staffDao.save(entityDTOConvertion.convertStaffDtoToStaffEntity(staffDto));
    }

    @Override
    public void updateStaff(String staffId,StaffDto staffDto) {

    }

    @Override
    public void deleteStaff(String staffId) {

    }

    @Override
    public StaffDto getSelectedStaff(String staffId) {
        return null;
    }

    @Override
    public List<StaffDto> getAllStaff() {
       return null;

    }
}
