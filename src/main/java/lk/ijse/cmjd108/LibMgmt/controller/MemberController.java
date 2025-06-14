package lk.ijse.cmjd108.LibMgmt.controller;

import lk.ijse.cmjd108.LibMgmt.dto.MemberDto;
import lk.ijse.cmjd108.LibMgmt.exception.MemberNotFoundException;
import lk.ijse.cmjd108.LibMgmt.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/members")
public class MemberController {
    @Autowired
    private MemberService memberService;

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Void> addMember(@RequestBody MemberDto memberDto){
        if(memberDto == null){
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
        memberService.saveMember(memberDto);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @DeleteMapping
    public ResponseEntity<Void> deleteMember(@RequestParam("memberId") String memberId){
        if(memberId == null){
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
        try {
            memberService.deleteMember(memberId);
            return ResponseEntity.noContent().build();
        }catch (MemberNotFoundException e){
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }catch (Exception e){
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PatchMapping(value = "/{memberId}",consumes = MediaType.APPLICATION_JSON_VALUE )
    public ResponseEntity<Void> updateMember(@PathVariable String memberId, @RequestBody MemberDto memberDto){
        if(memberId == null || memberDto == null){
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
        try{
            memberService.updateMember(memberId,memberDto);
            return ResponseEntity.noContent().build();
        } catch (MemberNotFoundException e) {
            e.printStackTrace();
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
        catch (Exception e) {
            e.printStackTrace();
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }

    }

    @GetMapping("{memberId}")
    public ResponseEntity<MemberDto> getSelectedMember(@PathVariable String memberId){
        return ResponseEntity.ok(memberService.getSelectedMember(memberId));
    }

    @GetMapping
    public ResponseEntity<List<MemberDto>> getAllMembers(){
        return ResponseEntity.ok(memberService.getAllMembers());
    }

}
