package stringandinteger;

import java.util.Scanner;

public class StringAndInteger {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Enter Month: ");

        String month = scan.next();
        
        String newStringMonth = "";

        if (month.toLowerCase().indexOf("a") + 1 > 0
                || month.toLowerCase().indexOf("e") + 1 > 0
                || month.toLowerCase().indexOf("i") + 1 > 0
                || month.toLowerCase().indexOf("o") + 1 > 0
                || month.toLowerCase().indexOf("u") + 1 > 0) {
            System.out.println("Month: " + month);
        } 
        else {
            int newMonth = Integer.parseInt(month);
            
            switch (newMonth) {
                case 1:
                    newStringMonth = "January";
                    System.out.println("Month: " + newStringMonth);
                    break;
                case 2:
                    newStringMonth = "February";
                    System.out.println("Month: " + newStringMonth);
                    break;
                case 3:
                    newStringMonth = "March";
                    System.out.println("Month: " + newStringMonth);
                    break;
                case 4:
                    newStringMonth = "April";
                    System.out.println("Month: " + newStringMonth);
                    break;
                case 5:
                    newStringMonth = "May";
                    System.out.println("Month: " + newStringMonth);
                    break;
                case 6:
                    newStringMonth = "June";
                    System.out.println("Month: " + newStringMonth);
                    break;
                case 7:
                    newStringMonth = "July";
                    System.out.println("Month: " + newStringMonth);
                    break;
                case 8:
                    newStringMonth = "August";
                    System.out.println("Month: " + newStringMonth);
                    break;
                case 9:
                    newStringMonth = "September";
                    System.out.println("Month: " + newStringMonth);
                    break;
                case 10:
                    newStringMonth = "October";
                    System.out.println("Month: " + newStringMonth);
                    break;
                case 11:
                    newStringMonth = "November";
                    System.out.println("Month: " + newStringMonth);
                    break;
                case 12:
                    newStringMonth = "December";
                    System.out.println("Month: " + newStringMonth);
                    break;
                default:
                    System.out.println("Invalid Month");
                    System.exit(0);
            }
        }
    }
    
}
