package checkvowels;

import java.util.Scanner;

public class CheckVowels {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a letter: ");
        char charecter = scanner.next().charAt(0);
        
        char letter = Character.toUpperCase(charecter);

            if (letter == 'A' || letter == 'E' || letter == 'I' || letter == 'O' || letter == 'U') {
                System.out.println(letter + " is a vowel.");
            } else {
                System.out.println(letter + " is a consonant.");
            }
        }

   
    }

