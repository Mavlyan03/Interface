package com.company;

public abstract class Person implements ComService,Rent {
    private String name;
    private int[] family;

    public Person(String name) {
        this.name = name;
    }

    public Person() {}

    public String getName() {return name;}

    public void setName(String name) {this.name = name;}

    public String toString() {return name;}
}
