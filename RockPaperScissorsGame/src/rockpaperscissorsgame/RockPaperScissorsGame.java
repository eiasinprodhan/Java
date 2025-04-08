
package rockpaperscissorsgame;

import java.util.Scanner;


public class RockPaperScissorsGame {


        public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int rand = (int) (Math.random() * 10);
        
        System.out.print("Choose Rock/Paper/Scissors: ");
        String user = scan.next();
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
                System.out.println("Server Error");
        }
        
        System.out.println("You: " + user);
        System.out.println("Computer: " + computer);
        
        if(user.equalsIgnoreCase("Rock") && computer.equalsIgnoreCase("Scissors")
                || user.equalsIgnoreCase("Paper") && computer.equalsIgnoreCase("Rock")
                || user.equalsIgnoreCase("Scissors") && computer.equalsIgnoreCase("Paper")){
            System.out.println("You Win");
        }
        else if(user.equals(computer)){
            System.out.println("Match Draw, Play Again");
        }
        else{
            System.out.println("You Lose");
        }
    }
    
}
