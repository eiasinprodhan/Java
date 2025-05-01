package vehiclerentalsystem.classes;

public class Motorcycle extends Vehicle {

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

    public void getRentPrice() {
        if (engineCapacity >= 500) {
            System.out.println("Total Rate: " + (int) (super.getDailyRate() + 500.00) + "(Engine Capacity More Than 500)");
        } else if (engineCapacity >= 401) {
            System.out.println("Total Rate: " + (int) (super.getDailyRate() + 400.00) + "(Engine Capacity Between 400-500)");
        } else if (engineCapacity >= 301) {
            System.out.println("Total Rate: " + (int) (super.getDailyRate() + 300.00) + "(Engine Capacity Between 300-400)");
        } else if (engineCapacity >= 201) {
            System.out.println("Total Rate: " + (int) (super.getDailyRate() + 200.00) + "(Engine Capacity Between 200-300)");
        } else {
            System.out.println("Total Rate: " + (int) super.getDailyRate() + "(Engine Capacity Less Than 200)");
        }
    }

}
