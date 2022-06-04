package com.java.marathon.sprint16_exersices.other.bascetOfGoods.products;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Purchases {

    private List<Product> cart;

    public Purchases() {
        this.cart = new ArrayList<>();
    }

    public List<Product> getCart() {
        return cart;
    }

    static double averagePriceInCart(List<Product> cart) {
        double total=0;
        for (Product product: cart) {
            total+=product.getPrice();
        }
        return total/cart.size();
    }

    double averagePriceInCart() {
        double total=0;
        for (Product product: this.cart) {
            total+=product.getPrice();
        }
        return total/this.cart.size();
    }

    public Purchases(List<Product> cart) {
        this.cart = cart;
    }

    public boolean addItem(Product product) {
        return this.cart.add(product);
    }

    public int countItem() {
        return this.cart.size();
    }

    public Product getProductByIndex(int i) {
        return this.cart.get(i);
    }


    public List<Product> sortByPrice() {
        List<Product> cart = this.cart;
        cart.sort(new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                if(o1.getPrice()>o2.getPrice()){
                    return 1;
                } else if (o1.getPrice()<o2.getPrice()) {
                    return -1;
                } else
                    return 0;
            }
        });
        return cart;
    }

    public List<Product> sortByName() {
        List<Product> cart = this.cart;
        cart.sort(new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });
        return this.cart;
    }
}
