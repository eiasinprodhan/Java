package regex;

import java.util.Scanner;

public class RegEx {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Your email address: ");
        String email = scan.next();
        
        boolean status = email.matches("^\\S+@\\S+\\.\\S+$");
        
        if(status==true){
            System.out.println(email + " is valid.");
        }
        else{
            System.err.println(email + " is invalid.");
        }
    }
    
}
