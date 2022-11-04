/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vehiclemodule;
import java.sql.*;
import javax.swing.*;

/**
 *
 * @author nathanwinslow
 */
public class javaConnect {
    
    Connection conn = null;
    
    public static Connection connectDB(){
        
        try{
            Class.forName("org.sqlite.JDBC");
            String path = "resources/softwareDatabase.db";
            Connection conn = DriverManager.getConnection("jdbc:sqlite:" + path);
            
            
            return conn;
            
        }
        catch (Exception e){
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
        
    }
    
    
}
