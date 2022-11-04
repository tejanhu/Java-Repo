import javax.swing.*;

public class errorsfound
{
   
    public static void main(String[] args)
    {
        rectangle();
        System.exit(0);
    
    }  //missing end curly brace of main method
       
        
    public static void rectangle(){ //missing right parentheses bracket and ending curly brace
       
         int length =0;; //length needs to be initialised
         int width=0; //width needs to be initialised
         
         //input dialog missing for both length and width
            length=(Integer.parseInt(JOptionPane.showInputDialog("length?")));    
            width=(Integer.parseInt(JOptionPane.showInputDialog("width?"))); //missing symbol to terminate *semicolon*

         
         int area=0;
         area=length*width; //variable length and width nowhere to be seen in the program except the expression 
         JOptionPane.showMessageDialog(null, area+"cm");
        
        
    
        }
    
    
    
    
    
    
    
    
    
    
    
}
