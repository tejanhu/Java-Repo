
/* *****************************************
AUTHOR HUSSEIN A TEJAN
This program demonstrates 
 - integer variables
 - doing calculations.
 
   Calculate the height and weight and find out the total to work out the BMI.
******************************************** */

import javax.swing .*; // import the swing library for I/O

	class calculateBMI
	{
		    public static void main (String[] param)
		    {
		
			calculateBMI();
			System.exit(0);
		
		    } // END main


		  
		    public static void calculateBMI()
		    {

		       // Declare variables
		       //
		       
		       String textinput;
		       int height;  
		       int weight;       
		       int ans;  
		       int BMI;       
	       
	       

		textinput = JOptionPane.showInputDialog("What is your height in cm?")
		;
		height= Integer.parseInt(textinput);
		textinput = JOptionPane.showInputDialog("What is your weight in Kg?")
		;
		weight= Integer.parseInt(textinput);


		       ans = height * height/10000;
		       BMI = weight / ans;
		       
		       

		    
		       
		       JOptionPane.showMessageDialog (null, "The BMI is " + BMI);
		
		    } // END calculateBMI
		    

		} // END class calculateBMI
