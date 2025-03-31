package org.skypro.skyshop;

public class ProductBasket {

    private static ProductBasket[] basket = new ProductBasket[5];
    private static int sumBasket;
    private String productName;
    private int productPrice;


public ProductBasket(String productName, int productPrice ){
    this.productName = productName;
    this.productPrice = productPrice;
}
    //метод добавления в корзину
    public static void setUserBasket(String productName, int productPrice) {

        for (int i = 0; i < basket.length; i++) {
            if (basket[i].equals(null)) {
                basket[i] = new ProductBasket(productName, productPrice);
                break;
            }
        }

    }

    //метод получения корзины
    public ProductBasket[] getUserBasket() {
        return basket;
    }

    //метод получения стоимости товаров в корзине
    public static int getBasketPrice(ProductBasket[] basket) {
        sumBasket = 0;
        for (ProductBasket price: basket) {
            if (price != null) {
                sumBasket += price.getBasketPrice();
            }
        }
        return sumBasket;
    }

    public static void printBasketComposition(ProductBasket[] basket) {
        for (int i = 0; i < basket.length; i++) {
            System.out.println(basket[i]);
        }
        System.out.println("Итого: " + getBasketPrice(basket));
    }
    public String toString(){
        return productName + " : "+ productPrice;
    }
    //метод проверки продукта по имени в корзине
    // @Override
    // public boolean equals(Object obj) {
    //   return super.equals(obj);
    // }
    //метод очистки корзины
    public static void cleanBasket(ProductBasket[] basket) {
        for (int i = 0; i < basket.length; i++) {
            basket[i] = null;
        }
    }
        public int getBasketPrice(){
            return productPrice;
        }

    }

