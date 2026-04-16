package org.example;

public class Human {

    String firstName;
    String lastName;
    int age;

    public Human(String firstName, String lastName, int age) {

        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public void sayHello() {

        System.out.println("Hello");
    }

    @Override
    public String toString() {
        return "Imię " + firstName + "\n" +
                "Nazwisko " + lastName + "\n" +
                "Wiek " + age;
    }



}
