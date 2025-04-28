
package abstractclass.abs;

public class Circle extends Geometry{
    private double radius;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public void getArea() {
        System.out.println("Area: " + (Math.PI * Math.pow(radius, 2)));
    }

    @Override
    public void getPerimeter() {
        System.out.println("Perimeter: " + (2 * Math.PI * radius));
    }
    
}
