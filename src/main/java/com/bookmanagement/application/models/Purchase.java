package com.bookmanagement.application.models;

public class Purchase {
    private int id;
    private int purchaseID;
    private int orderID;
    private double totalPrice;
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public int getPurchaseID() {
        return purchaseID;
    }
    public void setPurchaseID(int purchaseID) {
        this.purchaseID = purchaseID;
    }
    public int getOrderID() {
        return orderID;
    }
    public void setOrderID(int orderID) {
        this.orderID = orderID;
    }
    public double getTotalPrice() {
        return totalPrice;
    }
    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }
    @Override
    public String toString() {
        return "Purchase [getId()=" + getId() + ", getPurchaseID()=" + getPurchaseID() + ", getOrderID()="
                + getOrderID() + ", getTotalPrice()=" + getTotalPrice() + "]";
    }
}
