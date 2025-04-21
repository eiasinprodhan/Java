package bubblesortclasstest;

import java.util.Arrays;
import java.util.Scanner;

public class BubbleSortClassTest {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.print("How many numbers you want to enter?: ");
        int arraySize = scan.nextInt();
        
        int[] myArray = new int[arraySize];
        
        for(int index = 0; index<myArray.length; index++){
            System.out.print("Enter " + position(index+1) + " number: ");
            int arrayValue = scan.nextInt();
            myArray[index] = arrayValue;
        }
        
        System.out.println("Your array(Before sorting): " + Arrays.toString(myArray));
        
        for(int i = 0; i < myArray.length - 1;i++){
            for(int j = 0; j < myArray.length - 1 - i; j++){
                if(myArray[j] > myArray[j+1]){
                    int temp = myArray[j];
                    myArray[j] = myArray[j+1];
                    myArray[j+1] = temp;
                }
            }
        }
        System.out.println("Your array(After sorting): " + Arrays.toString(myArray));
        
        
    }
    
    public static String position(int number){
        String position;
        switch (number) {
            case 1:
                position = number + "st";
                break;
            case 2:
                position = number + "nd";
                break;
            case 3:
                position = number + "rd";
                break;
            default:
                position = number + "th";
        }
        return position;
    }
    
}
