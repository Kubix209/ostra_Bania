package org.example;

public class Student extends Human{
    String university;

    public Student(String firstName, String lastName, int age, String university) {
        super(firstName, lastName, age);
        this.university = university;
    }

    public void learning() {

        System.out.println("Nauka angielskiego");
    }

    @Override
    public void sayHello() {
        System.out.println("Hello student");
    }



}
