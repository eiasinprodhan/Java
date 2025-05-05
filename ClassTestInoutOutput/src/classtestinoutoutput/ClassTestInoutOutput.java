package classtestinoutoutput;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ClassTestInoutOutput {

    public static void main(String[] args) {
        try {
            Scanner scan = new Scanner(System.in);
            System.out.print("What you want to do?(Read/Write): ");
            String userChoice = scan.nextLine();

            if (userChoice.equalsIgnoreCase("Write")) {
                System.out.print("Enter your file name: ");
                String fileName = scan.nextLine();

                System.out.print("Enter your text: ");
                String userInput = scan.nextLine();

                File f = new File("C:\\Users\\Admin\\Desktop\\" + fileName + ".txt");
                try (PrintWriter pw = new PrintWriter(f)) {
                    pw.println(userInput);
                    System.err.println("Your file created successfully.");
                }
            } else if (userChoice.equalsIgnoreCase("Read")) {

                System.out.print("Enter your file name: ");
                String fileName = scan.nextLine();

                File f = new File("C:\\Users\\Admin\\Desktop\\" + fileName + ".txt");

                if (f.exists()) {
                    Scanner read = new Scanner(f);
                    String result = "";
                    while (read.hasNext()) {
                        result += read.nextLine();
                    }
                    System.out.println("Your text is: " + result);
                } 
                else {
                    System.err.println("Opps! File not found.");
                }

                
            } else {
                System.err.println("Opps! Invalid choice.");
            }

        } catch (FileNotFoundException ex) {
            Logger.getLogger(ClassTestInoutOutput.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
