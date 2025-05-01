package vehiclerentalsystem.classes;

public class Car extends Vehicle {

    private int numberOfSeats;
    private boolean hasAC;

    public Car() {
    }

    public Car(int numberOfSeats, boolean hasAC) {
        this.numberOfSeats = numberOfSeats;
        this.hasAC = hasAC;
    }

    public Car(int numberOfSeats, boolean hasAC, String registrationNumber, String brand, String model, double dailyRate, boolean isAvailable) {
        super(registrationNumber, brand, model, dailyRate, isAvailable);
        this.numberOfSeats = numberOfSeats;
        this.hasAC = hasAC;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    public boolean isHasAC() {
        return hasAC;
    }

    public void setHasAC(boolean hasAC) {
        this.hasAC = hasAC;
    }

    public void getRentPrice() {
        if (hasAC == true) {
            System.out.println("Total Rate: " + (int) (super.getDailyRate() + 500.00) + "(With AC)");
        } else {
            System.out.println("Total Rate: " + (int) super.getDailyRate() + "(Without AC)");
        }
    }

}
