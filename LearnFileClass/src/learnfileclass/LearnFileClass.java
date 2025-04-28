package learnfileclass;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class LearnFileClass {

    public static void main(String[] args) {
        File file = new File("C:\\Users\\Admin\\Desktop\\java.txt");
        
        try {
            Scanner scan = new Scanner(file);
           
            while(scan.hasNext()){
                String[] myArrays = scan.nextLine().split(" ");
                System.out.println(Arrays.toString(myArrays));
            }
            
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(LearnFileClass.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
