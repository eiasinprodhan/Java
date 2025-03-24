package primenumber;

import java.util.Scanner;

public class PrimeNumber {
    
    public static void main(String[] args) {
        int count = 0;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Your Number:");
        int input = scan.nextInt();
        for(int i = 1; i<=input; i++){
            if(input%i==0){
                count+=1;
            }
        }
        
       if(count==2){
           System.out.println("Prime Number");
       }
       else{
           System.out.println("Not A Prime Number");
       }
    }
    
}
