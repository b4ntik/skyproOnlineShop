package org.skypro.skyshop;

public class ProductBuilder {
    private String product;
    private int price;

    public ProductBuilder setProduct(String product) {
        this.product = product;
        return this;
    }

    public ProductBuilder setPrice(int price) {
        this.price = price;
        return this;
    }

    public Product createProduct() {
        return new Product(product, price);
    }
}