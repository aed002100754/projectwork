/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package deliverysystem;
import dsrestaurent.restaurentdirectory;
import ds.useraccounts;


import ds.useraccounts;

/**
 *
 * @author jaahn
 */
public class ConfigureASystem {

  public static EcoSystem configure(){
        
        EcoSystem system = EcoSystem.getInstance();
        
   
        
        restaurent resaurent = system.get.createitem("sysadmin");
        
        UserAccount ua = system.getUserAccountDirectory().createUserAccount("sysadmin", "sysadmin", restaurent, new restaurent());
        
        return system;
    }
}