package radiuscalculator;

import java.util.Scanner;

public class RadiusCalculator {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Your Radius: ");
        float input = scan.nextFloat();

        if (input > 0) {
            double result = (double) Math.PI * Math.pow(input, 2);
            System.out.println("Area Of Circle is: " + result);
        } else {
            System.out.println("Radius Can't Be  Zero OR Negetive.");
            System.out.print("Enter Your Radius Again: ");
            float input1 = scan.nextFloat();

            if (input1 > 0) {
                double result = (double) Math.PI * Math.pow(input1, 2);
                System.out.println("Area Of Circle is: " + result);
            } 
            else {
                System.out.println("You Have Entered Radius Value Zero OR Negetive Again!");
            }
        }
    }

}
