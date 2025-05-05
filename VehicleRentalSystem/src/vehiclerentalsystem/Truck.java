package vehiclerentalsystem;

public class Truck extends Vehicle{
    private double loadCapacity;

    public Truck() {
    }

    public Truck(double loadCapacity) {
        this.loadCapacity = loadCapacity;
    }

    public Truck(double loadCapacity, String registrationNumber, String brand, String model, double dailyRate, boolean isAvailable) {
        super(registrationNumber, brand, model, dailyRate, isAvailable);
        this.loadCapacity = loadCapacity;
    }

    public double getLoadCapacity() {
        return loadCapacity;
    }

    public void setLoadCapacity(double loadCapacity) {
        this.loadCapacity = loadCapacity;
    }
    
}
