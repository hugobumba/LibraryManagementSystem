package com.bookmanagement.application.models;

public class RolePermission {
    private int id;
    private int premissionID;
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public int getPremissionID() {
        return premissionID;
    }
    public void setPremissionID(int premissionID) {
        this.premissionID = premissionID;
    }
    @Override
    public String toString() {
        return "RolePermission [getId()=" + getId() + ", getPremissionID()=" + getPremissionID() + "]";
    }
}
