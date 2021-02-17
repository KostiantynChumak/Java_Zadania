package com.company;

import com.company.creatures.Animal;
import com.company.devices.Car;
import com.company.devices.Phone;
import com.company.creatures.Animal;
import com.company.creatures.FarmAnimal;
import com.company.creatures.Pet;

public class Main {

    public static void main(String[] args) throws Exception {
        Human me = new Human();
        me.firstName = "Kostiantyn";
        me.lastName = "Chumak";
        me.pet = new Pet("Dog");
        me.pet.name = "Rex";
        me.setCar(new Car("Mazda", "6"));
        System.out.println(me.getCar().getProducer() + " " + me.getCar().getModel());
        me.getLastSalaryCheckInfo();
        System.out.println("First salary check. Salary: " + me.getSalary());
        me.getLastSalaryCheckInfo();
        me.setSalary(5000.0);

        me.pet.takeForAWalk();
        me.pet.takeForAWalk();
        me.pet.takeForAWalk();
        me.pet.feed();
        me.pet.takeForAWalk();
        me.pet.takeForAWalk();
        me.pet.takeForAWalk();

        Car car1 = new Car("BMW", "5");
        Car car2 = new Car("BMW", "5");
        if (car1 == car2) {
            System.out.println("car1 i car2 są takie same");
        } else {
            System.out.println("car1 i car2 nie są takie same");
        }
        System.out.println(car1);

        me.mobile = new Phone("Xiaomi", "11");

        System.out.println(me);
        System.out.println(me.pet);
        System.out.println(me.getCar());
        me.getCar().turnOn();
        System.out.println(me.mobile);
        me.mobile.turnOn();

        Human czlowiek = new Human("Vladek", "Sumski");

        System.out.println();
        me.getCar().sell(me, czlowiek, 1000.0);
        System.out.println(me.getCar() + " " + me.cash);
        System.out.println(czlowiek.getCar() + " " + czlowiek.cash);

        System.out.println();
        me.mobile.sell(me, czlowiek, 100.0);
        System.out.println(me.mobile + " " + me.cash);
        System.out.println(czlowiek.mobile + " " + czlowiek.cash);

        System.out.println();
        me.pet.sell(me, czlowiek, 100.0);
        System.out.println(me.pet + " " + me.cash);
        System.out.println(czlowiek.pet + " " + czlowiek.cash);

        Animal testowyZwierz =  new Pet("Dog");
        testowyZwierz.sell(me, czlowiek, 100.);

        FarmAnimal pig = new FarmAnimal("Pig");
        pig.feed(100.0);
        pig.beEaten();
        pig.beEaten();
    }
}
