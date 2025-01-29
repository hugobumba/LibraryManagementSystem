package com.bookmanagement.application.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bookmanagement.application.models.Customer;
import com.bookmanagement.application.models.User;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
@RequestMapping(value = "/customers")
public class CustomerController {
    
    @GetMapping    
    public ResponseEntity<User> findAll(){

        Customer c1 = new Customer(1, "Hugo", "Bumba", "hugo@mail", "passw");
        return ResponseEntity.ok().body(c1);
    }
}
