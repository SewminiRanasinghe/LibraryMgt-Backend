package lk.ijse.cmjd108.LibMgmt.service;

import lk.ijse.cmjd108.LibMgmt.dto.BookDto;

import java.util.List;

public interface BookService {
    void addBook(BookDto bookDto);
    void deleteBook(String bookId);
    void updateBook(String bookId,BookDto bookDto);
    BookDto getSelectedBook(String bookId);
    List<BookDto> getAllBooks(BookDto bookDto);

}
