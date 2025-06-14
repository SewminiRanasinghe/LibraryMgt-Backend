package lk.ijse.cmjd108.LibMgmt.controller;

import lk.ijse.cmjd108.LibMgmt.dto.StaffDto;
import lk.ijse.cmjd108.LibMgmt.exception.StaffNotFoundException;
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
    @Autowired
    private StaffService staffService;

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Void> addStaff(@RequestBody StaffDto staffDto){
        if (staffDto == null){
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
        staffService.saveStaff(staffDto);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @DeleteMapping
    public ResponseEntity<Void> deleteStaff(@RequestParam("staffId") String staffId){
        if(staffId == null){
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
        try {
            staffService.deleteStaff(staffId);
            return ResponseEntity.noContent().build();
        }catch (StaffNotFoundException e){
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }catch (Exception e){
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }

    }

    @PatchMapping(value = "/{staffId}",consumes = MediaType.APPLICATION_JSON_VALUE )
    public ResponseEntity<Void> updateStaff(@PathVariable String staffId, @RequestBody StaffDto staffDto){
        if(staffId == null){
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }try {
            staffService.updateStaff(staffId,staffDto);
            return ResponseEntity.noContent().build();
        }catch (StaffNotFoundException e){
            e.printStackTrace();
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }catch (Exception e){
            e.printStackTrace();
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }

    }

    @GetMapping("{staffId}")
    public ResponseEntity<StaffDto> getSelectedStaff(@PathVariable String staffId, @RequestBody StaffDto staffDto){
        if(staffId == null || staffDto == null){
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }try {
            staffService.updateStaff(staffId,staffDto);
            return ResponseEntity.noContent().build();
        }catch (StaffNotFoundException e){
            e.printStackTrace();
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }catch (Exception e){
            e.printStackTrace();
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }

    }

    @GetMapping
    public ResponseEntity<List<StaffDto>> getAllStaffMembers(){
        return ResponseEntity.ok(staffService.getAllStaff());
    }

}
