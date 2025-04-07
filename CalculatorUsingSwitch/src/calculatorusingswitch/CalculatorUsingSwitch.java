package calculatorusingswitch;

import java.util.Scanner;

public class CalculatorUsingSwitch {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter 1st number: ");
        long num1 = scan.nextLong();

        System.out.print("Enter 2nd number: ");
        long num2 = scan.nextLong();

        System.out.print("Enter your operator like as(+, -, /, *): ");
        String operator = scan.next();

        long result = 0;

        switch (operator) {
            case "+":
                result = num1 + num2;
                break;
            case "-":
                result = num1 - num2;
                break;
            case "/":
                result = num1 / num2;
                break;
            case "*":
                result = num1 * num2;
                break;
            default:
                System.out.println("Invalid Operator");
        }
        
        System.out.println("Your result is: " + result);
    }

}
