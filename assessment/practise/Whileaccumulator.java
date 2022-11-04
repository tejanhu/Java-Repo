	
/* ***************************************
   AUTHOR: HUSSEIN A TEJAN 
		   ***WRITE A SHORT DESCRIPTION OF WHAT YOUR MODIFIED PROGRAM DOES HERE.
	   
	   This is not a just an outline of a program set up so you can fill in the gaps.
	   Stuff in CAPITALS WITH STARS indicates what you need to change to create a program that works
	   The rest is common to all programs you write.
   ****************************************/
import javax.swing.*;


class Whileaccumulator // ***THE WORD AFTER CLASS MUST BE THE NAME OF THE FILE (BEFORE the .java) YOU SAVE THIS IN
{
    public static void main (String[] param)
    {

		whilelop ();  // ***REPLACE THE WORD DOTHIS WITH THE NAME YOU USE BELOW
		
		System.exit(0);
		
    } // END main

	
	/* ***************************************
	*
	*	***PUT A COMMENT HERE TO EXPLAIN WHAT THIS METHOD IS FOR
	*/
	
    public static void whilelop ()  // ***REPLACE THE NAME 'DOTHIS' WITH THE NAME YOU USED ABOVE
	                              // ***THE NAME SHOULD HELP THE READER UNDERSTAND WHAT THIS CODE DOES
    {
      int next2=0; int sum=0;


String next1 = JOptionPane.showInputDialog("Type a number?");
next2 = Integer.parseInt(next1);

while (next2!=0)
{
sum = sum+next2;
next1= JOptionPane.showInputDialog("Type another number");
next2 = Integer.parseInt(next1);
if ((next2==0)){

System.out.println("0 is not accepted as a value");
  
}
else  {

System.out.println(sum);
}
}



}
 
    } // END Whileaccumulator            
	         // ****DONT FORGET TO CHANGE 'DOTHIS' HERE TO YOUR METHOD NAME
	
	

