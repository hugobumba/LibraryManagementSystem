package com.bookmanagement.application.models;

public class LoanItem {
    private int loanID;
    private int bookID;
    
    public LoanItem(int loanID, int bookID) {
        this.loanID = loanID;
        this.bookID = bookID;
    }

    public int getLoanID() {
        return loanID;
    }

    public void setLoanID(int loanID) {
        this.loanID = loanID;
    }

    public int getBookID() {
        return bookID;
    }

    public void setBookID(int bookID) {
        this.bookID = bookID;
    }

    @Override
    public String toString() {
        return "LoanItem [getLoanID()=" + getLoanID() + ", getBookID()=" + getBookID() + "]";
    }
}
