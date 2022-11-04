
public class Exercise5
{
   
    
    public static void checkWhichCantoDrink(DrinksMachine dm, Can can1, Can can2){
        dm.insert(160);
        //Inserted £1.60 into DM
        can1=dm.pressCoke();
        can2=dm.pressCoke();
       
        if(can1.isFull()){
            
            can1.drink();
            
        }
        
        else if(can2.isFull())
        {
            
            can2.drink();
        }
        
    }
    
    
    public static void main(String main[])
    {
       Can can1= new Can("Coke");
       Can can2= new Can("Coke");
       
       DrinksMachine dm= new DrinksMachine(80,2,10);
        
       checkWhichCantoDrink(dm, can1, can2);
    }
}
