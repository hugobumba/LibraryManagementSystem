package com.bookmanagement.application.models;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Loan {
    private int id;
    private int orderID;
    private String startDate;
    private String endDate;
    private double fine;
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
    
    public Loan(int id, int orderID, String endDate, double fine) {
        this.id = id;
        this.orderID = orderID;
        this.startDate = LocalDateTime.now().format(formatter);
        this.endDate = null;
        this.fine = 0;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getOrderID() {
        return orderID;
    }

    public void setOrderID(int orderID) {
        this.orderID = orderID;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public double getFine() {
        return fine;
    }

    public void setFine(double fine) {
        this.fine = fine;
    }

    @Override
    public String toString() {
        return "Loan [getId()=" + getId() + ", getOrderID()=" + getOrderID() + ", getStartDate()=" + getStartDate()
                + ", getEndDate()=" + getEndDate() + ", getFine()=" + getFine() + ", getClass()=" + getClass() + "]";
    }
}
