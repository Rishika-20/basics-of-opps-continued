package com.knoldus.totalsaleusingaggregation;
public class SalesItem {
    private int price;
    private int quantity;
    SalesItem(int price,int quantity){
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
