package org.skypro.skyshop;

import java.util.Arrays;
import java.util.Optional;

public class App {
    public static void main(String[] args) {
        Product product1 = new Product();
        Product product2 = new Product();
        product1.setProduct("Молоко", 100);
        product2.setProduct("Хлеб", 50);


        System.out.println(product1.getProductName() + " : " + product1.getProductPrice());
        System.out.println(product2.getProductName() + " : " + product2.getProductPrice());
        ProductBasket basket1 = new ProductBasket();
        basket1.setUserBasket(product1.getProductName(), product1.getProductPrice());
        basket1.setUserBasket(product2.getProductName(), product2.getProductPrice());

        basket1.printBasketComposition();
    }
}