
package abstractclass;

import abstractclass.abs.Circle;
import abstractclass.abs.Geometry;
import abstractclass.abs.Rectangle;

public class AbstractClass {

    public static void main(String[] args) {
        Geometry circle = new Circle(5.20);
        circle.getArea();
        circle.getPerimeter();
        Geometry rectangle = new Rectangle(20, 100);
        rectangle.getArea();
        rectangle.getPerimeter();
        
    }
    
}
