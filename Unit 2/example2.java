import javax.swing.*;

public class example2
{
   
    public static void main(String[] args)
    {
        rectangle();
        System.exit(0);
    }
    
    public static void rectangle(){
       
         int length;
         int width;
         
                
         length=(Integer.parseInt(JOptionPane.showInputDialog("length?")));
         width=(Integer.parseInt(JOptionPane.showInputDialog("width?")));
         
         int area=0;
         area=length*width;
         JOptionPane.showMessageDialog(null, area+"cm");
        
        
    }
    
    
    
    
    
    
    
    
    
    
    
    
}
