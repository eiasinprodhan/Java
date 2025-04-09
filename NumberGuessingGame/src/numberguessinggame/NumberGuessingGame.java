package numberguessinggame;

import java.util.Scanner;

public class NumberGuessingGame {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int rand = (int) (Math.random() * 10);

        int count = 1;

        while (count <= 3) {
            System.out.print("Guess a number between 1-10 (You have only 3 chances to guess): ");
            int input = scan.nextInt();
            
            if (input == rand) {
                System.out.println("Hooray! you win");
                break;
            }
            else if(input>rand && count<=2){
                System.err.println("Too Higher");
            }
            else if(input<rand && count<=2){
                System.err.println("Too Lower");
            }
            
            if(count==3){
                System.err.println("Alas! You Lose");
            }
            
            count++;
        }
        
        System.err.println("Correct number is: " + rand);
    }

}
