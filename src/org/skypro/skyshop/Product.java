package org.skypro.skyshop;

public class Product {

    private String product;
    private int price;

    public void product(String product, int price) {
        this.product = product;
        this.price = price;
    }

    public String getProducts() {
        return this.product;
    }

}
