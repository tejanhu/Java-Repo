import javax.swing.*;

public class exercise2
{
   
    public static void main(String[] args)
    {
        example1();
        
        System.exit(0);
    }
    
    
    public static void example1(){
        
        String entry[]=new String [10];
        String name="";
        
        for(int i=0; i<entry.length; i++){
            
            entry[i] = name;
       
                
            
        }
       
         for(int i=0; i<=10; i++){
              name=JOptionPane.showInputDialog("name?");
              System.out.println("my name is: " + name);
            }
            
            
        }
    
    
}
