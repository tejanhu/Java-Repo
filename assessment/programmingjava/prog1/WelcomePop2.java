import javax.swing.*; // import the swing library for I/O

class WelcomePop2
{
    public static void main (String[] param)
    {
        // We want to print out the message defined in method helloMessage
        boxHelloMessage();
        
        System.exit(0);
		
    } // END main


/* ***************************************************
	   Define some commands of our own to use above
   *************************************************** */
	
	/* ***************************************************
	   Our method boxHelloMessage prints a welcome message in a pop-up box
	   but splits it over 2 lines: \n isnt something that is printed, it
	   is the equivalent of the enter key. \ before a character changes 
	   it to a special character.
	*/
	
    public static void boxHelloMessage ()
    {
 
        JOptionPane.showMessageDialog(null, "HELLO \nEVERYBODY!");
		
    } // END boxHelloMessage
	
	
	
}	// END class helloboxnl
