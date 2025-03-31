package org.skypro.skyshop;

public class ProductBasket {
    public int[] userBasketProductPrices = new int[5];
    private String[] userBasketProductNames = new String[5];
    private int sumBasket;


    //метод добавления в корзину
    public void setUserBasket(String productName, int productPrice) {

        for (int i = 0; i < userBasketProductPrices.length; i++){
            if (userBasketProductPrices[i] == 0){
                userBasketProductPrices[i] = productPrice;
                userBasketProductNames[i] = productName;
            break;
            }
        }

    }
//метод получения корзины
    public int[] getUserBasket() {
        return userBasketProductPrices;
    }
    //метод получения стоимости товаров в корзине
    public int getBasketPrice(int[] basket){
        sumBasket = 0;
for (int i = 0; i< userBasketProductPrices.length; i++){
    sumBasket += userBasketProductPrices[i];
}
        return sumBasket;
    }
    public void printBasketComposition(){
        for (int i = 0; i < userBasketProductPrices.length; i++){
            System.out.println(userBasketProductNames[i] + " : " + userBasketProductPrices[i]);
        }
        System.out.println("Итого: "+ getBasketPrice(userBasketProductPrices));
    }
//метод проверки продукта по имени в корзине
   // @Override
   // public boolean equals(Object obj) {
     //   return super.equals(obj);
   // }
    //метод очистки корзины
    public int[] cleanBasket (int[] basket){
        return  basket;
    }
}
