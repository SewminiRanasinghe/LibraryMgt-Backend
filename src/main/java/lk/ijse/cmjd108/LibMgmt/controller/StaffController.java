package lk.ijse.cmjd108.LibMgmt.controller;

import lk.ijse.cmjd108.LibMgmt.dto.StaffDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/v1/staff")
public class StaffController {

    @GetMapping("health")
    public String healthTest(){
        return "staff controller is running";
    }

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Void> addStaff(@RequestBody StaffDto staffDto){
        System.out.println(staffDto);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @DeleteMapping
    public ResponseEntity<Void> deleteStaff(@RequestParam("staffId") String staffId){
        System.out.println(staffId);
        return ResponseEntity.noContent().build();
    }

    @PatchMapping(value = "/{staffId}",consumes = MediaType.APPLICATION_JSON_VALUE )
    public ResponseEntity<Void> updateStaff(@PathVariable String staffId, @RequestBody StaffDto staffDto){
        System.out.println(staffId);
        System.out.println(staffDto);
        return ResponseEntity.noContent().build();
    }

    @GetMapping("{bookId}")
    public ResponseEntity<StaffDto> getSelectedStaff(@PathVariable String staffId){
        System.out.println("Selected book for "+staffId);
        return ResponseEntity.ok(new StaffDto());
    }

    public ResponseEntity<List<StaffDto>> getAllStaffMembers(){
        return ResponseEntity.ok(new ArrayList<>());
    }

}
