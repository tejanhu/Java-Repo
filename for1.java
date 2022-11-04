
/* *****************************************
AUTHOR Paul Curzon
This program demonstrates 
 - for loops.
 
   Ask the user for a number, and go round a loop that number of times
   
   What happens if you type in 3, 0 , -1 on different runs?
   Try and predict the answer before you run it.
******************************************** */

import javax.swing.*; // import the swing library for I/O

class for1
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
       This method asks the user for a number and prints that
       number of *s.
    */
    
    public static void fortest()
    {

       // Declare variables
       //
       
       String textinput;  // whatever the person types as text
       int n = 0;          // an integer version of textinput
       String  resulttext ="";  // build a string to print the result as in one go at end
       
       // Get an an int from the user to loop that many times
       // convert (known as parsing) it into a number version
       //

       textinput = JOptionPane.showInputDialog("Enter a number and I will print that many *s: ");
       n = Integer.parseInt(textinput);

       for (int i=1; i<=n; i++)
       {
           resulttext = resulttext + "*";
       }

       JOptionPane.showMessageDialog(null, resulttext);

    } // END fortest
    

} // END class for1