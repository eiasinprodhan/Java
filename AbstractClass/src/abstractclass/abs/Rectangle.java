
package abstractclass.abs;

public class Rectangle extends Geometry{
    private double height;
    private double width;

    public Rectangle() {
    }

    public Rectangle(double height, double width) {
        this.height = height;
        this.width = width;
    }

    @Override
    public void getArea() {
        System.out.println("Area: " + (height * width));
    }

    @Override
    public void getPerimeter() {
       System.out.println("Perimeter: " + (2 * (height + width)));
    }
    
}
