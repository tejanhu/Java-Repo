
/* *****************************************
AUTHOR Paul Curzon
This program demonstrates 
 - non-terminating while loops.
 
   Ask the user if they want to go on repeatedly with
   no way of stopping
   
******************************************** */

import javax.swing.*; // import the swing library for I/O

class while2
{
    public static void main (String[] param)
    {
        
        nonTerminatingWhile();
        System.exit(0);
        
    } // END main


   /* ***************************************************
       Define some commands of our own to use above
   *************************************************** */
    
    
    /* ***************************************************
       A loop that never stops.
    */
    
    public static void nonTerminatingWhile()
    {

       // Declare variables
       //
       
       int i = 0;  

       while (true)
       {
           i = i + 1;
           JOptionPane.showMessageDialog(null, i + " ");

       }

 // Try editing this print back in by removing the comment symbol
 //  - what happens when you compile now?
 //      JOptionPane.showMessageDialog(null, "I'm gone");
       

    } // END NonTerminatingWhile
    

} // END class while2

