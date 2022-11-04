/*AUTHOR: HUSSEIN AHMED TEJAN
 * This frame is required to enable the mechanic to fill in the customer details to book an appointment for their vehicle to be service based on the Mileage Usage.
 */
package gui;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.TimeZone;
import maintenancebookings.Usagebased;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author ht304
 */
    public                                              class                   UsageBasedServiceBooking            extends javax.swing.JFrame {

                                                                                Usagebased                          usbController;
    private                                                                     int                                 vID;
    private                                                                     String                              bType;
    private                                                                     int                                 currentMileage;
                                                                                Connection                          conn = null;
                                                                                ResultSet                           rs = null;
                                                                                PreparedStatement                   pst = null;

                                                                                
    private                                                                 ArrayList<String>                   holidayName = new ArrayList();

    private                                                                 ArrayList<Date>                     holidaysList = new ArrayList();
    private                                                                 ArrayList<Date>                     bankHolidays = new ArrayList();
                                                                                
    public                                                                  String                              holidayType;                                                                            
                                                                                
    private                                                                     int                                 bayNum;
    private                                                                     int                                 prevMileage;
    private                                                                     String                              startTime;
    private                                                                     String                              endTime;
    private                                                                     String                              timeSet;
                                                                                String                              bookingTime;
                                                                                String                              bookingendTime;
                                                                                OptionBasedSchedule                 showPreviouslyBookedServices;
                                                                                Appointment                         bookingApp;

    public         UsageBasedServiceBooking(Appointment appBooking, OptionBasedSchedule showBookedServices, Usagebased controllerUsb) {
        initComponents();
                                                                                bookingApp =                        appBooking;
                                                                                showPreviouslyBookedServices =      showBookedServices;
                                                                                usbController =                     controllerUsb;

                                                                                
                                                                            conn = javaconnect.ConnecrDb();
                                                                            readHolidays();
                                                                                
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(UsageBasedServiceBooking.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(UsageBasedServiceBooking.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(UsageBasedServiceBooking.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(UsageBasedServiceBooking.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    private                                         void                            setVehicleID() {
        vIDUsb.setText("" + vID);

    }

    private                                         void                            setBookingType() {
        bTypeUsb.setText(bType);
    }

    private                                         void                            setcurrentMileage() {
        usbPresentMileage.setText("" + currentMileage);
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
        jPanel2 = new javax.swing.JPanel();
        BookingType = new javax.swing.JLabel();
        bTypeUsb = new javax.swing.JTextField();
        Mileage = new javax.swing.JLabel();
        usbPresentMileage = new javax.swing.JTextField();
        vehicleID = new javax.swing.JLabel();
        vIDUsb = new javax.swing.JTextField();
        serviceSubmit = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        bayNo = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        ubschosenDate = new com.toedter.calendar.JDateChooser();
        combo_montoFriTime = new javax.swing.JComboBox();
        combo_SatTime = new javax.swing.JComboBox();
        previousbookedServices = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        BookingType.setText("Booking Type:");

        bTypeUsb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bTypeUsbActionPerformed(evt);
            }
        });

        Mileage.setText("Mileage:");

        usbPresentMileage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usbPresentMileageActionPerformed(evt);
            }
        });

        vehicleID.setText("VehicleID:");

        vIDUsb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vIDUsbActionPerformed(evt);
            }
        });

        serviceSubmit.setText("SUBMIT");
        serviceSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                serviceSubmitActionPerformed(evt);
            }
        });

        jLabel1.setText("Bay No:");

        bayNo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6" }));
        bayNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bayNoActionPerformed(evt);
            }
        });

        jLabel3.setText("Date:");

        jLabel4.setText("Time:");

        ubschosenDate.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                ubschosenDatePropertyChange(evt);
            }
        });

        combo_montoFriTime.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "09:00", "10:00", "11:00", "12:00", "13:00", "14:00", "15:00", "16:00", "17:00", "17:30" }));
        combo_montoFriTime.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combo_montoFriTimeActionPerformed(evt);
            }
        });

        combo_SatTime.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "09:00", "10:00", "11:00", "12:00" }));
        combo_SatTime.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combo_SatTimeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(combo_montoFriTime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(combo_SatTime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(12, 12, 12)
                                .addGap(43, 43, 43)
                                .addComponent(ubschosenDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(43, 43, 43)
                                .addComponent(bayNo, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(Mileage)
                                    .addGap(43, 43, 43)
                                    .addComponent(usbPresentMileage, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(BookingType)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(bTypeUsb, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(vehicleID)
                                    .addGap(32, 32, 32)
                                    .addComponent(vIDUsb, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(110, 110, 110)
                        .addComponent(serviceSubmit, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 33, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(vIDUsb, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(vehicleID))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BookingType)
                    .addComponent(bTypeUsb))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Mileage)
                    .addComponent(usbPresentMileage, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(bayNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(ubschosenDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(combo_montoFriTime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(combo_SatTime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addComponent(serviceSubmit, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(81, 81, 81))
        );

        previousbookedServices.setText("View Previously Booked Services");
        previousbookedServices.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                previousbookedServicesActionPerformed(evt);
            }
        });

        jLabel2.setText("Register a new Service");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(previousbookedServices))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(113, 113, 113)
                        .addComponent(jLabel2)))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(previousbookedServices)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 28, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bTypeUsbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bTypeUsbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bTypeUsbActionPerformed

    private void usbPresentMileageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usbPresentMileageActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usbPresentMileageActionPerformed

    private void vIDUsbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vIDUsbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_vIDUsbActionPerformed

    private void serviceSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_serviceSubmitActionPerformed
        conn = javaconnect.ConnecrDb();
        
        
        try {
            Date date = new Date();
            if (ubschosenDate.getDate().before(date)) {
                ubschosenDate.setDate(null);
                JOptionPane.showMessageDialog(null, "It appears that you have opted to book a previous date, please select a future date.");

            }
            if (ubschosenDate.getDate().getDay() == 0) {

                JOptionPane.showMessageDialog(null, "Apologies, but the Garage is closed on Sundays.");

            }

            for (int i = 0; i < holidaysList.size(); i++) {
                System.out.println("We get in the usagebased thing");
                System.out.println(holidaysList.get(i));
                // if the jchooser day,year AND month =  bank holiday DAY, YEAR AND MONTH
                //Then we cant book
                if ((ubschosenDate.getDate().getYear() == holidaysList.get(i).getYear())
                        && (ubschosenDate.getDate().getDay() == holidaysList.get(i).getDay())
                        && (ubschosenDate.getDate().getMonth() == holidaysList.get(i).getMonth())) {

                    ubschosenDate.setDate(null);

                    JOptionPane.showMessageDialog(null, "Apologies, but the Garage is closed due to the " + holidayType + ": " + holidayName.get(i));
//                
//                    else {
//                }
                    break;
                }

            }
        } catch (Exception e) {
            // System.out.println("BANK HOLIDAYISSUE"+e.getMessage());
        }
        
        
        
        
        
        try {
//              conn = javaconnect.ConnecrDb();
            Statement stat = conn.createStatement();
            //Displays information from Database into jTable: UsageBasedService in OptionBasedSchedule
            String sql2 ="select * from UsageBasedService";
            rs = stat.executeQuery(sql2);
            int count = 0;
            int itemNum = 0;

            while (rs.next()) {
                if (vID == rs.getInt("vehicleID")) {
                    count = count + 1;
                }

            }
            while (rs.next()) {
                if (vID == rs.getInt("vehicleID")) {
                    itemNum = itemNum + 1;

                    if (count == itemNum) {
                        prevMileage = rs.getInt("currentVehicleMileage");
                        break;
                    }

                }

            }

            usbController.setVehicleID(vID);
            usbController.setBookingType(bType);
            usbController.setMiles(0);
            usbController.setDifference(prevMileage);
          
            usbController.workoutDifference(usbController.getDifference(), minimumMil, maximumMil);

            showPreviouslyBookedServices.setVisible(false);
            this.setVisible(false);

            try {
            //Inserts the data entered in the UsageBasedService form into the UsageBasedService table within the Database.

                String sql = "INSERT INTO UsageBasedService "
                        + "(vehicleID, currentVehicleMileage, BookingType, bayNumber, bookingDate,  bookingTime)"
                        + "VALUES (?,?,?,?,?,?)";
                pst = conn.prepareStatement(sql);
                pst.setString(1, vIDUsb.getText());
                pst.setString(2, usbPresentMileage.getText());
                pst.setString(3, bTypeUsb.getText());
                pst.setInt(4, bayNum);
                //pst.setString(5, ubschosenDate.getDate().toString());
                pst.setString(5, ubschosenDate.getDateFormatString());
                pst.setString(6, timeSet);

                pst.executeUpdate();
            } catch (Exception ne) {
                System.out.println("Cannot Perform Query");
                ne.printStackTrace();

            }

        } catch (SQLException ex) {
            Logger.getLogger(UsageBasedServiceBooking.class.getName()).log(Level.SEVERE, null, ex);
        }


    }//GEN-LAST:event_serviceSubmitActionPerformed
    //maxMileage
    public static final int maximumMil = 120000;
    //minMileage
    public static final int minimumMil = 10000;

    private void previousbookedServicesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_previousbookedServicesActionPerformed
        conn = javaconnect.ConnecrDb();
        showPreviouslyBookedServices.setVisible(true);

        this.setVisible(false);
    }//GEN-LAST:event_previousbookedServicesActionPerformed

    private void bayNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bayNoActionPerformed
        conn = javaconnect.ConnecrDb();
        bayNum = Integer.parseInt(bayNo.getSelectedItem().toString());

        if (bayNo.equals(bookingApp.processSchedule.getBayNumber())) {
            System.out.println(bayNum);
        }
    }//GEN-LAST:event_bayNoActionPerformed

    private void ubschosenDatePropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_ubschosenDatePropertyChange
       conn = javaconnect.ConnecrDb();
        try{
        if (ubschosenDate.getDate().getDay() == 6) {
            combo_montoFriTime.setVisible(false);
           // JOptionPane.showMessageDialog(null, "Please select from the times listed or come back on Monday as we are closed at 12 noon. ");
            combo_SatTime.setVisible(true);
        } else {
            combo_montoFriTime.setVisible(true);
            combo_SatTime.setVisible(false);
        }
}
catch(Exception e){
    
}

    }//GEN-LAST:event_ubschosenDatePropertyChange

    
    
    private void readHolidays() {
        conn = javaconnect.ConnecrDb();
        try {

            holidayType = " ";

            String sql = "select * from Holidays";
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            //Table_UBS.setModel(DbUtils.resultSetToTableModel(rs));
            ResultSetMetaData rsmd = rs.getMetaData();
            while (rs.next()) {
                if (rs.getInt("holidayType") == 1) {
                    holidayType = "Public Holiday";
                } else if (rs.getInt("holidayType") == 2) {
                    holidayType = "Bank Holiday";
                }
                String holidayTitle = rs.getString("holidayName");

                int dateAsUnixTimeStamp = rs.getInt("holidayDate");
                java.util.Date date = new java.util.Date((long) dateAsUnixTimeStamp * 1000);
                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd"); // the format of your date
                sdf.setTimeZone(TimeZone.getTimeZone("GMT-4")); // give a timezone reference for formating (see comment at the bottom

                // DATE FROM DATABASE AS A STRING
                String formattedDate = sdf.format(date);

                // DATE FROM DATABASE AS A DATE
                Date dateFinal = sdf.parse(formattedDate);
                holidaysList.add(dateFinal);

                holidayName.add(holidayTitle);
                //System.out.println("This is the formatted date and it's in the arraylist " + formattedDate);
            }
            pst.close();
            rs.close();
            conn.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    
    private void combo_SatTimeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combo_SatTimeActionPerformed
     
            //conn = javaconnect.ConnecrDb();
            bookingTime = combo_SatTime.getSelectedItem().toString();
            bookingendTime = combo_SatTime.getItemAt(combo_SatTime.getSelectedIndex() + 1).toString();
           String part[] = {bookingTime, bookingendTime};

         startTime = part[0];
         endTime = part[1];
         
         timeSet=startTime+endTime;
        
          for (int i = 0; i < part.length; i++) {

            System.out.println(part[i]);
        }
          
        System.out.println("The starttime in the combo box" + startTime);

        

        System.out.println("The endtime in the combo box" + endTime);
      
          
        
    }//GEN-LAST:event_combo_SatTimeActionPerformed

    private void combo_montoFriTimeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combo_montoFriTimeActionPerformed
       //conn = javaconnect.ConnecrDb();
            bookingTime = combo_montoFriTime.getSelectedItem().toString();
            bookingendTime = combo_montoFriTime.getItemAt(combo_montoFriTime.getSelectedIndex() + 1).toString();
           String part[] = {bookingTime, bookingendTime};

         startTime = part[0];
         endTime = part[1];
         
          timeSet=startTime+" - "+endTime;
        
          for (int i = 0; i < part.length; i++) {

            System.out.println(part[i]);
        }  
        
        System.out.println("We get in this baby for a change!");
    }//GEN-LAST:event_combo_montoFriTimeActionPerformed

    /**
     * @param args the command line arguments
     */
            public                                                  static                      void                main(String args[]) {
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
            java.util.logging.Logger.getLogger(UsageBasedServiceBooking.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UsageBasedServiceBooking.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UsageBasedServiceBooking.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UsageBasedServiceBooking.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public                                                                              void                run() {

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BookingType;
    private javax.swing.JLabel Mileage;
    private javax.swing.JTextField bTypeUsb;
    private javax.swing.JComboBox bayNo;
    private javax.swing.JComboBox combo_SatTime;
    private javax.swing.JComboBox combo_montoFriTime;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton previousbookedServices;
    private javax.swing.JButton serviceSubmit;
    private com.toedter.calendar.JDateChooser ubschosenDate;
    private javax.swing.JTextField usbPresentMileage;
    private javax.swing.JTextField vIDUsb;
    private javax.swing.JLabel vehicleID;
    // End of variables declaration//GEN-END:variables
}
