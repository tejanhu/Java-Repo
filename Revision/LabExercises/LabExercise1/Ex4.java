
public class Ex4
{
    
    public static void partyTime(DrinksMachine dm){
        
         
        
        Can myDrink=new Can("Coke");
        dm.insert(80);
        
        
            
        myDrink=dm.pressCoke();
            
        
       if(myDrink.isFull()){
           
           System.out.println("Coke cans are filled.");
        }
        myDrink.drink();
        
        if(!myDrink.isFull()){
           
           System.out.println("You drank all the Coke cans, so they're empty.");
        }
    }//END partyTime
    
    
    public static void main(String main[])
    {
       DrinksMachine dm= new DrinksMachine(80,3,10);
       
       partyTime(dm);
        
    }
}
