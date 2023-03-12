package com.knoldus.totalsaleusingaggregation;
import java.util.ArrayList;
import java.util.List;
public class TotalSales {
     private static List items;
     public TotalSales() { this.items = new ArrayList<>(); }
    public void addItem(SalesItem item) { items.add(item); }
       public int getTotalCostsOfItem() {

         int totalCost = 0;

         for (Object item : items) {
             totalCost += (Integer) item;
         }
         return totalCost;
         }
    public static void main(String[] args) {

        SalesItem firstItem = new SalesItem(5000,50);
        firstItem.getPrice();
        firstItem.getQuantity();
        System.out.println("Total sales: $"+firstItem.getTotalCostsOfItem());

        SalesItem secondItem = new SalesItem(1600,16);
        secondItem.getPrice();
        secondItem.getPrice();
        System.out.println("Total sales: $"+secondItem.getTotalCostsOfItem());
    }
}
