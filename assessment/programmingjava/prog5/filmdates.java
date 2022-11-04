// Author: Iqbal Hussain Date:22/11/2011
// The program demonstrates how it is able to utlise from given names of films and release dates from the user to calculate the earliest film as well as naming it.
import javax.swing.*;

class filmdates
{
	public static void main (String[]param)//Runs main method and runs all other methods
	{
		name();
		System.exit(0);

         }// End main

	public static void name()
	{	
		String film= "";//Stores name of film
		int earlydate = 2012;//Stores release date of film
		String earlyfilm = "";//Stores earliest film dated
	
	while (!film.equalsIgnoreCase("quit"))// While loop which works if quit is not entered
		{		
			String release;//Stores user response of date of film
			int release1;//Changes date film storage into integer to store

			film = JOptionPane.showInputDialog("Name a film?");//stores film name
			if (film.equalsIgnoreCase("quit"))//IF statement, quits if quit is entered
			{
				break;
			}

 			release = JOptionPane.showInputDialog(" What year was " + film 	+ " released?");
			release1 = Integer.parseInt(release);// Changes into a compatible integer storage place

			if (release1<= earlydate)// Loop which works out the earliest date through a repetition depending on number of films entered
			{
				earlydate = release1;//stores date of film as earliest
				earlyfilm = film;//stores earliest film
			}
			else
			{
				earlyfilm = earlyfilm;//stores date of earliest film
				earlydate = earlydate;//stores earliest film
			}
	
		}

		JOptionPane.showMessageDialog(null," The earliest film was " + earlyfilm + " released in " + earlydate);//Returns film & release date of earliest film
 
	}

}// End filmdates



