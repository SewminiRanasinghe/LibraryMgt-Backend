package lk.ijse.cmjd108.LibMgmt.controller;

import lk.ijse.cmjd108.LibMgmt.dto.BookDto;
import lk.ijse.cmjd108.LibMgmt.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/v1/books")
public class BookController {

    @Autowired
    private BookService bookService;

    @GetMapping("health")
    public String healthTest(){
        return "Book controller is running";
    }

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Void> addBook(@RequestBody BookDto bookDto){
        bookService.addBook(bookDto);
        System.out.println(bookDto);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @DeleteMapping
    public ResponseEntity<Void> deleteBook(@RequestParam("bookId") String bookId){
        System.out.println(bookId);
        return ResponseEntity.noContent().build();
    }

    @PatchMapping(value = "/{bookId}",consumes = MediaType.APPLICATION_JSON_VALUE )
    public ResponseEntity<Void> updateBook(@PathVariable String bookId, @RequestBody BookDto bookDto){
        System.out.println(bookId);
        System.out.println(bookDto);
        return ResponseEntity.noContent().build();
    }

    @GetMapping("{bookId}")
    public ResponseEntity<BookDto> getSelectedBook(@PathVariable String bookId){
        System.out.println("Selected book for "+bookId);
        return ResponseEntity.ok(new BookDto(
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

    @GetMapping
    public ResponseEntity<List<BookDto>> getAllBooks(){
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

        return ResponseEntity.ok(bookDtos);
    }

}



