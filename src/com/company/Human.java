package com.company;

import com.company.devices.Phone;
import com.company.creatures.Animal;
import com.company.devices.Car;
import com.company.Human;

import java.sql.Timestamp;

public class Human extends Animal {
    public String firstName;
    public String lastName;
    protected Phone mobile;
    public Animal pet;
    private Car car;
    public Double cash = 10000.0;
    protected Phone mobile;

    private Double salary = 4500.0;
    private Timestamp lastSalaryCheckTimestamp;
    private Double lastSalaryCheckValue;
    public Human() {
        super("Human");
    }

    public Human(String firstName, String lastName) {
        super("Human");
        this.firstName = firstName;
        this.lastName = lastName;
    }


    public void setSalary(Double salary) {
        if(salary < 0){
            System.out.println("Wartość pensji nie może być mniejsza od zera!");
        }else{
            System.out.println("Nowa wartość pensji przekazana do systemu ksiągowego!");
            System.out.println("Aneks do umowy do odebrania od pani Hani z kadr.");
            System.out.println("US i ZUS już wiedzą o zmianaie wysokosci wypłaty ;)");
            this.salary = salary;
        }
    }

    public void getLastSalaryCheckInfo() {
        if (lastSalaryCheckValue == null) {
            System.out.println("Ostatnie sprawdzanie pensji: brak");
        }else{
            System.out.println("Ostatnie sprawdzanie pensji: " + lastSalaryCheckTimestamp + " Pensja: " + lastSalaryCheckValue);
        }
    }
    public Car getCar() {
        return car;
    }

    public void removeCar(Car car) throws Exception {
        boolean success = false;
        if (hasDevice(car)) {
            this.car = null;
            success = true;
        }
        if (!success) {
            throw new Exception("Nie możesz usunąć samochodu, którego nie posiadasz!");
        }
    }

    public boolean hasDevice(Device device) {
        if (device instanceof Car) {
            return this.car == device;
        } else if (device instanceof Phone) {
            return this.mobile == device;
        }
        return false;
    }

    public String toString() {
        return firstName + " " + lastName;
    }
    public boolean hasAnimal(Animal animal) {
        return this.pet == animal;
    }

    public boolean couldBuy(Device device, Double price) {
        return price <= this.cash;
    }

    public void setMobile(Phone mobile) {
        this.mobile = mobile;
    }

    @Override
    public void sell(Human seller, Human buyer, Double price) throws Exception {
        throw new Exception("Nie możesz sprzedawać ludzi!");
    }
}
