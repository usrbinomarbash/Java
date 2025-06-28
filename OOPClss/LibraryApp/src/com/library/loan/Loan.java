package com.library.loan;

import com.library.book.Book;
import com.library.loanstatus.LoanStatus;
import com.library.member.Member;

import java.time.LocalDate;

public class Loan {
    private int loanId;
    private LocalDate loanDate;
    private LocalDate dueDate;
    private LoanStatus status;
    private Member member;
    private Book book;

    public Loan(int loanId, Member member, Book book) {
        this(loanId,LocalDate.now(),LocalDate.now().plusWeeks(2),LoanStatus.BORROWED,member,book);
    }

    public Loan(int loanId,LocalDate loanDate, LocalDate dueDate, LoanStatus status, Member member, Book book){
        this.loanId=loanId;
        this.loanDate=loanDate;
        this.dueDate=dueDate;
        this.status=status;
        this.member=member;
        this.book=book;
    }





    public int getLoanId() {
        return loanId;
    }

    public void setLoanId(int loanId) {
        this.loanId = loanId;
    }

    public LocalDate getLoanDate() {
        return loanDate;
    }

    public void setLoanDate(LocalDate loanDate) {
        this.loanDate = loanDate;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }

    public void setDueDate(LocalDate dueDate) {
        this.dueDate = dueDate;
    }

    public LoanStatus getStatus() {
        return status;
    }

    public void setStatus(LoanStatus status) {
        this.status = status;
    }

    public Member getMember() {
        return member;
    }

    public void setMember(Member member) {
        this.member = member;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    @Override
    public String toString() {
        return "Loan{" +
                "loanId=" + loanId +
                ", loanDate=" + loanDate +
                ", dueDate=" + dueDate +
                ", status=" + status +
                ", member=" + member +
                ", book=" + book +
                '}';
    }




}
