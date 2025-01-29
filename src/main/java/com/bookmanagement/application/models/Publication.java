package com.bookmanagement.application.models;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;

@MappedSuperclass
public class Publication{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String title;
    private String img;
    private String publishDate;
    private int authorID;
    private int genreID;
    private int editorialID;

    public Publication(){

    }

    public Publication(int id, String title, String publishDate, int authorID, int genreID, int editorialID) {
        this.id = id;
        this.title = title;
        this.img = null;
        this.publishDate = publishDate;
        this.authorID = authorID;
        this.genreID = genreID;
        this.editorialID = editorialID;
    }

    public Publication(int id, String title, String img, String publishDate, int authorID, int genreID,
            int editorialID) {
        this.id = id;
        this.title = title;
        this.img = img;
        this.publishDate = publishDate;
        this.authorID = authorID;
        this.genreID = genreID;
        this.editorialID = editorialID;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(String publishDate) {
        this.publishDate = publishDate;
    }

    public int getAuthorID() {
        return authorID;
    }

    public void setAuthorID(int authorID) {
        this.authorID = authorID;
    }

    public int getGenreID() {
        return genreID;
    }

    public void setGenreID(int genreID) {
        this.genreID = genreID;
    }

    public int getEditorialID() {
        return editorialID;
    }

    public void setEditorialID(int editorialID) {
        this.editorialID = editorialID;
    }

    @Override
    public String toString() {
        return "Publication [getId()=" + getId() + ", getTitle()=" + getTitle() + ", getImg()=" + getImg()
                + ", getPublishDate()=" + getPublishDate() + ", getAuthorID()=" + getAuthorID() + ", getGenreID()="
                + getGenreID() + ", getEditorialID()=" + getEditorialID() + "]";
    }
}