package pkgtry;

import java.util.Scanner;
import pkgtry.tclass.ArrayFunctions;

public class Try {

    public static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        main();

    }

    public static void main() {
        System.out.println("Welcome Online Shop");
        System.out.println("1. Home\n2.Balance\n3.Deposit");
        int userChoice = scan.nextInt();
        if (userChoice == 1) {
            main();
        } else if (userChoice == 2) {
         
            System.out.println("Balance");
             System.out.println("1.Home");
            System.out.println("2.Current Balance\n3.Loan");
            userChoice = scan.nextInt();
            if(userChoice==1){
                main();
            }
            else if(userChoice==2){
                
            }
            
        }
    }

}
