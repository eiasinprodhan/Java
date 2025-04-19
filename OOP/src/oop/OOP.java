package oop;

import java.util.Scanner;
import oop.tclass.Circle;

public class OOP {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your radius: ");
        double userInput = scan.nextDouble();
        
        Circle circle = new Circle();
        
        circle.setRadius(userInput);
        
        System.out.println("Area Of Circle: " + circle.getArea());
        System.out.println("Perimeter Of Circle: " + circle.getPerimeter());
    }
}
    
