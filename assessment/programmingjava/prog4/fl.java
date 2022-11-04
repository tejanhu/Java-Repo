/* *****************************************
AUTHOR Iqbal Hussain
Date: 18/10/2011

This program demonstrates a scoring system by judges on the performance of celebrities in a ski competition. The points are added using an integer expression to give a final score.

******************************************** */

import javax.swing.*; // import the swing library for I/O

class fl
{
    public static void main (String[] param)//Runs main method and runs all other methods
	{
		fl();
		System.exit(0);

	}// END main

	public static void fl() 
	{   
		String Celebrity=JOptionPane.showInputDialog("What is the Name of the Celebrity?");
		JOptionPane.showMessageDialog(null, "Judges for technical scores");
		int total = 0;
		int total1= 0;
		int total2= 0;

	//A loop of an input dialogue box
       		for (int i=1; i<=2; i++)
       	{

         	String score=JOptionPane.showInputDialog(null, "Judge " + i + ":What is your score?");
		int score1 = Integer.parseInt(score);
		total= total + score1;
        
        }//End loop
	//A loop on scores from extra judges with number of loop depending on user input

	
		String ej= JOptionPane.showInputDialog(" How many extra judges are there this week:");
 		
		int extra_judges = Integer.parseInt(ej);

		for (int i=1; i<= extra_judges + 2; i++)
		{
			String score1= JOptionPane.showInputDialog("Judge " + i + ":What is your score?");
			int score2 = Integer.parseInt(score1);
			total1 = total1 + score2;
			total2= total + total1; 
		}//End loop

		final_score(Celebrity, total2);
		
	}

	// Final output score 
	public static void final_score (String Celebrity, int total2)
		{
		JOptionPane.showMessageDialog(null, Celebrity + ": your score is..." + total2 );

		}
	

}//END fl


