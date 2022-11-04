import javax.swing.*;

public class example1
{
   
    public static void main(String[] args)
    {
       convertDaysToMinutes();
       System.exit(0);
    }//END main
    
    public static void convertDaysToMinutes()
    {
        int year;
        int days;
        int minutes;
        
        final int HOURS_IN_DAY=24;
        final int MINS_IN_HOUR=60;
        
        String YEAR =JOptionPane.showInputDialog("What year is it?");
        String textinput;
        String answertext;
         
          
                year=Integer.parseInt(YEAR);
        textinput = JOptionPane.showInputDialog("What is the time interval in days?");
      

        days=Integer.parseInt(textinput);
        
        minutes = days * MINS_IN_HOUR * HOURS_IN_DAY;
        
        answertext = days + " days is "+minutes + "minutes"+year + "year";
        
        JOptionPane.showMessageDialog(null, answertext);
        return;       
        
    }//END convertDaysToMinutes
    
}//END class
