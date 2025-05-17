package lk.ijse.cmjd108.LibMgmt.controller;

import lk.ijse.cmjd108.LibMgmt.dto.LendingDto;
import lk.ijse.cmjd108.LibMgmt.service.LendingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/lending")
public class LendingController {
    private LendingService lendingService;

    @Autowired
    public LendingController(LendingService lendingService) {
        this.lendingService = lendingService;
    }

    @GetMapping("health")
    public String healthTest(){
        return "lending controller is running";
    }

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Void> addLending(@RequestBody LendingDto lendingDto){
        lendingService.addLendingData(lendingDto);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @DeleteMapping
    public ResponseEntity<Void> deleteLending(@RequestParam("lendingId") String lendingId){
        lendingService.deleteLendingData(lendingId);
        return ResponseEntity.noContent().build();
    }

    @PatchMapping(value = "/{lendingId}",consumes = MediaType.APPLICATION_JSON_VALUE )
    public ResponseEntity<Void> handOverBook(@PathVariable String lendingId, @RequestBody LendingDto lendingDto){
        lendingService.handOverBook(lendingId,lendingDto);
        return ResponseEntity.noContent().build();
    }

    @GetMapping("{lendingId}")
    public ResponseEntity<LendingDto> getSelectedLending(@PathVariable String lendingId){
        return ResponseEntity.ok(lendingService.getSelectedLendingData(lendingId));
    }

    @GetMapping
    public ResponseEntity<List<LendingDto>> getAllLendings(){
        return ResponseEntity.ok(lendingService.getAllLendingData());
    }

}
