/* AUTHOR Paul Curzon
This program demonstrates the use of concatenating strings.


import javax.swing.*;

class WelcomeStrings
{
    public static void main (String[] param)
    {		
        varBuildMessage();
        System.exit(0);
		
    } // END main


/* ***************************************************
	   Define some commands of our own to use above
   *************************************************** */
	
   /* ***************************************************
   
   */
	
    public static void varBuildMessage ()
    {
        // first create three variables, one for each piece of the final message
        // and another to hold the final combined message
        String message1 ;
        String message2 ;
        String fullmessage;
        
        // set the first two variable to particular strings
        message1 = "Blondie";
        message2 = " is still the coolest lead singer ever";
        
        // then combine them using + 
        fullmessage = message1 + message2;
        
        // print out the final result
        JOptionPane.showMessageDialog(null, fullmessage);
        //Note giving the variable name here is as though the whole message was typed here

     } // END varBuildMessage



} // END class concatstrings
