/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dsrestaurent;

/**
 *
 * @author jaahn
 */
public class restaurent {
     private String items;
     private int price;  

    public String getItems() {
        return items;
    }

    public void setItems(String items) {
        this.items = items;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getItemid() {
        return itemid;
    }

    public void setItemid(int itemid) {
        this.itemid = itemid;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        restaurent.count = count;
    }
    private int itemid;
    private static int count = 1;

    public restaurent() {
        itemid = count;
        count++;
    }
    
}
