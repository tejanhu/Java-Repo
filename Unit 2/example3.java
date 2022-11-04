//missing library io

import javax.swing.*;


public class example3{
    
    public static void main(String[] args){
        
        average();
        
        System.exit(0);
        
    }
    
    public static void average(){
        
        int num1; //do not need to initialise variables before trying to use in an input dialog
        int num2;//do not need to initialise variables before trying to use in an input dialog
        int num3;//do not need to initialise variables before trying to use in an input dialog
        
        float average=0.0f;
        
        num1=(Integer.parseInt(JOptionPane.showInputDialog("?"))); //remember when parsing an integer from a string, it is Integer.parseInt() NOT Integer.parseInteger
        num2=(Integer.parseInt(JOptionPane.showInputDialog("?"))); //remember when parsing an integer from a string, it is Integer.parseInt() NOT Integer.parseInteger
        num3=(Integer.parseInt(JOptionPane.showInputDialog("?"))); //remember when parsing an integer from a string, it is Integer.parseInt() NOT Integer.parseInteger
        
        int sum; //do not need to initialise variable
        sum=num1+num2+num3; 
        
        
                average=(sum)/3.0f; //must place an 'f' at the end of a float number to allow the program to distinguish it from a double
        
        JOptionPane.showMessageDialog(null,"The average of these numbers is: "+ average); //must initialise variable before using it to calculate
        
                        //should be above message dialog as shown above
        
                        //average=(sum)/3.0f; //must place an 'f' at the end of a float number to allow the program to distinguish it from a double

        
        
        /*
       *************PROBLEM******************
          - Unsuccessful when trying to calculate average of numbers
           Reason:
           Because the average calculation was below the message dialog when it should have been above it.
       *****************
       
       */
        
    }
    
    
    
    
    
    
    
    
    
    
    
    
}
