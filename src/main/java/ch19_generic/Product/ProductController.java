package ch19_generic.Product;

import java.util.Date;

public class ProductController {
    public static void main(String[] args) {


   Product<String> product1 = new Product("laptop","Intel i7 16GB RAM, 512GB SSD");
   Product<Double> product2 = new Product("Smartphone",799.99);
      Product<Boolean> product3 = new Product("Avilm",true);

        System.out.println(product1);
        System.out.println(product2);
        System.out.println(product3);

    }
}
