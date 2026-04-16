package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Human jakub = new Human("Jakub", "Roszak", 26);

        Student kuba = new Student("Kuba", "Roszak", 26, "Legnica");

        Programmer adix = new Programmer("Adrian", "Brygider" ,27, true);

        jakub.sayHello();
        kuba.sayHello();
        adix.sayHello();

        kuba.learning();

        List<Human> studenci =  new ArrayList<>();
        studenci.add(kuba);
        studenci.add(jakub);
        studenci.add(adix);

        for (Human student : studenci) {

            student.sayHello();




        }
















    }
}