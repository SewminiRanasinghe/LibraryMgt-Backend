package lk.ijse.cmjd108.LibMgmt.dto;

import lombok.Data;

import java.io.Serializable;
import java.time.LocalDate;


@Data
public class LendingDto implements Serializable {
    private String lendingId;
    private String book;
    private String member;
    private LocalDate lendingDate;
    private LocalDate returnDate;
    private Boolean isActiveLending;
    private Long overDueDays;
    private Double fineAmount;

    @Override
    public String toString() {
        return "LendingDto{" +
                "book='" + book + '\'' +
                ", lendingId='" + lendingId + '\'' +
                ", member='" + member + '\'' +
                ", lendingDate='" + lendingDate + '\'' +
                ", returnDate='" + returnDate + '\'' +
                ", isActiveLending=" + isActiveLending +
                ", overDueDays=" + overDueDays +
                ", fineAmount=" + fineAmount +
                '}';
    }

    public LendingDto(String book, Double fineAmount, Boolean isActiveLending, LocalDate lendingDate, String lendingId, String member, Long overDueDays, LocalDate returnDate) {
        this.book = book;
        this.fineAmount = fineAmount;
        this.isActiveLending = isActiveLending;
        this.lendingDate = lendingDate;
        this.lendingId = lendingId;
        this.member = member;
        this.overDueDays = overDueDays;
        this.returnDate = returnDate;
    }

    public LendingDto() {
    }

    public String getBook() {
        return book;
    }

    public void setBook(String book) {
        this.book = book;
    }

    public Double getFineAmount() {
        return fineAmount;
    }

    public void setFineAmount(Double fineAmount) {
        this.fineAmount = fineAmount;
    }

    public Boolean getActiveLending() {
        return isActiveLending;
    }

    public void setActiveLending(Boolean activeLending) {
        isActiveLending = activeLending;
    }

    public String getLendingId() {
        return lendingId;
    }

    public void setLendingId(String lendingId) {
        this.lendingId = lendingId;
    }

    public String getMember() {
        return member;
    }

    public void setMember(String member) {
        this.member = member;
    }

    public Long getOverDueDays() {
        return overDueDays;
    }

    public void setOverDueDays(Long overDueDays) {
        this.overDueDays = overDueDays;
    }

    public LocalDate getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(LocalDate returnDate) {
        this.returnDate = returnDate;
    }

    public LocalDate getLendingDate() {
        return lendingDate;
    }

    public void setLendingDate(LocalDate lendingDate) {
        this.lendingDate = lendingDate;
    }
}
