/* *****************************************
AUTHOR Iqbal Hussain
Date:12/10/2011

   A program to demonstrate if on a character value Asks the user for
   a yes or no answer then indicates what they pressed. 
   
    This shows how you can have other commands - here assignments inside an if
    You can even have a sequence of commands.
   
******************************************** */

import javax.swing.*;

class drs
{
    public static void main (String[] param)//Runs main method and runs all other methods
    { 
        drs();
        System.exit(0);
        
    } // END main

    public static void drs()
	{
	//Prints out message explaining to user what the program does// 
        JOptionPane.showMessageDialog(null, "I can tell you the style of the music of different digital radio stations.");

    

       // Declare variables
       //
        String radiostation;   
        String ans;    
        // Asks user for an input of a digital station//
		{
       			radiostation = JOptionPane.showInputDialog("Give me a name of a digital radio station? ");
       			 ans = radiostation;
      			 // Shows message dialog depending on what the user inputs to the question//
     			 if (ans.equalsIgnoreCase("Magic"))
        		{
         		 	JOptionPane.showMessageDialog(null, "Easy Listening");        
       			}
  
        		else if (ans.equalsIgnoreCase("BBC Radio 1"))
        		{
            			JOptionPane.showMessageDialog(null, "Pop Music");
        		}   
        		else if (ans.equalsIgnoreCase("Kerrang!"))
        		{
            			JOptionPane.showMessageDialog(null, "Rock Music");
        		}   
        		else
        		{
            			JOptionPane.showMessageDialog(null, "-----");
       			}   
        
        		JOptionPane.showMessageDialog(null, "Thanks for your answer");                 
       
    		} 
      }

}// END drs
