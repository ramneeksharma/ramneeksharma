package com.example.model;

public class Customer {
    
    private String firstName;
    private String lastName;

    public void Customer(){
    }

    public void Customer(String firstname, String lastname){
        this.firstName = firstname;
        this.lastName = lastname;
    }

    public String getFirstName(){
        return this.firstName; 
    }

    public String getLastName(){
        return this.lastName; 
    }

    public void setFirstName(String firstname){
        this.firstName = firstname;
    }

    public void setLastName(String lastname){
        this.lastName = lastname;
    }
}
