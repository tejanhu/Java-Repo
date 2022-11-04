/* *****************************************
AUTHOR Paul Curzon

  A program to print the averages of a series of 
  pairs of ages.
  
  Illustrates how methods can return values.
   
******************************************** */

import javax.swing.*;

class ages
{
    public static void main (String[] param)
    { 
        averageAges();
        System.exit(0);
        
    } // END main


/* *********************************
    Ask for 10 pairs of ages printing their average 
*/
    public static void averageAges()
    {
       for (int i=1; i<=10; i++)
       {
          int averageAge;

          JOptionPane.showMessageDialog(null, "I need you to give me a pair of ages");
          averageAge = calculateAverage();
          System.out.println(i + ": " + averageAge);
        }

 
       return;

    } // END averageAges


/* *********************************
    A method that asks for two numbers and returns their average 
*/
    public static int calculateAverage()
    {
       int value1;
       int value2;
       int average;
       String textinput;

       textinput = JOptionPane.showInputDialog("Give me the first");
       value1 = Integer.parseInt(textinput);
       textinput = JOptionPane.showInputDialog("Give me the second");
       value2 = Integer.parseInt(textinput);

       average = (value1 + value2) / 2;

       return average;
    } // END calculateAverage
    


    
} // END class ages
