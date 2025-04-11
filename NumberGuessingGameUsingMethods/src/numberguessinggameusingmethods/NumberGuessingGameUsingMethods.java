package numberguessinggameusingmethods;

import java.util.Scanner;

public class NumberGuessingGameUsingMethods {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Guess a number between 1-9.");
        int number = scan.nextInt();

        String result = guessingGame(number);
        System.out.println(result);

    }

    public static String guessingGame(int userGuess) {
        Scanner scan = new Scanner(System.in);
        String result = "";
        int count = 0;
        int randomNumber = (int) (Math.random() * 10);

        while(count<=2){
            if (userGuess == randomNumber) {
                result = "You win.";
            } else if (userGuess > randomNumber) {
                result = "Too higher.";
                count++;
                userGuess = scan.nextInt();
            } else if (userGuess < randomNumber) {
                result = "Too lower.";
                count++;
                userGuess = scan.nextInt();
            } else {
                result = "You lose.";
            }
        }
       
        return result;
    }

}
