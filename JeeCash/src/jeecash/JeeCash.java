package jeecash;

import java.util.Scanner;
import jeecash.classes.Account;

public class JeeCash {

    public static Scanner scan = new Scanner(System.in);
    public static Account account = new Account(1287470, 100, "Eiasin Prodhan", 63342);

    public static void main(String[] args) {
        home();
    }

    public static void home() {
        System.out.println("JEE Cash(Trusted online bank for Java programmers)");
        System.out.println("1.Cash In\n2.Cash Out\n3.Change Pin\n4.Account Details\n5.Close");
        int inputHome = scan.nextInt();
        switch (inputHome) {
            case 1 ->
                cashIn();
            case 2 ->
                cashOut();
            case 3 ->
                changePin();
            case 4 ->
                accountDetails();
            case 5 ->
                exitMenu();
            default ->
                System.err.println("Invalid choice or input");
        }
    }

    public static void cashIn() {
        System.out.println("JEE Cash(Cash In)");
        System.out.print("Your account number: ");
        long inputAccountNumber = scan.nextLong();

        System.out.print("Your pin: ");
        int inputPin = scan.nextInt();

        System.out.print("Your amount: ");
        long inputAmount = scan.nextLong();

        account.cashIn(inputAccountNumber, inputPin, inputAmount);
    }

    public static void cashOut() {
        System.out.println("JEE Cash(Cash Out)");
        System.out.print("Your account number: ");
        long inputAccountNumber = scan.nextLong();

        System.out.print("Enter your pin: ");
        int inputPin = scan.nextInt();

        System.out.print("Your amount: ");
        long inputAmount = scan.nextLong();

        account.cashOut(inputAccountNumber, inputPin, inputAmount);

    }

    public static void changePin() {
        System.out.println("JEE Cash(Change Pin)");
        System.out.print("Your account number: ");
        long inputAccountNumber = scan.nextLong();

        System.out.print("Your old pin: ");
        int oldPin = scan.nextInt();

        System.out.print("Your new pin: ");
        int newPin = scan.nextInt();

        System.out.print("Your new pin again: ");
        int newPinAgain = scan.nextInt();

        account.changePin(inputAccountNumber, oldPin, newPin, newPinAgain);

    }

    public static void accountDetails() {
        System.out.println("JEE Cash(Account Detials)");
        System.out.print("Your account number: ");
        long inputAccountDetails = scan.nextLong();

        System.out.print("Your pin: ");
        int inputPin = scan.nextInt();

        account.accountDetails(inputAccountDetails, inputPin);

    }

    public static void exitMenu() {
        System.err.println("Closed successfully.");
        scan.close();
        System.exit(0);

    }

}
