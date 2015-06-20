/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package UI;

import Classes.DataEngine;
import Classes.Director;
import Interfaces.DataBluePrint;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author Pouya
 */
public class CustomerManagement extends Director implements DataBluePrint {
        DataEngine UserData = new DataEngine("CustomerList.txt");
    /**
     * Creates new form UserManagement
     */
    public CustomerManagement() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        TFullName = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        TNRIC = new javax.swing.JTextField();
        TContactNumber = new javax.swing.JTextField();
        RMale = new javax.swing.JRadioButton();
        RFemale = new javax.swing.JRadioButton();
        TID = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        RAdd = new javax.swing.JRadioButton();
        RRemove = new javax.swing.JRadioButton();
        RUpdate = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Custoomer Management");
        setResizable(false);
        setType(java.awt.Window.Type.POPUP);

        jPanel1.setBackground(new java.awt.Color(71, 61, 87));

        TFullName.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        TFullName.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TFullName.setText("Full Name");
        TFullName.setBorder(null);

        jButton1.setBackground(new java.awt.Color(148, 143, 153));
        jButton1.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jButton1.setText("Apply");
        jButton1.setBorder(null);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        TNRIC.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        TNRIC.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TNRIC.setText("NRIC");
        TNRIC.setBorder(null);

        TContactNumber.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        TContactNumber.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TContactNumber.setText("Contact Number");
        TContactNumber.setBorder(null);

        buttonGroup2.add(RMale);
        RMale.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        RMale.setForeground(new java.awt.Color(255, 255, 255));
        RMale.setSelected(true);
        RMale.setText("Male");
        RMale.setOpaque(false);

        buttonGroup2.add(RFemale);
        RFemale.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        RFemale.setForeground(new java.awt.Color(255, 255, 255));
        RFemale.setText("Female");
        RFemale.setOpaque(false);

        TID.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        TID.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TID.setText("ID");
        TID.setBorder(null);

        jPanel2.setBackground(new java.awt.Color(71, 61, 87));
        jPanel2.setLayout(null);

        buttonGroup1.add(RAdd);
        RAdd.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        RAdd.setForeground(new java.awt.Color(255, 255, 255));
        RAdd.setText("Add");
        RAdd.setOpaque(false);
        RAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RAddActionPerformed(evt);
            }
        });
        jPanel2.add(RAdd);
        RAdd.setBounds(10, 8, 45, 21);

        buttonGroup1.add(RRemove);
        RRemove.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        RRemove.setForeground(new java.awt.Color(255, 255, 255));
        RRemove.setText("Remove");
        RRemove.setOpaque(false);
        RRemove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RRemoveActionPerformed(evt);
            }
        });
        jPanel2.add(RRemove);
        RRemove.setBounds(64, 8, 70, 21);

        buttonGroup1.add(RUpdate);
        RUpdate.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        RUpdate.setForeground(new java.awt.Color(255, 255, 255));
        RUpdate.setText("Update");
        RUpdate.setOpaque(false);
        RUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RUpdateActionPerformed(evt);
            }
        });
        jPanel2.add(RUpdate);
        RUpdate.setBounds(138, 8, 57, 21);

        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        jPanel2.add(jLabel1);
        jLabel1.setBounds(8, 6, 192, 28);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(TFullName)
                    .addComponent(TNRIC)
                    .addComponent(TContactNumber, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(RMale, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(RFemale, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(TID, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TID, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TFullName, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TNRIC, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TContactNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RMale)
                    .addComponent(RFemale))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 106, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (RAdd.isSelected()) {
            Add();
        }
        else if (RRemove.isSelected()) {
            Delete();
        }
        else if (RUpdate.isSelected()) {
            if (Delete() == true) {
                Add(TID.getText());
            }
        }
        else {
            JOptionPane.showMessageDialog(null, "Please Select An Option.");
        }
        
// TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void RAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RAddActionPerformed
        DeActivate(TID);
        Activate(TFullName, TNRIC, TContactNumber, RMale, RFemale);
// TODO add your handling code here:
    }//GEN-LAST:event_RAddActionPerformed

    private void RRemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RRemoveActionPerformed
    
        Activate(TID);
        DeActivate(TFullName, TNRIC, TContactNumber, RMale, RFemale);        
// TODO add your handling code here:
    }//GEN-LAST:event_RRemoveActionPerformed

    private void RUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RUpdateActionPerformed
        Activate(TID, TFullName, TNRIC, TContactNumber, RMale, RFemale);
        // TODO add your handling code here:
    }//GEN-LAST:event_RUpdateActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CustomerManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CustomerManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CustomerManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CustomerManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CustomerManagement().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton RAdd;
    private javax.swing.JRadioButton RFemale;
    private javax.swing.JRadioButton RMale;
    private javax.swing.JRadioButton RRemove;
    private javax.swing.JRadioButton RUpdate;
    private javax.swing.JTextField TContactNumber;
    private javax.swing.JTextField TFullName;
    private javax.swing.JTextField TID;
    private javax.swing.JTextField TNRIC;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables

    @Override
    public void Add() {
            Random rnd = new Random(System.nanoTime());
            int IDNumber = rnd.nextInt();
            IDNumber = (IDNumber < 0 ? -IDNumber : IDNumber);
            StringBuilder sb = new StringBuilder();
            try {
               Boolean Validate = FieldValidation(new String[] {"Full Name", "NRIC", "Contact"}, new JTextField[] { TFullName, TNRIC, TContactNumber});
               if (Validate == true) {
                   if (RMale.isSelected()){
                       sb.append("ID.").append(Integer.toString(IDNumber)).append("\t");
                       sb.append("Name.").append(TFullName.getText()).append("\t");
                       sb.append("NRIC.").append(TNRIC.getText()).append("\t");
                       sb.append("Contact.").append(TContactNumber.getText()).append("\t");
                       sb.append("Gender.Male").append("\t");
                       UserData.Append(sb.toString());
                       JOptionPane.showMessageDialog(null, "Database Updated Successfully");                       
                   }
                   else if (RFemale.isSelected()){
                       sb.append("ID.").append(Integer.toString(IDNumber)).append("\t");
                       sb.append("Name.").append(TFullName.getText()).append("\t");
                       sb.append("NRIC.").append(TNRIC.getText()).append("\t");
                       sb.append("Contact.").append(TContactNumber.getText()).append("\t");
                       sb.append("Gender.Male").append("\t");
                       UserData.Append(sb.toString());
                       JOptionPane.showMessageDialog(null, "Database Updated Successfully");           
                   }
                   else {
                   JOptionPane.showMessageDialog(null, "All Fields Are Required.");
                   }
               }
               else {
                   JOptionPane.showMessageDialog(null, "All Fields Are Required.");
               }
            } catch (Exception ex) {
                Logger.getLogger(CustomerManagement.class.getName()).log(Level.SEVERE, null, ex);
            }
    }

    @Override
    public void Add(String ID) {
            StringBuilder sb = new StringBuilder();
            try {
               Boolean Validate = FieldValidation(new String[] {"ID","Full Name", "NRIC", "Contact"}, new JTextField[] {TID, TFullName, TNRIC, TContactNumber});
               if (Validate == true) {
                   if (RMale.isSelected()){
                       sb.append("ID.").append(ID).append("\t");
                       sb.append("Name.").append(TFullName.getText()).append("\t");
                       sb.append("NRIC.").append(TNRIC.getText()).append("\t");
                       sb.append("Contact.").append(TContactNumber.getText()).append("\t");
                       sb.append("Gender.Male").append("\t");
                       UserData.Append(sb.toString());
                       JOptionPane.showMessageDialog(null, "Database Updated Successfully");
                   }
                   else if (RFemale.isSelected()){
                       sb.append("ID.").append(ID).append("\t");
                       sb.append("Name.").append(TFullName.getText()).append("\t");
                       sb.append("NRIC.").append(TNRIC.getText()).append("\t");
                       sb.append("Contact.").append(TContactNumber.getText()).append("\t");
                       sb.append("Gender.Male").append("\t");
                       UserData.Append(sb.toString());
                       JOptionPane.showMessageDialog(null, "Database Updated Successfully");              
                   }
                   else {
                   JOptionPane.showMessageDialog(null, "All Fields Are Required.");
                   }
               }
               else {
                   JOptionPane.showMessageDialog(null, "All Fields Are Required.");
               }
            } catch (Exception ex) {
                Logger.getLogger(CustomerManagement.class.getName()).log(Level.SEVERE, null, ex);
            }        
    }

    @Override
    public Boolean Delete() {
        if (UserData.Validate("ID."+TID.getText()) == true) {
            UserData.Delete("ID."+TID.getText());
            JOptionPane.showMessageDialog(null, "Database Updated Successfully");
            return true;
        }
        else {
            JOptionPane.showMessageDialog(null, "The Entered ID Was Not Found.");
            return false;
        }
    }
}
