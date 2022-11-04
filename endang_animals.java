 
/* *****************************************
AUTHOR HUSSEIN A TEJAN
//The program prints message about endangered animals/
******************************************** */

import javax.swing.*;

class endang_animals
 {
    
 public static void main (String[] args)
 {		animalEnding();
        System.exit(0);  
       }
	   public static void animalEnding()
	   {
       int n;
	   String text = JOptionPane.sohwInputDialog("How many animals do you want to check?");
		n = Integer.parseInt(text);
	 
	 for(int i=1; i<=n; i++)
	   {
	     String  endang_animals;
		 endang_animals = ask String ("Give me the name of animal"+i);
			
			if(endang_animal.equals("Dodo");
			{
		JOptionPane.showMessageDialog(null,"The" + endang_animal + "is unfortunately exstinct");
    }
   else if endang_animal.equals("Blue Whale");
  {   
 JOptionPane.showMessageDialog(null,"The" + endang_animal + "is an endangered species." );
            
  }    
  else
  
 JOPtionPane.showMessageDialog("The" + Penguinman +"is one I have not heard of");
 
 }

 
 }
 }