package fibonacci;

import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Your Number: ");
        int input = scan.nextInt();
        int n1 = 0;
        int n2 = 1;
        for(int i = 1; i<=input; i++){
            int n3 = n1 + n2;
            System.out.print(n1 + ", ");
            n1 = n2;
            n2 = n3;
            
        }
    }
    
}
