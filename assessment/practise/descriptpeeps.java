/* *****************************************
AUTHOR HUSSEIN A TEJAN

******************************************** */

import javax.swing.*; // import the swing library for I/O

class descriptpeeps
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

       String userfact = JOptionPane.showInputDialog("What is your favourite colour?");
      String z= JOptionPane.showInputDialog("What is the colour of your eyes?");
      String p=JOptionPane.showInputDialog("What is the colour of your hair?");

       JOptionPane.showMessageDialog(null, "So your favourite colour is ,"+userfact +"."+ "  the colour of your eyes are ,"+z+"."+"the colour of your hair is  "+p+".");

    } // END askForFact


} // END class descriptpeeps
