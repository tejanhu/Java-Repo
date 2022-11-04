import javax.swing.*;
class QSb{
    
    
    public static void main(String [] param)
    {
        String temptext;
        int temp;
        
       temptext=JOptionPane.showInputDialog("Give me a temperature in F: ");
        temp=Integer.parseInt(temptext);
               
            
        int newtemp=0;
        int f=temp;
        
        newtemp=(f-32)*5/9;
           
    System.out.println("That is " + newtemp + "C");
    
     System.exit(0);
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}