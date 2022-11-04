
/* *****************************************
AUTHOR Paul Curzon
This program demonstrates 
 - for loops.
 
   Ask the user for a number, and print a table of factorials up to that point

******************************************** */

import javax.swing.*; // import the swing library for I/O

class exp_fact
{
    public static void main (String[] param)
    {
        
        expfacttable();
        System.exit(0);
        
    } // END main


   /* ***************************************************
       Define some commands of our own to use above
   *************************************************** */
    
    
    /* ***************************************************
       This method asks the user for a number and prints the
       factorial and exponential functions up to that number in a table
    */
    
    public static void expfacttable()
    {

       // Declare variables
       //
       int fact =1;
       int exp = 1;
       
       String textinput;  // whatever the person types as text
       int length = 0;          // an integer version of textinput
       String  resulttext ="";  // build a string to print the result as in one go at end
       
       // //What size table?
       //
       textinput = JOptionPane.showInputDialog("Enter a number and I will print factorials and exponentials to that number: ");
       length = Integer.parseInt(textinput);
       
       //Create the headers of the table
       //
       resulttext = resulttext + "No\t\t Exp\t\t Fact\n";
       resulttext = resulttext + "=============================\n";


       // Work out the results and build the  table a row at a time 
       for (int i=1; i<=length; i++)
       {
           fact=i*fact;
           exp=2*exp;
           resulttext = resulttext + i+"\t\t\t     "+exp+"\t\t\t     "+fact+ "\n";
       }

       JOptionPane.showMessageDialog(null, resulttext);

    } // END expfacttable
    

} // END class exp_fact
