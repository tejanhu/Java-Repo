/*AUTHOR: HUSSEIN AHMED TEJAN
*/
package maintenancebookings;

import gui.Appointment;
import java.util.Date;

public class Bays {
    
    Date bookingBay;
    boolean available;
    final int maximum_amount = 6;
    
    Appointment bookingrecords;

//    public Bays(int total_amount, boolean free, Appointment recordBooking) {
//        bookingrecords=
//        //total_amount = maximum_amount;
//        //available = free;
//    }
//
//    public boolean isUnavailable(booking) {
//        if (booking) {
//
//        } else {
//            available = false;
//
//        }
//        return available;
//    }

    public int getBaycount(int total_amount) {
        /*if(selectBay){
         total_amount=maximum_amount-1;
         return total_amount;
         }
         */
        return total_amount;

    }

}
