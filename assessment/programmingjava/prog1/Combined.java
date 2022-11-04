import javax.swing.*; // import the swing library for I/O

class Combined
{
    public static void main (String[] param)
    {
        // We want to print out the message defined in method helloMessage
        boxHelloMessage();
        confirm();
        
        System.exit(0);
    } // END main


   /* ***************************************************
	   Define some commands of our own to use above
   *************************************************** */
	
	
    /* ***************************************************
       Our method boxHelloMessage prints a welcome message in a pop-up box
    */
	
    public static void boxHelloMessage ()
    {
 
        JOptionPane.showMessageDialog(null, "The World says Hello - Is that OK?");
		
    } // END boxHelloMessage
	
	
    /* ***************************************************
       Our method confirm prints a welcome message in a pop-up box
    */
	
    public static void confirm ()
    {
 
        JOptionPane.showMessageDialog(null, "Are you sure it's OK?");
        JOptionPane.showMessageDialog(null, "Do you really mean that?");
        JOptionPane.showMessageDialog(null, "Well if you are absolutely sure - but don't blame me");
		
    } // END confirm
	
	
} 	// END class hellobox

