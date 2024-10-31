package com.lbg.classes;

public class Vehicle {
    private int numberOfWheels;
    private String registration;
    protected String engineInfo;

    public Vehicle() {
        this.setNumberOfWheels(4);
        this.setRegistration("UNREGISTERED VEHICLE");
    }

    public Vehicle(int numberOfWheels, String registration) {
        this.setNumberOfWheels(numberOfWheels);
        this.setRegistration(registration);
    }

//    public abstract String someAbstractMethod();

    @Override
    public String toString() {
//        return super.toString();
        return "Vehicle has " + this.getNumberOfWheels() + " wheels, registered as " + this.getRegistration();
    }

    public String performService() {
        return this.getRegistration() + " is being serviced";
    }
    public String getRegistration() {
        return registration;
    }

    public void setRegistration(String registration) {
        this.registration = registration;
    }

    public int getNumberOfWheels() {
        return numberOfWheels;
    }

    public void setNumberOfWheels(int numberOfWheels) {
        this.numberOfWheels = numberOfWheels;
    }

}
