
import java.util.*;

public class Exercise6
{
    
    public DrinksMachine getReference(DrinksMachine dm1, DrinksMachine dm2) {
        
        Scanner input = new Scanner(System.in);
        int amount=0;
        System.out.println("How much money do you have?");
      
        amount=input.nextInt();
        
        Can cokeCan=new Can("Coke");
        int cashmoney=0;
        if(amount>=dm1.getPrice()){
            
           
            
            cokeCan=dm1.pressCoke();
            
        }
        
        else if(amount>=dm2.getPrice()){
            cokeCan=dm2.pressCoke();
        }     
            if(dm1.getBalance()>dm2.getBalance()){
                System.out.println("dm1");
                return dm1;
            }
            
            else{
                                System.out.println("dm2");
                return dm2;
            }
            
        }
        
    

        
    
    
    public static void main(String [] main)
    {
       DrinksMachine dm1= new DrinksMachine(50, 10, 10);
       DrinksMachine dm2= new DrinksMachine(80, 10, 10);
        
     Exercise6 obj= new Exercise6();  
     
     System.out.println(obj.getReference(dm1, dm2));
     //System.out.println(richMach);
    }
}
