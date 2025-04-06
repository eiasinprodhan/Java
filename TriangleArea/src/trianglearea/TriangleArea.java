package trianglearea;

import java.util.Scanner;

public class TriangleArea {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Your Base: ");
        float base = scan.nextFloat();
        System.out.print("Enter Your Height: ");
        float height = scan.nextFloat();
        
        if(base <=0 || height <=0){
            System.out.println("Base Or Height Can't Be Zero Or Negetive");
    }
        else{
            double result = (base*height)/2;
            System.out.println("Area Of Triangle is: " + result);
        }
    }
    
}
