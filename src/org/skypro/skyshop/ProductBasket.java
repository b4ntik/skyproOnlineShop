package org.skypro.skyshop;

public class ProductBasket {

    private static ProductBasket[] basket = new ProductBasket[5];
    private static int sumBasket;
    private String productName;
    private int productPrice;



    public ProductBasket(String productName, int productPrice) {
        this.productName = productName;
        this.productPrice = productPrice;
    }

    //метод добавления в корзину
    public static void setUserBasket(ProductBasket[] basket, String productName, int productPrice) {
        boolean added = false;
        for (int i = 0; i < basket.length; i++) {
            if (basket[i] == null) {
                basket[i] = new ProductBasket(productName, productPrice);
                added = true;
                break;
            }
        }
        if (!added) {
            System.out.println("Корзина полная");
        }
    }


    //метод получения стоимости товаров в корзине
    public static int getBasketPrice(ProductBasket[] basket) {
        sumBasket = 0;
        for (ProductBasket price : basket) {
            if (price != null) {
                sumBasket += price.getBasketPrice();
            }
        }
        return sumBasket;
    }

    //получение названия продукта
    public String getProductName() {
        return productName;
    }

    //получение стоимости продукта
    public int getProductPrice() {
        return productPrice;
    }

    //печать содержимого корзины
    public static void printBasketComposition(ProductBasket[] basket) {
        if (basket[0] == null) {
            System.out.println("Корзина пуста");
        } else {
            for (int i = 0; i < basket.length; i++) {
                System.out.println(basket[i]);
            }
            System.out.println("Итого: " + getBasketPrice(basket));
        }
    }

    //формирование строки "товар : цена"
    public String toString() {
        return productName + " : " + productPrice;
    }

    //поиск продукта по имени в корзине
    public static boolean findProduct(ProductBasket[] basket, String product) {
        if (basket != null) {
            for (ProductBasket containProduct : basket) {
                if (containProduct != null && containProduct.getProductName().equals(product)) ;
                return true;
            }
        }
        return false;
    }

    //очистка корзины
    public static void cleanBasket(ProductBasket[] basket) {
        for (int i = 0; i < basket.length; i++) {
            basket[i] = null;
        }
    }

    //получение стоимости товаров
    public int getBasketPrice() {
        return productPrice;
    }

}

