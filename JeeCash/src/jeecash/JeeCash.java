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
        System.out.println("JEE Cash(Bank For Java Programmers)");
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
                System.err.println("Invalid Choice");
        }
    }

    public static void cashIn() {
        System.out.println("Enter Your Account Number");
        long inputAccountNumber = scan.nextLong();

        System.out.println("Enter Your Amount");
        long inputAmount = scan.nextLong();

        account.cashIn(inputAccountNumber, inputAmount);
    }

    public static void cashOut() {
        System.out.println("Enter Your Account Number");
        long inputAccountNumber = scan.nextLong();

        System.out.println("Enter Your Amount");
        long inputAmount = scan.nextLong();

        account.cashOut(inputAccountNumber, inputAmount);

    }

    public static void changePin() {
        System.out.println("Sorry! We are working on it.");

    }

    public static void accountDetails() {
        System.out.println("Enter Your Account Number");
        long inputAccountDetails = scan.nextLong();
        account.accountDetails(inputAccountDetails);

    }

    public static void exitMenu() {
        System.out.println("Closed Successfully.");

    }

}
