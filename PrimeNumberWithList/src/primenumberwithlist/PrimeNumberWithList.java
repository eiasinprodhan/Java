
package primenumberwithlist;

import java.util.Scanner;

public class PrimeNumberWithList {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int input = scan.nextInt();
        String result = "";

        for(int i = 1; i<=input; i++){
            int count = 0;
            for(int j = 1; j <= i; j++){
                if(i%j==0){
                    count++;
                }
            }
            if(count==2){
                result += i + ", ";
                count = 0;
            }
        }
        
        System.out.println(result);
    }
    
}
