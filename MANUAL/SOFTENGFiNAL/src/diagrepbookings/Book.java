/*
Booking system class idea
 */

package diagrepbookings;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Becky
 */
public class Book {
    // intiate variables
    private int bookID;
    private String fName;
    private String sName;
    private String date;
    private String startTime;
    private String endTime;
    private int bayNo;
    private String bookType;
    private String faultyPart;
    private int bookCost;
    private int custID;
    private int vehID;
    
        public Book(int bookingID, String firstName, String secName, String bookDate, String sTime, String eTime, int bayNum, String type, String part, int bookingCost, int customerID, int vehicleID){
            
            this.bookID = bookingID;
            this.custID = customerID;
            this.vehID = vehicleID;
            this.fName = firstName;
            this.sName = secName;
            this.date = bookDate;
            this.startTime = sTime;
            this.endTime = eTime;
            this.bookType = type;
            this.faultyPart = part;
            this.bayNo = bayNum;
            this.bookCost = bookingCost;
            
        }

    public int getBookID() {
        return bookID;
    }
    
    public void setBookID(int bookID){
        this.bookID = bookID;
    }

    public int getCustID() {
        return custID;
    }
    
    public void setCustID(int custID){
        this.custID = custID;
    }

    public int getVehID() {
        return vehID;
    }
    
    public void setVehID(int vehID){
        this.vehID = vehID;
    }

    public String getDate() {
        return date;
    }
    
    public void setDate(String date){
        this.date = date;
    }

    public String getStartTime() {
        return startTime;
    }
    
    public void setStartTime(String startTime){
        this.startTime = startTime;
    }
    
    public String getEndTime() {
        return endTime;
    }
    
    public void setEndTime(String endTime){
        this.endTime = endTime;
    }

    public String getBookType() {
        return bookType;
    }
    
    public void setBookType(String bookType){
        this.bookType = bookType;
    }

    public String getFaultyPart() {
        return faultyPart;
    }
    
    public void setFaultyPart(String faultyPart){
        this.faultyPart = faultyPart;
    }

    public int getBayNo() {
        return bayNo;
    }
    
    public void setBayNo(int bayNo){
        this.bayNo = bayNo;
    }

    public int getBookCost() {
        return bookCost;
    }
    
    public void setBookCost(int bookCost){
        this.bookCost = bookCost;
    }
    
    public static Book updateBook(ResultSet rs) throws SQLException{
        
        Book booking = new Book(rs.getInt("bookingID"),
            rs.getString("fullname"),
            rs.getString("surname"),
            rs.getString("bookingDate"),
            rs.getString("bookSTime"), // check DB
            rs.getString("bookETime"),
            rs.getInt("bayNumber"),
            rs.getString("bookingType"),
            rs.getString("faultyPart"),
            rs.getInt("bookingPrice"),
            rs.getInt("customerID"),
            rs.getInt("vehicleID")
        
        );
        return null;
                
    }
}
