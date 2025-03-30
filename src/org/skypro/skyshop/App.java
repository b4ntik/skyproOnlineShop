package org.skypro.skyshop;

public class App {
    public static void main(String[] args) {
    //Product product1 = new ProductBuilder().setProduct("Хлеб").setPrice(50).createProduct();
    Product product2 = new Product ("молоко", 50);
        //System.out.println(product1.getProduct() +" "+ product1.getProductPrice());
        //System.out.println(product2.getProduct() + " " + product2.getProductPrice());
        product2.setProduct("Молоко топленое");
        product2.setProductPrice(111);
        //System.out.println(product2.getClass() + " " + product2.getProductPrice());
        //System.out.println(product2.toString());
        ProductBasket basket1 = new ProductBasket(product2.getProductPrice());
        //System.out.println(basket1.getSumBasket());
        //basket1.productBasket(product2.getProductPrice());
        basket1.basketComposition();


    }
}