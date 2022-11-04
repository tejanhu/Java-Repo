/*AUTHOR: HUSSEIN AHMED TEJAN
*/
package maintenancebookings;

import java.util.ArrayList;

/**
 *
 * @author ht304
 */
    public                                      class                       Timebased extends Service {
    //service year is stored
    private                                 int                         year;
    //vehicleID is stored
    private                                 int                         vehicleID;
    //Type of booking is stored
    private                                 String                      bookingType;

    //throws an ExpiryServiceDateException if it has not reached a year for the customer's vehicle to be serviced
    public                                                              Timebased(int yr) throws ExpiryServiceDateException {

        if (yr < 1 || yr > 2) {
            throw                           new                         ExpiryServiceDateException();
        } else {
            year = yr;
        }
    }

    @Override
    public                                  Service                     getService() {
        return                                                          this; 
    }

    private                                 void                        setVehicleID(int vID) {
        vehicleID = vID;
    }

    private                                 void                        setBookingType(String bType) {
        bookingType = bType;
    }

    public                                  int                         getVehicleID() {
        return                                                          vehicleID;
    }

    public                                  String                      getBookingType() {
        return                                                          bookingType;
    }

    public                                  int                         getYear() {

        return                                                          year;

    }

}
