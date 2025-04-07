package greatestnumber;

import java.util.Scanner;

public class GreatestNumber {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Your First Number: ");
        int num1 = scan.nextInt();
        System.out.print("Enter Your Second Number: ");
        int num2 = scan.nextInt();
        
        if(num1>num2){
            System.out.println(num1 + " is greater.");
        }
        else{
            System.out.println(num2 + " is greater.");
        }
    }
    
}
