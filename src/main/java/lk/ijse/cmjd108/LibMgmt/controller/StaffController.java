package lk.ijse.cmjd108.LibMgmt.controller;

import lk.ijse.cmjd108.LibMgmt.dto.StaffDto;
import lk.ijse.cmjd108.LibMgmt.service.StaffService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/staff")
public class StaffController {

    private StaffService staffService;

    @Autowired
    public StaffController(StaffService staffService) {
        this.staffService = staffService;
    }

    @GetMapping("health")
    public String healthTest(){
        return "staff controller is running";
    }

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Void> addStaff(@RequestBody StaffDto staffDto){
        staffService.saveStaff(staffDto);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @DeleteMapping
    public ResponseEntity<Void> deleteStaff(@RequestParam("staffId") String staffId){
        staffService.deleteStaff(staffId);
        return ResponseEntity.noContent().build();
    }

    @PatchMapping(value = "/{staffId}",consumes = MediaType.APPLICATION_JSON_VALUE )
    public ResponseEntity<Void> updateStaff(@PathVariable String staffId, @RequestBody StaffDto staffDto){
        staffService.updateStaff(staffId,staffDto);
        return ResponseEntity.noContent().build();
    }

    @GetMapping("{staffId}")
    public ResponseEntity<StaffDto> getSelectedStaff(@PathVariable String staffId){
        return ResponseEntity.ok(staffService.getSelectedStaff(staffId));
    }

    @GetMapping
    public ResponseEntity<List<StaffDto>> getAllStaffMembers(){
        return ResponseEntity.ok(staffService.getAllStaff());
    }

}
