package binaryio;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class BinaryIO {

    public static void main(String[] args) {
        try {
            FileOutputStream fos = new FileOutputStream("java.dat");
            fos.write(10);
            fos.write(10000000);
            fos.write(100000000);
            fos.write(100000);
            fos.write(10000000);
            fos.close();
            
            FileInputStream fis = new FileInputStream("java.dat");
            int value;
            while((value = fis.read()) != -1){
                System.out.println(value + ", ");
            }
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(BinaryIO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(BinaryIO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
