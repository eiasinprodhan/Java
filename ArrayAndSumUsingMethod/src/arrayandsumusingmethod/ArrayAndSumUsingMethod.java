package arrayandsumusingmethod;

import java.util.Scanner;

public class ArrayAndSumUsingMethod {

    public static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.print("Enter your row limit: ");
        int rowSize = scan.nextInt();

        System.out.print("Enter your column limit: ");
        int columnSize = scan.nextInt();
        
        System.out.println("Sum of your array: " + doArraySum(rowSize, columnSize));

    }

    public static int doArraySum(int rowSize, int columnSize) {
        int[][] myArray = new int[rowSize][columnSize];
        int result = 0;

        for (int row = 0; row < myArray.length; row++) {

            for (int column = 0; column < myArray[row].length; column++) {
                System.out.print("Enter value for row " + (row + 1) + " x column " + (column + 1) + ": ");
                int userInput = scan.nextInt();
                myArray[row][column] = userInput;
                result+=myArray[row][column];
            }
        }

        return result;
    }

}
