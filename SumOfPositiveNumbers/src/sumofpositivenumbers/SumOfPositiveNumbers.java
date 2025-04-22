package sumofpositivenumbers;

import java.util.Scanner;

public class SumOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int result = 0;
        boolean status = true;
        
        while(status==true){
            System.out.print("Enter number: ");
            int userInput = scan.nextInt();
            
            if(userInput < 0){
                System.err.println("You entered negetive number.");
                status = false;
            }
            result+=userInput;
        }
        
        System.out.println("Sum: " + result);
    }
    
}
