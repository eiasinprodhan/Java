package primenumber;

import java.util.Scanner;

public class PrimeNumber {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Enter Your Number: ");
        int input = scan.nextInt();
        
        int count = 0;
        
        for(int i = 1; i<=input; i++){
            if(input%i==0){
                count++;
            }
        }
        
       if(count==2){
           System.out.println(input + " is a prime number.");
       }
       else{
           System.out.println(input + " isn't a prime number.");
       }
    }
    
}
