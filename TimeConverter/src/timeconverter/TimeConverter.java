package timeconverter;

import java.util.Scanner;

public class TimeConverter {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Seconds: ");
        int input = scan.nextInt();
        int seconds = input%60;
        int tempminutes = input/60;
        int minutes = tempminutes%60;
        int hours = tempminutes/60;
        
     
        System.out.println(input + " seconds is " +  hours + " hours and " + + minutes + " minutes and " + seconds + " seconds");
    }
    
}
