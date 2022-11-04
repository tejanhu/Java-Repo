/*AUTHOR: HUSSEIN AHMED TEJAN
*This class was necessary as Scheduled maintenance is a parent of every Maintenance booking and thus the total cost would need to be retrieved.
*/

package maintenancebookings;


    public                                      class               MaintenanceBooking         implements          ScheduledMaintenance{
    
    
    private                                 static              int                         tcost;

    /**
     * @return the total cost
     */
    public                                  static              int                         getTcost() {
        return                                                                              tcost;
    }
    private                                 final               int                         cost;
 
    
    
    public                                                                                  MaintenanceBooking(int sum){
        cost=sum;   
        tcost=sum;
    }

   
    public                                                      int                         getCost() {
        return                                                                              cost;
    }
}
