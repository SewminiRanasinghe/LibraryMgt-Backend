package lk.ijse.cmjd108.LibMgmt.service.impl;

import lk.ijse.cmjd108.LibMgmt.dto.MemberDto;
import lk.ijse.cmjd108.LibMgmt.service.MemberService;
import lk.ijse.cmjd108.LibMgmt.util.UtilData;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class MemberServiceImpl implements MemberService {
    @Override
    public void saveMember(MemberDto member) {
        member.setMemberId(UtilData.generateMemberId());
        System.out.println(member.toString());
    }

    @Override
    public void updateMember(String memberId, MemberDto member) {

    }

    @Override
    public void deleteMember(String memberId) {

    }

    @Override
    public MemberDto getSelectedMember(String memberId) {
        MemberDto member = new MemberDto();
        member.setMemberId("M1234");
        member.setName("John");
        member.setEmail("john23@gmail.com");
        member.setMembershipDate("2025-02-25");
        return member;
    }

    @Override
    public List<MemberDto> getAllMembers() {
        List<MemberDto> members = new ArrayList<>();

        MemberDto member1 = new MemberDto();
        member1.setMemberId("M001");
        member1.setName("John");
        member1.setEmail("john23@gmail.com");
        member1.setMembershipDate("2025-02-25");
        members.add(member1);

        MemberDto member2 = new MemberDto();
        member2.setMemberId("M002");
        member2.setName("John");
        member2.setEmail("john23@gmail.com");
        member2.setMembershipDate("2025-02-25");
        members.add(member2);

        MemberDto member3 = new MemberDto();
        member3.setMemberId("M003");
        member3.setName("John");
        member3.setEmail("john23@gmail.com");
        member3.setMembershipDate("2025-02-25");
        members.add(member3);

        MemberDto member4 = new MemberDto();
        member4.setMemberId("M004");
        member4.setName("John");
        member4.setEmail("john23@gmail.com");
        member4.setMembershipDate("2025-02-25");
        members.add(member4);

        return members;

    }
}
