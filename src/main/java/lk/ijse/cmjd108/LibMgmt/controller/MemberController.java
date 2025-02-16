package lk.ijse.cmjd108.LibMgmt.controller;

import lk.ijse.cmjd108.LibMgmt.dto.MemberDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/v1/members")
public class MemberController {
    @GetMapping("health")
    public String healthTest(){
        return "member controller is running";
    }

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Void> addMember(@RequestBody MemberDto memberDto){
        System.out.println(memberDto);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @DeleteMapping
    public ResponseEntity<Void> deleteMember(@RequestParam("memberId") String memberId){
        System.out.println(memberId);
        return ResponseEntity.noContent().build();
    }

    @PatchMapping(value = "/{memberId}",consumes = MediaType.APPLICATION_JSON_VALUE )
    public ResponseEntity<Void> updateMember(@PathVariable String memberId, @RequestBody MemberDto memberDto){
        System.out.println(memberId);
        System.out.println(memberDto);
        return ResponseEntity.noContent().build();
    }

    @GetMapping("{memberId}")
    public ResponseEntity<MemberDto> getSelectedStaff(@PathVariable String memberId){
        System.out.println("Selected book for "+memberId);
        return ResponseEntity.ok(new MemberDto());
    }

    public ResponseEntity<List<MemberDto>> getAllStaffMembers(){
        return ResponseEntity.ok(new ArrayList<>());
    }

}
