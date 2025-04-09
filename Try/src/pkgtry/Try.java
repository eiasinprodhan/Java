package pkgtry;

import java.util.Scanner;

public class Try {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int count = 1;
        long factorial = 1;
        
        System.out.print("Enter Your Number: ");
        int input = scan.nextInt();
        
        do{
            factorial*=count;
            count++;
        }
        while(count <= input);
        
        System.out.println("Factorial: " + factorial);
                
    }

}
