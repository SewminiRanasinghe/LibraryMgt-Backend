package lk.ijse.cmjd108.LibMgmt.util;

import lk.ijse.cmjd108.LibMgmt.dto.BookDto;
import lk.ijse.cmjd108.LibMgmt.dto.MemberDto;
import lk.ijse.cmjd108.LibMgmt.dto.StaffDto;
import lk.ijse.cmjd108.LibMgmt.entities.BookEntity;
import lk.ijse.cmjd108.LibMgmt.entities.MemberEntity;
import lk.ijse.cmjd108.LibMgmt.entities.StaffEntity;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class EntityDTOConvertion {
    private final ModelMapper modelMapper;

    public EntityDTOConvertion(ModelMapper modelMapper) {
        this.modelMapper = modelMapper;
    }

    //Book
    public BookEntity convertBookDTOTOBookEntity(BookDto bookDto){
        return modelMapper.map(bookDto,BookEntity.class);
    }
    public BookDto convertBookEntityTOBookDTO(BookEntity bookEntity){
        return modelMapper.map(bookEntity,BookDto.class);
    }
    public List<BookDto> toBookDtoList(List<BookEntity> bookEntities){
        return modelMapper.map(bookEntities,new TypeToken<List<BookDto>>(){}.getType());
    }

    //Member
    public MemberEntity convertMemberDtoToMemberEntity(MemberDto memberDto){
        return modelMapper.map(memberDto,MemberEntity.class);
    }
    public MemberDto convertMemberEntityTOMemberDTO(MemberEntity memberEntity){
        return modelMapper.map(memberEntity,MemberDto.class);
    }

    public List<MemberDto> toMemberDtoList(List<MemberEntity> memberEntities){
        return modelMapper.map(memberEntities,new TypeToken<List<MemberDto>>(){}.getType());
    }

    //Staff
    public StaffEntity convertStaffDtoToStaffEntity(StaffDto staffDto){
        return modelMapper.map(staffDto, StaffEntity.class);
    }
    public StaffDto convertStaffEntityTOStaffDTO(StaffEntity staffEntity){
        return modelMapper.map(staffEntity,StaffDto.class);
    }

    public List<StaffDto> toStaffDtoList(List<StaffEntity> staffEntities){
        return modelMapper.map(staffEntities,new TypeToken<List<StaffDto>>(){}.getType());
    }
}
