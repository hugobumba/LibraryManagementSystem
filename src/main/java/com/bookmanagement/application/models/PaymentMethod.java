package com.bookmanagement.application.models;

public class PaymentMethod {
    private int id;
    private String name;
    private boolean active;
    
    public PaymentMethod(int id, String name, boolean active) {
        this.id = id;
        this.name = name;
        this.active = active;
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

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    @Override
    public String toString() {
        return "PaymentMethod [getId()=" + getId() + ", getName()=" + getName() + ", isActive()=" + isActive() + "]";
    }
}
