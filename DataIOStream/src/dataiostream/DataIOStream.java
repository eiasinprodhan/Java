package dataiostream;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataIOStream {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        
        DataOutputStream dos = new DataOutputStream(new FileOutputStream("temp.dat"));
        dos.writeInt(158);
        dos.writeUTF("Eiasin Prodhan");
        
        dos.writeInt(500);
        dos.writeUTF("Parvej Alam");
        
        DataInputStream dis = new DataInputStream(new FileInputStream("temp.dat"));
        System.out.println(dis.readInt() + " " +  dis.readUTF());
        System.out.println(dis.readInt() + " " +  dis.readUTF());
            
       

    }

}
