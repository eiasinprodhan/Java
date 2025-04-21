package fibonacciclasstest;

import java.util.Scanner;

public class FibonacciClassTest {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Enter fibonacci series limit: ");
        int userInput = scan.nextInt();
        
        int num1 = 0;
        int num2 = 1;
        
        System.out.print("Your fibonacci series is: ");
        for(int i = 1; i<=userInput; i++){
            System.out.print(num1 + ", ");
            int num3 = num1 + num2;
            num1 = num2;
            num2 = num3;
        }
        System.out.println("");
        
    }
    
}
