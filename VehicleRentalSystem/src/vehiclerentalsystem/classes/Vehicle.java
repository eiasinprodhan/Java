package vehiclerentalsystem.classes;


public class Vehicle {
    private String registrationNumber;
    private String brand;
    private String model;
    private double dailyRate;
    private boolean isAvailable;

    public Vehicle() {
    }

    public Vehicle(String registrationNumber, String brand, String model, double dailyRate, boolean isAvailable) {
        this.registrationNumber = registrationNumber;
        this.brand = brand;
        this.model = model;
        this.dailyRate = dailyRate;
        this.isAvailable = isAvailable;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getDailyRate() {
        return dailyRate;
    }

    public void setDailyRate(double dailyRate) {
        this.dailyRate = dailyRate;
    }

    public boolean isIsAvailable() {
        return isAvailable;
    }

    public void setIsAvailable(boolean isAvailable) {
        this.isAvailable = isAvailable;
    }

    public void getInfo() {
        if(isIsAvailable()==true){
            System.out.println("Registration Number: " + registrationNumber + "\n"
                    + "Brand: " + brand + "\n"
                    +"Model:" + model + "\n"
                    +"Daily Rate: " + dailyRate);
        }
        else{
            System.out.println("Sorry! Not availabe.");
            System.exit(0);
        }
    }
    
    
}
