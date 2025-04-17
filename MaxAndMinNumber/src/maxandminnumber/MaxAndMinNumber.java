package maxandminnumber;

import java.util.Arrays;
import java.util.Scanner;

public class MaxAndMinNumber {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Enter your limit: ");
        int limit = scan.nextInt();
        int[] numbers = new int[limit];
        

//User This This Variable
//int maxNumber = 0;
//int minNumber = 999999999;
        
        
        for(int index = 0; index < limit; index++){
            System.out.print("Enter number " + (index+1) + ": ");
            int number = scan.nextInt();
            
            numbers[index] = number;
        }
        
//Or Use This Variable
        int maxNumber = numbers[0];
        int minNumber = numbers[0];
        
        System.out.println("Your numbers list: "+ Arrays.toString(numbers));
        
        for(int number : numbers){
            
            if(number > maxNumber){
                maxNumber = number;
            }
            
            if(number < minNumber){
                minNumber = number;
            }
        }
        
        System.out.println("Your min number is: " + minNumber);
        System.out.println("Your max number is: " + maxNumber);
        
    }
    
}
