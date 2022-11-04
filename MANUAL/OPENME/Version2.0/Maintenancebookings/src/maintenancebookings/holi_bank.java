/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maintenancebookings;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/**
 *
 * @author ht304
 */
public class holi_bank implements Holidays {

     ArrayList<Date> bankhodays = new ArrayList();

    public ArrayList<Date> getHoDates() {

        return bankhodays;

    }

    @Override
    public void setHoDates(ArrayList<Date> bankhodays) throws ParseException {
        
    }

//    public static void main(String[] args) throws ParseException {
//        ArrayList<Date> bankhodays = new ArrayList();
//        ArrayList<String> bankdates = new ArrayList();
//
//        bankdates.add("01/01/2015");
//        bankdates.add("03/04/2015");
//        bankdates.add("06/04/2015");
//        bankdates.add("04/05/2015");
//        bankdates.add("25/05/2015");
//        bankdates.add("31/12/2015");
//        bankdates.add("25/12/2015");
//        bankdates.add("28/12/2015");
//
//        DateFormat format = new SimpleDateFormat("dd/MM/yyyy");
//
//        for (int i = 0; i < bankdates.size(); i++) {
//            Date tempDate = format.parse(bankdates.get(i));
//            bankhodays.add(tempDate);
//        }
//
//        for (int i = 0; i < bankhodays.size(); i++) {
//            System.out.println(bankhodays.get(i));
//        }
//        
//        
//        
//    }
    
    @Override
    public void addHoDate(Date newholiday) {
        bankhodays.add(newholiday);
                
    }

}
