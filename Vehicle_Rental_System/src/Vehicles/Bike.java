package Vehicles;

import Vehicles.Parental_Class.*;
import Vehicles.Interface.*;

public class Bike extends Vehicle implements Insurable {
    public Bike(String brand, int rentPerDay, int speed) {
        super(brand, rentPerDay, speed);
    }

    @Override
    public double calcRent(int days) {
        return (double) getRentPerDay() * days;
    }

    @Override
    public double calculateInsurance() {
        return getRentPerDay() * 20.5;
    }

    @Override
    public void display() {
        super.displayInfo();
    }
}
