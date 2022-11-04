
/**
 * Author: H A Tejan
 * The below program consists of a cricket dice game which rolls 6 times from 1-6 producing a score per roll 
 *from the number displayed on the dice, this game only stops rolling if the user randomly receives a 5.
 *A message dialog box displays after each roll per dice of the score produced.
 *There is a random variable used to make the dice roll randomly between 1 and 6.
 */

import javax.swing.*;
import java.util.*;


		public class Exercise6 {

		  
		    
			    public static void main(String[] args) {
			       
			     Random bigdice =new Random ();
			     int dice=bigdice.nextInt(6)+1;
			     String userinput;
			     int totalin=0;
				boolean stop = false;
			     
			     while (dice!=5 && !stop)
				     {
					 dice=bigdice.nextInt(6)+1;

					 totalin=totalin+dice;
					 
				System.out.println("Your total for this innings so far:  " + totalin);
			 userinput=   JOptionPane.showInputDialog("Do you wish to declare?");
				     
				if(userinput.equals(("y")))
				{
			JOptionPane.showMessageDialog(null,"Your total for this innings so far is ." +totalin);
			 	stop = true;
			      
			  
				     } // END if statement
			     
			       
		
		
			} // while

			    } // END main
			    
		} // end class Exercise6
