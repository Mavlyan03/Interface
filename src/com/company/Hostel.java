package com.company;

public class Hostel extends Person  {

    private static String address;

    public Hostel() {};

    public Hostel(String setName) {super(setName);}

    public void getAddress(String address) {System.out.println("Address: " + address);}

    @Override
    public String payRent() {return "This is family pay rent";}


}
