package userlogin;

import java.util.Scanner;

public class UserLogin {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Your username: ");
        String userName = scan.next();

        String[] userNames = {"eiasin", "ovi", "robin", "atik", "rakib"};
        String[] passwords = {"eiasin123", "ovi123", "robin123", "atik123", "rakib123"};

        for (int i = 0; i < userNames.length; i++) {

            if (userName.equalsIgnoreCase(userNames[i])) {
                int index = i;
                System.out.print("Your password: ");
                String password = scan.next();

                if (password.equals(passwords[index])) {
                    System.out.println("Hi, " + userName.toUpperCase());
                } else {
                    System.err.println("Wrong password");
                }
                break;
                
            }
            if (i == userNames.length - 1) {
                System.err.println("Wrong username");
            }

        }

    }
}
