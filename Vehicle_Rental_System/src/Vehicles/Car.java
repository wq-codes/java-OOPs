package Vehicles;

import Vehicles.Interface.Insurable;
import Vehicles.Parental_Class.*;

public class Car extends Vehicle implements Insurable {

    public Car(String brand, int rentPerDay, int speed) {
        super(brand, rentPerDay, speed);
    }

    @Override
    public double calcRent(int days) {
        return (double) getRentPerDay() * days;
    }

    @Override
    public double calculateInsurance() {
        return getRentPerDay() * 90.5;
    }

    @Override
    public void display() {
        super.displayInfo();
    }

}
