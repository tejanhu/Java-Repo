	
/* ***************************************
/*AUTHOR: HUSSEIN AHMED TEJAN
		   
   ****************************************/
import javax.swing.JOptionPane;


class Arrays // ***THE WORD AFTER CLASS MUST BE THE NAME OF THE FILE (BEFORE the .java) YOU SAVE THIS IN
{
    public static void main (String[] param)
    {

		array();  // ***REPLACE THE WORD DOTHIS WITH THE NAME YOU USE BELOW
		
		System.exit(0);
		
    } // END main

	
	/* ***************************************
	*
	*	***PUT A COMMENT HERE TO EXPLAIN WHAT THIS METHOD IS FOR
	*/

	 public static void array()
	{

	String [] paintarray = new String[5]; // 5 strings stored into arrays
	paintarray[0] = "";	
	paintarray[1] = "Mona Lisa";          // stores Mona Lisa into the first paintarray    
	paintarray[2] = "Water Lillies";      // stores Water Lillies into the second paintarray 
	paintarray[3] = "The Scream";         // stores The Scream into the third paintarray
	paintarray[4] = "A Young rembrandt";  // stores A Young rembrandt into the fourth paintarray


	String Painting;  //variables holds strings

	int [] vote=new int [5];

	vote [0]= 0;          
	vote[1]= 0;           // votes are initialised
	 vote[2]= 0;          // votes are initialised
	 vote[3]= 0;          // votes are initialised
	 vote[4]= 0;          // votes are initialised




	Painting = JOptionPane.showInputDialog("Which painting do you think is the best?");      //input dialog asks the user to input something (currently stores strings)
	int paint=Integer.parseInt(Painting);                                                    //input dialog values accepted are converted into accepting integers


		while (paint!=-33)                                                                      //while loop
		{

		System.out.println("Which painting do you think is the best?");  // prints the question
		System.out.println("vote 1 for " +  paintarray[1]);
		System.out.println("vote 2 for " +  paintarray[2]);
		System.out.println("vote 3 for " +  paintarray[3]);
		System.out.println("vote 4 for " +  paintarray[4]);






		if (paint == 1) // if statement compares where paint equals 1
		{

			vote[1]= vote[1]+1;
			System.out.println(vote [1]);
			System.out.println("You voted for " + paintarray[1]);
			System.out.println("The current votes are");             //prints list of votes
			System.out.println(vote [1] + ":" + paintarray[1]);
			System.out.println(vote [2] + ":" + paintarray[2]);
			System.out.println(vote [3] + ":" + paintarray[3]);
			System.out.println(vote [4] + ":" + paintarray[4]);

		 
		}


		else if (paint == 2)   // if statement compares where paint equals 2
		{

			vote[2]= vote[2]+1;


			System.out.println(vote [2]);
			System.out.println("You voted for " + paintarray[2]);
			System.out.println("The current votes are");             //prints list of votes
			System.out.println(vote [1] + ":" + paintarray[1]);
			System.out.println(vote [2] + ":" + paintarray[2]);
			System.out.println(vote [3] + ":" + paintarray[3]);
			System.out.println(vote [4] + ":" + paintarray[4]);




		}

	else if(paint == 3){        // if statement compares where paint equals 3

		vote[3]= vote[3]+1;


		System.out.println(vote [3]);
		System.out.println("You voted for " + paintarray[3]);
		System.out.println("The current votes are");             //prints list of votes
		System.out.println(vote [1] + ":" + paintarray[1]);
		System.out.println(vote [2] + ":" + paintarray[2]);
		System.out.println(vote [3] + ":" + paintarray[3]);
		System.out.println(vote [4] + ":" + paintarray[4]);


	}

	 
	else if (paint == 4)          // if statement compares where paint equals 4
	{

	vote[4]= vote[4]+1;       // when user types 4, 1 is added to the value of vote 4


	System.out.println(vote [4]);
	System.out.println("You voted for " + paintarray[4]);
	System.out.println("The current votes are");               //prints list of votes
	System.out.println(vote [1] + ":" + paintarray[1]);
	System.out.println(vote [2] + ":" + paintarray[2]);
	System.out.println(vote [3] + ":" + paintarray[3]);
	System.out.println(vote [4] + ":" + paintarray[4]);

	}

	else 
	{

	System.out.println("ERROR!");          // prints the message "ERROR" when -33 is inputted

	}
	Painting = JOptionPane.showInputDialog("Which painting do you think is the best?");
	paint=Integer.parseInt(Painting);  //painting converted to take integer values as an input

	} // END while




	} //END method


	
} // END class Arrays  
               // ***DONT FORGET TO CHANGE 'template' HERE TO YOUR CLASS NAME FROM THE TOP
