package lk.ijse.cmjd108.LibMgmt.util;

import lk.ijse.cmjd108.LibMgmt.dto.BookDto;
import lk.ijse.cmjd108.LibMgmt.entities.BookEntity;
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
}
