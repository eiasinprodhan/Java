
package date;

import java.util.Scanner;


public class Date {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a Year(Digit Only): ");
        int year = scan.nextInt();

        System.out.print("Enter a month (Digit Only): ");
        int month = scan.nextInt();
        String newMonth = "";

        System.out.print("Enter Date(Digit Only): ");
        int date = scan.nextInt();

        switch (month) {
            case 1:
                newMonth = "January";
                break;
            case 2:
                newMonth = "February";
                break;
            case 3:
                newMonth = "March";
                break;
            case 4:
                newMonth = "April";
                break;
            case 5:
                newMonth = "May";
                break;
            case 6:
                newMonth = "June";
                break;
            case 7:
                newMonth = "July";
                break;
            case 8:
                newMonth = "August";
                break;
            case 9:
                newMonth = "September";
                break;
            case 10:
                newMonth = "October";
                break;
            case 11:
                newMonth = "November";
                break;
            case 12:
                newMonth = "December";
                break;
            default:
                System.out.println("Invalid Month");
        }

        if (year % 4 == 0 && year % 100 != 0 || year % 400==0) {
            if (month == 2 && date > 29) {
                System.out.println("It's A Leap Year But February Can't Be More Than 29");
            } else {
                System.out.println(newMonth + " " + date + ", " + year);
            }
        }
        else{
            if (month == 2 && date > 28) {
                System.out.println("It isn't Leap Year And February Can't Be More Than 28");
            } else {
                System.out.println(newMonth + " " + date + ", " + year);
            }
        }
    }
    
}
