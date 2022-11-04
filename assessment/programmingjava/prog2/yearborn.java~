
/* *****************************************
AUTHOR Paul Curzon
This program demonstrates 
 - integer variables
 - doing calculations.
 
   Ask the user for a number, and perform a simple calculation on it:
   square it and divide by 3. Finally print out the result
******************************************** */

import javax.swing.*; // import the swing library for I/O

class yearborn
{
    public static void main (String[] param)
    {
        
        born();
        System.exit(0);
        
    } // END main


   /* ***************************************************
       Define some commands of our own to use above
   *************************************************** */
    
    
    /* ***************************************************
       This method asks the user their age and works out their
       year of both. It only works if current year is correct
       or the person gives their age in that year.
    */
    
    public static void born()
    {

       // Declare variables
       //
       final int CURRENTYEAR = 2011; // The year the calculation is based on
                                     // will need to change this each year.
                                     // or will give the wrong answer.
       
       String textinput;  // whatever age the person types as text
       int age;          // an integer version of textinput
       int year;        // the calculated year of birth
       String answertext;  // construct the text to give the answer back 
       
       // Get an age (a string) from the user then
       // convert (known as parsing) it into a number version
       //
       textinput = JOptionPane.showInputDialog("Tell me your age now in " +  CURRENTYEAR);
       age = Integer.parseInt(textinput);

       // Now do the calculation
       //
       year = CURRENTYEAR - age; 
       
       answertext = "You must have been born in " +
                     year + " or " + (year - 1); 

    
       // Finally give the user the answer
       //   
       JOptionPane.showMessageDialog(null, answertext);

    } // END born
    

} // END class yearborn
