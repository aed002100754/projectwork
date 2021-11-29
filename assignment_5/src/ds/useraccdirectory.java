/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ds;

import java.util.ArrayList;

/**
 *
 * @author jaahn
 */
public class useraccdirectory {
    private ArrayList<useraccounts> userAccountList;

    public useraccdirectory() {
        userAccountList = new ArrayList();
    }

    public ArrayList<useraccounts> getUserAccountList() {
        return userAccountList;
    }
    
    public useraccounts authenticateUser(String username, String password){
        for (useraccounts ua : userAccountList)
            if (ua.getUsername().equals(username) && ua.getPassword().equals(password)){
                return ua;
            }
        return null;
    }
    
    public useraccounts createUserAccount(String username, String password, Employee employee, Role role){
        useraccounts userAccount = new useraccounts();
        userAccount.setUsername(username);
        userAccount.setPassword(password);
        userAccount.setEmployee(employee);
        userAccount.setRole(role);
        userAccountList.add(userAccount);
        return userAccount;
    }
    
    public boolean checkIfUsernameIsUnique(String username){
        for (useraccounts ua : userAccountList){
            if (ua.getUsername().equals(username))
                return false;
        }
        return true;
    }
    
}
