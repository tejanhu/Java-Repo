//Author: Iqbal Hussain Date: 28/11/2011
//This program demonstrates using a scoring system for a employee to work out the bonus they are entitled to. To calculate this, the program uses multiple methods as well as return values.


import javax.swing.*;

class bonus//Runs main method and runs all other methods

{
		
	public static void main ( String[]param)// Main method which carries out the process of the other methods, which contain calculations and once done, the results are 		returned for use in this method to finish the program.
	{
		JOptionPane.showMessageDialog(null,"Welcome to the bonus scheme");
		String profit1=JOptionPane.showInputDialog("What is the Profit score out of 5?");	
		String client1=JOptionPane.showInputDialog("What is the Client score out of 5?");
		String hard_work1=JOptionPane.showInputDialog("What is the Hard Work score out of 5?");

		double profit=  Integer.parseInt(profit1);// stores as decimal integer of profit
 		double client=Integer.parseInt(client1);//stores as decimal integer of client
 		double hard_work=Integer.parseInt(hard_work1);//stores as decimal integer of client
		final int profitmultiplier=2;//final int multiple value to times profit by
		final int clientmultiplier= 3;//final int multiple value to times client by
		final int hard_workmultiplier=5;//final int multiple value to times profit by		

		profit=profit_score(profit, profitmultiplier);
		client=client_score(client, clientmultiplier);
		hard_work=hard_work_score(hard_work, hard_workmultiplier);
		
		double performance_score;
		performance_score=performance_score(profit, client, hard_work);
		
	
	
		int total = (int)totalbonus(performance_score);

		JOptionPane.showMessageDialog(null, "Your performance score this year is "+ performance_score + " out of 10.");

		JOptionPane.showMessageDialog(null, "Your bonus is £"+ total + " pounds.");	

		
		System.exit(0);
		
		
	}// End main

	public static double profit_score (double profit, final int profitmultiplier)// Method carries out the calculation of new profit score value, then returned to main method
	{
        	double finalprofit= profit*profitmultiplier;//Profit score multiplied by 2
		return finalprofit;
	}

	public static double client_score (double client, final int clientmultiplier)//Method carries out the calculation of new client score value, then returned to main method
	{
		double finalclient= client*clientmultiplier;//Client score multiplied by 3
		return finalclient;
	}		
	
	public static double hard_work_score (double hard_work, final int hard_workmultiplier)//Method carries out the calculation of new hard work score value, then returned to 		main method
	{
		double finalhard_work= hard_work*hard_workmultiplier;//Hard work multiplied by 5
		return finalhard_work;
	}
	
	public static double performance_score(double profit, double client, double hard_work)//Method takes the returned values for the new values for profit, client and hard 	work to calculate the overall performance score, then returned to the main method
	{
		double performance= (profit+client+hard_work)/5; // Adds all multiplied scores up and divided by 5 to give an overall score.
		return performance;//Performance score is returned to main method
		
	
	}

	public static double totalbonus (double performance_score)// Method takes the returned performance score and calculates the bonus to be given, then returned to the main 		method
	{	
		double £bonus= 10000*performance_score;
		return £bonus;
	}
	
}// End bonus
	
