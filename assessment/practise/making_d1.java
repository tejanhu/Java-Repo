import javax.swing.*;

class making_d1 // ***THE WORD AFTER CLASS MUST BE THE NAME OF THE FILE (BEFORE the .java) YOU SAVE THIS IN
{
    public static void main (String[] param)
    {

		decision();  // ***REPLACE THE WORD DOTHIS WITH THE NAME YOU USE BELOW
		
		System.exit(0);
		
    } // END main

	
	/* ***************************************
	*
	*	***PUT A COMMENT HERE TO EXPLAIN WHAT THIS METHOD IS FOR
	*/
	
    public static void decision ()  // ***REPLACE THE NAME 'DOTHIS' WITH THE NAME YOU USED ABOVE
	                              // ***THE NAME SHOULD HELP THE READER UNDERSTAND WHAT THIS CODE DOES
    {
 
        String ans= JOptionPane.showInputDialog("What destination would you like to know about?");
     
        if(ans.equals("Leeds")){

       JOptionPane.showMessageDialog(null,"The trains to Leeds are REPLACED BY A BUS SERVICE.");
}
     else if

       (ans.equals("Liverpool")){

      System.out.println("The trains to Liverpool will have MINOR DELAYS.");
}

     else if (ans.equals("Manchester")){

      JOptionPane.showMessageDialog(null,"The trains to Manchester have no problems.");
}
  
     else {

      System.out.println("I know nothing about "+ ans);

}
  

 
    } // END DOTHIS            
	         // ****DONT FORGET TO CHANGE 'DOTHIS' HERE TO YOUR METHOD NAME
	
	
	
} // END class making_d1  
               // ***DONT FORGET TO CHANGE 'template' HERE TO YOUR CLASS NAME FROM THE TOP
