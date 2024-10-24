package com.lbg;
import com.lbg.classes.Car;
import static com.lbg.classes.CarColour.*;

public class Main {
    public static void main(String[] args) {
        System.out.printf("Hello and welcome!\n");
        Car bartCar = new Car();
        System.out.println(bartCar.getSpeed());
        System.out.println(bartCar);
        bartCar.setMake("Ford");
        bartCar.setModel("Fiesta");
        bartCar.setColour(RED);
        System.out.println(bartCar.getMake());
        System.out.println(bartCar.getModel());
        System.out.println(bartCar.getColour());

        System.out.println(bartCar.getSpeed());
        bartCar.accelerate(60);
        System.out.println(bartCar.getSpeed());
        bartCar.decelerate(30);
        System.out.println(bartCar.getSpeed());

        Car lisaCar = new Car("Corsa");
        lisaCar.accelerate(312);
        System.out.println(lisaCar.getSpeed());

        Car[] cars = new Car[3];
        cars[0] = bartCar;
        cars[1] = lisaCar;
        cars[2] = new Car();

        for (Car car : cars) {
            System.out.println(car);
            System.out.println(car.getColour());
            System.out.println(car.getModel());
        }
    }
}