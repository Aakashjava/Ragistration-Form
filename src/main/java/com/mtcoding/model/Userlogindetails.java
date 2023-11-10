package com.mtcoding.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Userlogindetails")

public class Userlogindetails {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String username; // For login and signup
    private String password; // For login and signup

    // Constructors, getters, and setters

    public Userlogindetails() {
        // Default constructor
    }

    public Userlogindetails(String username, String password) {
       
        this.username = username;
        this.password = password;
    }

    // Getters and setters for all fields

    // ... existing getters and setters ...

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
