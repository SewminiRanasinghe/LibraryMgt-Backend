package lk.ijse.cmjd108.LibMgmt.dto;

import java.io.Serializable;

public class BookDto implements Serializable {
    private String bookId;
    private String bookName;
    private String author;
    private String edition;
    private String publisher;
    private String isbn;
    private Double price;
    private Integer totalQty;
    private Integer availableQty;
    private String lastUpdateDate;
    private String lastUpdateTime;

    public BookDto(String author, Integer availableQty, String bookId, String bookName, String edition, String isbn, String lastUpdateDate, String lastUpdateTime, Double price, String publisher, Integer totalQty) {
        this.author = author;
        this.availableQty = availableQty;
        this.bookId = bookId;
        this.bookName = bookName;
        this.edition = edition;
        this.isbn = isbn;
        this.lastUpdateDate = lastUpdateDate;
        this.lastUpdateTime = lastUpdateTime;
        this.price = price;
        this.publisher = publisher;
        this.totalQty = totalQty;
    }

    public BookDto(){

    }

    public BookDto(String author) {
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Integer getAvailableQty() {
        return availableQty;
    }

    public void setAvailableQty(Integer availableQty) {
        this.availableQty = availableQty;
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

    public String getLastUpdateDate() {
        return lastUpdateDate;
    }

    public void setLastUpdateDate(String lastUpdateDate) {
        this.lastUpdateDate = lastUpdateDate;
    }

    public String getLastUpdateTime() {
        return lastUpdateTime;
    }

    public void setLastUpdateTime(String lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
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
}
