package examquestionno.pkg3;

import java.util.Scanner;

public class ExamQuestionNo3 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("How many Fibonacci number you want to see?: ");
        int limit = scan.nextInt();
        int n1 = 0;
        int n2 = 1;
        
        for(int i=1; i<=limit; i++){
            System.out.print(n1 + ", ");
            int n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
        }
        
        System.out.println("");
                
    }
    
}
