package pricediscount;

import java.util.Scanner;

public class PriceDiscount {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Enter product price: ");
        float price = scan.nextFloat();
        
        final float discount = 0.05f;
        float discountAmount;
        float actualPrice;
        
        if(price>200){
            discountAmount = price * discount;
            actualPrice = price - discountAmount;
        }
        else{
            discountAmount = 0;
            actualPrice = price;
        }
        
        System.out.println("Discount amount: " + discountAmount);
        System.out.println("Actual price: " + actualPrice);
        
        
    }
    
}
