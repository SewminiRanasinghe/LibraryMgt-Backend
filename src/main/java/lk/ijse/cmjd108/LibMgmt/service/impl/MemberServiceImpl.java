package lk.ijse.cmjd108.LibMgmt.service.impl;

import lk.ijse.cmjd108.LibMgmt.dao.MemberDao;
import lk.ijse.cmjd108.LibMgmt.dto.MemberDto;
import lk.ijse.cmjd108.LibMgmt.exception.MemberNotFoundException;
import lk.ijse.cmjd108.LibMgmt.service.MemberService;
import lk.ijse.cmjd108.LibMgmt.util.EntityDTOConvertion;
import lk.ijse.cmjd108.LibMgmt.util.UtilData;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
@Service
public class MemberServiceImpl implements MemberService {

    private final MemberDao memberDao;
    private final EntityDTOConvertion entityDTOConvertion;

    public MemberServiceImpl(MemberDao memberDao, EntityDTOConvertion entityDTOConvertion) {
        this.memberDao = memberDao;
        this.entityDTOConvertion = entityDTOConvertion;
    }

    @Override
    public void saveMember(MemberDto member) {
        member.setMemberId(UtilData.generateMemberId());
        member.setMembershipDate(UtilData.generateTodayDate());
        memberDao.save(entityDTOConvertion.convertMemberDtoToMemberEntity(member));
    }

    @Override
    public void updateMember(String memberId, MemberDto member) {
        var selectedMember = memberDao.findById(memberId);
        if(!selectedMember.isPresent()){
            throw new MemberNotFoundException("Memeber not found !");
        }
        selectedMember.get().setEmail(member.getEmail());
        selectedMember.get().setName(member.getName());
        selectedMember.get().setMembershipDate(UtilData.generateTodayDate());
    }

    @Override
    public void deleteMember(String memberId) {

        if(!memberDao.findById(memberId).isPresent()){
            throw new MemberNotFoundException("Member details not exist");
        }
        memberDao.deleteById(memberId);
    }

    @Override
    public MemberDto getSelectedMember(String memberId) {
        if(!memberDao.findById(memberId).isPresent()){
            throw new MemberNotFoundException("Member details not exist");
        }
        return entityDTOConvertion.convertMemberEntityTOMemberDTO(memberDao.getReferenceById(memberId));
    }

    @Override
    public List<MemberDto> getAllMembers() {
        return entityDTOConvertion.toMemberDtoList(memberDao.findAll());

    }
}
