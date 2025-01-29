package com.bookmanagement.application.models;

public class PurchaseItem {
    private int publicationID;
    private int purchaseID;
    private int quantity;
    private double subtotal;
    public int getPublicationID() {
        return publicationID;
    }
    public void setPublicationID(int publicationID) {
        this.publicationID = publicationID;
    }
    public int getPurchaseID() {
        return purchaseID;
    }
    public void setPurchaseID(int purchaseID) {
        this.purchaseID = purchaseID;
    }
    public int getQuantity() {
        return quantity;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    public double getSubtotal() {
        return subtotal;
    }
    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }
    @Override
    public String toString() {
        return "PurchaseItem [getPublicationID()=" + getPublicationID() + ", getPurchaseID()=" + getPurchaseID()
                + ", getQuantity()=" + getQuantity() + ", getSubtotal()=" + getSubtotal() + "]";
    }
}
