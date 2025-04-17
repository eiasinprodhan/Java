package twodimensionalarray;

import java.util.Arrays;
import java.util.Scanner;

public class TwoDimensionalArray {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Enter your row limit: ");
        int rowSize = scan.nextInt();
        
        System.out.print("Enter your column limit: ");
        int columnSize = scan.nextInt();
        
        int[][] myArrays = new int[rowSize][columnSize];
        
        for(int row = 0; row < myArrays.length; row++){
            
            for(int column = 0; column < myArrays[row].length; column++){
                System.out.print("Enter Value For " + (row+1) + " x  " + (column+1) + ": ");
                int userInput = scan.nextInt();
                myArrays[row][column] = userInput;
            }
        }
        
        System.out.println(Arrays.deepToString(myArrays));
        
    }
    
}
