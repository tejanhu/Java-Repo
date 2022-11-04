/* *****************************************
AUTHOR Paul Curzon
  Giving status of endangered animals up to a number
  indicated first by the user.
******************************************** */

import javax.swing.*;

class endangered
{
  public static void main (String [] param) 
  {
      aretheyendangered();
      System.exit(0);
  }
  

  /* ***************************************
  Give endangered status of a sequence of animals   
  */

  public static void aretheyendangered () 
  {
    String testAnimal = "";
    String animalStatus = "";
    int numberAnimals = 0;
    
    // First get the number of queries
    numberAnimals = howmanyanimals();
    
    //Then ask for that many animals and give status
    for(int i = 1; i <= numberAnimals; i++)
    {
      testAnimal = JOptionPane.showInputDialog
                         ("Give me the name of animal " + i);
                         
      animalStatus = statusofanimal(testAnimal);

      System.out.println("The " + testAnimal  + " is " + animalStatus);
    }
    
    return;
  }
 
 
  /* ***************************************
  For a given animal return its status as a string message   
  */
  public static String statusofanimal (String animal) 
  {  
  
     String status = "";
     
     /* Now set message based on status of animal */
     
      if (extinct(animal))
          {
            status = "unfortunately now extinct.";
          }
      else if (endangered(animal)) 

          { 
            status = "endangered and needs protection.";
          }
      else if (vulnerable(animal))
          { 
            status = "vulnerable";
          }
      else if (notindanger(animal))
          { 
            status = "not in danger.";
          }
      else
          { 
            status = "one I've not heard of.";
          }
      
      return status;
  }


  /* ***************************************
     Get the number of animals to check from user   
  */
  public static int howmanyanimals () 
  {  
      String textinput = JOptionPane.showInputDialog
                         ("How many animals do you want to check?");
      return Integer.parseInt(textinput);
  }


  /* ***************************************
     Is the given animal extinct?   
  */

  public static boolean extinct (String animal) 
  {  
       if ((animal.equals("Dodo") ||
           (animal.equals("Passenger Pigeon")))) 
          {
            return true;
          }
      else 
          {
            return false;
          }   
  }

  /* ***************************************
     Is the given animal endangered?   
  */

  public static boolean endangered (String animal) 
  {  
       if ((animal.equals("Blue Whale") ||
               (animal.equals("Albatross"))))
          {
            return true;
          }
      else 
          {
            return false;
          }   
  }

  /* ***************************************
     Is the given animal vulnerable?   
  */

  public static boolean vulnerable (String animal) 
  {  
       if (animal.equals("Cheetah"))
          {
            return true;
          }
      else 
          {
            return false;
          }   
  }

  /* ***************************************
     Is the given animal fine?   
  */

  public static boolean notindanger (String animal) 
  {  
       if (animal.equals("Rabbit"))
          {
            return true;
          }
      else 
          {
            return false;
          }   
  }
}
 