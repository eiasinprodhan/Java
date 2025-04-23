package vehiclerentalsystem;

public class VehicleRentalSystem {

    public static void main(String[] args) {
        Car car = new Car();
        Truck truck = new Truck();
        Motorcycle motorcycle = new Motorcycle();
        
        
        car.setRegistrationNumber("1986548758");
        car.setBrand("Toyota");
        car.setModel("Corolla");
        car.setDailyRate(5000);
        car.setNumberOfSeats(4);

        
        System.out.println("Registration No: " + car.getRegistrationNumber());
        System.out.println("Brand: " + car.getBrand());
        System.out.println("Model: " + car.getModel());
        System.out.println("Daily Rate: " + car.getDailyRate());
        System.out.println("Number Of Seats: " + car.getNumberOfSeats());
        
        System.out.println("------------------------------------------");
        
        truck.setRegistrationNumber("9865485484");
        truck.setBrand("Mahindra");
        truck.setModel("M-1000");
        truck.setDailyRate(1000);
        truck.setLoadCapacity(500);

        
        System.out.println("Registration No: " + truck.getRegistrationNumber());
        System.out.println("Brand: " + truck.getBrand());
        System.out.println("Model: " + truck.getModel());
        System.out.println("Daily Rate: " + truck.getDailyRate());
        System.out.println("Load Capacity: " + truck.getLoadCapacity());
        
        System.out.println("------------------------------------------");
        
        motorcycle.setRegistrationNumber("967845784");
        motorcycle.setBrand("Yamaha");
        motorcycle.setModel("FZ-X");
        motorcycle.setDailyRate(2000);
        motorcycle.setEngineCapacity(500);

        
        System.out.println("Registration No: " + motorcycle.getRegistrationNumber());
        System.out.println("Brand: " + motorcycle.getBrand());
        System.out.println("Model: " + motorcycle.getModel());
        System.out.println("Daily Rate: " + motorcycle.getDailyRate());
        System.out.println("Load Capacity: " + motorcycle.getEngineCapacity());
        
    }
    
}
