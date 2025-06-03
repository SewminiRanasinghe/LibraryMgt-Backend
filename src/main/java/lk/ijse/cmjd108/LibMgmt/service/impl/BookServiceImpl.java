package lk.ijse.cmjd108.LibMgmt.service.impl;

import lk.ijse.cmjd108.LibMgmt.dto.BookDto;
import lk.ijse.cmjd108.LibMgmt.service.BookService;
import lk.ijse.cmjd108.LibMgmt.util.UtilData;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements BookService {
    @Override
    public void addBook(BookDto bookDto) {
        //Business Process
        bookDto.setBookId(UtilData.generateBookId());
        bookDto.setLastUpdateDate(UtilData.generateTodayDate());
        bookDto.setLastUpdateTime(UtilData.generateCurrentTime());

        //pass to Dao

    }

    @Override
    public void deleteBook(String bookId) {

    }

    @Override
    public void updateBook(String bookId, BookDto bookDto) {

    }

    @Override
    public BookDto getSelectedBook(String bookId) {
        return  null;
    }

    @Override
    public List<BookDto> getAllBooks() {

        return null;

    }
}
