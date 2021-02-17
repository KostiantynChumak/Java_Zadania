package com.company;

import com.company.creatures.Animal;
import com.company.devices.Car;
import com.company.devices.Phone;

public class Main {

    public static void main(String[] args) throws Exception {
        Human me = new Human();
        me.firstName = "Kostiantyn";
        me.lastName = "Chumak";
        me.pet = new Animal("Dog");
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
    }
}
