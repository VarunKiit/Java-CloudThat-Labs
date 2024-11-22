package com.Varun;

import java.util.ArrayList;
import java.util.List;


public class Main {

    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
    }
}

class Person {
    String name;
    int billions;

    public Person(String name, int billions){
        this.name = name;
        this.billions = billions;
    }
}

