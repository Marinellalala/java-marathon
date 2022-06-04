package com.java.marathon.sprint16_exersices.other.bascetOfGoods.products;

public class Main {
    public static void main(String[] args) {
        Purchases purchases = new Purchases();
//        purchases.averagePriceInCart();
        purchases.addItem(new Clothes("jeans", 5, "s,", "red", 161, 50));
        purchases.addItem(new Clothes("aaaa", 25, "s,", "red", 161, 50));
        purchases.addItem(new Clothes("dress", 65, "s,", "red", 161, 50));
        purchases.countItem();
        purchases.getProductByIndex(0);
        System.out.println(purchases.sortByPrice());
        System.out.println(purchases.sortByName());
        System.out.println(purchases.getCart());
    }
}
