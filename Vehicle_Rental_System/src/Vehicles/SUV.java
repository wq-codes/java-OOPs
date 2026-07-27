package Vehicles;

import Vehicles.Interface.Insurable;
import Vehicles.Parental_Class.*;

public class SUV extends Vehicle implements Insurable {
    public SUV(String brand, int rentPerDay, int speed) {
        super(brand, rentPerDay, speed);
    }

    @Override
    public double calcRent(int days) {
        int rent = days * getRentPerDay();
        double luxuryTax = rent * 0.20;
        System.out.println("Luxury Rent is:" + luxuryTax);
        return (double) rent + luxuryTax;
    }

    @Override
    public double calculateInsurance() {
        return getRentPerDay() * 135.5;
    }

    @Override
    public void display() {
        super.displayInfo();
    }
}
