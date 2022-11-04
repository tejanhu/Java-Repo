/*AUTHOR: HUSSEIN AHMED TEJAN
*/
package maintenancebookings;

import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;


    public                                                  class                                   SMB {

    private                                                 ArrayList<MaintenanceBooking> crap;

    public                                                  SMB() {
        this.crap = new ArrayList();

 
    }

    public                                                  void                                    makeUsageBasedServiceBooking() {
        crap.add( new Usagebased());
        
    }

    public                                                  void                                    makeTimeBasedBooking(int year) {
        try {
            crap.add(new Timebased(year));
        } catch (ExpiryServiceDateException ex) {
            Logger.getLogger(SMB.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public                                                  void                                    makeMaintenanceBooking() {
        crap.add( new MoT());
        
    }

    public                                                  void                                    removeBooking(MaintenanceBooking bookingToBeRemoved) {
        crap.remove(bookingToBeRemoved);
        
    }

    public                                  static          void                                    main(String[] args) {

    }

    
    public                                                  ArrayList<MaintenanceBooking>           getCrap() {
        return                                                                                      crap;
    }

}
