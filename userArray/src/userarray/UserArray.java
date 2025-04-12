package userarray;

import java.util.Arrays;
import java.util.Scanner;

public class UserArray {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your array size");
        int arraySize = scan.nextInt();

        int[] myArray = new int[arraySize];

        for (int i = 0; i < arraySize; i++) {
            System.out.println("Enter your array data");
            int userInput = scan.nextInt();

            myArray[i] = userInput;
        }
        
        sum(myArray);
    }
    
    public static void sum(int... a) {

        int sum = 0;

        for (int item : a) {
            sum += item;
        }

        System.out.println(Arrays.toString(a));
        System.out.println(sum);

    }

}
