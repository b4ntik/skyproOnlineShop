package org.skypro.skyshop;

public class App {
    public static void main(String[] args) {
        Product product1 = new Product();
        Product product2 = new Product();
        product1.setProduct("Молоко", 100);
        product2.setProduct("Хлеб", 50);
        ProductBasket[] basket1 = new ProductBasket[5];

        System.out.println(product1.getProductName() + " : " + product1.getProductPrice());
        System.out.println(product2.getProductName() + " : " + product2.getProductPrice());

        basket1[0] = new ProductBasket(product1.getProductName(), product1.getProductPrice());
        basket1[1] = new ProductBasket(product2.getProductName(), product2.getProductPrice());


        ProductBasket.printBasketComposition(basket1);
    }
}