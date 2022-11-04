/*AUTHOR: HUSSEIN AHMED TEJAN
 */
package maintenancebookings;

import gui.TimeBasedServiceBooking;
import gui.UsageBasedServiceBooking;
import gui.BookingMoT;
import gui.OptionBasedSchedule;
import gui.MoTBooking;

import java.util.Date;

public class Bays {

//    Date bookingBay;
    boolean available;
    final int maximum_amount = 6;

    UsageBasedServiceBooking ubsBForm;
    TimeBasedServiceBooking tbsBForm;
    BookingMoT bmForm;

//    OptionBasedSchedule serviceScheduling;
//    MoTBooking motTesting;
//    public Bays(int total_amount, boolean free, OptionBasedSchedule schedulingService,  MoTBooking testingMoT) {
//        available=free;
//        serviceScheduling=schedulingService;
//        motTesting=testingMoT;
//        
//    }
    public Bays(int total_amount, boolean free, UsageBasedServiceBooking usageForm, TimeBasedServiceBooking timebasedBForm, BookingMoT motForm) {
        available = free;

        ubsBForm = usageForm;
        tbsBForm = timebasedBForm;
        bmForm = motForm;

    }

    public int getBaycount(int total_amount) {
        if (!available) {
            total_amount = maximum_amount - 1;
        }

        return total_amount;

    }

}
