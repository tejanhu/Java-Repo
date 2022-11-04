import javax.swing.*;

class hellovariable
{
    public static void main (String[] param)
    {		
        varHelloMessage();
        System.exit(0);
		
    } // END main


/* ***************************************************
	   Define some commands of our own to use above
   *************************************************** */
	
    /* ***************************************************
       Our method boxHelloMessage prints a welcome message in a pop-up box.
       This demonstrates creating a variable that can hold strings (sequences of characters)
       that are then used later. The variable used here is called myWelcomeMessage The
       assignment operator = stores the message in the variable. We then get the information (value)
       out again by giving the variable name where otherwise we could have just given the value.
    */
	
    public static void varHelloMessage ()
    {
        String myWelcomeMessage = "Hi, there. This is Eddie your shipboard computer speaking";
		
        JOptionPane.showMessageDialog(null, myWelcomeMessage);
		                 //Note giving the variable name here is as though the whole message was typed here
		
    } // END varHelloMessage
	
	
	
} // END class hellovariable
