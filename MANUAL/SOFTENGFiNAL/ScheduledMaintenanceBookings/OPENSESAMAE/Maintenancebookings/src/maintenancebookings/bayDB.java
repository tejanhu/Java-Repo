/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maintenancebookings;

import gui.javaconnect;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author LatinoWolofKid
 */
public class bayDB {

    Connection conn=null;
    
    Bays bay=new Bays(6, true, null, null,null);
    
    public bayDB(Bays bays) {
        bay=bays;
    }
    
    public boolean isUnavailable(Bays bay){
        conn=javaconnect.ConnecrDb();
        PreparedStatement stmt = null;
        
        try{
           
        
    //       stmt = conn.prepareStatement("SELECT TimeBasedService.bayNumber, UsageBasedService.bayNumber, UsageBasedService.bookingDate,UsageBasedService.bookingTime , MoT.bayNumber, MoT.bookingTime , MoT.date, TimeBasedService.lastService, TimeBasedService.bookingTime FROM MoT,UsageBasedService,TimeBasedService   ");
           
           
           ResultSet res = stmt.executeQuery();
           
           
           
           
        }catch(SQLException e){
            e.printStackTrace();
        }
        return false;
        
        
    }
    
    
}
