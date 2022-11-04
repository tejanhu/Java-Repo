
/* *****************************************
AUTHOR Paul Curzon

A program to demonstrate if  on an integer value
   Try typing in numbers other than 1 or 2
   and change the literal 1 in the test to other things
   to see what happens
******************************************** */

import javax.swing.*; // import the swing library for I/O

class if_int
{
    public static void main (String[] param)
    {
        
        chooseDirection();
        System.exit(0);
        
    } // END main


    /* ***************************************************
       Show how the first branch of an if is executed if an equality test is true
    */
    
    public static void chooseDirection()
    {

       // Declare variables
       //
        String direction;  // which branch to take from user
        int branch;        // int version of it
       
        direction = JOptionPane.showInputDialog("Do you want to take the first branch (type 1) or the second (type 2)");
        branch = Integer.parseInt(direction);
       
        if (branch == 1)
        {
           JOptionPane.showMessageDialog(null, "The first branch was executed and the second ignored");        // Executed if the test is true
        }
        else
        {
            JOptionPane.showMessageDialog(null, "The second branch was executed and the first ignored");       // Executed if the test is false
        }   
        
        JOptionPane.showMessageDialog(null, "After the IF statement we continue on our way");                 
       
    } // END chooseDirection
    

} // END class if_int
