package learnmap;

import java.util.Arrays;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class LearnMap {

    public static void main(String[] args) {
        try {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your ID: ");
        
        int userInput = scan.nextInt();
        
        Map<Integer, Student> studentInfo = new HashMap<>();
        
        studentInfo.put(1287039, new Student("Md. Atiqul Islam", "JEE", "CCSL", "Emran Hossain", "Running","0178569858"));
        studentInfo.put(1287046, new Student("Halima Akter", "JEE", "CCSL", "Emran Hossain", "Running","0178569858"));
        studentInfo.put(1287271, new Student("Atiqur Rahman", "JEE", "CCSL", "Emran Hossain", "Running","0178569858"));
        studentInfo.put(1287283, new Student("Md. Arifur Rahman", "JEE", "CCSL", "Emran Hossain", "Withdrawn","0178569858"));
        studentInfo.put(1287315, new Student("Sathe Khanom", "JEE", "CCSL", "Emran Hossain", "Running","0178569858"));
        studentInfo.put(1287462, new Student("Abdullah Al Masud", "JEE", "CCSL", "Emran Hossain", "Running","0178569858"));
        studentInfo.put(1287470, new Student("Eiasin Prodhan", "JEE", "CCSL", "Emran Hossain", "Running","01888118271"));
        studentInfo.put(1287519, new Student("Md. Rahmatullah", "JEE", "CCSL", "Emran Hossain", "Running","0178569858"));
        studentInfo.put(1287528, new Student("Md. Rahim Khan", "JEE", "CCSL", "Emran Hossain", "Running","01777051706"));
        studentInfo.put(1287647, new Student("Md. Sadiar Rahman", "JEE", "CCSL", "Emran Hossain", "Running","0178569858"));
        studentInfo.put(1287675, new Student("Md. Rakib Islam", "JEE", "CCSL", "Emran Hossain", "Running","01568086569"));
        studentInfo.put(1287748, new Student("Samim Junayet Istiaq", "JEE", "CCSL", "Emran Hossain", "Running","0178569858"));
        studentInfo.put(1287759, new Student("Rejaul Karim", "JEE", "CCSL", "Emran Hossain", "Running","0178569858"));
        studentInfo.put(1287799, new Student("Md. Parvej Hossen", "JEE", "CCSL", "Emran Hossain", "Running","01906600275"));
        studentInfo.put(1287829, new Student("Md. Imran Mia", "JEE", "CCSL", "Emran Hossain", "Running","0178569858"));
        

        System.out.println(studentInfo.get(userInput).toString());
        
        
//            Iterator<Map.Entry<Integer, Student>> li = studentInfo.entrySet().iterator();
//            
//            while(li.hasNext()){
//                Map.Entry<Integer, Student> entry = li.next();
//                System.out.println("Key: " + entry.getKey());
//            }
        
        
        } catch (Exception e) {
            System.out.println("Data not found!");
        }
    }

}
