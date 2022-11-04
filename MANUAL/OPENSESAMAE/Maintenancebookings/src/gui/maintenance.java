/*AUTHOR: HUSSEIN AHMED TEJAN
 * This frame is the interface of which the mechanic chooses to book a customer some Service or MoT.
 */
package gui;

import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import java.sql.Connection;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.WindowConstants;
import maintenancebookings.MoT;
import maintenancebookings.Service;


    public                                          class                   maintenance                 extends javax.swing.JInternalFrame {

        

        
        //    UsageBasedServiceBooking bookService ;
        // The mechanic is presented with an interface asking them to choose which Service to book for a customer
    ServiceOpt                                                         optionofservices;
        //The mechanic could also click on the MoT button, to book a MoT test
    MoTBooking                                                         revealMot;
   
    Connection                                                          conn;
    
    public                                                                  maintenance( ServiceOpt  serviceBook, MoTBooking motBook) {
        initComponents();
        
        optionofservices=serviceBook;
        revealMot=motBook;
        
        //The price for both Service and MoT is presented at the front of the interface
        priceService.setText("£ " + String.valueOf(new Service().getCost()));
        priceMoT.setText("£ " + String.valueOf(new MoT().getCost()));
    
        
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
        serviceOptions = new javax.swing.JButton();
        moTOptions = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        lblService = new javax.swing.JLabel();
        lblMoT = new javax.swing.JLabel();
        costofService = new javax.swing.JLabel();
        priceService = new javax.swing.JLabel();
        costofMoT = new javax.swing.JLabel();
        priceMoT = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setVisible(false);

        jPanel1.setMaximumSize(new java.awt.Dimension(691, 459));
        jPanel1.setMinimumSize(new java.awt.Dimension(691, 459));

        serviceOptions.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rsc/images/service.jpg"))); // NOI18N
        serviceOptions.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                serviceOptionsActionPerformed(evt);
            }
        });

        moTOptions.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rsc/images/mot.jpg"))); // NOI18N
        moTOptions.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                moTOptionsActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel1.setText("SCHEDULED MAINTENANCE BOOKING");
        jLabel1.setAlignmentX(0.3F);
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        lblService.setText("Service");

        lblMoT.setText("MoT");

        costofService.setText("Cost:");

        priceService.setText("___________________");

        costofMoT.setText("Cost:");

        priceMoT.setText("__________________");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(143, 143, 143)
                .addComponent(lblService)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblMoT)
                .addGap(173, 173, 173))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(178, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 492, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(143, 143, 143))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(costofService)
                        .addGap(18, 18, 18)
                        .addComponent(priceService))
                    .addComponent(serviceOptions, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(moTOptions, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(73, 73, 73))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(248, 248, 248)
                        .addComponent(costofMoT)
                        .addGap(27, 27, 27)
                        .addComponent(priceMoT)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(serviceOptions, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(moTOptions, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblMoT)
                    .addComponent(lblService))
                .addGap(5, 5, 5)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(priceService)
                    .addComponent(costofService)
                    .addComponent(costofMoT)
                    .addComponent(priceMoT))
                .addContainerGap(102, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void moTOptionsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_moTOptionsActionPerformed
        conn = javaconnect.ConnecrDb();
        //  main.dispose();
        
        //as soon as the MoTOptions button is clicked, the bookingMoT form loads up 
        revealMot.setVisible(true);
        revealMot.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);


    }//GEN-LAST:event_moTOptionsActionPerformed


    private void serviceOptionsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_serviceOptionsActionPerformed
        conn = javaconnect.ConnecrDb();
        
        //main.dispose();
        
         //as soon as the serviceOptions button is clicked, the wider option of types of Services loads up for the mechanic to choose exactly which Service to book for a customer
        optionofservices.setVisible(true);
        optionofservices.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

    }//GEN-LAST:event_serviceOptionsActionPerformed

    public                                                  static                  void                main(String args[]) {
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
            java.util.logging.Logger.getLogger(maintenance.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(maintenance.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(maintenance.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(maintenance.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
    public                                                                          void                run() {
                
                
                      try {
                    UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(maintenance.class.getName()).log(Level.SEVERE, null, ex);
                } catch (InstantiationException ex) {
                    Logger.getLogger(maintenance.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IllegalAccessException ex) {
                    Logger.getLogger(maintenance.class.getName()).log(Level.SEVERE, null, ex);
                } catch (UnsupportedLookAndFeelException ex) {
                    Logger.getLogger(maintenance.class.getName()).log(Level.SEVERE, null, ex);
                }
                
                
                
                
               
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel costofMoT;
    private javax.swing.JLabel costofService;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblMoT;
    private javax.swing.JLabel lblService;
    private javax.swing.JButton moTOptions;
    private javax.swing.JLabel priceMoT;
    private javax.swing.JLabel priceService;
    private javax.swing.JButton serviceOptions;
    // End of variables declaration//GEN-END:variables

 
}
