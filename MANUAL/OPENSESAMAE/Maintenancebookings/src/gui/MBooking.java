/*AUTHOR: HUSSEIN AHMED TEJAN
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.awt.event.MouseListener;
import java.beans.PropertyVetoException;
import java.sql.Time;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import maintenancebookings.ExpiryServiceDateException;
import maintenancebookings.Schedule;
import maintenancebookings.Timebased;
import maintenancebookings.Usagebased;

/**
 *
 * @author LatinoWolofKid
 */
    public                                              class                                           MBooking {

                                                                            int                         bookingID;
                                                                            String                      fullname;
                                                                            String                      address;
                                                                            Date                        bookingDate;
                                                                            Date                        bookingTime;
                                                                            int                         bayNumber;
                                                                            String                      bookingType;
                                                                            int                         bookingPrice;

    public                                                                  int                         getBookingID() {
        return                                                                                          bookingID;
    }

    public                                                                  void                        setBookingID(int bookingID) {
                                                                           this.bookingID =             bookingID;
    }

    public                                                                  String                      getFullname() {
        return                                                                                          fullname;
    }

    public                                                                  void                        setFullname(String fullname) {
                                                                            this.fullname =             fullname;
    }

    public                                                                  String                      getAddress() {
        return                                                                                          address;
    }

    public                                                                  void                        setAddress(String address) {
                                                                            this.address =              address;
    }

    public                                                                  Date                        getBookingDate() {
        return                                                                                          bookingDate;
    }

    public                                                                  void                        setBookingDate(Date bookingDate) {
                                                                            this.bookingDate =          bookingDate;
    }

    public                                                                  Date                        getBookingTime() {
        return                                                                                          bookingTime;
    }

    public                                                                  void                        setBookingTime(Date bookingTime) {
                                                                            this.bookingTime =          bookingTime;
    }

    public                                                                  int                         getBayNumber() {
        return                                                                                          bayNumber;
    }

    public                                                                  void                        setBayNumber(int bayNumber) {
                                                                            this.bayNumber =            bayNumber;
    }

    public                                                                  String                      getBookingType() {
        return                                                                                          bookingType;
    }

    public                                                                 void                         setBookingType(String bookingType) {
                                                                           this.bookingType =           bookingType;
    }

    public                                                                  int                         getBookingPrice() {
        return                                                                                          bookingPrice;
    }

    public                                                                  void                        setBookingPrice(int bookingPrice) {
                                                                            this.bookingPrice =         bookingPrice;
    }

    public                                  static                          void                        main(String[] args) throws PropertyVetoException {

                                            Schedule                        processingSchedule = new Schedule(null, null, null, 0);
                                            Appointment                     bookDateTimeBay = new Appointment(processingSchedule);
                                            OptionBasedSchedule             serviceTableBooking = new OptionBasedSchedule();
                                            BookingMoT                      bookMot = new BookingMoT(bookDateTimeBay);
                                            MoTBooking                      motTableBooking = new MoTBooking(bookMot);
                                            bookMot.setMoTInstance(motTableBooking);
                                            Usagebased                      usbController = new Usagebased();
                                            Timebased                       tbController = null;
                                            
                                            
                                            
        try {
            tbController = new Timebased(1);
        } catch (ExpiryServiceDateException ex) {
            Logger.getLogger(MBooking.class.getName()).log(Level.SEVERE, null, ex);
        }
                                            TimeBasedServiceBooking bookTimedService = new TimeBasedServiceBooking(serviceTableBooking, tbController);

                                            UsageBasedServiceBooking bookService = new UsageBasedServiceBooking(bookDateTimeBay,serviceTableBooking, usbController);
                                            ServiceOpt optionofservice = new ServiceOpt(bookService, bookTimedService);
                                            maintenance main = new maintenance(optionofservice, motTableBooking);

                                            Main mainPanel = new Main(main);
                                            LoginSystem login = new LoginSystem("twit", "twat", mainPanel);

                                            
// for(MouseListener listener : ((javax.swing.plaf.basic.BasicInternalFrameUI) main.getUI()).getNorthPane().getMouseListeners()){
//((javax.swing.plaf.basic.BasicInternalFrameUI) main.getUI()).getNorthPane().removeMouseListener(listener);
//}
       main.setMaximum(true);

    }

}
