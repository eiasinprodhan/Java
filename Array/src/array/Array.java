package array;

import java.util.Scanner;

public class Array {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("How many students do you have?: ");
        int arraySize = scan.nextInt();
        
        String[] names = new String[arraySize];
        int[] marks = new int[arraySize];
        
        String result = "";
        
        for(int i=0; i<arraySize; i++){
            System.out.print("No. " + (int)(i+1) + " student's name: ");
            String name = scan.next();
            
            System.out.print("No. " + (int)(i+1) + " student's mark: ");
            int mark = scan.nextInt();
            
            System.out.println("-------------------------------------");
            
            names[i] = name;
            marks[i] = mark;
            
            result+=i+1 + ". "+names[i] + " got " + marks[i] + " number \n"; 
        }
        
        System.out.println(result);
        
    }
}
