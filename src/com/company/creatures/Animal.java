package com.company.creatures;

public class Animal {
    final static Double DEFAULT_WEIGHT_DOG = 4.0;
    final static Double DEFAULT_WEIGHT_LION = 190.0;
    final static Double DEFAULT_WEIGHT_MOUSE = 0.01;

    public String name;

    final String species;
    private Double weight;

    public Animal(String species) throws Exception {
        this.species = species;

        switch (this.species) {
            case "Mouse":
                weight = DEFAULT_WEIGHT_MOUSE;
                break;
            case "Dog":
                weight = DEFAULT_WEIGHT_DOG;
                break;
            case "Lion":
                weight = DEFAULT_WEIGHT_LION;
            default:
                throw new Exception("Undefined species!");
        }
    }

    public void feed() {
        if (weight <= 0) {
            System.out.println("Too late...");
        } else {
            weight++;
            System.out.println("Thx, yummy.    Weight: " + weight);
        }
    }

    public void takeForAWalk() {
        if (weight <= 0) {
            System.out.println("Too late...");
        } else if (weight <= 3) {
            weight--;
            if (weight <= 0) {
                System.out.println("Thx, nice walk, but i'm dying...");
            } else {
                System.out.println("Thx, nice walk, but i'm hungry.    Weight: " + weight);
            }
        } else {
            weight--;
            System.out.println("Thx, nice walk.    Weight: " + weight);
        }
    }
    public String getSpecies() {
        return species;
    }

    public String toString() {
        return species + " " + name;
    }
}