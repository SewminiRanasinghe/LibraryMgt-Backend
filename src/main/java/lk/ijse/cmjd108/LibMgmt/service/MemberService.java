package lk.ijse.cmjd108.LibMgmt.service;

//import lk.ijse.cmjd108.LibMgmt.dto.MemberDto;
import lk.ijse.cmjd108.LibMgmt.dto.MemberDto;

import java.util.List;


public interface MemberService {
    void saveMember(MemberDto member);
    void updateMember(String memberId,MemberDto member);
    void deleteMember(String memberId);
    MemberDto getSelectedMember(String memberId);
    List<MemberDto> getAllMembers();
}
