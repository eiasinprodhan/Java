package passingobjecttomethods;

import java.util.Scanner;

public class PassingObjectToMethods {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        getScanner(scan);
    }
    
    public static void getScanner(Scanner scan){
        System.out.println("Enter your name: ");
        String userName = scan.next();
        System.out.println(userName);
    }
    
}
