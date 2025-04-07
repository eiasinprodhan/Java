package positivenegetivezerocheacker;

import java.util.Scanner;

public class PositiveNegetiveZeroCheacker {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter A Number: ");
        float input = scan.nextFloat();

        if (input > 0) {
            System.out.println("You Have Entered A Positive Number");
        } else if (input == 0) {
            System.out.println("You Have Entered Zero Number");
        } else {
            System.out.println("You Have Entered A Negetive Number");
        }
    }

}
