package lk.ijse.cmjd108.LibMgmt.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.persistence.Id;

import java.time.LocalDate;


@Entity
@Table(name = "lending")
public class LendingEntity {
    @Id
    private String lendingId;
    @ManyToOne
    @JoinColumn(name = "bookId", nullable = false)
    private BookEntity book;
    @ManyToOne
    @JoinColumn(name = "memberId", nullable = false)
    private MemberEntity member;
    private LocalDate lendingDate;
    private LocalDate returnDate;
    private Boolean isActiveLending;
    private Long overDueDays;
    private Double fineAmount;

    public LendingEntity() {
    }

    public LendingEntity(BookEntity book, Double fineAmount, Boolean isActiveLending, LocalDate lendingDate, String lendingId, MemberEntity member, Long overDueDays, LocalDate returnDate) {
        this.book = book;
        this.fineAmount = fineAmount;
        this.isActiveLending = isActiveLending;
        this.lendingDate = lendingDate;
        this.lendingId = lendingId;
        this.member = member;
        this.overDueDays = overDueDays;
        this.returnDate = returnDate;
    }

    public BookEntity getBook() {
        return book;
    }

    public void setBook(BookEntity book) {
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

    public LocalDate getLendingDate() {
        return lendingDate;
    }

    public void setLendingDate(LocalDate lendingDate) {
        this.lendingDate = lendingDate;
    }

    public String getLendingId() {
        return lendingId;
    }

    public void setLendingId(String lendingId) {
        this.lendingId = lendingId;
    }

    public MemberEntity getMember() {
        return member;
    }

    public void setMember(MemberEntity member) {
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

    @Override
    public String toString() {
        return "LendingEntity{" +
                "book=" + book +
                ", lendingId='" + lendingId + '\'' +
                ", member=" + member +
                ", lendingDate='" + lendingDate + '\'' +
                ", returnDate='" + returnDate + '\'' +
                ", isActiveLending=" + isActiveLending +
                ", overDueDays=" + overDueDays +
                ", fineAmount=" + fineAmount +
                '}';
    }
}
