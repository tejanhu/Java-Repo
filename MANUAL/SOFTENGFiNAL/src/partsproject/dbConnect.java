/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package partsproject;

/**
 * @author jpma3
 */

/* import the package from java library*/
import java.sql.*;
import javax.swing.JOptionPane;

public class dbConnect {
    
    Connection connect = null; //set null to the connection
    
    public static Connection databaseconnect(){

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
    
    
    

