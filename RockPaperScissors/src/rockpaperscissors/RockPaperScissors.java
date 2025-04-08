package rockpaperscissors;

import java.util.Scanner;

public class RockPaperScissors {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter Rock/Paper/Scissors: ");
        String user = scan.next();
        int rand = (int) ((Math.random() * 10 + 1));
        String computer = "";

        switch (rand) {
            case 1:
                computer = "Rock";
                break;
            case 2:
                computer = "Paper";
                break;
            case 3:
                computer = "Scissors";
                break;
            case 4:
                computer = "Rock";
                break;
            case 5:
                computer = "Paper";
                break;
            case 6:
                computer = "Scissors";
                break;
            case 7:
                computer = "Rock";
                break;
            case 8:
                computer = "Paper";
                break;
            case 9:
                computer = "Scissors";
                break;
            default:
                System.out.println("Computer Error");
        }

        System.out.println("User: " + user);
        System.out.println("Computer: " + computer);

        if (user == "Rock" && computer == "Scissors"
                || user == "Paper" && computer == "Rock"
                || user == "Scissors" && computer == "Paper") {
            System.out.println("You Win");
        }
        else if (user == computer) {
            System.out.println("Match Draw");

        } else {
            System.out.println("You Lose");
        }

    }
}
