	
/* ***************************************
   AUTHOR: Paul Curzon ***PUT YOUR NAME HERE
		   ***WRITE A SHORT DESCRIPTION OF WHAT YOUR MODIFIED PROGRAM DOES HERE.
	   
	   This is not a just an outline of a program set up so you can fill in the gaps.
	   Stuff in CAPITALS WITH STARS indicates what you need to change to create a program that works
	   The rest is common to all programs you write.
   ****************************************/
import javax.swing.*;

class number_input // ***THE WORD AFTER CLASS MUST BE THE NAME OF THE FILE (BEFORE the .java) YOU SAVE THIS IN
{
    public static void main (String[] param)
    {

		Something();  // ***REPLACE THE WORD DOTHIS WITH THE NAME YOU USE BELOW
		
		System.exit(0);
		
    } // END main

	
	/* ***************************************
	*
	*	***PUT A COMMENT HERE TO EXPLAIN WHAT THIS METHOD IS FOR
	*/
	
    public static void Something ()  // ***REPLACE THE NAME 'DOTHIS' WITH THE NAME YOU USED ABOVE
	                              // ***THE NAME SHOULD HELP THE READER UNDERSTAND WHAT THIS CODE DOES
    {

int f1;


String f= JOptionPane.showInputDialog("Type in a number.");
f1 =Integer.parseInt(f); 

JOptionPane.showMessageDialog(null,f);

  


 
    } // END DOTHIS            
	         // ****DONT FORGET TO CHANGE 'DOTHIS' HERE TO YOUR METHOD NAME
	
	
	
} // END class template  
               // ***DONT FORGET TO CHANGE 'template' HERE TO YOUR CLASS NAME FROM THE TOP
