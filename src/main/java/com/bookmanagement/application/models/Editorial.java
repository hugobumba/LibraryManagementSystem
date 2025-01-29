package com.bookmanagement.application.models;

public class Editorial {
    private int id;
    private String name;

    public Editorial(int id, String name) {
        this.id = id;
        this.name = name;
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

    @Override
    public String toString() {
        return "Editorial [getId()=" + getId() + ", getName()=" + getName() + "]";
    }
}
