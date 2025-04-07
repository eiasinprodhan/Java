package evenorodd;

import java.util.Scanner;

public class EvenOrOdd {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Your Number: ");
        int input = scan.nextInt();
        
        if(input%2==0){
            System.out.println(input + " is a even number.");
        }
        else{
            System.out.println(input + " is a odd number.");
        }
    }
    
}

