package lk.ijse.cmjd108.LibMgmt.service.impl;

import lk.ijse.cmjd108.LibMgmt.dto.BookDto;
import lk.ijse.cmjd108.LibMgmt.service.BookService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements BookService {
    @Override
    public void addBook(BookDto bookDto) {

    }

    @Override
    public void deleteBook(String bookId) {

    }

    @Override
    public void updateBook(String bookId, BookDto bookDto) {

    }

    @Override
    public BookDto getSelectedBook(String bookId) {
        return null;
    }

    @Override
    public List<BookDto> getAllBooks(BookDto bookDto) {
        return List.of();
    }
}
