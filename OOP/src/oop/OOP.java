package oop;

import java.util.Scanner;
import oop.tclass.Circle;
import oop.tclass.Student;

public class OOP {

    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        System.out.print("Enter your radius: ");
//        double userInput = scan.nextDouble();
//        
//        Circle circle = new Circle();
//        
//        circle.setRadius(userInput);
//        
//        System.out.println("Area Of Circle: " + circle.getArea());
//        System.out.println("Perimeter Of Circle: " + circle.getPerimeter());
        
        Student s = new Student("Eiasin Prodhan", "eiasinprodhan@gmail.com", 1, 100, "JEE");
        s.getInfo();
    }
}
    
