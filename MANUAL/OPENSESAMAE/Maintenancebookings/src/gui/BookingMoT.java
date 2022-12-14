/*AUTHOR: HUSSEIN AHMED TEJAN
 * This frame is where the mechanic books an appointment for a customer to take an MoT test.
 */
package gui;

import java.sql.Connection;
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


    public                                                  class                               BookingMoT extends javax.swing.JFrame {

    Appointment showBookings;
    MoTBooking motTbl;

    Connection conn = null;
    ResultSet rs = null;
    PreparedStatement pst = null;
    private String result;

    private                                 ArrayList<String>                   holidayName = new ArrayList();

    private                                 ArrayList<Date>                     holidaysList = new ArrayList();
    private                                 ArrayList<Date>                     bankHolidays = new ArrayList();

    private String timeSet;
    private String startTime;
    private String endTime;
    private int bayNum;
    private Date date;
    MoTBooking moTBook;
    private String commentary;
    private String moTRenewalDate = "";
    DateFormat dateFormat;
    Date brandNewDate;
    String bookingTime;
    String bookingendTime;
    

    public                                                                                        BookingMoT(Appointment showServices) {

        showBookings = showServices;
         
        readHolidays();
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(BookingMoT.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(BookingMoT.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(BookingMoT.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(BookingMoT.class.getName()).log(Level.SEVERE, null, ex);
        }

        initComponents();

        

        dateFormat = new SimpleDateFormat("yyyy-MM-dd");

//        if (bayNo.equals(showBookings.processSchedule.getBayNumber())) {
//            System.out.println("You can book this bay.");
//        } else if (!bayNo.equals(showBookings.processSchedule.getBayNumber())) {
//           // System.out.println("You cannot book this bay.");
//        }
//
//        if (chosenDate.equals(showBookings.processSchedule.getDate())) {
//            chosenDate.setText(dateFormat.format(cal.getTime()));
//            chosenDate.setEditable(false);
//            chosenRDate.setText(dateFormat.format(cal.getTime()));
//            chosenRDate.setEditable(false);
//           // System.out.println("You can book this date.");
//        } else if (!chosenDate.equals(showBookings.processSchedule.getDate())) {
//            System.out.println("You cannot book this date.");
//        }
        
        
           
        bg.add(failResult);

        bg.add(passResult);

    }
    //This button group groups the pass and fail radio buttons
    public ButtonGroup bg = new ButtonGroup();
    //This method is used to reassign the MoTBooking object to allow extra use.
    public void setMoTInstance(MoTBooking bookMot) {
        moTBook = bookMot;
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
        jLabel1 = new javax.swing.JLabel();
        reSult = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        comments = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        vID = new javax.swing.JTextField();
        bookMoTtotbl = new javax.swing.JButton();
        passResult = new javax.swing.JRadioButton();
        failResult = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        bayNo = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        chosenRDate = new javax.swing.JTextField();
        chosenDate = new com.toedter.calendar.JDateChooser();
        jLabel8 = new javax.swing.JLabel();
        combo_SatTime = new javax.swing.JComboBox();
        combo_time = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel1.setText("Result:");

        reSult.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reSultActionPerformed(evt);
            }
        });

        jLabel5.setText("Commentary:");

        comments.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                commentsActionPerformed(evt);
            }
        });

        jLabel6.setText("VehicleID:");

        vID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vIDActionPerformed(evt);
            }
        });

        bookMoTtotbl.setText("BOOK");
        bookMoTtotbl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bookMoTtotblActionPerformed(evt);
            }
        });

        passResult.setText("Pass");
        passResult.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passResultActionPerformed(evt);
            }
        });

        failResult.setText("Fail");
        failResult.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                failResultActionPerformed(evt);
            }
        });

        jLabel2.setText("Date:");

        bayNo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6" }));
        bayNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bayNoActionPerformed(evt);
            }
        });

        jLabel3.setText("Bay No:");

        jLabel7.setText("Renewal Date:");

        chosenRDate.setEditable(false);

        chosenDate.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                chosenDatePropertyChange(evt);
            }
        });

        jLabel8.setText("Time:");

        combo_SatTime.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "09:00", "10:00", "11:00", "12:00" }));
        combo_SatTime.setToolTipText("");
        combo_SatTime.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combo_SatTimeActionPerformed(evt);
            }
        });

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
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel1))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(bayNo, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(bookMoTtotbl, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel3)
                                            .addComponent(passResult))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(failResult)
                                        .addGap(14, 14, 14)))))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 176, Short.MAX_VALUE)
                                .addComponent(chosenRDate, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(chosenDate, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(comments, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 133, Short.MAX_VALUE)
                                            .addComponent(reSult, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 133, Short.MAX_VALUE)
                                            .addComponent(vID, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 133, Short.MAX_VALUE)))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(52, 52, 52)
                                        .addComponent(jLabel8)
                                        .addGap(18, 18, 18)
                                        .addComponent(combo_SatTime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE)))))
                        .addGap(23, 23, 23)
                        .addComponent(combo_time, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(vID, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(reSult))
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(comments, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel8)
                                    .addComponent(combo_SatTime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(combo_time, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addComponent(jLabel2)))
                        .addGap(5, 5, 5))
                    .addComponent(chosenDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(chosenRDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(passResult)
                    .addComponent(failResult))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(bookMoTtotbl, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(bayNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40))))
        );

        jLabel4.setText("Register a new MoT");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(254, 254, 254)
                .addComponent(jLabel4)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 41, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void reSultActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reSultActionPerformed
    //conn = javaconnect.ConnecrDb();

    }//GEN-LAST:event_reSultActionPerformed

    private void commentsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_commentsActionPerformed
        //conn = javaconnect.ConnecrDb();
        comments.setText(commentary);
        System.out.println(" in " + comments.getText());

    }//GEN-LAST:event_commentsActionPerformed

    private void vIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vIDActionPerformed
       conn = javaconnect.ConnecrDb();
    }//GEN-LAST:event_vIDActionPerformed
    //This method is used to set the bayNumber.
    private void setBayNo(int bayNum) {
        int bayNumber = bayNum;
    }

    private void bookMoTtotblActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bookMoTtotblActionPerformed
      conn = javaconnect.ConnecrDb();
        
         try {
            Date date = new Date();
            if (chosenDate.getDate().before(date)) {
                chosenDate.setDate(null);
                JOptionPane.showMessageDialog(null, "It appears that you have opted to book a previous date, please select a future date.");

            }
            if (chosenDate.getDate().getDay() == 0) {
                

                JOptionPane.showMessageDialog(null, "Apologies, but the Garage is closed on Sundays.");

            }

            for (int i = 0; i < holidaysList.size(); i++) {
                System.out.println(holidaysList.get(i));
                // if the jchooser day,year AND month =  bank holiday DAY, YEAR AND MONTH
                //Then we cant book
                if ((chosenDate.getDate().getYear() == holidaysList.get(i).getYear())
                        && (chosenDate.getDate().getDay() == holidaysList.get(i).getDay())
                        && (chosenDate.getDate().getMonth() == holidaysList.get(i).getMonth())) {

                    chosenDate.setDate(null);
                    System.out.println(" holidays "+ holidaysList);

                    JOptionPane.showMessageDialog(null, "Apologies, but the Garage is closed due to the " + holidayType + ": " + holidayName.get(i));

                    break;
                }

            }
        } catch (Exception e) {
            // System.out.println("BANK HOLIDAYISSUE"+e.getMessage());
        }





//This calendar object retrieves the date that was chosen on the jDateChooser.
        Calendar cal = chosenDate.getCalendar();
//        chosenDate.setText(dateFormat.format(cal.getTime()));
//        chosenDate.setEditable(false);
        
        //increments the exact date chosen by a year

        cal.add(chosenDate.getCalendar().YEAR, 1);
        brandNewDate = cal.getTime();
        moTRenewalDate = dateFormat.format(brandNewDate);
        chosenRDate.setText(dateFormat.format(brandNewDate));
        chosenRDate.setEditable(false);

        //if the pass radio button is selected, it will enable the mechanic to book an appointment for MoT testing.
        if (passResult.isSelected()) {

            moTBook.setVisible(true);
            this.setVisible(false);
        } 
        //if the fail radio button is selected, it will aks the mechanic to record the reasons behind why the customer failed the MoT test.
        else if (failResult.isSelected() && comments.getText().equalsIgnoreCase("")) {

            JOptionPane.showMessageDialog(null, "Please suggest the reasons behind the vehicle failing the MoT Test. ");

            return;
        }

        System.out.println("This date was chosen: " + showBookings);

        System.out.println("start time twat: "+startTime);
        System.out.println("end time twit: "+endTime);
        try {

            System.out.println("The baynumber is "+bayNum);
            
            //Inserts the data entered in the MoT form into the MoT table within the Database.
            String sql = "INSERT INTO MoT "
                    + "(vehicleID, result, commentary, mOTRenewalDate, date, bayNumber, bookingTime)"
                    + "VALUES (?,?,?,?,?,?,?)";
            pst = conn.prepareStatement(sql);
            pst.setString(1, vID.getText());
            pst.setString(2, reSult.getText());
            pst.setString(3, comments.getText());
            pst.setString(4, chosenRDate.getText());
            //pst.setString(5, dateFormat.format(chosenDate.getDate())+startTime+"- "+endTime);
            pst.setString(5, (chosenDate.getDate())+startTime+"- "+endTime);
            pst.setInt(6, bayNum);
            pst.setString(6, timeSet);
            pst.executeUpdate();
            //JUST NOW
            pst.close();
            rs.close();
            conn.close();
            //
        } catch (Exception ne) {
            System.out.println("Cannot Perform Query 2");
            ne.printStackTrace();

        }
         finally{
            try {
                pst.executeUpdate();
                pst.close();
                conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(TimeBasedServiceBooking.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
     

    }//GEN-LAST:event_bookMoTtotblActionPerformed
//Result is set to pass if the mechanic selected the pass radio button.
    private void passResultActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passResultActionPerformed
        //conn = javaconnect.ConnecrDb();
        if (passResult.isSelected()) {
            result = "pass";
            reSult.setText(result);

        }
    }//GEN-LAST:event_passResultActionPerformed
//Result is set to fail if the mechanic selected the fail radio button.
    private void failResultActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_failResultActionPerformed
        //conn = javaconnect.ConnecrDb();
        if (failResult.isSelected() && comments.getText().isEmpty()) {
            result = "fail";
            reSult.setText(result);
            // JOptionPane.showMessageDialog(null, "Please suggest the reasons behind the vehicle failing the MoT Test. ");
        }
    }//GEN-LAST:event_failResultActionPerformed
//The bay number selected is stored into the MoT table once selected at the end of pressing "Book".
    private void bayNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bayNoActionPerformed
        //conn = javaconnect.ConnecrDb();
        bayNum = Integer.parseInt(bayNo.getSelectedItem().toString());
        //System.out.println(bayNum);
    }//GEN-LAST:event_bayNoActionPerformed
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
    public                                                      String                                  holidayType;
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

    private void combo_timeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combo_timeActionPerformed
            //conn = javaconnect.ConnecrDb();
            bookingTime = combo_time.getSelectedItem().toString();
            bookingendTime = combo_time.getItemAt(combo_time.getSelectedIndex() + 1).toString();
           String part[] = {bookingTime, bookingendTime};

         startTime = part[0];
         endTime = part[1];
        
         timeSet=startTime+endTime;
         
          for (int i = 0; i < part.length; i++) {

            System.out.println(part[i]);
        }  
        
        System.out.println("We get in this baby for a change!");
    
    }//GEN-LAST:event_combo_timeActionPerformed

    private void chosenDatePropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_chosenDatePropertyChange
        conn = javaconnect.ConnecrDb();
        try{
        if (chosenDate.getDate().getDay() == 6) {
            combo_time.setVisible(false);
           // JOptionPane.showMessageDialog(null, "Please select from the times listed or come back on Monday as we are closed at 12 noon. ");
            combo_SatTime.setVisible(true);
        } else {
            combo_time.setVisible(true);
            combo_SatTime.setVisible(false);
        }
}
catch(Exception e){
    
}

  
        
    }//GEN-LAST:event_chosenDatePropertyChange

    /**
     * @param args the command line arguments
     */
            public                                      static                      void                        main(String args[]) {
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
            java.util.logging.Logger.getLogger(BookingMoT.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BookingMoT.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BookingMoT.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BookingMoT.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public                                                                  void                        run() {

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox bayNo;
    private javax.swing.JButton bookMoTtotbl;
    private com.toedter.calendar.JDateChooser chosenDate;
    private javax.swing.JTextField chosenRDate;
    private javax.swing.JComboBox combo_SatTime;
    private javax.swing.JComboBox combo_time;
    private javax.swing.JTextField comments;
    private javax.swing.JRadioButton failResult;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JRadioButton passResult;
    private javax.swing.JTextField reSult;
    private javax.swing.JTextField vID;
    // End of variables declaration//GEN-END:variables
}
