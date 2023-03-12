package com.knoldus.shoppingcartusingaggregation;

public class ItemsInCart {
    private int price;
    private int quantity;
    ItemsInCart(int price,int quantity){
        this.price = price;
        this.quantity = quantity;
    }
    public int getPrice() {
        return price;
    }
    public int getQuantity() {
        return quantity;
    }
    public int getTotalCostsOfItem() {
        return quantity * price;
    }
}
