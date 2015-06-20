/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package UI;

import Classes.DataEngine;
import Classes.Director;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Pouya
 */
public class Search extends Director {
    DataEngine Customers = new DataEngine("CustomerList.txt");
    DataEngine AllRooms = new DataEngine("RoomList.txt");
    DataEngine TBCleaned = new DataEngine("RoomStatus.txt");
    DataEngine Bookings = new DataEngine("BookingList.txt");
    DataEngine Checkins = new DataEngine("Checkins.txt");
    DataEngine Users = new DataEngine("UserList.txt");
    /**
     * Creates new form Search
     */
    public Search() {
        initComponents();
        if (Classes.Login.UserRole().equals("Admin")) {
           DeActivate (BRStatus, BC, BR, BRoom, BCheckins);
        }
        else if (Classes.Login.UserRole().equals("Reservation Staff")) {
            DeActivate (BU);
        }
        else if (Classes.Login.UserRole().equals("Front Desk Staff")) {
            DeActivate (BU);
        }
        else if (Classes.Login.UserRole().equals("Cleaning Staff")) {
            DeActivate (BU, BC, BR, BRoom, BCheckins);
        }
        else if (Classes.Login.UserRole().equals("Manager")) {
            
        }
        else {
            DeActivate (BRStatus, BU, BC, BR, BRoom, BCheckins);
        }
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        BRStatus = new javax.swing.JButton();
        BRoom = new javax.swing.JButton();
        BCheckins = new javax.swing.JButton();
        BR = new javax.swing.JButton();
        BC = new javax.swing.JButton();
        BU = new javax.swing.JButton();
        TID = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(71, 61, 87));

        BRStatus.setBackground(new java.awt.Color(148, 143, 153));
        BRStatus.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        BRStatus.setText("Room Status");
        BRStatus.setBorder(null);
        BRStatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BRStatusActionPerformed(evt);
            }
        });

        BRoom.setBackground(new java.awt.Color(148, 143, 153));
        BRoom.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        BRoom.setText("Rooms");
        BRoom.setToolTipText("");
        BRoom.setBorder(null);
        BRoom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BRoomActionPerformed(evt);
            }
        });

        BCheckins.setBackground(new java.awt.Color(148, 143, 153));
        BCheckins.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        BCheckins.setText("Check Ins");
        BCheckins.setBorder(null);
        BCheckins.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BCheckinsActionPerformed(evt);
            }
        });

        BR.setBackground(new java.awt.Color(148, 143, 153));
        BR.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        BR.setText("Reservation");
        BR.setBorder(null);
        BR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BRActionPerformed(evt);
            }
        });

        BC.setBackground(new java.awt.Color(148, 143, 153));
        BC.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        BC.setText("Customers");
        BC.setBorder(null);
        BC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BCActionPerformed(evt);
            }
        });

        BU.setBackground(new java.awt.Color(148, 143, 153));
        BU.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        BU.setText("Users");
        BU.setBorder(null);
        BU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BUActionPerformed(evt);
            }
        });

        TID.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        TID.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TID.setText("Search");
        TID.setBorder(null);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(BR, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BRoom, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BC, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BU, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BRStatus, javax.swing.GroupLayout.DEFAULT_SIZE, 127, Short.MAX_VALUE)
                    .addComponent(BCheckins, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(TID, javax.swing.GroupLayout.Alignment.LEADING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(TID, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BRStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BCheckins, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BR, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BRoom, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BC, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BU, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
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

    private void BRStatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BRStatusActionPerformed

        if (Check()) {
            List<String[]> ls = new ArrayList();
            for (String[] s : AllRooms.ReadFile()) {
                Boolean b = false;
                for (String[] s2 : TBCleaned.ReadFile()) {
                    if (s[0].split("\\.")[1].equals(s2[0])){
                        b = true;
                    }
                }
                if (b==true) {
                    ls.add(new String[]{s[0], "Status.To Be Cleaned"});
                }
                else {
                    ls.add(new String[]{s[0], "Status.Cleaned"});
                }
            }
            Populate (ls);
        }
        else {
            List<String[]> ls = new ArrayList();
            for (String[] s : AllRooms.ReadFile(TID.getText())) {
                Boolean b = false;
                for (String[] s2 : TBCleaned.ReadFile()) {
                    if (s[0].split("\\.")[1].equals(s2[0])){
                        b = true;
                    }
                }
                if (b==true) {
                    ls.add(new String[]{s[0], "Status.To Be Cleaned"});
                }
                else {
                    ls.add(new String[]{s[0], "Status.Cleaned"});
                }
            }
            Populate (ls);
        }
        
        // TODO add your handling code here:
    }//GEN-LAST:event_BRStatusActionPerformed

    private void BRoomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BRoomActionPerformed
        if (Check()) {
            List<String[]> ls = new ArrayList();
            List<String[]> ls2 = new ArrayList();
            for (String[] s : Checkins.ReadFile()) {
                String RoomID = "";
                String CheckIn = "";
                String CheckOut = "";
                for (String[] s2 : Bookings.ReadFile()) {
                    if (s[0].equals(s2[2])) {
                        RoomID = s2[0];
                        CheckIn = s[1];
                        CheckOut = s[2];
                    }
                }
                ls2.add(new String[] {RoomID, CheckIn, CheckOut});
            }
            for (String[] s : AllRooms.ReadFile()) {
                Boolean b = false;
                for (String[] s2 : ls2) {
                    if (s[0].equals(s2[0])) {
                        if (!s2[2].split("\\.")[1].equals("NA")){
                            b = true;
                        }
                    }    
                }
                if (b == true) {
                    ls.add(new String[] {s[0],"Floor."+s[0].split("\\.")[1].charAt(0), "Status.Occupied"});
                }
                else {
                    ls.add(new String[] {s[0],"Floor."+s[0].split("\\.")[1].charAt(0), "Status.Free"});

                }
            }
            Populate (ls);
        }
        else {
            List<String[]> ls = new ArrayList();
            List<String[]> ls2 = new ArrayList();
            for (String[] s : Checkins.ReadFile()) {
                String RoomID = "";
                String CheckIn = "";
                String CheckOut = "";
                for (String[] s2 : Bookings.ReadFile()) {
                    if (s[0].equals(s2[2])) {
                        RoomID = s2[0];
                        CheckIn = s[1];
                        CheckOut = s[2];
                    }
                }
                ls2.add(new String[] {RoomID, CheckIn, CheckOut});
            }
            for (String[] s : AllRooms.ReadFile()) {
                Boolean b = false;
                for (String[] s2 : ls2) {
                    if (s[0].equals(s2[0])) {
                        if (!s2[2].split("\\.")[1].equals("NA")){
                            b = true;
                        }
                    }    
                }
                if (b == true) {
                    ls.add(new String[] {s[0],"Floor."+s[0].split("\\.")[1].charAt(0), "Status.Occupied"});
                }
                else {
                    ls.add(new String[] {s[0],"Floor."+s[0].split("\\.")[1].charAt(0), "Status.Free"});

                }
            }
            
            List<String[]> ls3 = new ArrayList();
            for (String[] s : ls) {
                if (s[0].split("\\.")[1].startsWith(TID.getText())) {
                    ls3.add(s);
                }
            }
            
            Populate (ls3);       
        
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_BRoomActionPerformed

    private void BCheckinsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BCheckinsActionPerformed
        if (Check()) {
            List<String[]> ls = new ArrayList();
            for (String[] s : Bookings.ReadFile()) {
                Boolean b = false;
                String Checkin = "";
                String Checkout = "";
                for (String[] s2 : Checkins.ReadFile()) {
                    if (s[2].equals(s2[0])) {
                        b = true;
                        Checkin = s2[1];
                        Checkout = s2[2];
                    }    
                }
                if (b == true) {
                    ls.add(new String[] {s[0], "Status.Checked In", Checkin , Checkout, Customers.ReadFile(s[1]).get(0)[1]});
                }
                else {
                    ls.add(new String[] {s[0], "Status.NA", "CheckIn.NA" , "CheckOut.NA", Customers.ReadFile(s[1]).get(0)[1]});

                }
            }
            Populate (ls);
        }
        else {
            List<String[]> ls = new ArrayList();
            for (String[] s : Bookings.ReadFile(TID.getText())) {
                Boolean b = false;
                String Checkin = "";
                String Checkout = "";
                for (String[] s2 : Checkins.ReadFile()) {
                    if (s[2].equals(s2[0])) {
                        b = true;
                        Checkin = s2[1];
                        Checkout = s2[2];
                    }    
                }
                if (b == true) {
                    ls.add(new String[] {s[0], "Status.Checked In", Checkin , Checkout, Customers.ReadFile(s[1]).get(0)[1]});
                }
                else {ls.add(new String[] {s[0], "Status.NA", "CheckIn.NA" , "CheckOut.NA", Customers.ReadFile(s[1]).get(0)[1]});

                }
            }
            Populate (ls);        
        
        }
        
// TODO add your handling code here:
    }//GEN-LAST:event_BCheckinsActionPerformed

    private void BRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BRActionPerformed
        if (Check()) {
            List<String[]> ls = new ArrayList();
            for (String[] s : Bookings.ReadFile()) {
                for (String[] s2 : Customers.ReadFile()) {
                    if (s[1].equals(s2[0])) {
                        String[] t = s[3].split("\\.")[1].split("\\?");
                        ls.add(new String [] {s[0],s[2],"From."+t[0], "To."+t[t.length-1], s2[1]});
                    }
                }
            }
            Populate (ls);
        }
        else {
            List<String[]> ls = new ArrayList();
            for (String[] s : Bookings.ReadFile(TID.getText())) {
                for (String[] s2 : Customers.ReadFile()) {
                    if (s[1].equals(s2[0])) {
                        String[] t = s[3].split("\\.")[1].split("\\?");
                        ls.add(new String [] {s[0],s[2],"From."+t[0], "To."+t[t.length-1], s2[1]});
                    }
                }
            }
            Populate (ls);       
        
        }
        
// TODO add your handling code here:
    }//GEN-LAST:event_BRActionPerformed

    private void BCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BCActionPerformed
        if (Check()) {
            Populate(Customers.ReadFile());
        }
        else {
            Populate(Customers.ReadFile(TID.getText()));
        }
        
// TODO add your handling code here:
    }//GEN-LAST:event_BCActionPerformed

    private void BUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BUActionPerformed
        if (Check()) {
            Populate(Users.ReadFile());
        }
        else {
            Populate(Users.ReadFile(TID.getText()));
        }        // TODO add your handling code here:
    }//GEN-LAST:event_BUActionPerformed

    private void Populate (List<String[]> list) {
       for (int i = 0; i < jTable1.getRowCount(); i++) {
            for (int j = 0; j < jTable1.getColumnCount(); j++) {
                jTable1.getModel().setValueAt("", i, j);
            }
        }
       DefaultTableModel model = new DefaultTableModel();
       for (String [] s : list) {
           for (int i = 0; i < s.length; i++) {
               model.addColumn( s[i].split("\\.")[0]);
           }
           break;
       }
       for (String [] s : list) {
           String[] s2 = new String[s.length];
           for (int i = 0; i < s.length; i++) {
               s2[i] = s[i].split("\\.")[1];
           }
           model.addRow(s2);
       }
       
       jTable1.setModel(model);
       
    }
    
    Boolean Check () {
      if (TID.getText().equals("") & TID.getText() == null | TID.getText().equals("Search") == true){
          return true;
      }
      else {return false;}
    }
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
            java.util.logging.Logger.getLogger(Search.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Search.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Search.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Search.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Search().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BC;
    private javax.swing.JButton BCheckins;
    private javax.swing.JButton BR;
    private javax.swing.JButton BRStatus;
    private javax.swing.JButton BRoom;
    private javax.swing.JButton BU;
    private javax.swing.JTextField TID;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}