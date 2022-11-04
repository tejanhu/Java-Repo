	
/* ***************************************
   AUTHOR: HUSSEIN A TEJAN
	A program that produces a chat conversation.
	
   ****************************************/
import javax.swing.*; // import the swing library for I/O

class chatroomprog
{
    public static void main (String[] param)
    {
        // We want to print out the message defined in method helloMessage
		
		helloMessage();
		System.exit(0);
		
    } // END main


/* ***************************************************
	   Define some commands of our own to use above
   *************************************************** */
	

	
	/* ***************************************
	*
	*	Define a method to print a welcome message
	*/
	
    public static void helloMessage ()
    {
 
String userfact = JOptionPane.showInputDialog("What is your name?");
JOptionPane.showInputDialog("Hi there" + userfact); JOptionPane.showInputDialog("How are you?" );
JOptionPane.showInputDialog("I'm glad to hear it"  + userfact); JOptionPane.showInputDialog("What type of music do you like?");
JOptionPane.showInputDialog("I like Heavy metal music too."); JOptionPane.showInputDialog("Do computers worry you?");
JOptionPane.showInputDialog("You say No."   +  "I wonder why that is?" ); 
JOptionPane.showInputDialog("I'm glad to hear that but I have to go now."); JOptionPane.showInputDialog("I've enjoyed talking with you." ); 

    } // END helloMessage
	
	
	
} // END class chatroomprog
