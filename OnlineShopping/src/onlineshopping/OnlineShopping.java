package onlineshopping;

import java.util.Scanner;

public class OnlineShopping {

    public static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        menu();

    }

    public static void menu() {
        System.out.println("Welcome to Online Bazar");
        System.out.println("1.Home\n2.Search\n3.Product Categories\n4.Login\n5.Registration");
        int spc = scan.nextInt();
        if (spc == 1) {
            menu();
        } else if (spc == 2) {
            System.out.println("Product Categories");
            System.out.println("1.Men\n2.Women\n3.Grocery\n4.Furniture\n5.Electrical");
            int men = scan.nextInt();
            if (men == 1) {
                System.out.println("Product Categories");
                System.out.println("1.Shirt\n2.T-Shirt\n3.Polo T-Shirt\n4.Shoes\n5.Sun Glasses");
            }
        }
    }

}
