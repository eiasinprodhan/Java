package factorialnumber;

import java.util.Scanner;

public class FactorialNumber {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Your Number: ");
        int input = scan.nextInt();
        int result = 1;
        
        for(int i = 1; i<=input; i++){
            result*=i;
        }
        
        System.out.println("Factorial of " + input + " is: " + result);
        }
    
}
