/*AUTHOR: HUSSEIN AHMED TEJAN
*/
package maintenancebookings;

import java.sql.Time;
import java.util.Date;

    public                  class               Schedule {
    //bayNumber, start Time, finish Time and date of Service/MoT is stored and set on a Schedule object.
    private                 int                 bayNumber;
    private                 String              startTime;
    private                 String              finishTime;
    private                 Date                date;

    @Override
    public                  String              toString() {
    return "bay: "+bayNumber+" start at "+startTime+"  end at "+finishTime+" on "+date;
    }

    
    
    
    public                  Schedule            (Date datePut, String beginTime, String endTime, int bayNo) {
        date = datePut;
        startTime = beginTime;
        finishTime = endTime;
        bayNumber = bayNo;

    }

    public                  void                setDate(Date datePut) {
        date = datePut;
    }

    public                  Date                getDate() {
        return date;
    }

    public                  void                setstartTime(String time) {
        startTime = time;
    }

    public                  String              getstartTime() {
        return startTime;
    }

    public                  void                setfinishTime(String endTime) {
        finishTime = endTime;
    }

    public                  String              getfinishTime() {
        return finishTime;
    }

    public                  void                setBayNumber(int bayNumberPassed) {
        bayNumber = bayNumberPassed;
    }

    public                  int                 getBayNumber() {
        return bayNumber;
    }

}
