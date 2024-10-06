package JavaCollectionListPackage;

import java.util.Scanner;

import java.util.List;
import java.util.ArrayList;

public class ArrayListExample {

    public static void main (String args []) {
        

        /*
         * Math.abs
         * Math.round
         * Math.floor
         * Math.ceil
         * Math.sqrt
         * Math.
         */
        Product p = new Product(null, null, 0, 0, 0);

        Scanner sc = new Scanner(System.in);

        List <Product> products = new ArrayList<>();

        String name, brand;
        int qty, price;
        double amount;

        for (int i = 0; i < 5 ; i ++){

        System.out.println("Product Name = ");

        name = sc.next();

        
        System.out.println("Give Brand = ");

        brand = sc.next();

        
        System.out.println("Give quantity = ");

        qty = sc.nextInt();

        System.out.println("Give price= ");

        price = sc.nextInt();


        amount = qty * price;

        //p.setName(null);

        products.add( new Product(name , brand, qty, price, amount));

        }

        for (Product product : products) {
            product.display();
        }

        System.out.println("");
        System.out.println("");

        products.get(1).setName("Pappaya");

        products.get(2).setQty(12);

        for (Product product: products) {
            //product.display();
            product.getName();
        }

        System.out.println("");
        System.out.println("");

        // Write a program for add number

    }
    
}
