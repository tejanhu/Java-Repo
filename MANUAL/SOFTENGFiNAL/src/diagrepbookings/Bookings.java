/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package diagrepbookings;

import customer.CustomerFF;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Time;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author Becky
 */
public class Bookings extends javax.swing.JFrame {
    
    Connection conn = null;
    PreparedStatement pst = null;
    ResultSet rs=null;
    
    
    
  /**
     * Creates new form Bookings
     */
    public Bookings() {
           
        
        initComponents();
        Update_table();
        Update_list();
        Update_vehicle();
        Update_parts();
    
    }
    private void updateMiles() throws SQLException{
        conn=sqliteConnection.dbConnector();
        String sql2="UPDATE vehicle SET vehicleMileage=?" +" WHERE vehicleID ="+vehIDT.getText();
          
            pst=conn.prepareStatement(sql2);
            pst.setString(1,currentMiles.getText()); 
            pst.execute();
            
             pst.close();
             conn.close();            
    
    }
    private void updateMechanic() throws SQLException{
        int time = timeDuration();
        conn=sqliteConnection.dbConnector();
            String sql3="INSERT INTO mechanic (workingHours)";
            
            pst=conn.prepareStatement(sql3);
            pst.setInt(1,time);
            
            pst.execute();
            
            pst.close();
            conn.close(); 
    }
    private void updateBook(){
         conn=sqliteConnection.dbConnector();
        try{
            String sql="INSERT INTO Bookings (fullname,surname,bookingDate,bookingTime,bayNumber,bookingType,bookingPrice,faultyPart,customerID,vehicleID,bookETime) values (?,?,?,?,?,?,?,?,?,?,?)";
            pst=conn.prepareStatement(sql);
            pst.setString(1,customerList.getSelectedItem().toString());
            pst.setString(2,surnameT.getText());
            pst.setString(3,jDateChooser1.getDate().toString());
            pst.setString(4,timeT.getSelectedItem().toString()); 
            pst.setString(5,bayT.getSelectedItem().toString());
            pst.setString(6,typeT.getSelectedItem().toString());
            pst.setString(7,priceT.getText());
            pst.setString(8,partsList.getSelectedItem().toString());
            pst.setString(9,custIDT.getText());
            pst.setString(10,vehIDT.getText());
            pst.setString(11,timeE.getSelectedItem().toString());
            pst.execute();
            JOptionPane.showMessageDialog(null,"Booking Confirmed");
                               
            pst.close();
            conn.close();
            Update_table();
         }
            catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        
    } 
    
    
    }
    private Time endTime(){
        String strTimeT = timeE.getSelectedItem().toString();
        DateFormat formatter = new SimpleDateFormat("hh:mm");
        Date timeEnd;
        Time timeEn=null;
           
        try {
            
            timeEnd = formatter.parse(strTimeT);
            timeEn = new Time(timeEnd.getTime());
            
        } catch (ParseException ex) {
            Logger.getLogger(Bookings.class.getName()).log(Level.SEVERE, null, ex);
        }
        return timeEn;
         
         
    }
    
    private Time startTime(){
        String strTimeT = timeT.getSelectedItem().toString();
        DateFormat formatter = new SimpleDateFormat("hh:mm");
        Date timeStart;
        Time timeSt=null;
           
        try {
            
            timeStart = formatter.parse(strTimeT);
            timeSt = new Time(timeStart.getTime());
            
        } catch (ParseException ex) {
            Logger.getLogger(Bookings.class.getName()).log(Level.SEVERE, null, ex);
        }
        return timeSt;
         
         
    }
    
   private int timeDuration(){
        
        int timeDuration;
        int sTime = Integer.parseInt((String)timeT.getSelectedItem());
        int eTime = Integer.parseInt((String)timeE.getSelectedItem());
        
        timeDuration = eTime - sTime;
        
        return timeDuration;
        
        
    }
    
    
    private boolean checkTime(){
            boolean blocked = false;
            int sTime = Integer.parseInt((String)timeT.getSelectedItem());
            int eTime = Integer.parseInt((String)timeE.getSelectedItem());
            
        try{
            if(sTime > eTime){
                JOptionPane.showMessageDialog(null, "Please pick an valid Booking time");
            blocked = true;
            }
            else{ 
            blocked = false;
                    }
            
        }
        
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
            
        }
        return blocked;
        
    
    }
    
   
    
    private boolean checkDate(){
            boolean blocked=false;
        try {
            Date date = new Date();
            if (jDateChooser1.getDate().before(date)) {
                jDateChooser1.setDate(null);
                JOptionPane.showMessageDialog(null, "Booking must be made in the future");

           }
            if (jDateChooser1.getDate().getDay() == 0) {
                blocked = true;

                JOptionPane.showMessageDialog(null, "The Garage is closed on Sundays.");
                
            }
            
        } 
        
        
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
            
        }
        return blocked;
    }
     
    private void Update_list(){
        conn=sqliteConnection.dbConnector();
        try{
            String sql ="select * FROM Customer";
                    pst=conn.prepareStatement(sql);
                    rs = pst.executeQuery();
                   
                    while(rs.next()){
                        String name =rs.getString("fullname");
                        customerList.addItem(name);
                      
                    }
                     rs.close();
                     pst.close();
                     conn.close();
                     
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
            
        }
    
    }
    
    
    private void Update_vehicle(){
        conn=sqliteConnection.dbConnector();
        try{
            String sql ="select * FROM vehicle WHERE customerID"+custIDT.getText();
                    pst=conn.prepareStatement(sql);
                    rs = pst.executeQuery();
                   
                    while(rs.next()){
                        String carMake =rs.getString("make");
                        vehicleList.addItem(carMake);
                      
                    }
                     rs.close();
                     pst.close();
                     conn.close();
                     
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
            
        }
    
    }
    private void Update_parts(){
            conn=sqliteConnection.dbConnector();
        try{
            String sql ="select * FROM Parts";
                    pst=conn.prepareStatement(sql);
                    rs = pst.executeQuery();
                   
                    while(rs.next()){
                        String partName =rs.getString("Partname");
                        partsList.addItem(partName);
                      
                    }
                     rs.close();
                     pst.close();
                     conn.close();
                     
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
            
        }
    
    }
    private void Update_table(){
       conn=sqliteConnection.dbConnector();
        try{
            String sql="select * from Bookings";
            pst=conn.prepareStatement(sql);
            rs=pst.executeQuery();
            bookingT.setModel(DbUtils.resultSetToTableModel(rs));
    
                     rs.close();
                     pst.close();
                     conn.close();
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
            
        }
    }
    
    public void delete(){
        
        conn=sqliteConnection.dbConnector(); 
        int rowNo = bookingT.getSelectedRow();
        Statement stmt = null;
        try{
           
           String sql="delete from Bookings where bookingID="+ bookingT.getModel().getValueAt(rowNo,0);
            
            stmt=conn.createStatement();
            stmt.executeUpdate(sql);
            
            Update_table();
            
            stmt.close();
            conn.close();
            
            
                        
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        
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

        titleL = new javax.swing.JLabel();
        SearchL = new javax.swing.JLabel();
        searchF = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        bookingsT = new javax.swing.JScrollPane();
        bookingT = new javax.swing.JTable();
        editB = new javax.swing.JButton();
        deleteB = new javax.swing.JButton();
        customerL = new javax.swing.JLabel();
        customerList = new javax.swing.JComboBox();
        addCustB = new javax.swing.JButton();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        dateL = new javax.swing.JLabel();
        typeT = new javax.swing.JComboBox();
        typeL = new javax.swing.JLabel();
        bayT = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        timeT = new javax.swing.JComboBox();
        TimeL = new javax.swing.JLabel();
        priceL = new javax.swing.JLabel();
        addBookB = new javax.swing.JButton();
        updateB = new javax.swing.JButton();
        vehicleL = new javax.swing.JLabel();
        vehicleList = new javax.swing.JComboBox();
        idL = new javax.swing.JLabel();
        IDL2 = new javax.swing.JLabel();
        repairL = new javax.swing.JLabel();
        partsList = new javax.swing.JComboBox();
        custIDT = new javax.swing.JFormattedTextField();
        vehIDT = new javax.swing.JFormattedTextField();
        priceT = new javax.swing.JFormattedTextField();
        surnameT = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        timeE = new javax.swing.JComboBox();
        currentMilesL = new javax.swing.JLabel();
        currentMiles = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        titleL.setText("Bookings");

        SearchL.setText("Search");

        searchF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchFActionPerformed(evt);
            }
        });
        searchF.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                searchFKeyReleased(evt);
            }
        });

        jLabel1.setText("Current Bookings");

        bookingsT.setViewportView(bookingT);

        editB.setText("Edit");

        deleteB.setText("Delete");
        deleteB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBActionPerformed(evt);
            }
        });

        customerL.setText("Customer");

        customerList.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                customerListPopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
        });
        customerList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                customerListActionPerformed(evt);
            }
        });

        addCustB.setText("Add New Customer");
        addCustB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addCustBActionPerformed(evt);
            }
        });

        jDateChooser1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jDateChooser1MouseClicked(evt);
            }
        });

        dateL.setText("Date");

        typeT.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Diagnosis and Repair" }));

        typeL.setText("Type");

        bayT.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6" }));

        jLabel2.setText("Bay");

        timeT.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "09:00", "09:30", "10:00", "11:00", "11:30", "12:00", "12:30", "13:00", "13:30", "14:00", "14:30", "15:00", "15:30", "16:00", "16:30", "17:00", " " }));

        TimeL.setText("Time");

        priceL.setText("Price");

        addBookB.setText("Add Booking");
        addBookB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBookBActionPerformed(evt);
            }
        });

        updateB.setText("Update");
        updateB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateBActionPerformed(evt);
            }
        });

        vehicleL.setText("Vehicle");

        vehicleList.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                vehicleListPopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
        });

        idL.setText("ID");

        IDL2.setText("ID");

        repairL.setText("Repair");

        partsList.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                partsListPopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
        });

        custIDT.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(java.text.NumberFormat.getIntegerInstance())));

        vehIDT.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(java.text.NumberFormat.getIntegerInstance())));

        priceT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                priceTActionPerformed(evt);
            }
        });

        surnameT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                surnameTActionPerformed(evt);
            }
        });

        jLabel3.setText("til");

        timeE.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "09:30", "10:00", "11:00", "11:30", "12:00", "12:30", "13:00", "13:30", "14:00", "14:30", "15:00", "15:30", "16:00", "16:30", "17:00", "17:30" }));

        currentMilesL.setText("Current Mileage");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(titleL)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(SearchL)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(searchF, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jLabel1)
                                .addComponent(bookingsT, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(editB)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(deleteB)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(updateB))))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(customerL)
                                .addGap(1, 1, 1))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(dateL, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(TimeL, javax.swing.GroupLayout.Alignment.TRAILING))
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(1, 1, 1)
                                            .addComponent(typeL)))
                                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(priceL, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(currentMilesL, javax.swing.GroupLayout.Alignment.TRAILING)))))
                    .addComponent(vehicleL))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(customerList, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(surnameT, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(IDL2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(custIDT, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(bayT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(typeT, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(repairL)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(partsList, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(vehicleList, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(idL)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(vehIDT, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(priceT, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(timeT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(timeE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(currentMiles, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(addBookB)
                    .addComponent(addCustB))
                .addGap(14, 14, 14))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(titleL)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(SearchL)
                            .addComponent(searchF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(addCustB)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(customerList, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(customerL)
                        .addComponent(surnameT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(IDL2)
                        .addComponent(custIDT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(bookingsT, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(addBookB))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(editB)
                            .addComponent(deleteB)
                            .addComponent(updateB)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(vehicleL)
                            .addComponent(vehicleList, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(idL)
                            .addComponent(vehIDT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(dateL)
                            .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TimeL)
                            .addComponent(timeT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(timeE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(typeL)
                            .addComponent(typeT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(repairL)
                            .addComponent(partsList, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(bayT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(priceL)
                            .addComponent(priceT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(currentMilesL)
                            .addComponent(currentMiles, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(46, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addCustBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addCustBActionPerformed
        CustomerFF cff = new CustomerFF();
        cff.setVisible(true);
        cff.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); 

    }//GEN-LAST:event_addCustBActionPerformed

    private void searchFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchFActionPerformed
                // TODO add your handling code here:
    }//GEN-LAST:event_searchFActionPerformed

    private void addBookBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBookBActionPerformed
      boolean blocked = checkDate();
      //boolean blocked1 = checkTime();
      
      if(blocked==false){      
        updateBook();
          try {
              updateMiles();
              
          }
          catch (SQLException ex) {
              Logger.getLogger(Bookings.class.getName()).log(Level.SEVERE, null, ex);
          }
      }
      
      else{ 
        JOptionPane.showMessageDialog(null, "Booking not Valid");
      }
                                                   
    }//GEN-LAST:event_addBookBActionPerformed

    private void updateBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateBActionPerformed
        Update_table();
    }//GEN-LAST:event_updateBActionPerformed

    private void deleteBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBActionPerformed
        delete();
    }//GEN-LAST:event_deleteBActionPerformed

    private void customerListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_customerListActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_customerListActionPerformed

    private void customerListPopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_customerListPopupMenuWillBecomeInvisible
       
        conn=sqliteConnection.dbConnector();
        
        String tmp = (String)customerList.getSelectedItem().toString();
        String sql = "select * from Customer where fullName=?";
        
       
        try{
             pst=conn.prepareStatement(sql);
            pst.setString(1,tmp);
            rs = pst.executeQuery();
         
            if(rs.next()){
                
             String add =rs.getString("customerID");
             String sName = rs.getString("surname");
             custIDT.setText(add);
             surnameT.setText(sName);

         
         }
            
                     rs.close();
                     pst.close();
                     conn.close();
       }
       catch(Exception e)
       {
           JOptionPane.showMessageDialog(null,e);
       }
    }//GEN-LAST:event_customerListPopupMenuWillBecomeInvisible

    private void searchFKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchFKeyReleased
        conn=sqliteConnection.dbConnector();
        
        try{
            String sql="select * from Bookings where fullname like '%"+searchF.getText()+
            "%' OR bookingType LIKE '%" + searchF.getText() +
            "%' OR bookingDate LIKE '%" + searchF.getText() + "%';";
            
            pst=conn.prepareStatement(sql);
            rs=pst.executeQuery();

            while(rs.next()){
                
                bookingT.setModel(DbUtils.resultSetToTableModel(rs));
            }
            
            pst.close();
            conn.close();
            rs.close();
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,e);

        }
    
    }//GEN-LAST:event_searchFKeyReleased

    private void vehicleListPopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_vehicleListPopupMenuWillBecomeInvisible
    conn=sqliteConnection.dbConnector();
        
        String tmp = (String)vehicleList.getSelectedItem();
        String sql = "select * from Vehicle where make=?";
        
       
        try{
            pst=conn.prepareStatement(sql);
            pst.setString(1,tmp);
            rs = pst.executeQuery();
         
            if(rs.next()){
                
             String add =rs.getString("vehicleID");
             
             vehIDT.setText(add);

         
         }
            
                     rs.close();
                     pst.close();
                     conn.close();
       }
       catch(Exception e)
       {
           JOptionPane.showMessageDialog(null,e);
       }
    }//GEN-LAST:event_vehicleListPopupMenuWillBecomeInvisible

    private void partsListPopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_partsListPopupMenuWillBecomeInvisible
       
    }//GEN-LAST:event_partsListPopupMenuWillBecomeInvisible

    private void priceTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_priceTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_priceTActionPerformed

    private void surnameTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_surnameTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_surnameTActionPerformed

    private void jDateChooser1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jDateChooser1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jDateChooser1MouseClicked
/*
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
            java.util.logging.Logger.getLogger(Bookings.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Bookings.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Bookings.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Bookings.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Bookings().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel IDL2;
    private javax.swing.JLabel SearchL;
    private javax.swing.JLabel TimeL;
    private javax.swing.JButton addBookB;
    private javax.swing.JButton addCustB;
    private javax.swing.JComboBox bayT;
    public javax.swing.JTable bookingT;
    private javax.swing.JScrollPane bookingsT;
    private javax.swing.JTextField currentMiles;
    private javax.swing.JLabel currentMilesL;
    private javax.swing.JFormattedTextField custIDT;
    private javax.swing.JLabel customerL;
    public javax.swing.JComboBox customerList;
    private javax.swing.JLabel dateL;
    private javax.swing.JButton deleteB;
    private javax.swing.JButton editB;
    private javax.swing.JLabel idL;
    public com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JComboBox partsList;
    private javax.swing.JLabel priceL;
    private javax.swing.JFormattedTextField priceT;
    private javax.swing.JLabel repairL;
    public javax.swing.JTextField searchF;
    private javax.swing.JTextField surnameT;
    private javax.swing.JComboBox timeE;
    private javax.swing.JComboBox timeT;
    private javax.swing.JLabel titleL;
    private javax.swing.JLabel typeL;
    public javax.swing.JComboBox typeT;
    private javax.swing.JButton updateB;
    private javax.swing.JFormattedTextField vehIDT;
    private javax.swing.JLabel vehicleL;
    private javax.swing.JComboBox vehicleList;
    // End of variables declaration//GEN-END:variables
}
