package com.company;

public class Main {

    public static void main(String[] args) {

      Apartment person1 = new Apartment("Father");
      Apartment person2 = new Apartment("Mother");
      Apartment person3 = new Apartment("Son");
      Apartment person4 = new Apartment("Daughter");
      Apartment  person5 = new Apartment("Son");
      Apartment apartment  = new Apartment();
      apartment.getAddress("6 microrayon");
      System.out.println(apartment.payComServices());
      Apartment[] family1 = {person1,person2,person3,person4,person5};
      System.out.println("This is family consists "+family1.length+" persons");
        for (Apartment i:family1) {
            System.out.println((i).getName());
        }

      System.out.println();
      Hostel hostel1 = new Hostel("Father");
      Hostel hostel2 = new Hostel("Mother");
      Hostel hostel3 = new Hostel("Son");
      Hostel hostel = new Hostel();
      hostel.getAddress("7 microrayon");
      System.out.println(hostel.payRent());
      Hostel[] family2 = {hostel1,hostel2,hostel3};
      System.out.println("This is family consists "+family2.length+" persons");
      for (Hostel i:family2) {
            System.out.println((i).getName());
        }

      System.out.println();
      Hotel hotel1 = new Hotel("Father");
      Hotel hotel2 = new Hotel("Mother");
      Hotel hotel3 = new Hotel("Daughter");
      Hotel hotel4 = new Hotel("Son");
      Hotel hotel = new Hotel();
      hotel.getAddress("12 microrayon");
      Hotel[] family3 = {hotel1,hotel2,hotel3,hotel4};
      System.out.println("This is family consists "+family3.length+" persons");
      for (Hotel i:family3) {
          System.out.println((i).getName());
      }










  }
}
