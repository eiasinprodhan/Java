package stringreverse;

import java.util.Scanner;

public class StringReverse {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Enter your text: ");
        String userInput = scan.nextLine();
        String reverseString = "";
        
        for(int i = 0; i<userInput.length();i++){
            reverseString = userInput.charAt(i) + reverseString;
        }
        System.out.println("Reverse String: " + reverseString);
    }
    
}
