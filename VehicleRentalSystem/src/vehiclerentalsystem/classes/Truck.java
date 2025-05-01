package vehiclerentalsystem.classes;

public class Truck extends Vehicle {

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

    public void getRentPrice() {
        if (loadCapacity >= 2500) {
            System.out.println("Total Rate: " + (int) (super.getDailyRate() + 500.00) + "(Load Capacity More Than 2500)");
        } else if (loadCapacity >= 2000) {
            System.out.println("Total Rate: " + (int) (super.getDailyRate() + 400.00) + "(Load Capacity Between 2000-2500)");
        } else if (loadCapacity >= 1500) {
           System.out.println("Total Rate: " + (int) (super.getDailyRate() + 300.00) + "(Load Capacity Between 1500-2000)");
        } else if (loadCapacity >= 1000) {
            System.out.println("Total Rate: " + (int) (super.getDailyRate() + 200.00) + "(Load Capacity Between 1000-1500)");
        } else {
            System.out.println("Total Rate: " + (int) super.getDailyRate() + "(Load Capacity Less Than 1000)");
        }
    }

}
