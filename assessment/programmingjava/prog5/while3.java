/* *****************************************
AUTHOR Paul Curzon
This program demonstrates 
 - while loops.
 
   Ask the user if they want to go on repeatedly until they don't.
   Count how many times you've asked, to illustrate how
   an explicit counter can be used with a while loop.
   
   What happens if you type something other than y or n? Predict then try.
   
******************************************** */

import javax.swing.*; // import the swing library for I/O

class while3
{
    public static void main (String[] param)
    {
        
        whileGoOnCount();
        System.exit(0);
        
    } // END main


   /* ***************************************************
       Define some commands of our own to use above
   *************************************************** */
    
    
    /* ***************************************************
       Ask the user if they want to go on repeatedly until they don't.
       Say how many times you asked.
    */
    
    public static void whileGoOnCount()
    {

       // Declare variables
       //
       
       String ans = "y";  // y means continue, n means stop
                          // initially set to y or would not enter loop
       int count = 0;     // counter of how many times loop bady executed


       while (ans.equals("y"))
       {
           ans = JOptionPane.showInputDialog("Shall I go on? (y/n)");
           count = count + 1;
       }

       JOptionPane.showMessageDialog(null, "That was " + count + " times");
       

    } // END whilegoonCount
    

} // END class while3


