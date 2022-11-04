import javax.swing.*;

public class exercise
{
    
      
    
    public static void main(String [] param)
    {
        
      test();
        
       
    }
    
    
    
    public static int test(){
        String numero_un= JOptionPane.showInputDialog("1st number?");
        int num1=Integer.parseInt(numero_un);
        String numero_deux= JOptionPane.showInputDialog("2nd number?");
        int num2=Integer.parseInt(numero_deux);
        
        int nombre= (num1+num2)/2;
        
         System.out.println(nombre);
        
          System.exit(0);       
         
        return nombre;
    }
  
}
