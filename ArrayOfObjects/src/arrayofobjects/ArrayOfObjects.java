package arrayofobjects;

import java.util.Arrays;

public class ArrayOfObjects {

    public static void main(String[] args) {
        Student[] students = new Student[5];
        
        Student atik = new Student("Atik", "atik@gmail.com", 12874860, 50, "JEE");
        Student parvej = new Student("Parvej", "parvej@gmail.com", 12874861, 99, "JEE");
        Student rakib = new Student("Rakib", "rakib@gmail.com", 12874862, 90, "JEE");
        
        students[0] = atik;
        students[1] = parvej;
        students[2] = rakib;
        
        System.out.println(Arrays.toString(students));
    }
    
}
