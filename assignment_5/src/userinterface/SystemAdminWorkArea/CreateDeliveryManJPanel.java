/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.SystemAdminWorkArea;

import Business.Customer.CustomerDirectory;
import Business.DeliveryMan.DeliveryMan;
import Business.DeliveryMan.DeliveryManDirectory;
import Business.EcoSystem;
import Business.Role.DeliverManRole;
import Business.UserAccount.UserAccount;
import Business.UserAccount.UserAccountDirectory;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author yaopeixinmac
 */
public class CreateDeliveryManJPanel extends javax.swing.JPanel {

    /**
     * Creates new form CreateDeliveryManJPanel
     */
            JPanel userProcessContainer;
    EcoSystem ecosystem;
    DeliveryManDirectory deliveryManDirectory;
    UserAccountDirectory userAccountDirectory;
    public CreateDeliveryManJPanel(JPanel userProcessContainer,EcoSystem ecosystem) {
        initComponents();
                   this.userProcessContainer=userProcessContainer;
        this.ecosystem=ecosystem;
        this.deliveryManDirectory=ecosystem.getDeliveryManDirectory();
        this.userAccountDirectory=ecosystem.getUserAccountDirectory();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setBackground(new java.awt.Color(204, 204, 255));

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel1.setText("NEW DELIVERYMAN");

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jLabel2.setText("username:");

        jLabel3.setText("password:");

        jButton1.setBackground(new java.awt.Color(255, 204, 255));
        jButton1.setText("ADD");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(255, 204, 255));
        jButton2.setText("BACK");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(83, 83, 83)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(137, 137, 137)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(192, 192, 192)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton2)
                            .addComponent(jButton1))))
                .addGap(113, 251, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addComponent(jLabel1)
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(34, 34, 34)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton2)
                .addContainerGap(150, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String usernane=jTextField1.getText();
        String password=jTextField2.getText();
        UserAccount ud;
        ud = userAccountDirectory.createUserAccount(usernane, password,  new DeliverManRole());
        DeliveryMan deliveryMan=deliveryManDirectory.addDeliveryMan();
        deliveryMan.setName(usernane);
        JOptionPane.showMessageDialog(null, "add deliveryMan successfully!!", "svaing", JOptionPane.WARNING_MESSAGE);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
            ManageDeliveryManJPanel mc = new ManageDeliveryManJPanel(userProcessContainer, ecosystem);
        userProcessContainer.add("ManageSupplierAdministrative", mc);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}