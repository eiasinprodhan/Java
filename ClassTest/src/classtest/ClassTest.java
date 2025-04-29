package classtest;

import classtest.vehicles.Truck;
import classtest.vehicles.Vehicle;

public class ClassTest {

    public static void main(String[] args) {
        Truck t = new Truck();
        
        t.setRegularPrice(100);
        t.setWeight(2000);
        
        System.out.println(t.getSalePrice());
        
    }
    
}
