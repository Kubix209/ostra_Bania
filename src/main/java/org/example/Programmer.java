package org.example;

public class Programmer extends Human {
    boolean hasPC;

    public Programmer(String firstName, String lastName, int age, boolean hasPC) {
        super(firstName, lastName, age);
        this.hasPC = hasPC;
    }

    @Override
    public void sayHello() {
        System.out.println("Hello programmer ostra bania");
    }


    //drugi komentarz
}
