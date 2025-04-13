package array;

import java.util.Arrays;

public class Array {

    public static void main(String[] args) {
        String[] names = {"Rakib", "Rohmatullah", "Atik", "Reja", "Sadiar"};
        int[] marks = {95, 67, 85, 58, 45};

        for (int i = 0; i < names.length; i++) {
            System.out.println(i+1 + ". " + names[i] + " got " + marks[i] + ".");
        }
        
    }
    
}
