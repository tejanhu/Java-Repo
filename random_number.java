
/* *****************************************
AUTHOR HUSSEIN A TEJAN
This program demonstrates a arithmetic board game 
 - integer variables
 - doing calculations.
 
   Ask the user to think of a number, and perform a simple calculation on it to get the answer:
   square it and divide by 3. Finally print out the result
******************************************** */

import javax.swing.*; // import the swing library for I/O

class random_number
{
    public static void main (String[] param)
    {
        
       random();
        System.exit(0);
        
    } // END main


    
    
    public static void random()
    {

      
       

       
       String textinput;  
int CURRENTnumber;
int age;
int year;
       int number;          
       int multiple;        
       String answertext;  
       



       JOptionPane.showInputDialog("Tell me the number you have now " +  CURRENTnumber);
       age = Integer.parseInt(textinput);

       

       multiple = CURRENTnumber * number; 
       
       answertext = "You must be thinking of the number" +
                     year + " or " + (year - 1); 

    
        
       JOptionPane.showMessageDialog(null, answertext);

    } // END random
    

} // END class random_number
