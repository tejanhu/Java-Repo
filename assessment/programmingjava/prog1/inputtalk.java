/* *****************************************
AUTHOR Paul Curzon
This program demonstrates the use of a way for the 
person using your program to give the program some information.

It also uses the swing library for the command showInputDialog. 
******************************************** */

import javax.swing.*; // import the swing library for I/O

class inputtalk
{
    public static void main (String[] param)
    {
       // We want to print out the message defined in method helloMessage
       askForFact();
       System.exit(0);
       
    } // END main


/* ***************************************************
	   Define some commands of our own to use above
   *************************************************** */
	
    /* ***************************************************
      Our method askForFact asks the user for a fact,
      then stores it in the variable called userfact.
      it is then printed back as part of a message.
    */
	
    public static void askForFact()
    {

       String userfact = JOptionPane.showInputDialog("What is your name?");
       
       JOptionPane.showInputDialog(null, "Hi there " +  userfact + ". How are you?");
       
      String userfact1 = JOptionPane.showInputDialog("I'm glad to hear it " + userfact + ". What type of music do you like? ");

     String userfact2 = JOptionPane.showInputDialog(null, "I like " +  userfact1 + " music too." + " Do computers worry you?");

      JOptionPane.showInputDialog("You say " + userfact2 + ". I wonder why that is? ");

JOptionPane.showMessageDialog(null, "I'm glad to hear that but I have to go now.  I've enjoyed talking with you " + userfact + ".");

  } // END askForFact


} // END class inputbox
