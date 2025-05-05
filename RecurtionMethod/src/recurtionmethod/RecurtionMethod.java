package recurtionmethod;

public class RecurtionMethod {

    public static void main(String[] args) {
        System.out.println(factorial(5));
        oddOrEven(15);
    }

    public static long factorial(int n) {

        if (n == 0) {
            return 1;
        } else {
            System.out.println(n);
            return n * factorial(n - 1);
        }
    }
    
    public static void oddOrEven(int n) {
        if(n<=0){
            System.out.println("");
        }
        else{
            oddOrEven(n-2);
            System.out.println(n);
        }
    }

}
