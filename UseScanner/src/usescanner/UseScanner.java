package usescanner;

import java.util.Scanner;

public class UseScanner {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter 1st Number: ");
        float n1 = input.nextFloat();
        System.out.print("Enter 2nd Number: ");
        float n2 = input.nextFloat();
        
        float result = (float) n1 + n2;
        
        System.out.println("Your result is: " + result);
    }
    
}
