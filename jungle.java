	
/* ***************************************
   AUTHOR: H A TEJAN
	A program that asks for a user
	to come up with 6 animals and 
	to enter them in the input dialog, 
	to check if they have stripes or not.
   ****************************************/
import javax.swing.*;


class jungle
{
    public static void main (String[] param)
    {
        
		
		Jungle_spots();
		System.exit(0);
		
    } // END main



	
    public static void Jungle_spots ()
    {
        int total = 0;
        String animal;

        System.out.println("Name 6 animals and I will judge whether they have stripes.");
		
      for (int i=1;i<=6;i++)
          {
           animal=JOptionPane.showInputDialog("animal?");
           if (animal.equalsIgnoreCase("tiger")|animal.equalsIgnoreCase("zebra")|animal.equalsIgnoreCase("bumblebee"))
           	   {
           	   	System.out.println("A " + animal + " has stripes.");
           	   } // END if statement

           else
               {
               	System.out.println("I don't think that a " + animal + " has stripes.");
               	total=total+1;
               }// END else statement	   
          } // END for loop

         

          System.out.println(total+ " of the animals you enquired about DO NOT have stripes.");
    } // END Jungle_spots
	
	
	
} // END class jungle
