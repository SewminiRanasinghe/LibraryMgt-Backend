package lk.ijse.cmjd108.LibMgmt.controller;

import lk.ijse.cmjd108.LibMgmt.dto.BookDto;
import lk.ijse.cmjd108.LibMgmt.exception.BookNotFoundException;
import lk.ijse.cmjd108.LibMgmt.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/books")

public class BookController {

    @Autowired
    private BookService bookService;

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Void> addBook(@RequestBody BookDto bookDto){
        if(bookDto == null){
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
        bookService.addBook(bookDto);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @DeleteMapping
    public ResponseEntity<Void> deleteBook(@RequestParam("bookId") String bookId){
        if(bookId == null){
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
        try {
            bookService.deleteBook(bookId);
            return ResponseEntity.noContent().build();
        }catch (BookNotFoundException e){
            e.printStackTrace();
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }catch (Exception e){
            e.printStackTrace();
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }

    }

    @PatchMapping(value = "/{bookId}",consumes = MediaType.APPLICATION_JSON_VALUE )
    public ResponseEntity<Void> updateBook(@PathVariable String bookId, @RequestBody BookDto bookDto){
        if(bookId == null || bookDto == null){
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
        try{
            bookService.updateBook(bookId,bookDto);
            return ResponseEntity.noContent().build();
        }catch (BookNotFoundException e){
            e.printStackTrace();
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }catch (Exception e){
            e.printStackTrace();
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }

    }

    @GetMapping("{bookId}")
    public ResponseEntity<BookDto> getSelectedBook(@PathVariable String bookId){
        if(bookId == null){
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
        try{
            var selectedBook = bookService.getSelectedBook(bookId);
            return ResponseEntity.ok(selectedBook);
        }catch (BookNotFoundException e){
            e.printStackTrace();
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }catch (Exception e){
            e.printStackTrace();
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("getallbooks")
    public ResponseEntity<List<BookDto>> getAllBooks(){

        return ResponseEntity.ok(bookService.getAllBooks());
    }

}



