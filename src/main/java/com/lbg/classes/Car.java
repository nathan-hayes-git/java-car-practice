package com.lbg.classes;

public final class Car extends Vehicle implements ISteerable {
    public Car(String model){
        this.setModel(model);
        this.setMake("Unknown");
    }
    public Car() {
        this("Unknown", "Unknown", CarColour.BLACK);
//        this.setMake("Unknown");
//        this.setModel("Unknown");
    }

    public Car(String make, String model, CarColour carColour) {
        super(4, "UNREGISTERED CAR");
        this.setMake(make);
        this.setModel(model);
        this.setColour(carColour);
    }

    @Override
    public String toString() {
//        return super.toString();
//        return "I am a car";
        String info = "I am a " + this.getColour() + " " + this.getMake() + " " + this.getModel();
        return info;
    }

    @Override
    public String performService() {
        return "Car " + super.performService();
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

    @Override
    public String turnLeft() {
        return "I'm turning left!";
    }

    @Override
    public String turnRight() {
        return "I'm turning right!";
    }
}
