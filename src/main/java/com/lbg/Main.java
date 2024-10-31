package com.lbg;
import com.lbg.classes.Car;
import com.lbg.classes.CarColour;
//import com.lbg.classes.SubCar;
import com.lbg.classes.ISteerable;
import com.lbg.classes.Vehicle;

import java.util.Random;

import static com.lbg.classes.CarColour.*;


public class Main {
    public static void main(String[] args) {
//        javaPart1();
        javaPart2();

    }

    private static void javaPart1() {
        System.out.printf("Hello and welcome!\n");
//        Car bartCar = new Car();
//        System.out.println(bartCar.getSpeed());
//        System.out.println(bartCar);
//        bartCar.setMake("Ford");
//        bartCar.setModel("Fiesta");
//        bartCar.setColour(RED);
//        System.out.println(bartCar.getMake());
//        System.out.println(bartCar.getModel());
//        System.out.println(bartCar.getColour());
//
//        System.out.println(bartCar.getSpeed());
//        bartCar.accelerate(60);
//        System.out.println(bartCar.getSpeed());
//        bartCar.decelerate(30);
//        System.out.println(bartCar.getSpeed());
//
//        Car lisaCar = new Car("Corsa");
//        lisaCar.accelerate(312);
//        System.out.println(lisaCar.getSpeed());
//
//        Car[] cars = new Car[3];
//        cars[0] = bartCar;
//        cars[1] = lisaCar;
//        cars[2] = new Car();
//
//        for (Car car : cars) {
//            System.out.println(car);
//            System.out.println(car.getColour());
//            System.out.println(car.getModel());

        int numberOfCars = 100;
        CarColour[] carColoursArray = {RED, YELLOW, BLACK, BLUE}; // create an array of car colours
        Car[] carArray = new Car[numberOfCars]; // create an empty array of cars
        Random randomiser = new Random(); // instantiate a Random object
        int pickedNumber;
        for (int i = 0; i < numberOfCars; i++) {
            Car newCar = new Car(); // create a new car object
            pickedNumber = randomiser.nextInt(carColoursArray.length); // pick an integer between 0 and 3
            newCar.setColour(carColoursArray[pickedNumber]); // set the car object's colour with the randomised integer
            carArray[i] = newCar; // set the ith position in the array to the car object
        }

        int redCount = 0;
        int yellowCount = 0;
        int blueCount = 0;
        int blackCount = 0;
//        for (int i = 0; i < numberOfCars; i++) {
//            switch (carArray[i].getColour()) { // switch statement on the car object's colour
//                case RED:
//                    redCount++;
//                    break;
//                case YELLOW:
//                    yellowCount++;
//                    break;
//                case BLUE:
//                    blueCount++;
//                    break;
//                case BLACK:
//                    blackCount++;
//                    break;
//            }
//        }
        for (Car car : carArray) { // for each car in the carArray
            switch (car.getColour()) { // switch statement on the car object's colour
                case RED:
                    redCount++;
                    break;
                case YELLOW:
                    yellowCount++;
                    break;
                case BLUE:
                    blueCount++;
                    break;
                case BLACK:
                    blackCount++;
                    break;
            }
        }
        System.out.printf("There are %s red cars, %s yellow cars, %s blue cars and %s black cars\n", redCount, yellowCount, blueCount, blackCount);

        Car newCar = new Car("Vauxhaul", "Astra", RED);
        System.out.println(newCar.toString());
    }

    private static void javaPart2() {
        Vehicle v1 = new Vehicle();
        Vehicle v2 = new Vehicle();
        Vehicle v3 = new Vehicle(2, "LI45SMP");
        Car car1 = new Car("Ford", "Fiesta", YELLOW);
        Car car2 = new Car("Renault", "Cleo", BLUE);
//        car1.setNumberOfWheels(4);
        System.out.println(car1.toString());
        System.out.println(car1.getNumberOfWheels());
        System.out.println(v1);
        System.out.println(v2);
        System.out.println(v3);
        String serviceInfo = car1.performService();
        System.out.println(serviceInfo);
        System.out.println(v3.performService());
        System.out.println(car1.getRegistration());


        Vehicle[] vehicles = {v1, v2, v3, car1, car2};
        // This is an example of polymorphism!
        for (Vehicle v: vehicles) {
            System.out.println(v);
            System.out.println(v.performService());
        }
//        SubCar sc = new SubCar();
        System.out.println(car1.turnLeft());
        ISteerable[] steerables = {car1, car2};

        for (ISteerable s: steerables) {
            System.out.println(s.turnRight());
            System.out.println(s.turnLeft());
        }
    }
}