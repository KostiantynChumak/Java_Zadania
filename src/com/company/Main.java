package com.company;

import com.company.creatures.Animal;
import com.company.devices.Car;

public class Main {

    public static void main(String[] args) throws Exception {
        Human me = new Human();
        me.firstName = "Kostiantyn";
        me.lastName = "Chumak";
        me.pet = new Animal("Dog");
        me.pet.name = "Rex";
        me.car = new Car("Mazda", "6");
        System.out.println(me.car.producer + " " + me.car.model);

        me.pet.takeForAWalk();
        me.pet.takeForAWalk();
        me.pet.takeForAWalk();
        me.pet.feed();
        me.pet.takeForAWalk();
        me.pet.takeForAWalk();
        me.pet.takeForAWalk();
    }
}
