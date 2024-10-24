package com.lbg.classes;

public class Car {
    public Car(String model){
        this.setModel(model);
        this.setMake("Unknown");
    }
    public Car() {
        this.setMake("Unknown");
        this.setModel("Unknown");
    }
    private int speed;
    private String make;
    private String model;
    private CarColour colour;
    public int getSpeed() {
        return speed;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }


    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public CarColour getColour() {
        return colour;
    }

    public void setColour(CarColour colour) {
        this.colour = colour;
    }

    public void accelerate(int deltaV) {
        if (deltaV > 0)
            this.speed += deltaV;
    }

    public void decelerate(int deltaV) {
        if (deltaV > 0)
            this.speed -= deltaV;
    }
}
