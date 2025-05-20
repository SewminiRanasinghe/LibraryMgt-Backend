package lk.ijse.cmjd108.LibMgmt.service.impl;

import lk.ijse.cmjd108.LibMgmt.dto.*;
import lk.ijse.cmjd108.LibMgmt.service.*;
import lk.ijse.cmjd108.LibMgmt.util.UtilData;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BookServiceImpl implements BookService {
    @Override
    public void addBook(BookDto bookDto) {
        //Business Process
        bookDto.setBookId(UtilData.generateBookId());
        System.out.println(bookDto);
    }

    @Override
    public void deleteBook(String bookId) {

    }

    @Override
    public void updateBook(String bookId, BookDto bookDto) {

    }

    @Override
    public BookDto getSelectedBook(String bookId) {
        return  (new BookDto(
                "Kamla",
                5,
                "B005",
                "Spring boot",
                "2015",
                "1452-25",
                "2024-10-15",
                "10.15",
                500.0,
                "Oxford",
                10
        ));
    }

    @Override
    public List<BookDto> getAllBooks() {
        List<BookDto> bookDtos = new ArrayList<>();
        bookDtos.add(new BookDto(
                "Kamla",
                5,
                "B001",
                "Spring boot",
                "2015",
                "1452-25",
                "2024-10-15",
                "10.15",
                500.0,
                "Oxford",
                10
        ));

        bookDtos.add(new BookDto(
                "Kamla",
                5,
                "B002",
                "Spring boot",
                "2015",
                "1452-25",
                "2024-10-15",
                "10.15",
                500.0,
                "Oxford",
                10
        ));

        bookDtos.add(new BookDto(
                "Kamla",
                5,
                "B003",
                "Spring boot",
                "2015",
                "1452-25",
                "2024-10-15",
                "10.15",
                500.0,
                "Oxford",
                10
        ));

        bookDtos.add(new BookDto(
                "Kamla",
                5,
                "B004",
                "Spring boot",
                "2015",
                "1452-25",
                "2024-10-15",
                "10.15",
                500.0,
                "Oxford",
                10
        ));

        bookDtos.add(new BookDto(
                "Kamla",
                5,
                "B005",
                "Spring boot",
                "2015",
                "1452-25",
                "2024-10-15",
                "10.15",
                500.0,
                "Oxford",
                10
        ));
        return bookDtos;

    }
}
