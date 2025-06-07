package lk.ijse.cmjd108.LibMgmt.service.impl;

import lk.ijse.cmjd108.LibMgmt.dao.BookDao;
import lk.ijse.cmjd108.LibMgmt.dto.BookDto;
import lk.ijse.cmjd108.LibMgmt.entities.BookEntity;
import lk.ijse.cmjd108.LibMgmt.service.BookService;
import lk.ijse.cmjd108.LibMgmt.util.EntityDTOConvertion;
import lk.ijse.cmjd108.LibMgmt.util.UtilData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import lk.ijse.cmjd108.LibMgmt.exception.BookNotFoundException;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class BookServiceImpl implements BookService {

    private final EntityDTOConvertion entityDTOConvertion;
    private final BookDao bookDao;

    @Autowired
    public BookServiceImpl(EntityDTOConvertion entityDTOConvertion, BookDao bookDao) {
        this.entityDTOConvertion = entityDTOConvertion;
        this.bookDao = bookDao;
    }

    @Override
    public void addBook(BookDto bookDto) {
        //Business Process
        bookDto.setBookId(UtilData.generateBookId());
        bookDto.setLastUpdateDate(UtilData.generateTodayDate());
        bookDto.setLastUpdateTime(UtilData.generateCurrentTime());

        //pass to Dao
        var bookEntity = entityDTOConvertion.convertBookDTOTOBookEntity(bookDto);
        bookDao.save(bookEntity);
    }

    @Override
    public void deleteBook(String bookId) {
        //is AvlbleAdd commentMore actions
        Optional<BookEntity> foundBook = bookDao.findById(bookId);
        if(!foundBook.isPresent()){
            throw new BookNotFoundException("Book not found");
        }
        bookDao.deleteById(bookId);

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
