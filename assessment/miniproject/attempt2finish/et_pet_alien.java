
/*AUTHOR: HUSSEIN AHMED TEJAN
 * Below is a program I designed to represent my pet alien called ET 
 * whom I feed and have decided to monitor his eating patterns and sleep patterns and that sort of nature.
 */

import java.io.*;
import javax.swing.JOptionPane;
import java.util.Random;

public class et_pet_alien {


	    public static void main(String[] args) {
	       
	      
	 	alienrun();
		 categories();
		children_arrays();
		inputyoudig();
	      
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

	} // end main 
		 

		
                /***************************************************************************
		 * This method includes five arrays which carry the ages of ET's children  
		 * and inform the user of what to type 
		 *in order to find out how old ET's youngest and oldest child is. 
		 */

		public static void children_arrays()

		{

		String alientodler;
		String alienoldest;
		String tot;
		String firstborn;
		int [] aryNums;

		aryNums = new int [5];

		aryNums[0] = 2500;
		aryNums[1] = 7300;
		aryNums[2] = 9500;
		aryNums[3] = 34000;
		aryNums[4] = 20;

     JOptionPane.showMessageDialog(null,"Type tot if you wish to know how old ET's youngest alien child is \n type firstborn if you wish to know how old ET's oldest child is.");

           
		alientodler=JOptionPane.showInputDialog("What is the age of ET's youngest alien child?");

		if(alientodler.equalsIgnoreCase("tot")){

		JOptionPane.showMessageDialog(null, aryNums[4] );
		}


		alienoldest=JOptionPane.showInputDialog("What is the age of ET's first born alien child?");








	 if(alienoldest.equalsIgnoreCase("firstborn")){
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


		for(int x=1;x<=1;x++)
		{
		int wassup=categoryemotion();
		System.out.println(wassup);
		  
		// These if statments check for wassup values and print a corresponding message based on the values found to show ET's Emotional state.

		if (wassup==0|wassup<=7)

		{
		       
		 

		System.out.println("ET is Normal");        
		       JOptionPane.showMessageDialog(null,"Well done Dave!");

		   } // end if

		if (wassup==8){


		System.out.println("ET is hyper");


		  } // end if


		if (wassup==10){

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

		if (wassup==8){


		System.out.println("ET is hyper");
		System.out.println();

		  } // end if


		if (wassup==10){

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

		

		public static void inputyoudig ()
					throws IOException
	{
	     PrintWriter outputStream =
		new PrintWriter(new FileWriter("hello.txt"));
             outputStream.println("Hello World");
		outputStream.close();
		System.exit(0);

	} // END inputyoudig




		/***************************************************************************
		 * This method has a random object which is used to randomise each emotional 
		 * state  that ET has.
		 *
		 */
		

		public static int categoryemotion ()
		{
			Random var=new Random();
			int emotionint=var.nextInt(10+1);
			return emotionint;
		}


         
} // end et_pet_alien class
    






    
