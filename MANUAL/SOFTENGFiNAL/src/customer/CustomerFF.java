/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package customer;

//import net.proteanit.sql.DbUtils;
import javax.swing.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
//import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author sanjaymanikandhan
 */
public class CustomerFF extends javax.swing.JFrame {

    Connection conn = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    Statement stmt = null;
    private String customerIDValue;
    // private int price;
    private String type;

    public CustomerFF() {
        initComponents();
        conn = sqliteConnection.dbConnector();
        Update_table();
    }

    private void Update_table() {
        conn = sqliteConnection.dbConnector();
        try {
            String sql = "select * from Customer";
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            DataTable.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
        finally {
            try {
               
            pst.close();
            conn.close();
                
            }
            catch (SQLException e) {
                JOptionPane.showMessageDialog(null,e);
            }
        }
    }

    private void Update_table1() {
    conn = sqliteConnection.dbConnector();

        try {
            String sql = "select * from Customer";

            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            bookingTable.setModel(DbUtils.resultSetToTableModel(rs));

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
        finally {
            try {
                
                
            pst.close();
            conn.close();
                
            }
            catch (SQLException e) {
                JOptionPane.showMessageDialog(null,e);
            }
        }
    }

    @SuppressWarnings("empty-statement")
    private void bookingType() throws SQLException {
       
         conn = sqliteConnection.dbConnector();
        
        int price = 0;

        ArrayList<Integer> Bookinglist = new ArrayList<>();
        int custid = Integer.parseInt(DataTable.getValueAt(DataTable.getSelectedRow(), 0).toString());
        System.out.println(custid + " selected row");

        try {
            String sql = "SELECT Bookings.bookingID "
                    + "FROM Customer "
                    + "INNER JOIN Bookings "
                    + "ON Customer.customerID = Bookings.customerID "
                    + "WHERE Customer.customerID='" + custid + "';";
            //String sql1 = "SELECT bookingID from Bookings WHERE Bookings.customerID = Customer.customerID'" + custid + "';";
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();

            while (rs.next()) {
                int bookingsID = rs.getInt("bookingID");
                Bookinglist.add(bookingsID);

            }

            for (int i = 0; i < Bookinglist.size(); i++) {
                System.out.println(Bookinglist.get(i));
            }

            for (int x = 0; x < Bookinglist.size(); x++) {
                String sql2 = "SELECT bookingPrice "
                        + "FROM Bookings "
                        + "WHERE bookingID = '" + Bookinglist.get(x) + "';";
                pst = conn.prepareStatement(sql2);
                rs = pst.executeQuery();

                while (rs.next()) {
                    price = rs.getInt("bookingPrice");
                }

                if (price == 0) {
                    String sql3 = "UPDATE Bookings "
                            + "SET bookingType = 'PAID' "
                            + "WHERE bookingID = '" + Bookinglist.get(x) + "';";
                    pst = conn.prepareStatement(sql3);
                    pst.execute();
                    System.out.println("changed to paid");

                } else {
                    String sql4 = "UPDATE Bookings "
                            + "SET bookingType = 'UNPAID' "
                            + "WHERE bookingID = '" + Bookinglist.get(x) + "';";
                    pst = conn.prepareStatement(sql4);
                    pst.execute();
                    System.out.println("changed to unpaid");

                }

            }// end for loop

            String sql2 = "SELECT *  "
                    + "FROM Bookings "
                    + "WHERE Bookings.customerID= '" + custid + "';";
            pst = conn.prepareStatement(sql2);
            rs = pst.executeQuery();
            bookingTable.setModel(DbUtils.resultSetToTableModel(rs));

        } catch (SQLException e) {

            // e.printStackTrace();
            System.out.println("Cannot perform query");

        }// end try and catch
         finally {
            try {
                
                
            pst.close();
            conn.close();
                
            }
            catch (SQLException e) {
                JOptionPane.showMessageDialog(null,e);
            }
        }
   
    }// end of method
     
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        jPanel1 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        idT = new javax.swing.JTextField();
        addressT = new javax.swing.JTextField();
        sNameT = new javax.swing.JTextField();
        fNameT = new javax.swing.JTextField();
        typeT = new javax.swing.JTextField();
        hNumberT = new javax.swing.JTextField();
        mNumberT = new javax.swing.JTextField();
        postcodeT = new javax.swing.JTextField();
        countyT = new javax.swing.JTextField();
        ok = new javax.swing.JButton();
        IdL = new javax.swing.JLabel();
        firstnameL = new javax.swing.JLabel();
        surnameL = new javax.swing.JLabel();
        addressL = new javax.swing.JLabel();
        typeL = new javax.swing.JLabel();
        countyL = new javax.swing.JLabel();
        postcodeL = new javax.swing.JLabel();
        mNumberL = new javax.swing.JLabel();
        hNumberL = new javax.swing.JLabel();
        clearAdd = new javax.swing.JButton();
        priOrIndT = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        IdL1 = new javax.swing.JLabel();
        idT1 = new javax.swing.JTextField();
        fName1 = new javax.swing.JLabel();
        sName1 = new javax.swing.JLabel();
        addressL1 = new javax.swing.JLabel();
        countyL1 = new javax.swing.JLabel();
        postcodeL1 = new javax.swing.JLabel();
        mNumber1 = new javax.swing.JLabel();
        hNumberL1 = new javax.swing.JLabel();
        fNameT1 = new javax.swing.JTextField();
        sNameT1 = new javax.swing.JTextField();
        addressT1 = new javax.swing.JTextField();
        countyT1 = new javax.swing.JTextField();
        postcodeT1 = new javax.swing.JTextField();
        mNumberT1 = new javax.swing.JTextField();
        hNumberT1 = new javax.swing.JTextField();
        typeL1 = new javax.swing.JLabel();
        typeT1 = new javax.swing.JTextField();
        searchButton1 = new javax.swing.JButton();
        updateButton1 = new javax.swing.JButton();
        deleteButton1 = new javax.swing.JButton();
        clearButton1 = new javax.swing.JButton();
        noteLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        DataTable = new javax.swing.JTable();
        showBookings = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        bookingTable = new javax.swing.JTable();
        vehicleDetails = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        vehicleTable = new javax.swing.JTable();
        noteLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(jLabel1.getFont());
        jLabel1.setText("Customer Details");
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        idT.setEditable(false);
        idT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idTActionPerformed(evt);
            }
        });

        addressT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addressTActionPerformed(evt);
            }
        });

        sNameT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sNameTActionPerformed(evt);
            }
        });

        fNameT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fNameTActionPerformed(evt);
            }
        });

        typeT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                typeTActionPerformed(evt);
            }
        });

        hNumberT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hNumberTActionPerformed(evt);
            }
        });

        mNumberT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mNumberTActionPerformed(evt);
            }
        });

        postcodeT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                postcodeTActionPerformed(evt);
            }
        });

        countyT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                countyTActionPerformed(evt);
            }
        });

        ok.setFont(new java.awt.Font("Comic Sans MS", 0, 13)); // NOI18N
        ok.setText("Add");
        ok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okActionPerformed(evt);
            }
        });

        IdL.setText("ID");

        firstnameL.setText("Firstname");

        surnameL.setText("Surname");

        addressL.setText("Address");

        typeL.setText("Customer Type");

        countyL.setText("County");

        postcodeL.setText("Postcode");

        mNumberL.setText("Mobile Number");

        hNumberL.setText("Home Number");

        clearAdd.setText("Clear");
        clearAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearAddActionPerformed(evt);
            }
        });

        priOrIndT.setText("Private/Individual");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(mNumberL)
                    .addComponent(firstnameL)
                    .addComponent(IdL)
                    .addComponent(surnameL)
                    .addComponent(addressL)
                    .addComponent(typeL)
                    .addComponent(hNumberL)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(countyL, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(postcodeL, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(countyT, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(postcodeT, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mNumberT, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(hNumberT, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(fNameT, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                            .addComponent(idT, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                            .addComponent(sNameT, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                            .addComponent(addressT, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                            .addComponent(typeT))
                        .addGap(18, 18, 18)
                        .addComponent(priOrIndT)))
                .addGap(145, 145, 145))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(153, 153, 153)
                        .addComponent(ok)
                        .addGap(119, 119, 119)
                        .addComponent(clearAdd))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(437, 437, 437)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(502, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(idT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(IdL))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fNameT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(firstnameL))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sNameT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(surnameL))
                .addGap(14, 14, 14)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(addressT, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(addressL)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(typeT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(priOrIndT))
                    .addComponent(typeL))
                .addGap(24, 24, 24)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(countyT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(countyL))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(postcodeT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(postcodeL))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mNumberL)
                    .addComponent(mNumberT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(hNumberL)
                    .addComponent(hNumberT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ok)
                    .addComponent(clearAdd))
                .addContainerGap(148, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Customer Accounts", jPanel2);

        IdL1.setText("ID");

        org.jdesktop.beansbinding.Binding binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, idT1, org.jdesktop.beansbinding.ELProperty.create("true"), idT1, org.jdesktop.beansbinding.BeanProperty.create("editable"));
        bindingGroup.addBinding(binding);

        idT1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idT1ActionPerformed(evt);
            }
        });

        fName1.setText("Firstname");

        sName1.setText("Surname");

        addressL1.setText("Address");

        countyL1.setText("County");

        postcodeL1.setText("Postcode");

        mNumber1.setText("Mobile Number");

        hNumberL1.setText("Home Number");

        fNameT1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fNameT1ActionPerformed(evt);
            }
        });

        typeL1.setText("Customer Type");

        typeT1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                typeT1ActionPerformed(evt);
            }
        });

        searchButton1.setText("Search");
        searchButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchButton1ActionPerformed(evt);
            }
        });

        updateButton1.setText("Update");
        updateButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateButton1ActionPerformed(evt);
            }
        });

        deleteButton1.setText("Delete");
        deleteButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButton1ActionPerformed(evt);
            }
        });

        clearButton1.setText("Clear");
        clearButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearButton1ActionPerformed(evt);
            }
        });

        noteLabel2.setText("Note: Enter the CustomerID to delete customer from the table.");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(IdL1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(fName1)
                            .addComponent(sName1)
                            .addComponent(addressL1)
                            .addComponent(countyL1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(postcodeL1)
                            .addComponent(mNumber1)
                            .addComponent(hNumberL1)
                            .addComponent(typeL1))
                        .addGap(216, 216, 216)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(idT1, javax.swing.GroupLayout.DEFAULT_SIZE, 730, Short.MAX_VALUE)
                            .addComponent(fNameT1)
                            .addComponent(sNameT1)
                            .addComponent(addressT1)
                            .addComponent(countyT1)
                            .addComponent(postcodeT1)
                            .addComponent(mNumberT1)
                            .addComponent(hNumberT1)
                            .addComponent(typeT1)))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(81, 81, 81)
                                .addComponent(searchButton1)
                                .addGap(33, 33, 33)
                                .addComponent(updateButton1)
                                .addGap(31, 31, 31)
                                .addComponent(deleteButton1)
                                .addGap(18, 18, 18)
                                .addComponent(clearButton1))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addComponent(noteLabel2)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(IdL1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(idT1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(fName1)
                    .addComponent(fNameT1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(sName1))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(sNameT1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(25, 25, 25)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addressL1)
                    .addComponent(addressT1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(typeL1)
                    .addComponent(typeT1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(countyL1)
                    .addComponent(countyT1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(postcodeL1)
                    .addComponent(postcodeT1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mNumberT1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mNumber1))
                .addGap(24, 24, 24)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(hNumberL1)
                    .addComponent(hNumberT1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(searchButton1)
                    .addComponent(updateButton1)
                    .addComponent(deleteButton1)
                    .addComponent(clearButton1))
                .addGap(38, 38, 38)
                .addComponent(noteLabel2)
                .addGap(0, 86, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Edit/Delete", jPanel5);

        DataTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CustomerID", "Firstname", "Surname", "Address", "Customer Type", "County", "Postcode", "Mobile Number", "Home Number"
            }
        ));
        DataTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                DataTableMouseReleased(evt);
            }
        });
        jScrollPane1.setViewportView(DataTable);

        showBookings.setText("Show Bookings");
        showBookings.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showBookingsActionPerformed(evt);
            }
        });

        bookingTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "bookingID", "customerID", "fullname", "surname", "address", "bookingDate", "bookingTime", "bayNumber", "bookingType", "bookingPrice"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(bookingTable);

        vehicleDetails.setText("Show Vehicle Details");
        vehicleDetails.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                vehicleDetailsMouseReleased(evt);
            }
        });
        vehicleDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vehicleDetailsActionPerformed(evt);
            }
        });

        vehicleTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "vehicleID", "make", "model", "engineSize", "colour", "mOTRenewalDate", "lastService", "nextService", "vehicelMileage", "type", "mOTState", "customerID"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(vehicleTable);

        noteLabel1.setText("Note : Select one customer from the table and click the buttons for bookings and vehicle information");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(showBookings)
                        .addGap(83, 83, 83)
                        .addComponent(noteLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 694, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(vehicleDetails, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(155, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1)))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(showBookings)
                    .addComponent(noteLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(vehicleDetails)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Bookings/Vehicles", jPanel3);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
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

        bindingGroup.bind();

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void idTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idTActionPerformed

    private void fNameTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fNameTActionPerformed

    }//GEN-LAST:event_fNameTActionPerformed

    private void sNameTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sNameTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sNameTActionPerformed

    private void addressTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addressTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addressTActionPerformed

    private void typeTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_typeTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_typeTActionPerformed

    private void countyTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_countyTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_countyTActionPerformed

    private void postcodeTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_postcodeTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_postcodeTActionPerformed

    private void mNumberTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mNumberTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mNumberTActionPerformed

    private void hNumberTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hNumberTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_hNumberTActionPerformed

    private void okActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okActionPerformed
        conn = sqliteConnection.dbConnector();

        try {
            String sql = "Insert into Customer (customerID,fullname,surname,"
                    + "firstLineAddress,customerType,county,postcode,mobileNumber,homeNumber) values (?,?,?,?,?,?,?,?,?)";
            pst = conn.prepareStatement(sql);

            if (fNameT.getText().equals("") || addressT.getText().equals("") || typeT.getText().equals("")
                    || countyT.getText().equals("") || postcodeT.getText().equals("")
                    || mNumberT.getText().equals("") || hNumberT.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Empty field");
            } else {
                pst.setString(2, fNameT.getText());
                pst.setString(3, sNameT.getText());
                pst.setString(4, addressT.getText());
                pst.setString(5, typeT.getText());
                pst.setString(6, countyT.getText());
                pst.setString(7, postcodeT.getText());
                pst.setString(8, mNumberT.getText());
                pst.setString(9, hNumberT.getText());
                pst.execute();
                Update_table();
                JOptionPane.showMessageDialog(null, "Added");

            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);

        }
         finally {
            try {
                
                
            pst.close();
            conn.close();
                
            }
            catch (SQLException e) {
                JOptionPane.showMessageDialog(null,e);
            }
        }
        


    }//GEN-LAST:event_okActionPerformed

    private void idT1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idT1ActionPerformed

    }//GEN-LAST:event_idT1ActionPerformed

    private void fNameT1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fNameT1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fNameT1ActionPerformed

    private void typeT1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_typeT1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_typeT1ActionPerformed

    private void searchButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchButton1ActionPerformed
        conn = sqliteConnection.dbConnector();

        try {
            String sql = "select * from Customer where fullname='" + fNameT1.getText() + "'and surname='"
                    + sNameT1.getText() + "'";
            if (fNameT1.getText().equals("") || sNameT1.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "No Customer Found ");
            } else {

                pst = conn.prepareStatement(sql);
                rs = pst.executeQuery();

                while (rs.next()) {

                    idT1.setText(rs.getString("customerID"));
                    fNameT1.setText(rs.getString("fullname"));
                    sNameT1.setText(rs.getString("surname"));
                    addressT1.setText(rs.getString("firstLineAddress"));
                    typeT1.setText(rs.getString("customerType"));
                    countyT1.setText(rs.getString("county"));
                    postcodeT1.setText(rs.getString("postcode"));
                    mNumberT1.setText(rs.getString("mobileNumber"));
                    hNumberT1.setText(rs.getString("homeNumber"));
                }
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Cant find the customer");

        }
         finally {
            try {
                
                
            pst.close();
            conn.close();
                
            }
            catch (SQLException e) {
                JOptionPane.showMessageDialog(null,e);
            }
        }

        Update_table();

    }//GEN-LAST:event_searchButton1ActionPerformed

    private void updateButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateButton1ActionPerformed
        conn = sqliteConnection.dbConnector();

        try {

            String value1 = idT1.getText();
            String value2 = fNameT1.getText();
            String value3 = sNameT1.getText();
            String value4 = addressT1.getText();
            String value5 = typeT1.getText();
            String value6 = countyT1.getText();
            String value7 = postcodeT1.getText();
            String value8 = mNumberT1.getText();
            String value9 = hNumberT1.getText();

            String sql = "update Customer set fullname='" + value2 + "' , surname='" + value3 + "', "
                    + "firstLineAddress='" + value4 + "', customerType='" + value5 + "', county='" + value6 + "', "
                    + "postcode='" + value7 + "', mobileNumber='" + value8 + "', homeNumber='" + value9 + "' where customerID ='"
                    + value1 + "' ";
            //String sql="update Customer set fullname='" + value2 +"', surname='" +value3 + "', firstLineAddress='" +value4+"', customerType='" +value5+"', county='"+value6+"', postcode='"+value7+"', mobileNumber='" +value8+"', homeNumber='"+value9+"' where customerID = '"+value1"'"; 
            //System.out.println("work");
            pst = conn.prepareStatement(sql);
            pst.execute();
            Update_table();

            JOptionPane.showMessageDialog(null, "Updated");

            pst.close();
            conn.close();

        } catch (SQLException e) {

            JOptionPane.showMessageDialog(null, " Not Updated");
            JOptionPane.showMessageDialog(null, e);

        }
         finally {
            try {
                
                
            pst.close();
            conn.close();
                
            }
            catch (SQLException e) {
                JOptionPane.showMessageDialog(null,e);
            }
        }


    }//GEN-LAST:event_updateButton1ActionPerformed

    private void deleteButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButton1ActionPerformed
        conn = sqliteConnection.dbConnector();

        try {
            String sql = "delete from Customer where CustomerID='" + idT1.getText() + "'";
            //String sql="delete from Customer where fullname='"+fNameT1.getText()+" surname='"+ sNameT1.getText()+"'firstLineAddress='" +addressT1.getText()+"', customerType='" +typeT1.getText()+"', county='" + countyT1.getText()+"', "
            //  + "postcode='"+postcodeT1.getText()+"', mobileNumber='" +mNumberT1.getText()+"', homeNumber='"+hNumberT1.getText()+"'";

            if (idT1.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Enter CustomerID to Delete");
            } else {

               int optionType = JOptionPane.YES_NO_CANCEL_OPTION;
               int code = JOptionPane.showConfirmDialog(null,"Do you want to delete this customer","Confirmation  Box", optionType);
                
               if(code==JOptionPane.NO_OPTION){
                   JOptionPane.getRootFrame().dispose();   
               }
               else if(code==JOptionPane.YES_OPTION){
                   
                pst = conn.prepareStatement(sql);
                pst.executeUpdate();

                idT1.setText("");
                fNameT1.setText("");
                sNameT1.setText("");
                addressT1.setText("");
                typeT1.setText("");
                countyT1.setText("");
                postcodeT1.setText("");
                mNumberT1.setText("");
                hNumberT1.setText("");

                JOptionPane.showMessageDialog(null, "Deleted");
            }
                else{
                        JOptionPane.showMessageDialog(null,"Not Deleted");
                    }

            }
           
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);

        }
         finally {
            try {
                
                
            pst.close();
            conn.close();
                
            }
            catch (SQLException e) {
                JOptionPane.showMessageDialog(null,e);
            }
        }
        Update_table();

    }//GEN-LAST:event_deleteButton1ActionPerformed

    private void clearButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearButton1ActionPerformed
        idT1.setText("");
        fNameT1.setText("");
        sNameT1.setText("");
        addressT1.setText("");
        typeT1.setText("");
        countyT1.setText("");
        postcodeT1.setText("");
        mNumberT1.setText("");
        hNumberT1.setText("");
        // Update_table();// TODO add your handling code here:
    }//GEN-LAST:event_clearButton1ActionPerformed

    private void showBookingsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showBookingsActionPerformed
        try {
            bookingType();
        } catch (SQLException ex) {
            Logger.getLogger(CustomerFF.class.getName()).log(Level.SEVERE, null, ex);
        }
        showCustomerBookings();
    }//GEN-LAST:event_showBookingsActionPerformed

    private void DataTableMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DataTableMouseReleased
        int selected;
        selected = DataTable.getSelectedRow();
        customerIDValue = DataTable.getValueAt(selected, 0).toString();
       // System.out.println(customerIDValue);


    }//GEN-LAST:event_DataTableMouseReleased

    private void vehicleDetailsMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_vehicleDetailsMouseReleased
        int selected;
        selected = DataTable.getSelectedRow();
        customerIDValue = DataTable.getValueAt(selected, 0).toString();
        //System.out.println(customerIDValue);

    }//GEN-LAST:event_vehicleDetailsMouseReleased

    private void vehicleDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vehicleDetailsActionPerformed
        //changeDates();
        showVehicle();
    }//GEN-LAST:event_vehicleDetailsActionPerformed

    private void clearAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearAddActionPerformed
        idT.setText("");
        fNameT.setText("");
        sNameT.setText("");
        addressT.setText("");
        typeT.setText("");
        countyT.setText("");
        postcodeT.setText("");
        mNumberT.setText("");
        hNumberT.setText("");

    }//GEN-LAST:event_clearAddActionPerformed

    void showVehicle() {
        conn = sqliteConnection.dbConnector();
        try {
            String sql = "select * from vehicle where customerID='" + customerIDValue + "'";

            pst = conn.prepareStatement(sql);
            pst.executeQuery();
            rs = pst.executeQuery();
            vehicleTable.setModel(DbUtils.resultSetToTableModel(rs));

        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, e);
        }

    }

    void showCustomerBookings() {
        conn = sqliteConnection.dbConnector();
        try {
            String sql = "select * from Bookings where customerID='" + customerIDValue + "'";

            pst = conn.prepareStatement(sql);
            pst.executeQuery();
            rs = pst.executeQuery();
            bookingTable.setModel(DbUtils.resultSetToTableModel(rs));

        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, e);
        }
    finally {
            try {
                
                
            pst.close();
            conn.close();
                
            }
            catch (SQLException e) {
                JOptionPane.showMessageDialog(null,e);
            }
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
            java.util.logging.Logger.getLogger(CustomerFF.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CustomerFF.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CustomerFF.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CustomerFF.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CustomerFF().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JTable DataTable;
    public javax.swing.JLabel IdL;
    public javax.swing.JLabel IdL1;
    public javax.swing.JLabel addressL;
    public javax.swing.JLabel addressL1;
    public javax.swing.JTextField addressT;
    public javax.swing.JTextField addressT1;
    private javax.swing.JTable bookingTable;
    private javax.swing.JButton clearAdd;
    private javax.swing.JButton clearButton1;
    public javax.swing.JLabel countyL;
    public javax.swing.JLabel countyL1;
    public javax.swing.JTextField countyT;
    public javax.swing.JTextField countyT1;
    private javax.swing.JButton deleteButton1;
    private javax.swing.JLabel fName1;
    public javax.swing.JTextField fNameT;
    public javax.swing.JTextField fNameT1;
    public javax.swing.JLabel firstnameL;
    public javax.swing.JLabel hNumberL;
    public javax.swing.JLabel hNumberL1;
    public javax.swing.JTextField hNumberT;
    private javax.swing.JTextField hNumberT1;
    public javax.swing.JTextField idT;
    public javax.swing.JTextField idT1;
    public javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    public javax.swing.JTabbedPane jTabbedPane1;
    public javax.swing.JLabel mNumber1;
    public javax.swing.JLabel mNumberL;
    public javax.swing.JTextField mNumberT;
    public javax.swing.JTextField mNumberT1;
    private javax.swing.JLabel noteLabel1;
    private javax.swing.JLabel noteLabel2;
    public javax.swing.JButton ok;
    public javax.swing.JLabel postcodeL;
    public javax.swing.JLabel postcodeL1;
    public javax.swing.JTextField postcodeT;
    public javax.swing.JTextField postcodeT1;
    private javax.swing.JLabel priOrIndT;
    public javax.swing.JLabel sName1;
    public javax.swing.JTextField sNameT;
    public javax.swing.JTextField sNameT1;
    private javax.swing.JButton searchButton1;
    private javax.swing.JButton showBookings;
    public javax.swing.JLabel surnameL;
    public javax.swing.JLabel typeL;
    private javax.swing.JLabel typeL1;
    public javax.swing.JTextField typeT;
    public javax.swing.JTextField typeT1;
    private javax.swing.JButton updateButton1;
    private javax.swing.JButton vehicleDetails;
    private javax.swing.JTable vehicleTable;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables
}//end class 
