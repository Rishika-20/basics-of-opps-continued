package com.knoldus.shoppingcartusingaggregation;
import java.util.ArrayList;
import java.util.List;
public class ShoppingCart {

     private static List items;
     public ShoppingCart() { this.items = new ArrayList<>(); }
    public void addItem(ItemsInCart item) { items.add(item); }
       public int getTotalCostsOfItem() {

         int totalCost = 0;

         for (Object item : items) {
             totalCost += (Integer) item;
         }
         return totalCost;
         }
    public static void main(String[] args) {

        ItemsInCart firstItem = new ItemsInCart(1000,10);
        firstItem.getPrice();
        firstItem.getQuantity();
        System.out.println("Total cost of first item in cart is: $"+firstItem.getTotalCostsOfItem());

        ItemsInCart secondItem = new ItemsInCart(800,8);
        secondItem.getPrice();
        secondItem.getPrice();
        System.out.println("Total cost of second item in cart is: $"+secondItem.getTotalCostsOfItem());
    }
}
