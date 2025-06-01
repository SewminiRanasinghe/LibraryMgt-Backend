package lk.ijse.cmjd108.LibMgmt.entities;

import jakarta.persistence.*;
import java.sql.Time;
import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "book")
public class BookEntity {
    @Id
    private String bookId;
    private String bookName;
    private String author;
    private String edition;
    private String publisher;
    private String isbn;
    private Double price;
    private Integer totalQty;
    private Integer avilableQty;
    private LocalDate lastUpdateDate;
    private Time lastUpdateTime;
    @OneToMany(mappedBy = "book",cascade = CascadeType.ALL,orphanRemoval = true)
    private List<LendingEntity> lendings;

    public BookEntity() {
    }

    public BookEntity(String author, Integer avilableQty, String bookId, String bookName, String edition, String isbn, LocalDate lastUpdateDate, Time lastUpdateTime, List<LendingEntity> lendings, Double price, String publisher, Integer totalQty) {
        this.author = author;
        this.avilableQty = avilableQty;
        this.bookId = bookId;
        this.bookName = bookName;
        this.edition = edition;
        this.isbn = isbn;
        this.lastUpdateDate = lastUpdateDate;
        this.lastUpdateTime = lastUpdateTime;
        this.lendings = lendings;
        this.price = price;
        this.publisher = publisher;
        this.totalQty = totalQty;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Integer getAvilableQty() {
        return avilableQty;
    }

    public void setAvilableQty(Integer avilableQty) {
        this.avilableQty = avilableQty;
    }

    public String getBookId() {
        return bookId;
    }

    public void setBookId(String bookId) {
        this.bookId = bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getEdition() {
        return edition;
    }

    public void setEdition(String edition) {
        this.edition = edition;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public LocalDate getLastUpdateDate() {
        return lastUpdateDate;
    }

    public void setLastUpdateDate(LocalDate lastUpdateDate) {
        this.lastUpdateDate = lastUpdateDate;
    }

    public Time getLastUpdateTime() {
        return lastUpdateTime;
    }

    public void setLastUpdateTime(Time lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
    }

    public List<LendingEntity> getLendings() {
        return lendings;
    }

    public void setLendings(List<LendingEntity> lendings) {
        this.lendings = lendings;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public Integer getTotalQty() {
        return totalQty;
    }

    public void setTotalQty(Integer totalQty) {
        this.totalQty = totalQty;
    }

    @Override
    public String toString() {
        return "BookEntity{" +
                "author='" + author + '\'' +
                ", bookId='" + bookId + '\'' +
                ", bookName='" + bookName + '\'' +
                ", edition='" + edition + '\'' +
                ", publisher='" + publisher + '\'' +
                ", isbn='" + isbn + '\'' +
                ", price=" + price +
                ", totalQty=" + totalQty +
                ", avilableQty=" + avilableQty +
                ", lastUpdateDate=" + lastUpdateDate +
                ", lastUpdateTime=" + lastUpdateTime +
                ", lendings=" + lendings +
                '}';
    }
}
