package com.in28minutes.learnspringframework.meeting.domain;

import java.util.Arrays;

public class Person {
    private String firstName;
    private String lastName;
    private int age;
    private String[] hobbies;

    private Address address;

    public Person(String firstName, String lastName, int age, String[] hobbies, Address address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.hobbies = hobbies;
        this.address = address;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public String[] getHobbies() {
        return hobbies;
    }

    public Address getAddress() {
        return address;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", hobbies=" + Arrays.toString(hobbies) +
                ", address=" + address +
                '}';
    }
}
