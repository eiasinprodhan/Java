package array;

import java.util.Arrays;
import java.util.Scanner;

public class Array {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] names = new String[15];

        for (int i = 0; i < 15; i++) {
            String userInput = scan.next();
            names[1] = userInput;
        }
        
        System.out.println(Arrays.toString(names));
        
    }

}
