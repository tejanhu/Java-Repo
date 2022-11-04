/* *****************************************
AUTHOR Paul Curzon
  A program to print the averages of a series of 
  pairs of ages, stopping when the user wishes it.
  Illustrates how methods can be passed  values.
******************************************** */

import javax.swing.*;

class ages2
{
    public static void main (String[] param)
    { 
        averageAges();
        System.exit(0);
        
    } // END main


/* *********************************
    Ask for a series pairs of ages printing their average each time
*/
    public static void averageAges()
    {
       String again = "yes";
       
       while (again.equals("yes"))
       {
          int age1;
          int age2;
          String textinput;
          int averageAge;
          
          textinput = JOptionPane.showInputDialog("Give me the first age");
          age1 = Integer.parseInt(textinput);
          textinput = JOptionPane.showInputDialog
                                             ("Give me the second age");
          age2 = Integer.parseInt(textinput);

          averageAge = calculateAverage(age1, age2);
          
          System.out.println("Average: " + averageAge);
          
          again = JOptionPane.showInputDialog("Continue? (yes/no)");
        }

       return;

    } // END averageAges
/* *********************************
    A method that given two numbers  returns their average 
*/
     public static int calculateAverage(int value1, int value2)
     {
        int average;

        average = (value1 + value2) / 2;

        return average;
     } // END calculateAverage
    
} // END class ages2

