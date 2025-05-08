package pkgtry;

import java.util.Scanner;

public class Try {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String sentence = "Hello World";
        char[] letters = sentence.toCharArray();
        
        System.out.print("[");
        for (char c : letters) {
            System.out.print(c + " ,");
        }
        System.out.println("]");
    }
}
