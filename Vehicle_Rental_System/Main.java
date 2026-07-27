import java.util.Scanner;
import Vehicles.*;
import Vehicles.Interface.Insurable;
import Vehicles.Parental_Class.Vehicle;
import Vehicles.Services.RentalService;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Insurable car = new Car("Honda", 3200, 170);
        Insurable bike = new Bike("United", 700, 70);
        Insurable suv = new SUV("Toyota", 5000, 180);

        Insurable[] autos = new Insurable[3];
        autos[0] = car;
        autos[1] = suv;
        autos[2] = bike;

        System.out.println("================DI Demo==============");
        for (Insurable insurable_vehicle : autos) {// check all autos array if it is Vehicle then iot will create an
                                                   // object of service and use method of that this is DI
            if (insurable_vehicle instanceof Vehicle v) {

                RentalService service = new RentalService(v);// pass the object to constructor, this is constructor DI
                service.rentVehicle_details();
                System.out.println("---------------------");
            }
        }
        System.out.println("================ Insurance Cost & Display Info ==============");
        for (Insurable vehicle : autos) {

            vehicle.display();
            if (vehicle instanceof Insurable) {
                Insurable i = (Insurable) vehicle;
                i.display();
                System.out.println("Submit insurance amount: " + i.calculateInsurance());
            }

        }

        sc.close();
    }
}