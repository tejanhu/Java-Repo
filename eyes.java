/* *****************************************
AUTHOR Paul Curzon
A program that politely enquires of people's eye colour  
******************************************** */

import javax.swing.*; // import the swing library for I/O

class eyes
{
    public static void main (String[] param)
    {
        // We want to print out the message defined in method helloMessage
		
		askForEyeColour();
		System.exit(0);
		
    } // END main

	/* ***************************************************
	   Method askForEyeColour asks the user for their eye colour,
	   then stores it in the variable called eyeColour
	   it is then printed back as part of a message.
	*/
	
    public static void askForEyeColour()
    {

       String eyeColour = JOptionPane.showInputDialog("What colour are your eyes?");
	   
	   JOptionPane.showMessageDialog(null, 
	               "So your eyes are "+ eyeColour+ 
                   " are they. I like "+ eyeColour+ ".");
		
    } // END askForEyeColour
	

} // END class eyes
