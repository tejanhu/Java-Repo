/* *****************************************
AUTHOR Paul Curzon
This program demonstrates 
 - while loops.
 
   Ask the user if they want to go on repeatedly until they don't
   
   What happens if you type something other than y or n? Predict then try.
   
******************************************** */

import javax.swing.*; // import the swing library for I/O

class while1
{
    public static void main (String[] param)
    {
        
        whileGoOn();
        System.exit(0);
        
    } // END main


   /* ***************************************************
       Define some commands of our own to use above
   *************************************************** */
    
    
    /* ***************************************************
       Ask the user if they want to go on repeatedly until they don't.
    */
    
    public static void whileGoOn()
    {

       // Declare variables
       //
       
       String ans = "y";  // y means continue, n means stop
                          // initially set to y or would not enter loop
       

       while (ans.equals("y"))
       {
           ans = JOptionPane.showInputDialog("Shall I go on? (y/n)");
       }

       JOptionPane.showMessageDialog(null, "I'm gone");
       

    } // END whilegoon
    

} // END class while1 

