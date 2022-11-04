
/* *****************************************
AUTHOR Paul Curzon
This program demonstrates 
 - integer variables
 - doing calculations.
 
   Add the ages of three children (three integers)
   to work out the total age.
******************************************** */

import javax.swing.*; // import the swing library for I/O

class add3
{
    public static void main (String[] param)
    {
        
        add3ages();
        System.exit(0);
        
    } // END main


   /* ***************************************************
       Define some commands of our own to use above
   *************************************************** */
    
    
    /* ***************************************************
       This method adds the ages of three children written
       into the program
    */
    
    public static void add3ages()
    {

       // Declare variables
       //
       int age1;  // each will hold the age of a different child
       int age2;       
       int age3;  
       int totalAge; // the answer when the three ages are added      
       
       // Set the ages to specific values
       // 
       age1 = 7;
       age2 = 13;
       age3 = 10;
       
       // Now do the calculation of the total age
       //
       totalAge = age1 + age2 + age3;

    
       // Finally give the user the answer
       //   
       JOptionPane.showMessageDialog(null, "The total age of the three children is " + totalAge);
        
    } // END add3ages
    

} // END class add3
