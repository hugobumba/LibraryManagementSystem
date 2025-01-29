package com.bookmanagement.application.models;

public class Customer extends User{

    public Customer(int id, String firstName, String lastName, String mail, String password){
        super(id, firstName, lastName, mail, password);
    }
}
