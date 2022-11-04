/*AUTHOR: HUSSEIN AHMED TEJAN
 * Below is a program I designed to represent my pet alien called ET 
 * whom I feed and have decided to monitor his eating patterns and sleep patterns and that sort of nature.
 */

import javax.swing.JOptionPane;
import java.util.Random;
import java.io.*;

	public class et_pet_alien {


		    public static void main(String[] args) {
		       int [] aryNums=new int [5];

					aryNums[0] = 2500;
					aryNums[1] = 7300;
					aryNums[2] = 9500;
					aryNums[3] = 34000;
					aryNums[4] = 20;
                         Input();               
		 	alienrun();
			 categories();
			children_arrays(aryNums);
		  	alienkids(aryNums);
		      
		    } // end Main 

		/**************************************************************************************
		 * This method has a number of lines which are printed and if statements           
	         *which ask the user a number of things
		 *to determine ET's rate of hunger as well as sleep patterns  
		 * and compares whether ET prefers eating more snakes over fruits within two four loops.
		 */
	

		public static void alienrun()
		{
		 	System.out.println("Hi, my name is ET and I am from planet Mars.");
			String name;
			name=JOptionPane.showInputDialog("What is your name?"+ "Are you an earthling?");
		
		
			String rateofhunger= JOptionPane.showInputDialog("What rate of hunger does ET have on a scale of 1-10?");
			int rateofhunger_score;
		
			rateofhunger_score =Integer.parseInt(rateofhunger);
				
		
			if(rateofhunger_score>10){
			    	System.out.println("ET gets extremely hunger!");
			} // end if 
			else if(rateofhunger_score<10){
		       		JOptionPane.showMessageDialog(null,"ET takes it like a man!");
			} // end if 
		    
			String sleeping_hours= JOptionPane.showInputDialog("How many hours does ET sleep per day?");
			int hours;
		
			hours =Integer.parseInt(sleeping_hours);
			      
			if(hours>6){
			    System.out.println("ET gets plenty of shuteye!");
			}
			else if(hours<8){
		      		 JOptionPane.showMessageDialog(null,"ET is a stubborn pet and needs MORE DISCIPLINE!");
			} 

			String snakes;               
			String monkeys;               
			String octopuses;               
			String panthers;                
			int serpent = 0;              
			int monk = 0;             
			int octo = 0;             
			int feline = 0;            
		
		       
		       for(int i=1;i<=4;i++) 
			{       
		 		snakes= JOptionPane.showInputDialog("How many snakes does ET enjoy eating?");    //*input dialog
		     	 	serpent= Integer.parseInt(snakes);                   //string variable being converted into an integer variable
		       
			       JOptionPane.showMessageDialog(null,serpent);     //*message dialog
				      
			       monkeys= JOptionPane.showInputDialog("How many monekys does ET enjoy swinging in the trees with?");   //*input dialog
			       monk= Integer.parseInt(monkeys);                       //string variable being converted into an integer variable
			       
			       JOptionPane.showMessageDialog(null,monk);       //*message dialog
				      
			      
			       octopuses= JOptionPane.showInputDialog("How many octopuses does ET squash per second?");  //*input dialog
			       octo= Integer.parseInt(octopuses);                        //string variable being converted into an integer variable
			       
			       JOptionPane.showMessageDialog(null,octo);        //*message dialog
			       
			       
			       panthers= JOptionPane.showInputDialog("How many panthers did ET chase in the zoo?");  //*input dialog
			       feline= Integer.parseInt(panthers);                         //string variable being converted into an integer variable
				      
			       JOptionPane.showMessageDialog(null,feline);        //*message dialog
		       } // end for
		       
			String oranges;                //string initialising rat 1
			String apples;                  //string initialising rat 2
			String grapes;                  //string initialising rat 3
			String strawberries;                  //string initialising rat 4
			int orang = 0;              //*types declared as integers
			int app = 0;                 //*
			int grap = 0;                 //*
			int strawb = 0;                 //*
		       
			 for(int i=1;i<=4;i++) 
			{             //for loop
		  		oranges= JOptionPane.showInputDialog("How many oranges does ET digest per millisecond?" );  //*input dialog
			       orang= Integer.parseInt(oranges);              //string variable being converted into an integer variable
			       
			       JOptionPane.showMessageDialog(null, orang);     //*message dialog
				      
				 apples= JOptionPane.showInputDialog("How many apples does ET eat a week?");  //*input dialog
			       app= Integer.parseInt(apples);                  //string variable being converted into an integer variable
		
			       JOptionPane.showMessageDialog(null, app);        //*message dialog
			       
				   
			       grapes= JOptionPane.showInputDialog("How many grapes does ET swallow per night?");  //*input dialog
			       grap= Integer.parseInt(grapes);                      //string variable being converted into an integer variable
			       
			       JOptionPane.showMessageDialog(null, grap);        //*message dialog
			       
				 
				strawberries= JOptionPane.showInputDialog("How many strawberries does ET's stomach entertain?");   //*input dialog
			       strawb= Integer.parseInt(strawberries);                      //string variable being converted into an integer variable
		
			       JOptionPane.showMessageDialog(null, strawb);       //*message dialog
		       } // end for 
		      
			 int animals;    //the type of the mouse total being initialised as an integer
			 int fruits;      //the type of the rat total being initialised as an integer
			 
			 animals =serpent+monk+octo+feline;      //sum of animals
			 fruits =orang+app+grap+strawb;     //sum of fruits
			 
			 JOptionPane.showMessageDialog(null,"The total of animals ET has a taste for are: " + animals + ", and the amount of fruits ET eats are:" +fruits+".");
			 
			 if (animals>fruits){            //if statement comparing total of fruits with total of animals
			     JOptionPane.showMessageDialog(null,"ET finds animals more tastier in comparison to fruits.");   //*message dialog
			 } // end if 
			 
			 else if (fruits>animals){       //else if statement comparing total of animals with total of fruits
			    JOptionPane.showMessageDialog(null,"ET prefers fruits over animals.");    //*message dialog
			 } // end if 

		} // end alienrun
			 

		
		/***************************************************************************
		 * This method includes five arrays which carry the ages of ET's children  
		 * and inform the user of what to type 
		 *in order to find out how old ET's youngest and oldest child is. 
		 */

		public static void children_arrays(int [] aryNums)

		 {

			String alientodler;
			String alienoldest;
			String tot;
			String firstborn;
		

		

	

			JOptionPane.showMessageDialog(null,"Type tot if you wish to know how old ET's youngest alien child is \n type firstborn if you wish to know how old ET's oldest child is.");

	   
			alientodler=JOptionPane.showInputDialog("What is the age of ET's youngest alien child?");

		  if(alientodler.equalsIgnoreCase("tot"))
			{

				JOptionPane.showMessageDialog(null, aryNums[4] );
			}


				alienoldest=JOptionPane.showInputDialog("What is the age of ET's first born alien child?");



	 	if(alienoldest.equalsIgnoreCase("firstborn"))
			{
				JOptionPane.showMessageDialog(null, aryNums[3] );
			}


		} //end children_arrays method




        /***************************************************************************
	 * This method asks the user to select which category they want ET 
	 * to have per round in terms of his emotions.
	 */


	public static void categories()

	 {


	    int emotionint;


	
		String userinput;
		userinput=JOptionPane.showInputDialog("How many rounds do you desire Sire?");
		int 
		textinput=Integer.parseInt(userinput);



		for(int k=1;k<=textinput;k++)
		{
			System.out.println("Round "+k);


			for(int x=1;x<=4;x++)
			{
				int wassup=categoryemotion();
				System.out.println(wassup);
	  
	// These if statments check for wassup values and print a corresponding message based on the values found to show ET's Emotional state.

				if (wassup==0|wassup<=7)

				{
	       
	 

					System.out.println("ET is Normal");        
	       				JOptionPane.showMessageDialog(null,"Well done Dave!");

	   			} // end if

			        if (wassup==8)
				{


					System.out.println("ET is hyper");


	  			 } // end if


				 if (wassup==10)
				 {

					System.out.println("ET is disobediant");

	  			  } //end if


				 if (wassup==9)
				 {

					System.out.println("ET is cranky");
					JOptionPane.showMessageDialog(null, "Bloody 'ell Dave!");

	  			 }// end if

				 String userOption;
				userOption=JOptionPane.showInputDialog("You have three choices: a Tranquilizer, a sweet or a cane!"); 



				if (userOption.equals("Tranquilizer"))

				{
					wassup=0;
					System.out.println(wassup);
					System.out.println("ET bedtime");

				if (wassup==0|wassup<=7)

				{
	       
	 

					System.out.println("ET is Normal");        
	       				JOptionPane.showMessageDialog(null,"Well done Dave!");

	   			} // end if

				if (wassup==8)
				{

					System.out.println("ET is hyper");
					System.out.println();

	 			} // end if


				if (wassup==10)
				{

					System.out.println("ET is disobediant");
					System.out.println();
	  			} //end if


				if (wassup==9)
				{

					System.out.println("ET is cranky");
					JOptionPane.showMessageDialog(null, "Bloody 'ell Dave!");
					System.out.println();

	  			}// end if



				} // end if tranquilizer



				if (userOption.equals("sweet"))

				{
					wassup=8;
					System.out.println(wassup);
					System.out.println("Come have some sugar ET!");

				if (wassup==8)

				{

					System.out.println("ET is hyper");
					System.out.println();

				}



				} // end if sweet



				if (userOption.equals("Cane"))

				{
					wassup=10;
					System.out.println(wassup);
					System.out.println("Come get your whooping ET!");

				if (wassup==10)

				{

					System.out.println("disobediant");
					System.out.println();

				}

				}// end if Cane




		}// end second for loop

	}// end first for loop

		System.out.println("THE END.");


	} // end categories method




		/*The method below arranges the String array of ET's alien kids 
      	  	*into order of age in terms of descending order rather
        	*than ascending order and prints it in the terminal.        
        	*/         
                              
                      
                      
	public static void alienkids(int [] aryNums ) 
	{

                                      
        	String [] rascals = new String [5]; 
        	rascals[0] ="alex";
        	rascals[1] ="alie";
        	rascals[2] ="xela";
        	rascals[3] ="polo";
        	rascals[4] ="yoshi";
        
        	for(int a =0; a<=4; a++)
        	{    
        		JOptionPane.showMessageDialog(null,rascals[a] + " is " + aryNums[a] + " years old" );
        	}

					
                 	JOptionPane.showMessageDialog(null, "It's feeding time.");

		boolean sorted = false;
		while (!sorted)
		{
			sorted = true;
			int counter;
                
	   	for (counter=0;counter<aryNums.length-1;counter++)
		{

			if (aryNums[counter]>aryNums[counter+1])
			{      int feed_sum = aryNums [counter + 1];
                       		aryNums[counter+1] = aryNums[counter];
                       		aryNums[counter] = feed_sum;
                
                       		String rascals_ntmp=rascals[counter+1]; 
                       		rascals[counter+1] = rascals[counter];
                       		rascals[counter] = rascals_ntmp;
                
                       		sorted = false;
        	}

			} // END if

	

		} // END for loop


		for(int i=0;i<aryNums.length;i++)
    
		{
    			System.out.println(i+ ". " + rascals[i] + ": "+aryNums[i] );
		}
                Question(rascals);
		 Output(rascals);



  	}	 // END alienkids

		
	
	/*The method below asks the user whether they wish to continue with the game 
  	*if the user types "yes" the program goes back to the first method after the main
	*or if the user types anything other than "yes",
	*the question comes up asking if the user wants to save Et's children
	*and if the user types "yes" it saves the names of Et's alien 
	*into a text file or if the user types "no" the game ends.         
	*/    



	public static void Question (String [] rascals)  
        {
		
		String answer;
		
       	
		
		answer=JOptionPane.showInputDialog("Do you wish to continue the game?");		

        			
		if(answer.equals("yes"))
		{
			 alienrun();
		} // END if statement
        

				
        	
		else
		{
		  String option;
		 

		  option=JOptionPane.showInputDialog("Do you wish to save Et's chidlren?");
                  
                  	if(option.equals("yes"))
		{
		  
			 Output(rascals);		

		} // END if statement
                        
                     else if (option.equals("no"))
		{
		  
			System.exit(0);		

		} // END else if statement
          
                              
                 
		} // END else statement

       } // END Question

         
         
		/************************************************************
		This method demonstrates simple file output.
    		Where the random variable is stored into a file called "Et.txt"
      		Therefore, it prints the alien names into a file called Et.txt
   
		***************************************************************/

        public static void Output(String [] Rascals)  
        {
                try{
        	PrintWriter outputStream = new PrintWriter(new FileWriter("Et.txt"));
                outputStream.println("The following are the names of Et's pet children:");
        	for (int n=0;n<Rascals.length;n++)
		{
                    
        	outputStream.println(Rascals[n]);

        	} // END for loop
        	outputStream.close();
        
        	System.exit(0);
                    
                } // END try
                catch (IOException E){
                    
                    
                    
                }
                

       } // end Output


	
		/************************************************
		This method demonstrates simple file input.
    		Where the contents stored in the file "Et.txt"
      		are printed within a console.
   
		**************************************************/

     public static void Input () 
        {   
            
            System.out.println(" Alien names in text file");
            System.out.println();
            
            try {
            
       
            BufferedReader inStream = new BufferedReader(new FileReader("Et.txt"));
 
            String followingword = inStream.readLine();

        
            while ((followingword = inStream.readLine()) != null)
            {
             System.out.println(followingword);
               // followingword = inStream.readLine();
            
            }

        inStream.close();
        }
        catch(IOException E){
            
            
        }
        
                

        } // END Input

		
		/***************************************************************************
		 * This method has a random object which is used to randomise each emotional 
		 * state  that ET has.
	         */
		

		public static int categoryemotion ()
		{
			Random var=new Random();
			int emotionint=var.nextInt(10+1);
			return emotionint;
		} // END categoryemotion


		 
	} // end et_pet_alien class
	    






    
