package gradechecker;

import java.util.Scanner;

public class GradeChecker {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter Your Number");
        int input = scan.nextInt();
        
        if(input>100){
            System.out.println("Marks Can't Be Greater Than 100");
        }
        else if(input>=90){
            System.out.println("You got A");
        }
        else if(input>=80){
            System.out.println("You got B");
        }
        else if(input>=70){
            System.out.println("You got C");
        }
        else if(input>=60){
            System.out.println("You got D");
        }
        else{
            System.out.println("You failed");
        }
        }
    }
    
}
