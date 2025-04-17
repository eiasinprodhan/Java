package fibonacci;

import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your limit: ");
        int input = scan.nextInt();
        
        int n1 = 0;
        int n2 = 1;
        
        System.out.print("Your fibonacci series is: ");
        
        for(int i = 1; i<=input; i++){
            int n3 = n1 + n2;
            System.out.print(n1 + ", ");
            n1 = n2;
            n2 = n3;
            
        }
    }
    
}
