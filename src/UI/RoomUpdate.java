/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package UI;

import Classes.DataEngine;
import javax.swing.JOptionPane;

/**
 *
 * @author Pouya
 */
public class RoomUpdate extends javax.swing.JFrame {
    DataEngine RoomStatus = new DataEngine("RoomStatus.txt"); 
    DataEngine RoomList = new DataEngine("RoomList.txt");
    /**
     * Creates new form RoomUpdate
     */
    public RoomUpdate() {
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
        jPanel1 = new javax.swing.JPanel();
        TID = new javax.swing.JTextField();
        RCleaned = new javax.swing.JRadioButton();
        RTBCleaned = new javax.swing.JRadioButton();
        BApply = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        setType(java.awt.Window.Type.POPUP);

        jPanel1.setBackground(new java.awt.Color(71, 61, 87));

        TID.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        TID.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TID.setText("Room Number");
        TID.setBorder(null);

        buttonGroup1.add(RCleaned);
        RCleaned.setForeground(new java.awt.Color(255, 255, 255));
        RCleaned.setText("Cleaned");
        RCleaned.setOpaque(false);

        buttonGroup1.add(RTBCleaned);
        RTBCleaned.setForeground(new java.awt.Color(255, 255, 255));
        RTBCleaned.setText("To Be Cleaned");
        RTBCleaned.setOpaque(false);

        BApply.setBackground(new java.awt.Color(148, 143, 153));
        BApply.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        BApply.setText("Apply");
        BApply.setBorder(null);
        BApply.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BApplyActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(TID, javax.swing.GroupLayout.DEFAULT_SIZE, 127, Short.MAX_VALUE)
                    .addComponent(RCleaned, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(RTBCleaned, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BApply, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(46, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(TID, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(RCleaned)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(RTBCleaned)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BApply, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
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

    private void BApplyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BApplyActionPerformed
        if (RCleaned.isSelected()) {
            if (RoomList.Validate("RoomNumber."+TID.getText())) {
                if (RoomStatus.Validate(TID.getText()+"\t")) {
                    RoomStatus.Delete(TID.getText()+"\t");
                    JOptionPane.showMessageDialog(null, "Database Updated Successfully");
                }
            }
            else {JOptionPane.showMessageDialog(null, "The Entered Room Number Was Not Found.");}
        }
        else if (RTBCleaned.isSelected()) {
            if (RoomList.Validate("RoomNumber."+TID.getText())) {
                if (!RoomStatus.Validate(TID.getText()+"\t")) {
                    RoomStatus.Append(TID.getText()+"\t");
                }
                JOptionPane.showMessageDialog(null, "Database Updated Successfully");
            }
            else {JOptionPane.showMessageDialog(null, "The Entered Room Number Was Not Found.");}        
        }
        else {
            JOptionPane.showMessageDialog(null, "Please Select An Option.");
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_BApplyActionPerformed

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
            java.util.logging.Logger.getLogger(RoomUpdate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RoomUpdate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RoomUpdate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RoomUpdate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RoomUpdate().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BApply;
    private javax.swing.JRadioButton RCleaned;
    private javax.swing.JRadioButton RTBCleaned;
    private javax.swing.JTextField TID;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
