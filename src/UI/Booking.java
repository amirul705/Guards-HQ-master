/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package UI;

import Classes.DataEngine;
import Classes.Director;
import java.awt.Color;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author Pouya
 */
public class Booking extends Director {
    DataEngine Bookings = new DataEngine("BookingList.txt");
    DataEngine RoomList = new DataEngine("RoomList.txt");
    DataEngine Class = new DataEngine("RoomClass.txt");
    DataEngine Customers = new DataEngine("CustomerList.txt");
    List<String> ARoomNumber = new ArrayList();
    int Duration = 0;
    /**
     * Creates new form Booking
     */
    public Booking() {
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

        jPanel1 = new javax.swing.JPanel();
        TCIN = new javax.swing.JTextField();
        TCOUT = new javax.swing.JTextField();
        BSearch = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        BBook = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        TCINR = new javax.swing.JTextField();
        TCID = new javax.swing.JTextField();
        TCOUTR = new javax.swing.JTextField();
        TTotalAmount = new javax.swing.JTextField();
        TCCNumber = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Booking");

        jPanel1.setBackground(new java.awt.Color(71, 61, 87));

        TCIN.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        TCIN.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TCIN.setText("12/12/2012");
        TCIN.setBorder(null);

        TCOUT.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        TCOUT.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TCOUT.setText("12/12/2012");
        TCOUT.setBorder(null);

        BSearch.setBackground(new java.awt.Color(148, 143, 153));
        BSearch.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        BSearch.setText("Search");
        BSearch.setBorder(null);
        BSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BSearchActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Room Type", "Price Per Night"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        BBook.setBackground(new java.awt.Color(148, 143, 153));
        BBook.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        BBook.setText("Book");
        BBook.setBorder(null);
        BBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BBookActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(82, 72, 97));

        TCINR.setEditable(false);
        TCINR.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        TCINR.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TCINR.setText("Check In Date");
        TCINR.setBorder(null);

        TCID.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        TCID.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TCID.setText("Customer ID");
        TCID.setBorder(null);

        TCOUTR.setEditable(false);
        TCOUTR.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        TCOUTR.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TCOUTR.setText("Check Out Date");
        TCOUTR.setBorder(null);

        TTotalAmount.setEditable(false);
        TTotalAmount.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        TTotalAmount.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TTotalAmount.setText("Total Amount");
        TTotalAmount.setBorder(null);

        TCCNumber.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        TCCNumber.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TCCNumber.setText("Credit Card Number");
        TCCNumber.setBorder(null);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TCID, javax.swing.GroupLayout.DEFAULT_SIZE, 460, Short.MAX_VALUE)
                    .addComponent(TCINR, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(TCOUTR)
                    .addComponent(TTotalAmount)
                    .addComponent(TCCNumber))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(TCID, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TCINR, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TCOUTR, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TTotalAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TCCNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TCOUT, javax.swing.GroupLayout.DEFAULT_SIZE, 132, Short.MAX_VALUE)
                            .addComponent(TCIN)
                            .addComponent(BSearch, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(BBook, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(183, 183, 183))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(TCIN, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TCOUT, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(BBook, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
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

    private void BSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BSearchActionPerformed
        Boolean Validate = DateValidation(TCIN.getText()) & DateValidation(TCOUT.getText());
        if (Validate == true) {
            List<Date> DateRange = Ranger (TCIN.getText(), TCOUT.getText());
            Duration = DateRange.size();
            List<String> RawData = new ArrayList();
            List<String> RoomNumbers = new ArrayList();
            for (String[] s :Bookings.ReadFile()) {
                RawData.add(s[s.length-1].split("\\.")[1]);
                RoomNumbers.add(s[0]);
            }
            List<String> UnAvailableRooms = Comparer(RawData, DateRange, RoomNumbers);

            if (UnAvailableRooms.size()>0) {
            List<String> AvailableRooms = new ArrayList();
            for (String[] s : RoomList.ReadFile()) {
                Boolean b = true;
                for (String s2 : UnAvailableRooms) {
                    if (s[0].split("\\.")[1].equals(s2.split("\\.")[1])) {
                        b = false;
                    }
                }
                if (b == true) {
                    AvailableRooms.add(s[1].split("\\.")[1]);
                    ARoomNumber.add(s[0].split("\\.")[1]+"\t"+s[1].split("\\.")[1]);
                }
            }
            Distinct(AvailableRooms);
            Distinct(ARoomNumber);
            List<String[]> Display = new ArrayList();
            for (String s : AvailableRooms) {
                for (String[] s2 : Class.ReadFile()) {
                    if (s.equals(s2[0].split("\\.")[1])){
                        Display.add(s2);  
                    }
                }
            }
            PopulateTable (Display);
            TCINR.setText(TCIN.getText());
            TCOUTR.setText(TCOUT.getText());
            }
            else {
                
                for (String[] s : RoomList.ReadFile()) {
                    ARoomNumber.add(s[0].split("\\.")[1]+"\t"+s[1].split("\\.")[1]);
                }
                
                List<String[]> Display = new ArrayList();
                List<String> Rooms = new ArrayList();
                for (String[] s : RoomList.ReadFile()) {
                    Rooms.add(s[1].split("\\.")[1]);
                }
                Distinct(Rooms);
                for (String[] s : Class.ReadFile()) {
                    for (String s2 : Rooms) {
                        int i = 0;
                        if (s[0].split("\\.")[1].equals(s2) && i==0) {
                            Display.add(s);
                            i++;
                        }
                    }
                }
                PopulateTable(Display);
                TCINR.setText(TCIN.getText());
                TCOUTR.setText(TCOUT.getText());
            }
            

        }
        else {

            JOptionPane.showMessageDialog(null, "Invalid Date Formate.");
        }
        
        // TODO add your handling code here:
    }//GEN-LAST:event_BSearchActionPerformed

    private void BBookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BBookActionPerformed
        Boolean DateCheck = (DateConvert(TCINR.getText()).before(new Date()));
        if (DateCheck == true) {
            JOptionPane.showMessageDialog(null, "You Can't Book For The Current Day.");
        }
        if (Duration > 31){
            JOptionPane.showMessageDialog(null, "You Can Only Book For Maximum 31 Days.");
        }
        if (DateCheck == false && Duration <= 31) {
        Boolean CCNumber = IntValidation(TCCNumber.getText());
        Boolean ID = Customers.Validate("ID."+TCID.getText());
        if (ID == false) {TCID.setForeground(Color.red);}
        else {TCID.setForeground(Color.BLACK);}
        if (CCNumber == false) {TCCNumber.setForeground(Color.red);
        }
        else {TCCNumber.setForeground(Color.BLACK);}
        if (ARoomNumber.size() <= 0) {
            JOptionPane.showMessageDialog(null, "An Error Occured Due To Any Of These Reasons:\n1- You Havn't Search A Date Yet.\n2- No Room For This Date Is Available.");
        }
        if (CCNumber & ID & ARoomNumber.size() > 0 & (jTable1.getSelectedRows().length == 1) == true) {
            StringBuilder sb = new StringBuilder();
            StringBuilder Reciept = new StringBuilder();
            List<String> Room2Class = new ArrayList();
            for (String s : ARoomNumber) {
                
                if (s.split("\t")[1].equals(jTable1.getModel().getValueAt(jTable1.getSelectedRow(), 0).toString())){
                    Room2Class.add(s.split("\t")[0]);
                    System.out.println(s);
                }
            }
            int R = new Random(System.nanoTime()).nextInt();
            String RID = Integer.toString(( R > 0 ? R : -R ));
            sb.append("RoomNumber.").append(Room2Class.get(0)).append("\t");
            Reciept.append("RoomNumber.").append(Room2Class.get(0)).append("\t");
            sb.append("ID.").append(TCID.getText()).append("\t");
            sb.append("ReservationID.").append(RID).append("\t");
            Reciept.append("ReservationID.").append(RID).append("\t");            
            Reciept.append("ID.").append(TCID.getText()).append("\t");
            Reciept.append("CheckIn.").append(TCINR.getText()).append("\t");
            Reciept.append("CheckOut.").append(TCOUTR.getText()).append("\t");
            List<Date> Ranges = Ranger (TCINR.getText(), TCOUTR.getText());
            sb.append("Range.");
            for (Date d : Ranges) {
                sb.append(Date2String(d)).append("?");
            }
            sb.deleteCharAt(sb.length()-1);
            sb.append("\t");

            int Amount = Integer.parseInt(jTable1.getModel().getValueAt(jTable1.getSelectedRow(), 1).toString())*Ranges.size();
            TTotalAmount.setText(Integer.toString(Amount));
            Reciept.append("Amount.").append(TTotalAmount.getText()).append("\t");
            Bookings.Append(sb.toString());
            Reciept.append("CreditCard.").append(TCCNumber.getText()).append("\t");
            DataEngine.Append(Reciept.toString(), TCID.getText()+".txt");
            DataEngine.Append(Reciept.toString(),"Reservations.txt");           
            ARoomNumber.clear();
            JOptionPane.showMessageDialog(null, "Booking Has Been Made Successfully.\nA Reciept Has Been Generated At:\n[Root]"+TCID.getText()+".txt");
        }
        
        }
        else {
            System.out.println(Duration);
        }
// TODO add your handling code here:
    }//GEN-LAST:event_BBookActionPerformed



    private List<String> Comparer (List<String> Raw, List<Date> in, List<String> RoomNumbers) {
        List<String> Output = new ArrayList();
       // System.out.println(RoomNumbers.size());
        int index = 0;
        for (String s : Raw) {
            String[] Range = s.split("\\?");
            List<Date> DRange = new ArrayList();
            for (int i = 0; i < Range.length; i++) {
                DRange.add(DateConvert(Range[i]));
            }

            for (Date d : DRange) {
                Boolean t = false;
                for (Date d2 : in) {
                    if (d.getDate() == d2.getDate()) {
                        t = true;
                    }
                }
                if (t == true) {
                Output.add(RoomNumbers.get(index));
                } 
            }
            index++;
        }
        Distinct(Output);
        return Output;
    }
    
    private void PopulateTable(List<String[]> in) {
        for (int i = 0; i < jTable1.getRowCount(); i++) {
            for (int j = 0; j < jTable1.getColumnCount(); j++) {
                jTable1.getModel().setValueAt("", i, j);
            }
        }
        int y = 0;
        for (String[] s : in) {
            for (int x = 0; x < s.length; x++) {
            jTable1.getModel().setValueAt(s[x].split("\\.")[1], y, x);
            }
            y++;
        }
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
            java.util.logging.Logger.getLogger(Booking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Booking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Booking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Booking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Booking().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BBook;
    private javax.swing.JButton BSearch;
    private javax.swing.JTextField TCCNumber;
    private javax.swing.JTextField TCID;
    private javax.swing.JTextField TCIN;
    private javax.swing.JTextField TCINR;
    private javax.swing.JTextField TCOUT;
    private javax.swing.JTextField TCOUTR;
    private javax.swing.JTextField TTotalAmount;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
