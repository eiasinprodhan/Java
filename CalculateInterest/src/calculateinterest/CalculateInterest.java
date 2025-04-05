package calculateinterest;

import java.util.Scanner;

public class CalculateInterest {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Your Interest Rate(Example: 12.5%): ");
        float interestRate = input.nextFloat() / 1200;
        System.out.print("Enter Your Year: ");
        int year = input.nextInt();
         System.out.print("Enter Your Amount: ");
        float amount = input.nextFloat();
        double result = (double) amount * interestRate / (1-(1/Math.pow((1+interestRate), year*12)));
        System.out.println("Your Monthly is: " + (int) result + " Taka Only");
        System.out.println("Your Total is: " + (int) result*12*year + " Taka Only");
        
    }
    
}
