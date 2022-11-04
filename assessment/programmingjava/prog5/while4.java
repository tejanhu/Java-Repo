/* *****************************************
AUTHOR Paul Curzon
This program demonstrates 
 - while loops.
 
   Add a series of numbers asking the user 
   using a sentinel value (-1) to determine when to stop.
   
   
******************************************** */

import javax.swing.*; // import the swing library for I/O

class while4
{
    public static void main (String[] param)
    {
        
        whileGoOnCount();
        System.exit(0);
        
    } // END main


   /* ***************************************************
       Define some commands of our own to use above
   *************************************************** */
    
    
    /* ***************************************************
      Get numbers adding them as you go until -1 is typed.
    */
    
    public static void whileGoOnCount()
    {

       // Declare variables
       //
       
       String anstext;    // text typed in - will be converted to a number
       String resulttext; // build up an answer to print                   
       int count = 0;     // counter of how many times loop body executed
       int ans   = 0;     // next number entered
       int sum   = 0;     // total so far


       // We must get teh first number before the 
       anstext = JOptionPane.showInputDialog("Enter a number (-1 to terminate)");
       ans = Integer.parseInt(anstext);

       while (ans != -1)
       {
           // Process the value given so far as known now not to be -1
           //
           sum = sum + ans;
           
           count = count + 1;  // keep track of how many have entered 
           
           // Having processed the last number, get the next
           //
           anstext = JOptionPane.showInputDialog("Enter a number (-1 to terminate)");
           ans = Integer.parseInt(anstext);
           
       }

       // Now print out the results
       // Notice this program still tries to print out the average even when it involves
       // dividing by zero
       //
       resulttext =  "That was " + count + " numbers";
       resulttext = resulttext + "\nwith a sum of " + sum;
       resulttext = resulttext + "\nand an average of " + ((double) sum/ (double) count);

       JOptionPane.showMessageDialog(null, resulttext);
       

    } // END whilegoonCount
    

} // END class while4


