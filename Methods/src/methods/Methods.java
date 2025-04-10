package methods;

import java.util.Scanner;

public class Methods {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Enter your number: ");
        int input = scan.nextInt();
        
        String prime = findPrimeNumber(input);
        System.out.println(prime);
        
        double circle = findAreaOfCircle(input);
        System.out.println("Area Of Circle: " + circle);
    }

    public static String findPrimeNumber(int input) {
        
        String result = "";
        int count = 0;
        for (int i = 1; i <= input; i++) {
            if (input % i == 0) {
                count++;
            }
        }
        
        if (count == 2) {
            result =  input + " is a prime number.";
        } else {
            result = input + " isn't a prime number.";
        }
        return result;
    }
    
    public static double findAreaOfCircle(int input) {
        
        double result = (double) (Math.PI * Math.pow(input, 2));
        
        return result;
    }
    
}
