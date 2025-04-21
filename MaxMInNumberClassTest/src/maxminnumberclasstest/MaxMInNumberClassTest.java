package maxminnumberclasstest;

import java.util.Arrays;
import java.util.Scanner;

public class MaxMInNumberClassTest {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.print("How many numbers you want to enter?: ");
        int arraySize = scan.nextInt();
        
        int[] myArray = new int[arraySize];
        
        for(int index = 0; index < myArray.length; index++){
            System.out.print("Enter " + (index+1) + position(index+1) + " number: ");
            int userInput = scan.nextInt();
            myArray[index] = userInput;
        }
        
        System.out.println("Your numbers are: " + Arrays.toString(myArray));
        
        int maxNumber = myArray[0];
        int minNumber = myArray[0];
        
        for(int number : myArray){
            if(number > maxNumber){
                maxNumber = number;
            }
            
            if(number < minNumber){
                minNumber = number;
            }
        }
        System.out.println("Your max number is: " + maxNumber);
        System.out.println("Your min number is: " + minNumber);
    }
    
    public static String position(int number){
        switch (number) {
            case 1:
                return "st";
            case 2:
                return "nd";
            case 3:
                return "rd";
            default:
                return "th";
        }
    }

}
