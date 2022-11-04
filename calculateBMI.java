
/* *****************************************
AUTHOR HUSSEIN A TEJAN
This program demonstrates 
 - Body Mass Index
 - doing calculations.
 
   Add the ages of three children (three integers)
   to work out the total age.
******************************************** */



class calculateBMI
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
       This method calculates the Body Mass Index of an individual written
       into the program
    */
    
    public static void calculateBMI();
    {

         // Declare variables
       String heightInput; // an integer version of heightInput
       String heightInput;

       int height;  // each will hold the age of a different child
       int weight;       
       int mass;  
       int ans; // the final answer      
       
       // Now do the calculation of the BMI
       //
       totalBMI = height + weight;

       // Get some input (a string) from the user then
       // convert (known as parsing) it into a number version
     
       heightInput = JOptionPane.showInputDialog("What is your height in cm as a whole number?");
       height = Integer.parseInt(heightInput);
      
       weightInput = JOptionPane.showInputDialog("What is your weight in Kg as a whole number?");
       weight = Integer.parseInt(weightInput);
       // Finally give the user the answer
       //   
       JOptionPane.showMessageDialog(null, "The body mass index of the individual is " + totalheight_weight);
        
    } // END calculateBMI
    
      
   } // END class calculateBMI
