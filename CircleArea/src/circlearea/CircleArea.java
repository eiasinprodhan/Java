package circlearea;

import java.util.Scanner;

public class CircleArea {

    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Enter Your Radius: ");
        float input = scan.nextFloat();
        double result = Math.PI * Math.pow(input,2);
        System.out.println("Your Area is: " + result);
        
    }
    
}
