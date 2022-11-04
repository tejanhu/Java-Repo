/*AUTHOR: HUSSEIN AHMED TEJAN
 * This frame is required to enable the mechanic to fill in the customer details to book an appointment for their vehicle to be service based on the expiration date of their last Service.
 */
package gui;

import com.toedter.calendar.JDateChooser;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import maintenancebookings.Schedule;
import maintenancebookings.Timebased;

/**
 *
 * @author ht304
 */
    public                                  class                           TimeBasedServiceBooking             extends javax.swing.JFrame {

                                                                            Connection                          conn = null;
                                                                            ResultSet                           rs = null;
                                                                            PreparedStatement                   pst = null;

    private                                                                 int                                 vID;
    private                                                                 String                              bType;
    private                                                                 int                                 bayNum;
                                                                            String                              timeSet;

    private                                                                 ArrayList<String>                   holidayName = new ArrayList();

    private                                                                 ArrayList<Date>                     holidaysList = new ArrayList();
    private                                                                 ArrayList<Date>                     bankHolidays = new ArrayList();

//    Date din = new Date();

    private                                                                 String                              startTime;
    private                                                                 String                              endTime;
                                                                            String                              bookingTime;
                                                                            String                              bookingendTime;

                                                                            String                              renewDate = "";

                                                                            DateFormat                          dateFormat;

                                                                            Calendar                            cal;

                                                                            Timebased                           tbController;

    public                                                                  String                              holidayType;

//    Schedule processSchedule;
//    Appointment showServiceBookings;
                                                                            OptionBasedSchedule                 showPreviouslyBookedServices;

    public                                                                  TimeBasedServiceBooking(OptionBasedSchedule showBookedServices, Timebased controllerTsb) {
        initComponents();
        // appDate.setText(String.valueOf(din.toString()));
                                                                            tbController =                      controllerTsb;
          conn = javaconnect.ConnecrDb();
                                                                            readHolidays();
//        showServiceBookings = showServices;
                                                                            showPreviouslyBookedServices =      showBookedServices;

        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(TimeBasedServiceBooking.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(TimeBasedServiceBooking.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(TimeBasedServiceBooking.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(TimeBasedServiceBooking.class.getName()).log(Level.SEVERE, null, ex);
        }

                                                                            dateFormat =        new              SimpleDateFormat("yyyy-MM-dd");

//        if (bayNo.equals(showServiceBookings.processSchedule.getBayNumber())) {
//            System.out.println("You can book this bay.");
//        } else if (!bayNo.equals(showServiceBookings.processSchedule.getBayNumber())) {
//            System.out.println("You cannot book this bay.");
//        }
//        if (appDate.equals(showServiceBookings.processSchedule.getDate().toString())) {
//            appDate.setText(dateFormat.format(cal.getTime()));
//            appDate.setEditable(false);
//            appRenewalDate.setText(dateFormat.format(cal.getTime()));
//            appRenewalDate.setEditable(false);
//           // System.out.println("You can book this date.");
//        } else if (!appDate.equals(showServiceBookings.processSchedule.getDate())) {
//            System.out.println("You cannot book this date.");
//        }
        //nextService=showBookedServices.
//         try {
        SimpleDateFormat parser = new SimpleDateFormat("yyyy-MM-dd");

        //  String test = parser.format(jDateChooser.getDate());
        // date = jDateChooser.getDate();
//        } catch (Exception e) {
//
//        }
                                                                            ButtonGroup                              bg = new ButtonGroup();

        bg.add(OneYr);
        bg.add(TwoYr);

        if (OneYr.isSelected()) {
            bg.clearSelection();
        } else if (TwoYr.isSelected()) {
            bg.clearSelection();
        }
    }

    private                                                                 void                                        setVehicleID(int vehicleID) {
                                                                            vID =                                       vehicleID;
    }

    private                                                                 void                                        setBookingType(String bookType) {
                                                                            bType =                                     bookType;
    }

//    private void setDate(Date aujordhui) {
//        din = aujordhui;
//    }
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
        vehicleID = new javax.swing.JLabel();
        vIDTbs = new javax.swing.JTextField();
        serviceSubmit = new javax.swing.JButton();
        bookType = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        appRenewalDate = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        bayNo = new javax.swing.JComboBox();
        OneYr = new javax.swing.JRadioButton();
        TwoYr = new javax.swing.JRadioButton();
        appDate = new com.toedter.calendar.JDateChooser();
        combo_Sattime = new javax.swing.JComboBox();
        jLabel5 = new javax.swing.JLabel();
        combo_time = new javax.swing.JComboBox();
        prevBS = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        BookingType.setText("Booking Type:");

        vehicleID.setText("VehicleID:");

        vIDTbs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vIDTbsActionPerformed(evt);
            }
        });

        serviceSubmit.setText("SUBMIT");
        serviceSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                serviceSubmitActionPerformed(evt);
            }
        });

        bookType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bookTypeActionPerformed(evt);
            }
        });

        jLabel2.setText("Date:");

        jLabel3.setText("Renewal Date:");

        appRenewalDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                appRenewalDateActionPerformed(evt);
            }
        });

        jLabel4.setText("Bay No:");

        bayNo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6" }));
        bayNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bayNoActionPerformed(evt);
            }
        });

        OneYr.setText("1 YR");
        OneYr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OneYrActionPerformed(evt);
            }
        });

        TwoYr.setText("2 YRS");
        TwoYr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TwoYrActionPerformed(evt);
            }
        });

        appDate.setDateFormatString("yyyy-MM-dd");
        appDate.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                appDatePropertyChange(evt);
            }
        });

        combo_Sattime.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "09:00", "10:00", "11:00", "12:00" }));
        combo_Sattime.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combo_SattimeActionPerformed(evt);
            }
        });

        jLabel5.setText("Time:");

        combo_time.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "09:00", "10:00", "11:00", "12:00", "13:00", "14:00", "15:00", "16:00", "17:00", "17:30" }));
        combo_time.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combo_timeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(BookingType))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jLabel4))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel3))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(vehicleID)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(vIDTbs, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(bookType, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(appRenewalDate, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(38, 38, 38))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(bayNo, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(66, 66, 66))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(appDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 46, 46)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(combo_Sattime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(combo_time, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(172, 172, 172)
                .addComponent(serviceSubmit, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(OneYr)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(TwoYr)
                .addGap(59, 59, 59))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(vehicleID)
                    .addComponent(vIDTbs, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BookingType)
                    .addComponent(bookType))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(combo_Sattime, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel5)
                            .addComponent(combo_time, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(appDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(OneYr)
                    .addComponent(TwoYr))
                .addGap(12, 12, 12)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(appRenewalDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(serviceSubmit, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(bayNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(71, 71, 71))))
        );

        prevBS.setText("View Previously Booked Services");
        prevBS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prevBSActionPerformed(evt);
            }
        });

        jLabel1.setText("Book Service");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(154, 154, 154)
                        .addComponent(prevBS))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(245, 245, 245)
                        .addComponent(jLabel1)))
                .addContainerGap(167, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(32, 32, 32))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(prevBS)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 10, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bookTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bookTypeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bookTypeActionPerformed

    private void vIDTbsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vIDTbsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_vIDTbsActionPerformed

    private void serviceSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_serviceSubmitActionPerformed
        conn = javaconnect.ConnecrDb();
        try {
            Date date = new Date();
            if (appDate.getDate().before(date)) {
                appDate.setDate(null);
                JOptionPane.showMessageDialog(null, "It appears that you have opted to book a previous date, please select a future date.");

            }
            if (appDate.getDate().getDay() == 0) {

                JOptionPane.showMessageDialog(null, "Apologies, but the Garage is closed on Sundays.");

            }

            for (int i = 0; i < holidaysList.size(); i++) {
                System.out.println("We get in the timebased thing");
                System.out.println(holidaysList.get(i));
                // if the jchooser day,year AND month =  bank holiday DAY, YEAR AND MONTH
                //Then we cant book
                if ((appDate.getDate().getYear() == holidaysList.get(i).getYear())
                        && (appDate.getDate().getDay() == holidaysList.get(i).getDay())
                        && (appDate.getDate().getMonth() == holidaysList.get(i).getMonth())) {

                    appDate.setDate(null);

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

        /*
         WHEN YOU CLICK THE BOOKING BUTTON
        
         get the chosen date
         get the time chosen
         get the bay chosen
         System.out.println("This is start time when the button is pressed"+startTime);
         System.out.println("This is end time when the button is pressed"+endTime);
        
         ONCE YOU GET THEM
        
         save them to variable
        
         ADD THEM TO DB
        
         */
        //Date dateChosen = jDateChooser.getDate();
        //int bayChosen = Integer.parseInt(bayNo.getSelectedItem().toString());
//        System.out.println("This is start time when the button is pressed" + startappTime);
//        System.out.println("This is end time when the button is pressed" + endappTime);
//        try {
//            conn = javaconnect.ConnecrDb();
//            //}
//            //Inserts the data entered in the TimeBasedService form into the TimeBasedService table within the Database.
//            String sql = "INSERT INTO TimeBasedService "
//                    + "(vehicleID, BookingType, lastService, nextService, bayNumber, bookingTime)"
//                    + "VALUES (?,?,?,?,?,?)";
//            pst = conn.prepareStatement(sql);
//            pst.setString(1, vIDTbs.getText());
//            pst.setString(2, bookType.getText());
//            pst.setString(3, appDate.getDateFormatString());
//            pst.setString(4, appRenewalDate.getText());
//            pst.setInt(5, bayNum);
//            pst.setString(6, timeSet);
//
//            pst.executeUpdate();
//
//        } catch (Exception ne) {
//            System.out.println("Cannot Perform Query");
//            ne.printStackTrace();
//
//        }

//        setStartTime(startTime);
//        setEndTime(endTime);
//
//        processSchedule.setDate(date);
//        processSchedule.setstartTime(startappTime);
//        processSchedule.setfinishTime(endappTime);
//        processSchedule.setBayNumber(bayNum);
        //System.out.println("This date was chosen: " + processSchedule);
//        
        conn = javaconnect.ConnecrDb();

        
        showPreviouslyBookedServices.setVisible(false);
        this.setVisible(false);

        try {

            System.out.println(vIDTbs.getText());
            System.out.println(bookType.getText());
            System.out.println((appDate.getDate()));
            System.out.println(appRenewalDate.getText());
            System.out.println(bayNum);

            String sql = "INSERT INTO TimeBasedService "
                    + "(vehicleID, BookingType, lastService, nextService, bayNumber)"
                    + "VALUES (?,?,?,?,?)";
            pst = conn.prepareStatement(sql);
            pst.setString(1, vIDTbs.getText());
            pst.setString(2, bookType.getText());
            //pst.setString(3, dateFormat.format(appDate.getDate())+startTime+"- "+endTime);
            pst.setString(3, (appDate.getDate())+startTime+"- "+endTime);
            pst.setString(4, appRenewalDate.getText());
            pst.setInt(5, bayNum);
            //pst.setString(6, timeSet);
            
            pst.executeUpdate();
        } catch (Exception ne) {
            System.out.println("Cannot Perform Query");
            ne.printStackTrace();

        }

    }//GEN-LAST:event_serviceSubmitActionPerformed
//This buttons enables the mechanic to view previously booked Appointments customers reserved for TimeBased Service.
    private void prevBSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prevBSActionPerformed
        conn = javaconnect.ConnecrDb();
        showPreviouslyBookedServices.setVisible(true);
//        showServiceBookings.setVisible(false);
        this.setVisible(false);
    }//GEN-LAST:event_prevBSActionPerformed

    private void appRenewalDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_appRenewalDateActionPerformed
        conn = javaconnect.ConnecrDb();

//        try {
//            SimpleDateFormat parser = new SimpleDateFormat("yyyy-MM-dd");
//
//            //  String test = parser.format(jDateChooser.getDate());
//            date = jDateChooser.getDate();
//
//            if (appDate.getDate().getDay() == 6) {
//                combo_time.setVisible(true);
//                JOptionPane.showMessageDialog(null, "Please select from the times listed or come back on Monday as we are closed at 12 noon. ");
//                combo_SatTime.setVisible(true);
//            } else {
//
//            }
//
//        } catch (Exception e) {
//
//        }
    }//GEN-LAST:event_appRenewalDateActionPerformed

    private void bayNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bayNoActionPerformed
     //The bay Number combo box clicked is stored into a variable which is then fed back into the database.
        conn = javaconnect.ConnecrDb();
        bayNum = Integer.parseInt(bayNo.getSelectedItem().toString());
        System.out.println(bayNum);
    }//GEN-LAST:event_bayNoActionPerformed
//This feature is required to display available times on Saturdays.
    private void combo_SattimeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combo_SattimeActionPerformed
//        System.out.println("The date in the combo box is " + date);
         conn = javaconnect.ConnecrDb();
        
        
         bookingTime = combo_Sattime.getSelectedItem().toString();
         bookingendTime = combo_Sattime.getItemAt(combo_Sattime.getSelectedIndex() + 1).toString();
        String part[] = {bookingTime, bookingendTime};

        startTime = part[0];

        System.out.println("The starttime in the combo box" + startTime);

        endTime = part[1];

        System.out.println("The endtime in the combo box" + endTime);
        for (int i = 0; i < part.length; i++) {

            System.out.println(part[i]);
        }
    }//GEN-LAST:event_combo_SattimeActionPerformed

    private void appDatePropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_appDatePropertyChange
        conn = javaconnect.ConnecrDb();
        try{
        if (appDate.getDate().getDay() == 6) {
            combo_time.setVisible(false);
           // JOptionPane.showMessageDialog(null, "Please select from the times listed or come back on Monday as we are closed at 12 noon. ");
            combo_Sattime.setVisible(true);
        } else {
            combo_time.setVisible(true);
            combo_Sattime.setVisible(false);
        }
}
catch(Exception e){
    
}
    }//GEN-LAST:event_appDatePropertyChange
//Once the mechanic selects the radio button on the assumption that the customer requested to renew their servicing for the vehicle in one year
 //the renewal date would increment exactly one year from their last service date of which then they would need to re-service their vehicle.
    private void OneYrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OneYrActionPerformed
        conn = javaconnect.ConnecrDb();
        cal = appDate.getCalendar();
        if (OneYr.isSelected()) {

            cal.add(appDate.getCalendar().YEAR, 1);
            Date brandNewDate = cal.getTime();
            renewDate = dateFormat.format(brandNewDate);
            appRenewalDate.setText(dateFormat.format(brandNewDate));
            appRenewalDate.setEditable(false);
        }
    }//GEN-LAST:event_OneYrActionPerformed
//Once the mechanic selects the radio button on the assumption that the customer requested to renew their servicing for the vehicle in two years time
 //the renewal date would increment exactly two years from their last service date of which then they would need to re-service their vehicle.
    private void TwoYrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TwoYrActionPerformed
        conn = javaconnect.ConnecrDb();
        cal = appDate.getCalendar();
        if (TwoYr.isSelected()) {
            cal.add(appDate.getCalendar().YEAR, 2);
            Date brandNewDate = cal.getTime();
            renewDate = dateFormat.format(brandNewDate);
            appRenewalDate.setText(dateFormat.format(brandNewDate));
            appRenewalDate.setEditable(false);
        }
    }//GEN-LAST:event_TwoYrActionPerformed

    private void combo_timeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combo_timeActionPerformed
            conn = javaconnect.ConnecrDb();
   
            bookingTime = combo_time.getSelectedItem().toString();
            bookingendTime = combo_time.getItemAt(combo_time.getSelectedIndex() + 1).toString();
           String part[] = {bookingTime, bookingendTime};

         startTime = part[0];
         endTime = part[1];
         
          timeSet=startTime+" - "+endTime;
        
          for (int i = 0; i < part.length; i++) {

            System.out.println(part[i]);
        }  
        
        System.out.println("We get in this baby for a change!");
    }//GEN-LAST:event_combo_timeActionPerformed

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

    /**
     * @param args the command line arguments
     */
            public                                              static                      void                        main(String args[]) {
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
            java.util.logging.Logger.getLogger(TimeBasedServiceBooking.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TimeBasedServiceBooking.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TimeBasedServiceBooking.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TimeBasedServiceBooking.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public                                                                          void                        run() {

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BookingType;
    private javax.swing.JRadioButton OneYr;
    private javax.swing.JRadioButton TwoYr;
    private com.toedter.calendar.JDateChooser appDate;
    private javax.swing.JTextField appRenewalDate;
    private javax.swing.JComboBox bayNo;
    private javax.swing.JTextField bookType;
    private javax.swing.JComboBox combo_Sattime;
    private javax.swing.JComboBox combo_time;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton prevBS;
    private javax.swing.JButton serviceSubmit;
    private javax.swing.JTextField vIDTbs;
    private javax.swing.JLabel vehicleID;
    // End of variables declaration//GEN-END:variables
}
