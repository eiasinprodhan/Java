package primenumberclasstest;

import java.util.Scanner;

public class PrimeNumberClassTest {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Enter your number: ");
        int userInput = scan.nextInt();
        
        int count = 0;
        
        for(int i = 1; i<= userInput; i++){
            if(userInput % i ==0){
                count++;
            }
        }
        
        if(count==2){
            System.out.println(userInput + " is a prime number");
        }
        else{
             System.out.println(userInput + " isn't a prime number");
        }
    }
    
}
