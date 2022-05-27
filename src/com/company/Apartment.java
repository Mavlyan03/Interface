package com.company;

public  class Apartment extends Person  {

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
    public String toString() {
        return getName() ;
   }

    }











