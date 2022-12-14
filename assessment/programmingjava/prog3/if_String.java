
/* *****************************************
AUTHOR Paul Curzon

  A program to demonstrate if statements on a string value Try
changing the assignment of ans to something else to see the
difference.  Notice that you do not use == to compare strings, but
rather use the more cumbersome equals. Using == for strings is a
common mistake so watch out for it...
   
******************************************** */

import javax.swing.*; // import the swing library for I/O

class if_String
{
    public static void main (String[] param)
    {
        
        yesNo3();
        System.exit(0);
        
    } // END main


   /* ***************************************************
     Show how you use s.equals to test a string s for equality
   */

    public static void yesNo3()
    {

        // Declare variables
          //
        String ans = "yes";    // create a string to do a test on
       
        if (ans.equals("yes"))
        {
           JOptionPane.showMessageDialog(null, "Yes");        
        }   
        else
        {
          JOptionPane.showMessageDialog(null, "What?!?!");
        }   
       
    } // END yesNo3
    

} // END class if_String
