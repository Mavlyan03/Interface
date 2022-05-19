package com.company;

public  class Apartment extends Person implements ComService {

    private static String address;
    private String Apartment;

    public Apartment() {}

    public Apartment(String setName) {
        super(setName);
    }

    public void getAddress(String address) {System.out.println("Address: " + address);}

    @Override
    public String payComServices() {
        return "This is family pay communicate services";
    }

    @Override
    public String payRent() {return null;}
    

   @Override
    public String toString() {
        return getName() ;
   }

    }











