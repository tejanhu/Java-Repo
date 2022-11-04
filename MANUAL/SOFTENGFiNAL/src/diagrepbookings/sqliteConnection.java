package diagrepbookings;



/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import javax.swing.*;
import java.sql.*;
import javax.swing.*;
public class sqliteConnection {

    
    Connection conn = null;
    
    public static Connection dbConnector(){
    
    try{
        
        Class.forName("org.sqlite.JDBC");
        Connection conn = DriverManager.getConnection("jdbc:sqlite:resources/softwareDatabase.db");
       return conn;
                }
    catch (Exception e)
    {
        JOptionPane.showMessageDialog(null, e);
         return null;
    }
   
    
}
}
