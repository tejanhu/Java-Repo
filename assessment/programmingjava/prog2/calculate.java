/* *****************************************
AUTHOR Paul Curzon
This program demonstrates 
 - integer variables
 - doing calculations.
 
   Ask the user for a number, and perform a simple calculation on it:
   square it and divide by 3. Finally print out the result
******************************************** */

import javax.swing.*; // import the swing library for I/O

class calculate
{
    public static void main (String[] param)
    {
        
        squarethird();
        System.exit(0);
        
    } // END main


   /* ***************************************************
       Define some commands of our own to use above
   *************************************************** */
    
    
    /* ***************************************************
       This method asks the user for a number, and performs a simple calculation on it:
       square it and divide by 4. Finally print out the result
    */
    
    public static void squarethird()
    {

       // Declare variables
       //
       String textinput;  // whatever the person types
       int number;        // an integer version of textinput
       int answer;        // the final answer 
       
       // Get some text (a string) from the user then
       // convert (known as parsing) it into a number version
       //
       textinput = JOptionPane.showInputDialog("Give me a number");
       number = Integer.parseInt(textinput);

       // Now do the calculation
       //
       answer = (number * number) / 4;

    
       // Finally give the user the answer
       //   
       JOptionPane.showMessageDialog(null, "Answer is " + answer);
        
    } // END squarethird
    

} // END class calculatejavac 
