/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dsrole;

import javax.swing.JPanel;
import deliverysystem.EcoSystem;
import ds.useraccounts;

/**
 *
 * @author jaahn
 */
public class sysadminrole {
     @Override
    public JPanel createWorkArea(JPanel userProcessContainer, useraccounts account, Organization organization, Enterprise enterprise, EcoSystem system) {
        return new SystemAdminWorkAreaJPanel(userProcessContainer, system);
    }
    
}
