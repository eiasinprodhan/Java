package multidimensionalarray;

import java.util.Arrays;

public class MultidimensionalArray {

    public static void main(String[] args) {
        int[][] myArray = new int[5][5];
        myArray[0][0] = 1;
        myArray[0][1] = 2;
        myArray[0][2] = 3;
        myArray[0][3] = 4;
        myArray[0][4] = 5;

        myArray[1][0] = 1;
        myArray[1][1] = 2;
        myArray[1][2] = 3;
        myArray[1][3] = 4;
        myArray[1][4] = 5;

        myArray[2][0] = 1;
        myArray[2][1] = 2;
        myArray[2][2] = 3;
        myArray[2][3] = 4;
        myArray[2][4] = 5;

        myArray[3][0] = 1;
        myArray[3][1] = 2;
        myArray[3][2] = 3;
        myArray[3][3] = 4;
        myArray[3][4] = 5;

        myArray[4][0] = 1;
        myArray[4][1] = 2;
        myArray[4][2] = 3;
        myArray[4][3] = 4;
        myArray[4][4] = 5;

        for (int row = 0; row < myArray.length; row++) {

            for (int column = 0; column < myArray[row].length; column++) {
                System.out.print(myArray[row][column] + " ");
            }
            System.out.println(",");
        }

    }

}
