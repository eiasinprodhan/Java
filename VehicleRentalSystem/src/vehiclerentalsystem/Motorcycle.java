package vehiclerentalsystem;

public class Motorcycle extends Vehicle{
    private int engineCapacity;

    public Motorcycle() {
    }

    public Motorcycle(int engineCapacity) {
        this.engineCapacity = engineCapacity;
    }

    public Motorcycle(int engineCapacity, String registrationNumber, String brand, String model, double dailyRate, boolean isAvailable) {
        super(registrationNumber, brand, model, dailyRate, isAvailable);
        this.engineCapacity = engineCapacity;
    }

    public int getEngineCapacity() {
        return engineCapacity;
    }

    public void setEngineCapacity(int engineCapacity) {
        this.engineCapacity = engineCapacity;
    }
    
}
