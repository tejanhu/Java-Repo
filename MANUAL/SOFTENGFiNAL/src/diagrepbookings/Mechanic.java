/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package diagrepbookings;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Becky
 */
public class Mechanic {
    
    private int mechanicID;
    private int hourlyRate;
    private int workingHours;
    private int totalHours;
    private int totalPay;
    
     public Mechanic (int ID, int rate, int hours, int work, int pay){
            this.mechanicID = ID;
            this.hourlyRate = rate;
            this.workingHours = work;
            this.totalHours = hours;
            this.totalPay = pay;
    
          }
    
     public int getMechanicID() {
        return mechanicID;
    }
     
    public void setMechanicID(int mechanicID) {
        this.mechanicID = mechanicID;
    }

    public int getHourlyRate() {
        return hourlyRate;
    }
    
    public void setHourlyRate(int hourlyRate) {
        this.hourlyRate = hourlyRate;
    }
    
    public int getWorkingHours() {
        
        return workingHours;
    }

    public void setWorkingHours(int workingHours) {
        this.workingHours = workingHours;
    }
    
     public int getTotalHours() {
        
         totalHours = totalHours+workingHours;        
        return totalHours;
    }
     public void setTotalHours(int totalHours) {
        this.totalHours = totalHours;
    }


    public int getTotalPay() {
        return totalPay;
    }
    
    public void setTotalPay(int totalPay) {
        this.totalPay = totalPay;
    }
   
    public void payMechanic(int ID, int rate, int hours, int pay){
        
        totalPay = hours*rate;
    }
    
    public static Mechanic updateMechanic(ResultSet rs) throws SQLException{
        
        Mechanic mechanic = new Mechanic(rs.getInt("mechanicID"),
            rs.getInt("hourlyRate"),
            rs.getInt("workingHours"),
            rs.getInt("totalHours"),
            rs.getInt("totalPay")     
        
        );
        return mechanic;
    }
}
