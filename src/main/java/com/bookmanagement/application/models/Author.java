package com.bookmanagement.application.models;

public class Author {
    private int id;
    private String name;
    private String img;
    private long bio;

    @Override
    public String toString() {
        return "Author [getId()=" + getId() + ", getName()=" + getName() + ", getImg()=" + getImg() + ", getBio()="
                + getBio() + "]";
    }

    public Author(int id, String name, String img, long bio) {
        this.id = id;
        this.name = name;
        this.img = img;
        this.bio = bio;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public long getBio() {
        return bio;
    }

    public void setBio(long bio) {
        this.bio = bio;
    }
}
