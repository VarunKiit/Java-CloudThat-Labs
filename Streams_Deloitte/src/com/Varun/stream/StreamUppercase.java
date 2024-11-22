package com.Varun.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamUppercase extends Person {
    public StreamUppercase(String name, int billions) {
        super(name, billions);
    }

    public static void main(String[] args){
        List<Person> people = new ArrayList<>();

        people.add(new Person("varun", 212));
        people.add(new Person("rohit", 120));
        people.add(new Person("shashank", 150));
        people.add(new Person("rahul", 100));

        List<String> onetwentyclubNames = people.stream()
                .filter(person -> person.billions >= 120) // Keep only qualifying Persons
                .map(person -> person.name.substring(0, 1).toUpperCase() + person.name.substring(1)) // Capitalize first letter
                .collect(Collectors.toList()); // Collect names into a List

        onetwentyclubNames.forEach(System.out::println);
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
