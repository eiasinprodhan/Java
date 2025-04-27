package evennumberfilecreation;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class EvenNumberFileCreation {

    public static void main(String[] args) {

        try {
            Scanner scan = new Scanner(System.in);
            
            System.out.print("Enter your file name: ");
            String fileName = scan.nextLine();
            
            System.out.print("Which number you want to generate(Odd/Even): ");
            String number = scan.nextLine();


            System.out.print("Enter your number limit: ");
            int limit = scan.nextInt();
            scan.nextLine();


            String result = "";
            int selector = 0;

            if (number.equalsIgnoreCase("Odd")) {
                selector = 1;
            } else if (number.equalsIgnoreCase("Even")) {
                selector = 0;
            } else {
                System.err.println("Invalid choice");
            }

            for (int i = 1; i <= limit; i++) {
                if (i % 2 == selector) {
                    result += i + "\n";
                }
            }

            File file = new File("C:\\Users\\Admin\\Desktop\\Odd Or Even\\" + fileName + ".txt");
            
            if (file.exists() == true) {
                System.err.println("File name already exist.");
            } else {
                System.out.println("Your file created successfully.");
                PrintWriter pw = new PrintWriter(file);
                pw.print(result);
                pw.close();
            }

        } catch (FileNotFoundException ex) {
            Logger.getLogger(FileClass.class.getName()).log(Level.SEVERE, "Unable to create a file", ex);
        }
    }

}
