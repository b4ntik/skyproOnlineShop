package org.skypro.skyshop;

public class Product {

    public static String product;
    public int price;

    public Product(String product, int price) {

        this.product = product;
        this.price = price;
    }

    public String getProduct() {
        return this.product;
    }
    public int getProductPrice() {
        return price;
    }
    public void setProduct(String product) {
        this.product = product;
    }

    public void setProductPrice(int price) {

        this.price = price;
    }

    public String toString() {
        return "Товар: " + this.product + ", его цена: " + this.price;
    }
}
