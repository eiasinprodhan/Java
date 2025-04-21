package pricediscount;

import java.util.Scanner;

public class PriceDiscount {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Enter product price: ");
        float price = scan.nextFloat();
        
        final float discount = 0.05f;
        float actualPrice = 0;
        float discountAmount = 0;
        
        if(price>200){
            actualPrice = price - (price*discount);
            discountAmount = price*discount;
        }
        else{
            actualPrice = price;
            discountAmount = 0;
        }
        
        System.out.println("Discount amount: " + discountAmount);
        System.out.println("Actual price: " + actualPrice);
        
        
    }
    
}
