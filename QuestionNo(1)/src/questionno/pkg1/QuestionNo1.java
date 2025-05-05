package questionno.pkg1;

import java.util.Scanner;

public class QuestionNo1 {

    public static void main(String[] args) {
        try {
            int result = 10/0;
            System.out.println("Result: " + result);
        } catch (Exception e) {
            System.err.println(e);
        }
    }

}
