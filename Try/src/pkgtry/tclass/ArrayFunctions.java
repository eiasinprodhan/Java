
package pkgtry.tclass;

import java.util.Arrays;
import java.util.Scanner;


public class ArrayFunctions {
    int[] myArray;

    public ArrayFunctions() {
    }

    public ArrayFunctions(int[] myArray) {
        this.myArray = myArray;
    }
    
    public void setMyArray(int[] myArray) {
        this.myArray = myArray;
    }


    public void getMyArray() {
        System.out.println("Your Array: " + Arrays.toString(myArray));
    }
    
    public void getMax(){
        int maxNumber = myArray[0];
        for(int number : myArray){
            if(number > maxNumber){
                maxNumber = number;
            }
        }
        System.out.println("Max Number: " + maxNumber);
    }
    
    public void getMin(){
        int minNumber = myArray[0];
        for(int number : myArray){
            if(number < minNumber){
                minNumber = number;
            }
        }
        System.out.println("Min Number: " + minNumber);
    }
    
    public void createArray(int arraySize){
        myArray = new int[arraySize];
        for(int i=0; i<myArray.length; i++){
            System.out.print("Enter " + (i+1) + position(i+1) + " number: ");
            Scanner scan = new Scanner(System.in);
            int userInput = scan.nextInt();
            myArray[i] = userInput;
        }
    }
    
    public String position(int number){
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
