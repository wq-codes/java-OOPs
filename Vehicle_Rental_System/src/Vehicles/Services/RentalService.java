package Vehicles.Services;

import Vehicles.Parental_Class.Vehicle;

public class RentalService {
    private Vehicle vehicle;

    public RentalService(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public void rentVehicle_details() {

        System.out.println("Vehicle: " + vehicle.getBrand());
        System.out.println("Speed: " + vehicle.getSpeed() + " km/h");
        System.out.println("Rent per Day: " + vehicle.getRentPerDay());
    }
}
