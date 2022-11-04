
/* *****************************************
AUTHOR Paul Curzon

   A program to demonstrate if on a character value Asks the user for
   a yes or no answer then indicates what they pressed. 
   
    This shows how you can have other commands - here assignments inside an if
    You can even have a sequence of commands.
   
******************************************** */

import javax.swing.*; // import the swing library for I/O

class if_char2
{
    public static void main (String[] param)
    {
        
        yesNo2();
        System.exit(0);
        
    } // END main


    /* ***************************************************
       Show how a chain of tests on characters can be done
    */
    
    public static void yesNo2()
    {

       // Declare variables
       //
        String reply;    // which branch to take from user
        char ans;        // char version of it 
        String finalresponse;   // Build string printed to the user.
       
       // Ask for a response then take the first letter of it as a character to test
       // using the method charAt preceded by the name of the string
        reply = JOptionPane.showInputDialog("Enter Y/N: ");
        ans = reply.charAt(0);
       
        if (ans == 'y')
        {
           finalresponse = "yes";        
        }
        else if (ans == 'Y')
        {
           finalresponse = "YES";
        }   
        else if (ans=='n')
        {
           finalresponse = "no";
        }   
        else if (ans=='N')
        {
           finalresponse = "NO";
        }   
        else
        {
           finalresponse = "What?!?!";
        }   
        
        finalresponse = "You said: " + finalresponse + " Thanks for your answer";
        JOptionPane.showMessageDialog(null, finalresponse);
       
    } // END yesNo2
    

} // END class if_char2
    
