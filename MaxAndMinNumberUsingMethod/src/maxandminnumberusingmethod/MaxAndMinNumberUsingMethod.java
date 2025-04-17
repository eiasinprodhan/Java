package maxandminnumberusingmethod;

import java.util.Arrays;
import java.util.Scanner;

public class MaxAndMinNumberUsingMethod {
    
    public static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        
        System.out.print("Enter your limit: ");
        int limit = scan.nextInt();
        
        String result = findMaxAndMin(limit);
        System.out.println(result);

    }

    public static String findMaxAndMin(int limit) {
        
        int[] numbers = new int[limit];

        for (int index = 0; index < limit; index++) {
            System.out.print("Enter number " + (index + 1) + ": ");
            int number = scan.nextInt();

            numbers[index] = number;
        }

        int maxNumber = numbers[0];
        int minNumber = numbers[0];

        for (int number : numbers) {

            if (number > maxNumber) {
                maxNumber = number;
            }

            if (number < minNumber) {
                minNumber = number;
            }
        }

        String result = "Your numbers list: " + Arrays.toString(numbers) + "\n"
                + "Your min number is: " + minNumber + "\n"
                + "Your max number is: " + maxNumber;

        return (result);
    }

}
