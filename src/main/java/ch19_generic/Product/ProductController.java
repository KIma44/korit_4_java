package ch19_generic.Product;

import java.util.Date;

public class ProductController {
    public static void main(String[] args) {

Product<String> product1 = new Product("김일","김이");
    Product<Integer> product2 = new Product("김삼",22);
    Product<Double> product3 = new Product("김사",102.0);

        System.out.println(product1);
        System.out.println(product2);
        System.out.println(product3);


    }
}
