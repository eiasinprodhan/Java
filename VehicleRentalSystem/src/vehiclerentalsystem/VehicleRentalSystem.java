package vehiclerentalsystem;

import vehiclerentalsystem.classes.Car;
import vehiclerentalsystem.classes.Motorcycle;

public class VehicleRentalSystem {

    public static void main(String[] args) {
        Motorcycle motor = new Motorcycle(301, "2158658485", "BMW", "RX-100", 500, true);

        motor.getInfo();
        motor.getRentPrice();
    }

}
