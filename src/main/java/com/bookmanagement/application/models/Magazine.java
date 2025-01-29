package com.bookmanagement.application.models;

import jakarta.persistence.Entity;

@Entity
public class Magazine extends Publication{
    private double price;

    public Magazine() {}

    public Magazine(int id, String title, String publishDate, int authorID, int genreID, int editorialID,
            double price) {
        super(id, title, publishDate, authorID, genreID, editorialID);
        this.price = price;
    }

    public Magazine(int id, String title, String img, String publishDate, int authorID, int genreID, int editorialID,
            double price) {
        super(id, title, img, publishDate, authorID, genreID, editorialID);
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Magazine ["+super.toString()+"price=" + price + "]";
    }
    
}
