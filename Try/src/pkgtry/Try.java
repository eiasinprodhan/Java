package pkgtry;

import java.util.Scanner;
import pkgtry.tclass.ArrayFunctions;

public class Try {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        ArrayFunctions af = new ArrayFunctions();
        
        System.out.print("Enter array size: ");
        int arraySize = scan.nextInt();
        
        af.createArray(arraySize);
        af.getMyArray();
        af.getMax();
        af.getMin();

    }

}
