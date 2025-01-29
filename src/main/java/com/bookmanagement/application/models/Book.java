package com.bookmanagement.application.models;

import jakarta.persistence.Entity;

@Entity
public class Book extends Publication{
    private int isbn;

    public Book() {}

    public Book(int id, String title, String publishDate, int authorID, int genreID, int editorialID, int isbn) {
        super(id, title, publishDate, authorID, genreID, editorialID);
        this.isbn = isbn;
    }

    public Book(int id, String title, String img, String publishDate, int authorID, int genreID, int editorialID,
            int isbn) {
        super(id, title, img, publishDate, authorID, genreID, editorialID);
        this.isbn = isbn;
    }

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    @Override
    public String toString() {
        return "Book ["+super.toString()+"getIsbn()=" + getIsbn() + "]";
    }

}
