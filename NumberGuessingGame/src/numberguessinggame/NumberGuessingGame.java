package numberguessinggame;

import java.util.Scanner;

public class NumberGuessingGame {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int rand = (int) (Math.random() * 10);

        int count = 0;

        while (count < 3) {
            System.out.print("Guess a number between 1-10 (You have only 3 chances to guess): ");
            int input = scan.nextInt();
            
            if (input == rand) {
                System.out.println("Hooray! you win");
                break;
            } else {
                count++;
                System.out.print("Alas! you lose");
                if (input > rand) {
                    System.out.println(" and you guess too high");
                } else {
                    System.out.println(" and you guess too low");
                }
            }
        }
        
        System.out.println("Correct number is: " + rand);
    }

}
