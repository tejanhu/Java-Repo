
/* *****************************************
AUTHOR HUSSEIN A TEJAN
This program demonstrates 
 - integer variables
 - doing calculations.
 
   Add the ages of three children (three integers)
   to work out the total age.
******************************************** */

import javax.swing .*; // import the swing library for I/O

class bmi
{
    public static void main (String[] param)
    {
        
        add3ages();
        System.exit(0);
        
    } // END main


  
    public static void add3ages()
    {

       // Declare variables
       //
       
       String textinput;
       int height;  
       int weight;       
       int ans;  
       int BMI;       
       
       

textinput = JOptionPane.showInputDialog("What is your height in cm?")
;
height= Integer.parseInt(textinput);
textinput = JOptionPane.showInputDialog("What is your weight in Kg?")
;
weight= Integer.parseInt(textinput);


       ans = height * height/10000;
       BMI = weight / ans;
       
       

    
       
       JOptionPane.showMessageDialog (null, "The BMI is " + BMI);
        
    } // END add3ages
    

} // END class add3
