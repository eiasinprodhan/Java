package methods;

import java.util.Scanner;

public class Methods {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        //User Input And Messages
        System.out.print("Enter your number: ");
        int input = scan.nextInt();

        //Declaring Methods In Variables
        String prime = findPrimeNumber(input);
        String oddEven = findOddEven(input);
        double circle = findAreaOfCircle(input);

        //Printing Method's Variable
        System.out.println(prime);
        System.out.println(oddEven);
        System.out.println("Area Of Circle: " + circle);
    }

    //Function To Find Prime Number
    public static String findPrimeNumber(int input) {

        String result = "";
        int count = 0;
        for (int i = 1; i <= input; i++) {
            if (input % i == 0) {
                count++;
            }
        }

        if (count == 2) {
            result = input + " is a prime number.";
        } else {
            result = input + " isn't a prime number.";
        }
        return result;
    }

    //Function To Calculate Area Of Circle
    public static double findAreaOfCircle(int input) {

        double result = (double) (Math.PI * Math.pow(input, 2));

        return result;
    }

    //Function To Find Odd Or Even Number
    public static String findOddEven(int input) {
        String result = "";

        if (input % 2 == 0) {
            result = input + " is even number.";
        } else {
            result = input + " is odd number.";
        }

        return result;
    }

}
