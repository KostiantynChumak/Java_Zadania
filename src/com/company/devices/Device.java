package com.company.devices;

import com.company.Human;

public abstract class Device {
    final String producer;
    final String model;
    public Integer yearOfProduction;

    protected Device(String producer, String model) {
        this.producer = producer;
        this.model = model;
    }

    public String toString() {
        return "Producer: " + producer + " Model: " + model + " Year of Production:" + yearOfProduction;
    }

    public abstract void turnOn();
    }
