package methodoverloading;

import java.util.Arrays;

public class MethodOverloading {

    public static void main(String[] args) {
        System.out.println(sum());
        System.out.println(sum(20));
        System.out.println(sum(20, 30, 40, 50, 60, 70));
        System.out.println(myArray(50,10,15,68,18,65,90));
    }
    
    public static int sum(){
        return 10+20;
    }
    
    public static int sum(int a){
        return 10+a;
    }
    
    public static int sum(int ...a){
        int sum = 0;
        for(int item : a){
            sum+=item;
        }
        return sum;
    }
    
    public static String myArray(int ...a){
        String result = Arrays.toString(a);
        return result;
    }
    
}
