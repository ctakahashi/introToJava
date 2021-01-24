package examples.car;

import examples.play.Person;

public class Car {

    private static int numOfCars;

    double gasTankAmount;
    double currentSpeed;
    int numOfWheels;
    Person[] passengers;

    public Car() {
        numOfCars++;
    }

    public double accelerate(double increasedSpeed) {
        currentSpeed += increasedSpeed;
        return currentSpeed;
    }

    public double decelerate(double increasedSpeed) {
        currentSpeed += increasedSpeed;
        return currentSpeed;
    }

    public static double requiredGasForMiles(double miles, double milesPerGallon) {
        return miles / milesPerGallon;
    }
}
