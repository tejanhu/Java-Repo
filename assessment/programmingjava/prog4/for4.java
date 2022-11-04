/* *****************************************
AUTHOR Paul Curzon
This program demonstrates 
 - for loops.
 
   Go round a loop a fixed number of times
   
******************************************** */

import javax.swing.*; // import the swing library for I/O

class for4
{
    public static void main (String[] param)
    {
        
        fortest();
        System.exit(0);
        
    } // END main


   /* ***************************************************
       Define some commands of our own to use above
   *************************************************** */
    
    
    /* ***************************************************
       This method asks the user for a number and pops up an ok box, that number of times.
    */
    
    public static void fortest()
    {
      
       for (int i=1; i<=4; i++)
       {
          JOptionPane.showMessageDialog(null, i + " Hello");
       }

       JOptionPane.showMessageDialog(null, "I am out of the loop now - are you ok");
       

    } // END fortest
    

} // END class for4
