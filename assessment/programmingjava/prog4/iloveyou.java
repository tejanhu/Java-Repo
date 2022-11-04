/* *****************************************
AUTHOR Paul Curzon
This program demonstrates 
 - for loops.
 
   Ask the user for a number, and go round a loop that number of times
   proclaiming love.
   
   What happens if you type in 3, 0 , -1 on different runs?
   Try and predict the answer before you run it.
******************************************** */

import javax.swing.*; // import the swing library for I/O

class iloveyou
{
    public static void main (String[] param)
    {
        
        counttheways();
        System.exit(0);
        
    } // END main


   /* ***************************************************
       Define some commands of our own to use above
   *************************************************** */
    
    
    /* ***************************************************
       This method asks the user for a number and prints 
       I love you that
       number of times.
    */
    
    public static void counttheways()
    {

       // Declare variables
       //
       
       String textinput;  // whatever the person types as text
       int n = 0;          // an integer version of textinput
       
       // Get an an int from the user to loop that many times
       // convert (known as parsing) it into a number version
       //

       JOptionPane.showMessageDialog(null, "How do I love thee? Let me count the ways: ");
       textinput = JOptionPane.showInputDialog("Give me a number, then:");
       n = Integer.parseInt(textinput);

       for (int i=1; i<=n; i++)
       {
          JOptionPane.showMessageDialog(null, i+": I love you!");
       }
    } // END counttheways
    

} // END class iloveyou

