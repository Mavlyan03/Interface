package com.company;
public class Hotel extends Person {

    private String address;

    public Hotel() {};

    public Hotel(String setName) {
        super(setName);
    }

    public void getAddress(String address) {System.out.println("Address: " + address);}


    @Override
    public String payRent() {return "This is family pay rent";}
}
