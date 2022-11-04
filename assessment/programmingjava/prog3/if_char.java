
/* *****************************************
AUTHOR Paul Curzon

   A program to demonstrate if on a character value Asks the user for
   a yes or no answer then indicates what they pressed. 
   
    What happens if you type in a word rather than a letter when asked? 
   
******************************************** */

import javax.swing.*; // import the swing library for I/O

class if_char
{
    public static void main (String[] param)
    {
        
        yesNo();
        System.exit(0);
        
    } // END main


    /* ***************************************************
       Show how a chain of tests on characters can be done
    */
    
    public static void yesNo()
    {

       // Declare variables
       //
        String reply;    // which branch to take from user
        char ans;        // char version of it 
       
       // Ask for a response then take the first letter of it as a character to test
       // using the method charAt preceded by the name of the string
        reply = JOptionPane.showInputDialog("Enter Y/N: ");
        ans = reply.charAt(0);
       
        if (ans == 'y')
        {
           JOptionPane.showMessageDialog(null, "yes");        
        }
        else if (ans == 'Y')
        {
            JOptionPane.showMessageDialog(null, "YES");
        }   
        else if (ans=='n')
        {
            JOptionPane.showMessageDialog(null, "no");
        }   
        else if (ans=='N')
        {
            JOptionPane.showMessageDialog(null, "NO");
        }   
        else
        {
            JOptionPane.showMessageDialog(null, "What?!?!");
        }   
        
        JOptionPane.showMessageDialog(null, "Thanks for your answer");                 
       
    } // END yesNo
    

} // END class if_char
    
