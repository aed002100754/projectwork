/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import business.Business;
import business.Customer.CustomerDirectory;
import business.DB4OUtil.DB4OUtil;
import business.Order.Order;
import business.Order.OrderDirectory;
import business.Restaurant.RestaurantDirectory;
import business.role.Role;
import business.useraccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import ui.SystemAdminWorkArea.SystemAdminWorkAreaJPanel;

/**
 *
 * @author deepv
 */
public class LoginScreen extends javax.swing.JPanel {

    /**
     * Creates new form LoginScreen
     */
    Business business;
    JPanel mainWorkArea;
    private DB4OUtil dB4OUtil = DB4OUtil.getInstance();
    private Business system;
    RestaurantDirectory restaurantDirectory;
    CustomerDirectory customerDirectory;
    OrderDirectory orderDirectory;

    public LoginScreen(JPanel mainWorkArea, Business business, RestaurantDirectory restaurantDirectory, CustomerDirectory customerDirectory, OrderDirectory orderDirectory) {
        System.out.println("LOGIN!!!!!");
        initComponents();
        this.business = business;
        this.mainWorkArea = mainWorkArea;
        system = dB4OUtil.retrieveSystem();
        this.restaurantDirectory = restaurantDirectory;
        this.customerDirectory = customerDirectory;
        this.orderDirectory = orderDirectory;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblUser = new javax.swing.JLabel();
        txtUserName = new javax.swing.JTextField();
        lblPassword = new javax.swing.JLabel();
        pwdField = new javax.swing.JPasswordField();
        btnLogin = new javax.swing.JButton();

        lblUser.setFont(new java.awt.Font("STXihei", 0, 12)); // NOI18N
        lblUser.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblUser.setText("USERNAME ");

        txtUserName.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtUserName.setSelectionColor(new java.awt.Color(204, 204, 204));

        lblPassword.setFont(new java.awt.Font("STXihei", 0, 12)); // NOI18N
        lblPassword.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblPassword.setText("PASSWORD ");

        pwdField.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        btnLogin.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnLogin.setText("LOGIN");
        btnLogin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(269, 269, 269)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblUser)
                    .addComponent(lblPassword))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(pwdField, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtUserName, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(274, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {pwdField, txtUserName});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(211, 211, 211)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblUser)
                    .addComponent(txtUserName, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pwdField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPassword))
                .addGap(37, 37, 37)
                .addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(217, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {pwdField, txtUserName});

    }// </editor-fold>//GEN-END:initComponents

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        String userName = txtUserName.getText();
        // Get Password
        char[] passwordCharArray = pwdField.getPassword();
        String password = String.valueOf(passwordCharArray);
        boolean flag = false;

        UserAccount userAccount = null;
        userAccount = system.getUserAccountDirectory().authenticateUser(userName, password);

        if (userAccount != null) {
            Role test = userAccount.getRole();
            JPanel mainScreen = new MainScreen(mainWorkArea, userAccount, system, restaurantDirectory, customerDirectory, orderDirectory);
            mainWorkArea.add("MainScreen", mainScreen);
            CardLayout layout = (CardLayout) mainWorkArea.getLayout();
            layout.next(mainWorkArea);
            flag = true;
            txtUserName.setText("");
            pwdField.setText("");
        }

        if (!flag) {
            JOptionPane.showMessageDialog(null, "Invalid User Name/ Password.");
            txtUserName.setText("");
            pwdField.setText("");
        }
    }//GEN-LAST:event_btnLoginActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogin;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblUser;
    private javax.swing.JPasswordField pwdField;
    private javax.swing.JTextField txtUserName;
    // End of variables declaration//GEN-END:variables
}
