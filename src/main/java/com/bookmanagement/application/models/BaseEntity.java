package com.bookmanagement.application.models;

public class BaseEntity {
    private int id;

    public BaseEntity(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "BaseEntity [getId()=" + getId() + "]";
    }

    public void setId(int id) {
        this.id = id;
    }
}
