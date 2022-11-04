
import java.util.*;

public class Ex6
{
    
    public DrinksMachine getReference(DrinksMachine dm1, DrinksMachine dm2) {
        
        Scanner input = new Scanner(System.in);
        int amount=0;
        System.out.println("How much money do you have?");
        try{
        amount=input.nextInt();
        
        Can cokeCan=new Can("Coke");
        int cashmoney=0;
        if(amount>=dm1.getPrice()){
            
          
            
            cokeCan=dm1.pressCoke();
            
        }//END if
        else if(amount>=dm2.getPrice()){
            cokeCan=dm2.pressCoke();
        }//END elseif
        
            if(dm1.getBalance()>dm2.getBalance()){
                
                return dm1;
            }//END if2
            
            else{
                
                return dm2;
            }//END else1
         else if(amount<dm1.getPrice()&&amount<dm2.getPrice()){
            throw new NotEnoughChangeException();
            //System.out.println("You cannot buy a coke Can and that's FINAL!");
        }  
        
         }//END try  
        
    }
    catch(NotEnoughChangeException e){
        
        System.out.println("Sorry fella. Not enough change! Better luck next time.");
    }
        
    }
    
    public static void main(String [] main)
    {
       DrinksMachine dm1= new DrinksMachine(50, 10, 10);
       DrinksMachine dm2= new DrinksMachine(80, 10, 10);
        
       Exercise6 obj= new Exercise6();  
     
     DrinksMachine richMach=obj.getReference(dm1, dm2);
       
    }
}
