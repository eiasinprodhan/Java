package stringmethods;

import java.util.Scanner;

public class StringMethods {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        String message = scan.nextLine();
        
        System.out.println("length : " + message.length());
        System.out.println("concat : " + message.concat("End"));
        System.out.println("toUpperCase : " + message.toUpperCase());
        System.out.println("toLowerCase : " + message.toLowerCase());
    }

    private static int lenght() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
