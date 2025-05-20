package filepractice;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class FilePractice {

    
    public static void main(String[] args) {
        File f = new File("java.txt");
        try {
            PrintWriter pw = new PrintWriter(f);
            pw.println("Hello, World");
            pw.close();
            
            Scanner s = new Scanner(f);
            System.out.println(s.nextLine());
        } catch (FileNotFoundException ex) {
            Logger.getLogger(FilePractice.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
