/*AUTHOR: HUSSEIN AHMED TEJAN
*The mechanic could do either Time Based or Usaged Based Servicing for the customer.
*/
package maintenancebookings;


    public                                  class                           Service             extends         MaintenanceBooking {
    //initialises the cost of all Services to be £150
    public                                                                                                      Service() {
        super(150);
    }

    /**
     *
     * @param service
     */
    public                                                                  Service                             getService() {
        return                                                              this;

    }

}
