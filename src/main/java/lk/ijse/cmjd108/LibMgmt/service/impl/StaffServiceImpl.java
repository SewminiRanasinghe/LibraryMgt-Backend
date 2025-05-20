package lk.ijse.cmjd108.LibMgmt.service.impl;

import lk.ijse.cmjd108.LibMgmt.dto.StaffDto;
import lk.ijse.cmjd108.LibMgmt.service.StaffService;
import lk.ijse.cmjd108.LibMgmt.util.UtilData;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

import static lk.ijse.cmjd108.LibMgmt.dto.Role.LIBRARIAN;

@Service
public class StaffServiceImpl implements StaffService {
    @Override
    public void saveStaff(StaffDto staffDto) {
        staffDto.setStaffId(UtilData.generateStaffId());
        System.out.println(staffDto);
    }

    @Override
    public void updateStaff(String staffId,StaffDto staffDto) {

    }

    @Override
    public void deleteStaff(String staffId) {

    }

    @Override
    public StaffDto getSelectedStaff(String staffId) {
        StaffDto staff = new StaffDto();
        staff.setEmail("hash123@gmail.com");
        staff.setFirstName("Hash");
        staff.setLastName("Ruparathne");
        staff.setJoinDate("10-12-2012");
        staff.setPhone("0112291416");
        staff.setRole(LIBRARIAN);
        staff.setStaffId("S123");
        return staff;
    }

    @Override
    public List<StaffDto> getAllStaff() {
        List<StaffDto> staffDtos = new ArrayList<>();

        StaffDto staff1 = new StaffDto();
        staff1.setEmail("hash123@gmail.com");
        staff1.setFirstName("Hash");
        staff1.setLastName("Ruparathne");
        staff1.setJoinDate("10-12-2012");
        staff1.setPhone("0112291416");
        staff1.setRole(LIBRARIAN);
        staff1.setStaffId("S001");
        staffDtos.add(staff1);

        StaffDto staff2 = new StaffDto();
        staff2.setEmail("hash123@gmail.com");
        staff2.setFirstName("Hash");
        staff2.setLastName("Ruparathne");
        staff2.setJoinDate("10-12-2012");
        staff2.setPhone("0112291416");
        staff2.setRole(LIBRARIAN);
        staff2.setStaffId("S002");
        staffDtos.add(staff2);

        StaffDto staff3 = new StaffDto();
        staff3.setEmail("hash123@gmail.com");
        staff3.setFirstName("Hash");
        staff3.setLastName("Ruparathne");
        staff3.setJoinDate("10-12-2012");
        staff3.setPhone("0112291416");
        staff3.setRole(LIBRARIAN);
        staff3.setStaffId("S003");
        staffDtos.add(staff3);

        StaffDto staff4 = new StaffDto();
        staff4.setEmail("hash123@gmail.com");
        staff4.setFirstName("Hash");
        staff4.setLastName("Ruparathne");
        staff4.setJoinDate("10-12-2012");
        staff4.setPhone("0112291416");
        staff4.setRole(LIBRARIAN);
        staff4.setStaffId("S004");
        staffDtos.add(staff4);

        return staffDtos;

    }
}
