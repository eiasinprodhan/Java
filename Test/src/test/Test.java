import javax.swing.*;
public class Test {
 
    public static void main(String[] args)
    {
        String fn=JOptionPane.showInputDialog("Enter your 1st number");
        String sn=JOptionPane.showInputDialog("Enter your 2nd number");
        int x=Integer.parseInt(fn);
        int y=Integer.parseInt(sn);
        int z=x+y;
        JOptionPane.showMessageDialog(null,"Your reslut is:" +z);
 
    }
}