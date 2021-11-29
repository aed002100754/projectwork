/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dsrestaurent;

import java.util.ArrayList;
import dsrestaurent.restaurent;

/**
 *
 * @author jaahn
 */
public class restaurentdirectory {
    private ArrayList<restaurent> itemlist;

    public restaurentdirectory() {
        itemlist = new ArrayList();
    }

    public ArrayList<restaurent> getitemlist() {
        return itemlist;
    }
    
    public restaurent createrestaurent(String items){
        restaurent restaurent = new restaurent();
        restaurent.setItems(items);
        
        itemlist.add(restaurent);
        return restaurent;
    }
    
}
