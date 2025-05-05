package classtestquestion.pkg2;

import classtestquestion.pkg2.tclass.Bike;
import classtestquestion.pkg2.tclass.Car;

public class ClassTestQuestion2 {

    
    public static void main(String[] args) {
        Car car = new Car(4, "Corolla", 500);
        Bike bike = new Bike(true, "Royal Enfield", 300);
        car.getVehicleDetials();
        System.out.println("\n");
        bike.getVehicleDetials();
    }
    
}
