package classtest.vehicles;

public class Truck extends Vehicle {

    public int weight;

    public Truck() {
    }

    public Truck(int weight) {
        this.weight = weight;
    }

    public Truck(int weight, int speed, double regularPrice, String color) {
        super(speed, regularPrice, color);
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public double getSalePrice() {
        if (weight > 2000) {
            return regularPrice - (regularPrice * 0.10);
        }
        else{
            return regularPrice;
        }
    }

}
