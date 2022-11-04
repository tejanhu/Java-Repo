import java.util.*;

public class Ex8
{
    
    public static int numCans(DrinksMachine vendorMach){
        
        //Can myCoke= new Can("Coke");
        
        
        int amount= 0;
        
        Scanner input= new Scanner(System.in);
        System.out.println("Insert money.");
        amount=input.nextInt();
        vendorMach.insert(amount);
        int cansbought=0;
        if(amount>=vendorMach.getPrice()){
        while(!vendorMach.cokesEmpty()){
          vendorMach.pressCoke();
           cansbought=cansbought+1;
        }
//         if(amount<vendorMach.getPrice()){
//             System.out.println("Cannot buy any more Coke");
//             return -1;
//         }
        //buy Coke from Vendor Machine until it is empty, keep a counter of how many cokes you bought
        
         for(int i=0;i>cansbought;i++){
            vendorMach.loadCoke(new Can("Coke"));
        }
        
        //Refill all those cans you bought from the Vendor Machine
        
       
    }
//     else{
//         System.out.println("Cannot buy any Coke");
//         return -1;
//     }
         return cansbought;
        
    }
    
    
    public static void main (String [] args)
    {
       DrinksMachine vendorMach= new DrinksMachine(80, 10, 10);
        
       int amount=numCans(vendorMach);
       System.out.println(amount); 
    }
}
