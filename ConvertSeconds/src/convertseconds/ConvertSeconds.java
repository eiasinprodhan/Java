/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package convertseconds;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class ConvertSeconds {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Seconds: ");
        int totalSeconds = scan.nextInt();
        
        int sirHours = totalSeconds / 3600;
        int remainingSeconds = totalSeconds % 3600;
        int sirMinutes = remainingSeconds/60;
        int sirSeconds = remainingSeconds%60;
        
        System.out.println(totalSeconds + " seconds is " +  sirHours + " hours and " + + sirMinutes + " minutes and " + sirSeconds + " seconds");
    }
    
}
