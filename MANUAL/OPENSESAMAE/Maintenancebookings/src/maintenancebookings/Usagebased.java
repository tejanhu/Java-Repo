/*AUTHOR: HUSSEIN AHMED TEJAN
 */
package maintenancebookings;

import java.util.ArrayList;

/**
 *
 * @author ht304
 */
    public                              class                       Usagebased extends Service {
    //current mileage is stored
    private                         int                         miles = 0;
    //min mileage is stored
    private                         final int                   min_miles = 10000;
    //max mileage is stored
    private                         final int                   max_miles = 12000;
    //difference of mileage from current service to next service is stored
    private                         int                         diffOfMiles=0;
    //vehicle ID is stored
    private                         int                         vehicleID;
    //booking type is stored
    private                         String                      bookingType;

    /**
     *
     */
    public                                                      Usagebased() {
    }

    public                      void                            setVehicleID(int vID) {
        vehicleID = vID;
    }

    public                      void                            setBookingType(String bType) {
        bookingType = bType;
    }

    public                      void                            setMiles(int mileage) {
        miles = mileage;
    }
    
    public                      void                            setDifference(int previousMiles){
        diffOfMiles=previousMiles-miles;
    }
    
     public                     int                             getDifference(){
        return                                                  diffOfMiles;
    }

    public                      int                             getVehicleID() {
        return                                                  vehicleID;
    }

    public                      String                          getBookingType() {
        return                                                  bookingType;
    }

    @Override
    public                      Service                         getService() {
        return                                                  this; 
    }

    //Throws a MileageException if the difference between the previous mileage and the current mileage are < the min mileage or > the max mileage
    public                      void                            workoutDifference(int diffOfMiles, int min_miles, int max_miles) {
        try {
            if (diffOfMiles                     < min_miles ||                      diffOfMiles > max_miles) {
                throw           new                             MileageException();

            } //END if
            else {
                
            }
        }//End try
        catch (MileageException E) {

            System.out.println("You will have to renew your service ASAP!");

        }//END catch
        
    }

}
