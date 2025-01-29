package com.bookmanagement.application.models;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class User {

    private int id;
    private String firstName;
    private String lasttName;
    private String mail;
    private String phone;
    private String password;
    private String createdAt;
    private String updatedAt;
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

    public User(int id, String firstName, String lasttName, String mail, String password) {
        this.id = id;
        this.firstName = firstName;
        this.lasttName = lasttName;
        this.mail = mail;
        this.password = password;
        this.phone = null;
        this.createdAt = LocalDateTime.now().format(formatter);
        this.updatedAt = null;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLasttName() {
        return lasttName;
    }

    public void setLasttName(String lasttName) {
        this.lasttName = lasttName;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    public DateTimeFormatter getFormatter() {
        return formatter;
    }

    public void setFormatter(DateTimeFormatter formatter) {
        this.formatter = formatter;
    }

    @Override
    public String toString() {
        return "User [getId()=" + getId() + ", getFirstName()=" + getFirstName() + ", getLasttName()=" + getLasttName()
                + ", getMail()=" + getMail() + ", getPhone()=" + getPhone() + ", getPassword()=" + getPassword()
                + ", getCreatedAt()=" + getCreatedAt() + ", getUpdatedAt()=" + getUpdatedAt() + "]";
    }
}