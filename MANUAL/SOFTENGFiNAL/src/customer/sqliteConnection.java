/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package customer;
import javax.swing.*;
import java.sql.*;
import javax.swing.*;
public class sqliteConnection {

    
    Connection conn = null;
    
    public static Connection dbConnector(){
    
   try {
            Class.forName("org.sqlite.JDBC"); // load the class for connection
            String path = "resources/softwareDatabase.db"; // database file path
            Connection connect =DriverManager.getConnection("jdbc:sqlite:"+ path); // create conneection
            return connect; //return the connection
            //resources//softwareDatabase.db
         } catch (Exception ex) // catch the exception
         { 
           JOptionPane.showMessageDialog(null, ex); 
            return null;
         } 
   
    
}
}
