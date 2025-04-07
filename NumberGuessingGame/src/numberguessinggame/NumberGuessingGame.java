package numberguessinggame;

import java.util.Scanner;

public class NumberGuessingGame {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int rand = (int) (Math.random() * 10 + 1);

        int chance = 0;

        while (chance < 3) {
            System.out.print("Guess A Number In 1-9 (You Will Get 3 Chances): ");
            int input = scan.nextInt();
            
            if (input == rand) {
                System.out.println("Hooray! You Win");
                break;
            } else {
                chance++;
                System.out.print("You Lose");
                if (input > rand) {
                    System.out.println(" And Your Input is greater than Random Number");
                } else {
                    System.out.println(" And Your Input is less than Random Number");
                }
            }
        }
    }

}
