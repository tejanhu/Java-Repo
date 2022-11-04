/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maintenancebookings;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;

/**
 *
 * @author ht304
 */
public class holi_public implements Holidays {

    ArrayList<Date> publichodays;

    @Override
    public ArrayList<Date> getHoDates() {
        return publichodays;
    }

     @Override
    public void setHoDates(ArrayList<Date> bankhodays) throws ParseException {
        
    }

//    public static void main(String[] args) throws ParseException {
//        ArrayList<Date> publichodays = new ArrayList();
//        ArrayList<String> publicdates = new ArrayList();
//
//        publicdates.add("01/01/2015");
//        publicdates.add("03/04/2015");
//        publicdates.add("06/04/2015");
//        publicdates.add("04/05/2015");
//        publicdates.add("25/05/2015");
//        publicdates.add("31/12/2015");
//        publicdates.add("25/12/2015");
//        publicdates.add("28/12/2015");
//
//        DateFormat format = new SimpleDateFormat("dd/MM/yyyy");
//
//        for (int i = 0; i < publicdates.size(); i++) {
//            Date tempDate = format.parse(publicdates.get(i));
//            publichodays.add(tempDate);
//        }
//
//        for (int i = 0; i < publichodays.size(); i++) {
//            System.out.println(publichodays.get(i));
//        }
//        
//        
//        
//   }
    
    @Override
    public void addHoDate(Date newholiday) {
        publichodays.add(newholiday);
                
    }

}
