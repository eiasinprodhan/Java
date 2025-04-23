package bigintegerfactorial;

import java.math.BigInteger;
import java.util.Scanner;

public class BigIntegerFactorial {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter number: ");
        int userInput = scan.nextInt();

        BigInteger result = BigInteger.ONE;

        for (int i = 1; i <= userInput; i++) {
            result = result.multiply(BigInteger.valueOf(i));
        }
        
        System.out.println("Factorial of " + userInput + ": " + result);
    }
    

}
