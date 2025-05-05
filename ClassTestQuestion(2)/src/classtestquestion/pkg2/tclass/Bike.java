package classtestquestion.pkg2.tclass;

public class Bike extends Vehicle{
    private boolean hasCarrier;

    public Bike() {
    }

    public Bike(boolean hasCarrier) {
        this.hasCarrier = hasCarrier;
    }

    public Bike(boolean hasCarrier, String brand, int speed) {
        super(brand, speed);
        this.hasCarrier = hasCarrier;
    }

    public boolean isHasCarrier() {
        return hasCarrier;
    }

    public void setHasCarrier(boolean hasCarrier) {
        this.hasCarrier = hasCarrier;
    }

    @Override
    public void getVehicleDetials() {
        System.out.println("Bike Detials");
        System.out.println("-------------------------");
        super.getVehicleDetials();
        System.out.println("Has Carrier: " + hasCarrier);
    }

   
    
    
    
}
