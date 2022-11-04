/*AUTHOR: HUSSEIN AHMED TEJAN
 * This frame enables the mechanic to view the current appointments scheduled for both Usage and Time Based Servicing.
 */
package gui;

import java.sql.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import net.proteanit.sql.DbUtils;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

    public                                          class                   OptionBasedSchedule             extends javax.swing.JFrame {
    //This stores each customer's respected vehicle Mileage to display in the box below if selected.   
    ArrayList<Integer> milLs = new ArrayList<>();

    Connection conn;
    ResultSet rs = null;
    PreparedStatement pst = null;
    

//    UsageBasedServiceBooking fillUbsb;
    public                                                                                                  OptionBasedSchedule() {
        initComponents();
        //This saves the changes, updating naturally the Usage Based Service table.
        Select_table();
        //This saves the changes, updating naturally the Time Based Service table.
        Select_table2();

        //fillUbsb=ubsbFill;
      //  vIDUsb.setVisible(false);
       // vIDTbs.setVisible(false);
        //Table_UBS.setCellSelectionEnabled(false);

        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(OptionBasedSchedule.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(OptionBasedSchedule.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(OptionBasedSchedule.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(OptionBasedSchedule.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    
    private                                             void                                                    Select_table() {
        conn = javaconnect.ConnecrDb();
        
        DefaultTableModel tblModel;
        tblModel = new DefaultTableModel(new Object[][]{}, new String[]{"vehicleID","BookingType","currentVehicleMileage","bayNumber","bookingDate","bookingTime"}){
             public boolean isCellEditable (int row, int column) {
            return false;
        }//END DefaultTableModel
;
                      
        };

        try {
            String sql = "select * from UsageBasedService";
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            //Table_UBS.setModel(DbUtils.resultSetToTableModel(rs));
            ResultSetMetaData rsmd = rs.getMetaData();
            while(rs.next()){
                tblModel.addRow(new Object[] {rs.getInt("vehicleID"),rs.getString("BookingType"),rs.getInt("currentVehicleMileage"),rs.getInt("bayNumber"),rs.getString("bookingDate"),rs.getString("bookingTime")});
            }
            Table_UBS.setModel(tblModel);
            
            for (int i = 0; i < rs.getFetchSize(); i++) {
                milLs.add(rs.getInt("currentVehicleMileage"));
                pst.close();
                rs.close();
                conn.close();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }

    }

    private                                             void                                                    Select_table2() {
        conn = javaconnect.ConnecrDb();
            
        DefaultTableModel tblModel2;
        tblModel2 = new DefaultTableModel(new Object[][]{}, new String[]{"vehicleID","BookingType","lastService","nextService","bayNumber","bookingTime"}){
             public boolean isCellEditable (int row, int column) {
            return false;
        }//END isCellEditable
             
       };//       END DefaultTableModel2
                
        try {
            String sql = "select * from TimeBasedService";
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            //Table_TBS.setModel(DbUtils.resultSetToTableModel(rs));

             while(rs.next()){
              tblModel2.addRow(new Object[] {rs.getInt("vehicleID"),rs.getString("BookingType"),rs.getDate("lastService"),rs.getDate("nextService"),rs.getInt("bayNumber"),rs.getString("bookingTime")});
            }
            Table_TBS.setModel(tblModel2);
                
            pst.close();
            rs.close();
            conn.close();

        }//END Try Statement
             catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
          }//END catch Statement

    }

 

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        Table_UBS = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        Table_TBS = new javax.swing.JTable();

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("   Usage Based Service");

        jLabel3.setText("Current Mileage:");

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        Table_UBS.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "vehicleID", "BookingType", "currentVehicleMileage", "bayNumber", "bookingDate", "bookingTime"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Object.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        Table_UBS.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Table_UBSMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(Table_UBS);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 685, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(241, 241, 241)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 186, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jTabbedPane1.addTab("Usage Based Service", jPanel2);

        jLabel4.setText("Time Based Service");

        Table_TBS.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "vehicleID", "BookingType", "lastService", "nextService", "bayNumber"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        Table_TBS.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Table_TBSMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(Table_TBS);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 535, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(93, Short.MAX_VALUE))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(252, 252, 252)
                .addComponent(jLabel4)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addGap(34, 34, 34)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(166, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Time Based Service", jPanel4);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 712, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
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
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed
//This enables the user to take a better look at the vehicle Mileage of each customer individually if they select a single row.
    private void Table_UBSMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Table_UBSMouseClicked
        conn = javaconnect.ConnecrDb();
        
        try {
            int row = Table_UBS.getSelectedRow();
            String Table_Choice1 = (Table_UBS.getModel().getValueAt(row, 0).toString());

            String sql = "select * from UsageBasedService where vehicleID='" + Table_Choice1 + "' ";

            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();

            if (rs.next()) {
                String take1 = rs.getString("currentVehicleMileage");
                jTextField1.setText(take1);

                pst.close();
                rs.close();
                conn.close();
            }

        } catch (Exception e) {

        }

       
//
//        jTextField1.setText(milLs.get(Table_UBS.getSelectedRow()).toString());
    }//GEN-LAST:event_Table_UBSMouseClicked

    private void Table_TBSMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Table_TBSMouseClicked
      
    }//GEN-LAST:event_Table_TBSMouseClicked

    /**
     * @param args the command line arguments
     */
            public                                          static                  void                            main(String args[]) {
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
            java.util.logging.Logger.getLogger(OptionBasedSchedule.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(OptionBasedSchedule.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(OptionBasedSchedule.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(OptionBasedSchedule.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public                                                                   void                           run() {

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Table_TBS;
    private javax.swing.JTable Table_UBS;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
