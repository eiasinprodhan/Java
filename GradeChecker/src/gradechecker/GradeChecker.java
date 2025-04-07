package gradechecker;

import java.util.Scanner;

public class GradeChecker {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Enter Your Mark: ");
        int mark = scan.nextInt();
        
        if(mark>100){
            System.out.println("Marks Can't Be Greater Than 100");
        }
        else if(mark>=90){
            System.out.println("You got A");
        }
        else if(mark>=80){
            System.out.println("You got B");
        }
        else if(mark>=70){
            System.out.println("You got C");
        }
        else if(mark>=60){
            System.out.println("You got D");
        }
        else{
            System.out.println("You failed");
        }
        }
    }
