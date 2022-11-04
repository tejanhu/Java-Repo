/*AUTHOR: HUSSEIN AHMED TEJAN
 * This frame is necessary to block Holidays i.e: Bank and Public Holidays, Sundays, days that have already passed and also enable appointments to only take place from 9-12 noon on Saturdays. 
 */
package gui;

import com.sun.xml.internal.ws.wsdl.parser.InaccessibleWSDLException;
import java.awt.Component;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.TimeZone;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import java.sql.Time;
import java.text.ParseException;
import java.util.Calendar;
import java.util.Date;

import java.awt.Color;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DateFormat;
import static java.util.Calendar.SATURDAY;
import javax.swing.JList;
import javax.swing.ListSelectionModel;
import javax.swing.UIManager;
import javax.swing.plaf.basic.BasicComboBoxRenderer;

import maintenancebookings.Schedule;

    public                                  class                               Appointment extends javax.swing.JFrame {

    private                                 String                              startappTime;
    private                                 String                              endappTime;
    private                                 Date                                date;
    private                                 int                                 bayNum;

    private                                 ArrayList<String>                   holidayName = new ArrayList();

    private                                 ArrayList<Date>                     holidaysList = new ArrayList();
    private                                 ArrayList<Date>                     bankHolidays = new ArrayList();

        
                                            Schedule                            processSchedule;

    private                                 String                              startTime;
    private                                 String                              endTime;
                                            Connection                          conn = null;
                                            ResultSet                           rs = null;
                                            PreparedStatement                   pst = null;

                                            BookingMoT                          bm = new BookingMoT(this);

                                            OptionBasedSchedule                 ubService = new OptionBasedSchedule();
                                            OptionBasedSchedule                 tbService = new OptionBasedSchedule();

                                            MoTBooking                          tblMot = new MoTBooking(bm);
    private                                 Object                              Calender;



    public                                                                      Appointment(Schedule scheduleProcessor) {
                                                                                processSchedule = scheduleProcessor;
        initComponents();
                                                                                conn = javaconnect.ConnecrDb();
        readHolidays();

                                            String                              nextService = "";

        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Appointment.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(Appointment.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(Appointment.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(Appointment.class.getName()).log(Level.SEVERE, null, ex);
        }

                                            DateFormat                          dateFormat = new SimpleDateFormat("yyyy-MM-dd");
                                            Calendar                            cal = Calendar.getInstance();
                                            Date                                brandNewDate = cal.getTime();
        //if (response == 1) {
            cal.add(Calendar.YEAR, 1);

            nextService = dateFormat.format(brandNewDate);
            rqstnxtService.setText(dateFormat.format(cal.getTime()));
            rqstnxtService.setEditable(false);
//        } else if (response == 2) {
//            cal.add(Calendar.YEAR, 2);
//
//            nextService = dateFormat.format(brandNewDate);
//            rqstnxtService.setText(dateFormat.format(cal.getTime()));
//            rqstnxtService.setEditable(false);
//        }

    }

   
   

    public void setStartTime(String startTime) {
        System.out.println("We are in start time");
        startappTime = startTime;

    }

    public void setEndTime(String endTime) {
        System.out.println("We are in end time");
        endappTime = endTime;

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
        buttonGroup3 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        combo_time = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        bookAppointmentDate = new com.toedter.calendar.JDateChooser();
        jLabel3 = new javax.swing.JLabel();
        bookS_M = new javax.swing.JButton();
        bayNo = new javax.swing.JComboBox();
        combo_SatTime = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();
        rqstnxtService = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel1MouseClicked(evt);
            }
        });
        jPanel1.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jPanel1PropertyChange(evt);
            }
        });

        jLabel1.setText("Bay No:");

        combo_time.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "09:00", "10:00", "11:00", "12:00", "13:00", "14:00", "15:00", "16:00", "17:00", "17:30" }));
        combo_time.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combo_timeActionPerformed(evt);
            }
        });

        jLabel2.setText("Time:");

        bookAppointmentDate.setDateFormatString("yyyy-MM-dd");
        bookAppointmentDate.setMaxSelectableDate(new java.util.Date(253370768502000L));
        bookAppointmentDate.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                bookAppointmentDatePropertyChange(evt);
            }
        });

        jLabel3.setText("Please choose your Date:");

        bookS_M.setText("BOOK");
        bookS_M.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bookS_MActionPerformed(evt);
            }
        });

        bayNo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6" }));
        bayNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bayNoActionPerformed(evt);
            }
        });

        combo_SatTime.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "09:00", "10:00", "11:00", "12:00", "" }));

        jLabel4.setText("Due for Next Service:");

        rqstnxtService.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rqstnxtServiceActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(182, 182, 182)
                        .addComponent(bookS_M, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(153, 153, 153)
                                .addComponent(bayNo, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(26, 26, 26)
                                .addComponent(combo_SatTime, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(34, 34, 34)
                                .addComponent(combo_time, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4))
                                .addGap(35, 35, 35)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(bookAppointmentDate, javax.swing.GroupLayout.DEFAULT_SIZE, 137, Short.MAX_VALUE)
                                    .addComponent(rqstnxtService))))))
                .addGap(118, 118, 118))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(bookAppointmentDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jLabel4))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(rqstnxtService, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(combo_SatTime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(combo_time, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(bayNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(71, 71, 71)
                .addComponent(bookS_M, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bookAppointmentDatePropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_bookAppointmentDatePropertyChange
        Connection conn = null;

        try {
            SimpleDateFormat parser = new SimpleDateFormat("yyyy-MM-dd");

            String test = parser.format(bookAppointmentDate.getDate());

            date = bookAppointmentDate.getDate();

            if (bookAppointmentDate.getDate().getDay() == 6) {
                combo_time.setVisible(true);
                JOptionPane.showMessageDialog(null, "Please select from the times listed or come back on Monday as we are closed at 12 noon. ");
                combo_SatTime.setVisible(true);
            } else {

            }

        } catch (Exception e) {

        }

    }//GEN-LAST:event_bookAppointmentDatePropertyChange


    private void jPanel1PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jPanel1PropertyChange


    }//GEN-LAST:event_jPanel1PropertyChange

    private void jPanel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseClicked

    }//GEN-LAST:event_jPanel1MouseClicked

    private void bookS_MActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bookS_MActionPerformed

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
    

        setStartTime(startTime);
        setEndTime(endTime);

        processSchedule.setDate(date);
        processSchedule.setstartTime(startappTime);
        processSchedule.setfinishTime(endappTime);
        processSchedule.setBayNumber(bayNum);

        System.out.println("This date was chosen: " + processSchedule);
//        
        try {
            Date date = new Date();
            if (bookAppointmentDate.getDate().before(date)) {
                bookAppointmentDate.setDate(null);
                JOptionPane.showMessageDialog(null, "It appears that you have opted to book a previous date, please select a future date.");

            }
            if (bookAppointmentDate.getDate().getDay() == 0) {
                

                JOptionPane.showMessageDialog(null, "Apologies, but the Garage is closed on Sundays.");

            }

            for (int i = 0; i < holidaysList.size(); i++) {
                System.out.println(holidaysList.get(i));
                // if the jchooser day,year AND month =  bank holiday DAY, YEAR AND MONTH
                //Then we cant book
                if ((bookAppointmentDate.getDate().getYear() == holidaysList.get(i).getYear())
                        && (bookAppointmentDate.getDate().getDay() == holidaysList.get(i).getDay())
                        && (bookAppointmentDate.getDate().getMonth() == holidaysList.get(i).getMonth())) {

                    bookAppointmentDate.setDate(null);
                   

                    JOptionPane.showMessageDialog(null, "Apologies, but the Garage is closed due to the " + holidayType + ": " + holidayName.get(i));

                    break;
                }

            }
        } catch (Exception e) {
            // System.out.println("BANK HOLIDAYISSUE"+e.getMessage());
        }


    }//GEN-LAST:event_bookS_MActionPerformed
//Reads the holidays into the jDateChooser calendar, formats the time and stores the type of holiday and holiday name.
    private void readHolidays() {
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
    public                                                      String                                  holidayType;


    private void combo_timeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combo_timeActionPerformed
        // TODO add your handling code here:
        System.out.println("The date in the combo box is " + date);

        String bookingTime = combo_time.getSelectedItem().toString();
        String bookingendTime = combo_time.getItemAt(combo_time.getSelectedIndex() + 1).toString();
        String part[] = {bookingTime, bookingendTime};

        startTime = part[0];

        System.out.println("The starttime in the combo box" + startTime);

        endTime = part[1];

        System.out.println("The endtime in the combo box" + endTime);
        for (int i = 0; i < part.length; i++) {

            System.out.println(part[i]);
        }


    }//GEN-LAST:event_combo_timeActionPerformed

    private void bayNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bayNoActionPerformed
        // TODO add your handling code here:
        bayNum = Integer.parseInt(bayNo.getSelectedItem().toString());
        System.out.println(bayNum);
    }//GEN-LAST:event_bayNoActionPerformed

    private void rqstnxtServiceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rqstnxtServiceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rqstnxtServiceActionPerformed

    /**
     * @param args the command line arguments
     */
            public                                              static                          void                main(String args[]) {
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
        } catch (InstantiationException ex) {
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Appointment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Appointment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public                                                                              void                run() {

                new Appointment(new Schedule(null, null, null, 0)).setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox bayNo;
    private com.toedter.calendar.JDateChooser bookAppointmentDate;
    private javax.swing.JButton bookS_M;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.JComboBox combo_SatTime;
    private javax.swing.JComboBox combo_time;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField rqstnxtService;
    // End of variables declaration//GEN-END:variables
}
