package celsiustofahrenheit;

import java.util.Scanner;

public class CelsiusToFahrenheit {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Celsius (Integer Number Only): ");
        if (scan.hasNextInt()) {
            int input = scan.nextInt();
            int result = input * 9 / 5 + 32;
            System.out.println(input + " Celsius is " + result + " Fahrenheit");
        } else {
            System.out.println("Please enter a integer number");
        }

    }
}
