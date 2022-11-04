package maintenancebookings;


import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;

public interface Holidays {

//return the list of dates in your holidays arraylist
public ArrayList<Date> getHoDates ();
//set a single date to one of your holidays arraylist
public void  setHoDates (ArrayList<Date> newholidays)throws ParseException;
//add a single date to your holidays arraylist
public void  addHoDate (Date newholiday);
	

}