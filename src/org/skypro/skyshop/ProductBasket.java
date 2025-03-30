package org.skypro.skyshop;

public class ProductBasket {

    int sumBasket = 0;
    boolean isProductAvailability;
    private Product product;
    String productName = product.getProduct();
    int productPrice = product.getProductPrice();


//метод для добавления продуктов в корзину
    public  ProductBasket(int price) {
        sumBasket += price;
       // productName = product.getProduct();
    }
//метод для получения стоимости корзины
    public int getSumBasket() {

        return this.sumBasket;
    }

    // метод печати стоимости корзины
    public void basketComposition(){
        System.out.println("Товар: " + productName + ", его цена: " + productPrice);
    }
    //метод проверяющий продукт в корзине по имени
    public boolean checkProductInBasket (String name){
       return isProductAvailability;
    }
    //метод очистки корзины
    //public int[] cleanBasket(){
//return
   // }

}

