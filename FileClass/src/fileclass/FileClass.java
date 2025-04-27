package fileclass;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class FileClass {

    public static void main(String[] args) {

        try {
            Scanner scan = new Scanner(System.in);
            System.out.print("How many text you want to create?: ");
            int limit = scan.nextInt();
            scan.nextLine();
            for (int i = 1; i <= limit; i++) {
                System.out.print("Your text file name: ");
                String paragraphName = scan.nextLine();
                System.out.print("Your text file contents: ");
                String paragraph = scan.nextLine();

                PrintWriter pw = new PrintWriter("C:\\Users\\Admin\\Desktop\\Paragraph\\" + paragraphName + ".txt");
                pw.print(paragraph);
                System.out.println(i + " text files created successfully.");
                pw.close();
            }

        } catch (FileNotFoundException ex) {
            System.err.println("Text file created unsuccessfully.");
           //Logger.getLogger(FileClass.class.getName()).log(Level.SEVERE, "Unable to create a file", ex);

        }

    }

}
