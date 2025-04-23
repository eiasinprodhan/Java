package multipicationtable;

import java.util.Scanner;

public class MultipicationTable {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Which multipication table you want to see?: ");
        int userInput = scan.nextInt();
        
        System.err.println("Multipication Table Of " + userInput + ":");

        for (int i = 1; i <= 10; i++) {
            System.out.println(userInput + " x " + i + " = " + (userInput * i));
        }
    }

}
