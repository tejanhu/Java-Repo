
/**
 * Author: H A Tejan
 * 
 */

import javax.swing.*;
import java.util.*;


public class Exercise6 {

  
    
    public static void main(String[] args) {
       
     Random bigdice =new Random ();
     int dice=bigdice.nextInt(6)+1;
     String userinput;
     int totalin=0;
     
     while (dice!=5)
             {
                 totalin=totalin+dice;
                 
        System.out.println("Your total for this innings so far:  " + totalin);
 userinput=   JOptionPane.showInputDialog("Do you wish to declare?");
             
        if(userinput.equals(("y")))
        {
JOptionPane.showMessageDialog(null,"Your total for this innings so far is ." +totalin);
      
  
             } // if statement
     
       
        
        
} // while

    } // main
    
} // end class Exercise6
