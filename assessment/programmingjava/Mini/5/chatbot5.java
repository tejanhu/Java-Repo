//Author: Iqbal Hussain

//The program is called 'Chatbot' which is a simulated bot which can talk and reply to humans by using loops, if statements, while loops, arrays, etc. As well as the use of multiple methods, int and string values being called into other methods and returned.

import javax.swing.*; // import the swing library for I/O

class chatbot5
{
	final static int value=6;		
		
    	public static void main (String[] param)
    	{
  	    	            	
    		int user_no=Integer.parseInt(JOptionPane.showInputDialog("How 			many users will there be?"));
		
		for(int i=0; i<user_no; i++)//Loop which runs program depending on 			response on number of users	
		{	
						
			String userfact_i="";
			String userfact1="";
			String userfact2="";			
			userfact_i=hello(i, userfact_i);
			
			userfact2=askForFact(i,userfact_i, userfact1, userfact2);
			team(userfact_i, userfact2);// method team called with 				arguments being passed inside it 
		 }

		System.exit(0);

	} // END main
	
		
    	public static String hello(int i, String userfact_i)//Basic introduction by 			robot to user and name of user returned to main for later use
	{ 
	
		JOptionPane.showMessageDialog(null, "Hello Human " + (i+1) +", I 			am a chatbot." );
	
       		userfact_i = JOptionPane.showInputDialog("Hi, what's 			your name?");//Stores in String user's name
		return userfact_i;//returns users name 

	}// Basic dialogue message

        public static String askForFact(int i, String userfact_i, String userfact1, 						String userfact2)
	//Asks for basic facts for user e.g.name and favourite team and stored using 		String
	{
				
       		JOptionPane.showInputDialog(null, "Hi there " +  userfact_i + 			". How are you?"); 
       
      		userfact1 = JOptionPane.showInputDialog("I'm glad to 			hear it " + userfact_i + ". Do you like Football? ");
		//Here are the first set of decision's, which give out a 			response depending on what the user previously inputs.

     		if(userfact1.equalsIgnoreCase("Yes"))//If statement ignoring 			the case of the answer and provides a response to userfact1
        	{
           
    	 		userfact2 = JOptionPane.showInputDialog(null, "I like 				football "+ "too " + userfact_i + ". Who do you 			support?");       
        	}
  
        	else 
        	{
	 		userfact2 = JOptionPane.showInputDialog(null, "How can 				you not like football. It's amazing " + userfact_i + ". You 				must have a team that you support?"); 
		}

		return userfact2;//returns user's football team
				 
	}


	public static void team(String userfact_i, String userfact2)//Method 		which calls the arguments passed on to it and uses arguments which 		provides a response using if statements depending on user response
	{
		boolean team= true;//boolean value for true/false assignment for use 			in while loop to work

	    	while(team == true)//While loop which works through an if statement, 			will stop once a valid team is given
		{

			if(userfact2.equalsIgnoreCase("Arsenal"))//If statement which 				processes through given responses from userfact2 and 				determines a reply depending on answer, otherwise asks for a 				better team which has a response.
			{
				JOptionPane.showMessageDialog(null, userfact_i 					+ ", Arsenal are an amazing team to be honest, 					especially as their back on top form.");
				team=false;
			}
			
			else if(userfact2.equalsIgnoreCase("Manchester United"))
			{
				JOptionPane.showMessageDialog(null, userfact_i + ", 					Manchester United they are a very good team to be 					honest, sadly their in the Europa league, good old 					channel five.");
				team=false;
			}
		
			else if(userfact2.equalsIgnoreCase("Chelsea")) 
			{
				JOptionPane.showMessageDialog(null, userfact_i +", 					Chelsea are a very good team, not sure about Boas 					though.");
				team=false;
			}

			else if(userfact2.equalsIgnoreCase("Manchester City")) 
	
			{	
				JOptionPane.showMessageDialog(null,userfact_i + ", 					Manchester City are a very good team, as long as they 					got money");
				team=false;
			}
				
			else if(userfact2.equalsIgnoreCase("Tottenham"))
			{
				JOptionPane.showMessageDialog(null,userfact_i+ ", 					Tottenham there a good team, Redknapp is the brains.");
				team=false;
							
			}
			
			else if(userfact2.equalsIgnoreCase("Liverpool"))
			{
				JOptionPane.showMessageDialog(null,userfact_i+", 					Liverpool they used to be a good team, what 					happened.");
				team=false;
			}
			
			else
			{
			
				userfact2=JOptionPane.showInputDialog	
				(userfact_i+", who are " + userfact2 + ", must be 					a terrible team. Do you like a better team?");
										
			}	
		}
					
		looplove(userfact_i,userfact2);//method called with arguments 			passed on it from this method
		
	}

	public static void looplove(String userfact_i, String userfact2)
	// method with argument passed into it, user asked for rating of user's team, 		with a looped response
	{
		String rating;  // whatever the person types as text
       		int no_rating = 0;  // an integer version of textinput
       
		rating = JOptionPane.showInputDialog( "How much do you rate "+ 			userfact2 +" from 1-10?");//Assigns rating given by user and stores in 			String
		no_rating = Integer.parseInt(rating);//Parse string into int 			storage

      		for (int i=1; i<=no_rating; i++)//loop in repsonse to rating 			given will show a repeated message

       		{
          		JOptionPane.showMessageDialog(null,"You love " + 				userfact2 + "!");
       		}

      		String reason=JOptionPane.showInputDialog("So you love "+ userfact2 + 			" times " + no_rating +"?");
		
		if(reason.equalsIgnoreCase("Yes"))//IF statement which goes through, 			the following statements and uses depending on users response
		{
			JOptionPane.showMessageDialog(null, "I'm glad to hear that you 				love your team " + userfact_i + ".");
		}
		else if(reason.equalsIgnoreCase("No"))
		{
			JOptionPane.showMessageDialog(null,"Come on now, you must love 				them, otherwise why say it. "+ userfact_i+", 				try to find a team you actually love.");
		}
		else
		{
			JOptionPane.showMessageDialog(null,"I dont understand what you 				mean,  "+ userfact_i
			+".");
		} 
		top5();
  	}//end looplove

	

	public static void top5()//This method uses arrays to store the users answers, 		when we ask for his best teams, which is then given back as a response when we 		ask for a team name
	{
		
		String []positionteam= new String[value];//Array declared and 			intialisied

		JOptionPane.showMessageDialog(null,"Now can you put the teams 			in order of which is the best?(Arsenal, Manchester United, 			Chelsea, Manchester City, Tottenham, Liverpool)");

		for(int j=0;j<positionteam.length;j++)//loop repeatedly asks for users 			input and stores in array
			{			
				positionteam[j]=JOptionPane.showInputDialog("(Arsenal, 					Manchester United,Chelsea, Manchester City, Tottenham, 					Liverpool)"+"\t"+ (j+1) +":");
			}

		String lookupteam= JOptionPane.showInputDialog("Name a team 			and I will tell you where you placed it?");
					
		for (int j=0; j<positionteam.length; j++)//Loop looks through 				stored values to get position of team asked for
		{
			if (lookupteam.equalsIgnoreCase(positionteam[j]))// IF 				statement looks to see if asked team is found
			{ 	
			
				JOptionPane.showMessageDialog(null,"You placed 					"+lookupteam+" in position "+ (j+1));  		
				//Gives message telling the user the team 					looked up and it's position	
			}			
		}		
		topplayer(positionteam);//Calls topplayer method and passes array into 						it					
	}//End top5


	public static void topplayer(String [] positionteam)//Method uses arrays 		passed from previous method and employs other arrays to ask questions and 		provide an equal response depending on the team questioned about, using a loop
	{	
		String [] teams={"Arsenal","Manchester United","Chelsea","Manchester 			City","Tottenham","Liverpool"};
		String [] usersplayer=new String [value];
		String [] bestplayer={"Van Persie","Wayne Rooney","John Terry","Sergio 			Agüero","Jermain Defoe","Steven Gerrard"};
		
		for(int k=0; k<usersplayer.length;k++)
		{
			JOptionPane.showMessageDialog(null,"So your position " + (k+1) 				+ " is "+ positionteam[k] + ", mine is " + teams[k]);
			usersplayer[k]=JOptionPane.showInputDialog("Who do you think 				is " + teams[k]+ "'s best player?");
			JOptionPane.showMessageDialog(null,"I think " + teams[k] + 				"'s best player is " + bestplayer[k] +", he seems great."); 
		}

	}//End topplayer
		


}// END class chatbot



