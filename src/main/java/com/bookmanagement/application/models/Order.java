package com.bookmanagement.application.models;

public class Order {
    private int id;
    private int costumerID;
    private String date;
    
    public Order(int id, int costumerID, String date) {
        this.id = id;
        this.costumerID = costumerID;
        this.date = date;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCostumerID() {
        return costumerID;
    }

    public void setCostumerID(int costumerID) {
        this.costumerID = costumerID;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Order [getId()=" + getId() + ", getCostumerID()=" + getCostumerID() + ", getDate()=" + getDate() + "]";
    }
}