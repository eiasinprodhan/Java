package celsiustofahrenheit;

import java.util.Scanner;

public class CelsiusToFahrenheit {

    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
        System.out.println("Enter Celsius: ");
       int input = scan.nextInt();
        System.out.println(input + " Celsius is " + (input*9/5+32) + " Fahrenheit");
    }
    
}
