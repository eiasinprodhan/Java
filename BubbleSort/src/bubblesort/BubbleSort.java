package bubblesort;

import java.util.Arrays;
import java.util.Scanner;

public class BubbleSort {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter your array size: ");
        int arraySize = scan.nextInt();

        int[] myArray = new int[arraySize];

        for (int index = 0; index < myArray.length; index++) {
            System.out.print("Enter array value: ");
            int userValue = scan.nextInt();
            myArray[index] = userValue;
        }

        System.out.println("Array before sorting: " + Arrays.toString(myArray));

        for (int round = 0; round < myArray.length - 1; round++) {
            for (int step = 0; step < myArray.length - 1 - round; step++) {
                if (myArray[step]>myArray[step+1]) {
                    int temp = myArray[step + 1];
                    myArray[step + 1] = myArray[step];
                    myArray[step] = temp;
                }
            }
        }
        System.out.println("Array before sorting: " + Arrays.toString(myArray));
    }

}
