/* *****************************************
AUTHOR Iqbal Hussain 
Date:12/10/2011
This program demonstrates 
 - integer variables
 - doing simple mulitplication & adding calculations

This program has been created specifically for customers being able to input interger values for the number normal tickets & special exhibit tickets they require to enter the Natural History Museum which then calculates the total cost at the end.
 
   
******************************************** */

import javax.swing.*; // import the swing library for I/O

class museum
{
    public static void main (String[] param)//Runs main method and runs all other methods
    {
        
        timesticket();
        System.exit(0);
        
    } // END main

    public static void timesticket()
    {

       // Declare variables
       //
       String textinput;  // whatever the person types stored
       int number;        // an integer version of textinput
       int answer;        // Answer after integer values inputted and calculated
       
    

	JOptionPane.showMessageDialog(null, "Hi, welcome to the Natural History Museum.");

       textinput = JOptionPane.showInputDialog("Number of adults entering?");
       number = Integer.parseInt(textinput);

       // Now do the calculation
       //
       answer = number * 2;

	String textinput1;  // whatever the person types stored
       int number1;        // an integer version of textinput
       int answer1;  // Answer after the integer values inputted and calculated

       textinput1 = JOptionPane.showInputDialog("Number of children entering?");
       number1 = Integer.parseInt(textinput1);
 
        answer1 = number1 * 0;

	String textinput2; // whatever the person types stored
	int number2;// an integer version of textinput
	int answer2;// Answer after the integer values inputted and calculated & added with previous inputted values for final answer
       textinput2 = JOptionPane.showInputDialog("Are you going to attend the Special Exhibit? (1-Yes 0-No)");
       number2 = Integer.parseInt(textinput2);


	answer2= answer+ answer1+ number2 * (number*5+number1*3);


       // Finally give the user the total answer
       //   
       JOptionPane.showMessageDialog(null, "Total cost will be £" + answer2 ) ;
        
    } // END timesticket
    

} // END class museum


