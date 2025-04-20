package social;

import java.util.Scanner;
import java.util.UUID;
import social.tclass.User;

public class Social {

    public static Scanner scan = new Scanner(System.in);
    public static User user = new User();

    public static void main(String[] args) {
        System.out.print("Choose Login Or Registration: ");
        String userChoice = scan.next();

        if (userChoice.equalsIgnoreCase("Login")) {

            System.out.print("Email: ");
            String email = scan.next();

            System.out.print("Password: ");
            String password = scan.next();
            
            user.Login(email, password);

        } 
        else if (userChoice.equalsIgnoreCase("Registration")) {

            System.out.print("Username: ");
            String username = scan.next();

            System.out.print("Email: ");
            String email = scan.next();

            System.out.print("Password: ");
            String password = scan.next();
            
            user.Registration(username, email, password);

        }
        else{
            System.out.println("Invalid choice.");
        }
    }

}
