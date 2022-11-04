import java.util.*;
public class Ex3
{
   

    
    public static void exercise3(DrinksMachine dm){
        Can coke;
        System.out.println("I will now insert" + " n"+" p into the drinks machine");
        System.out.println("    ");
        System.out.println("Enter how much money you wish to insert into the DrinksMachine.");
        Scanner scan= new Scanner(System.in);
        int n=scan.nextInt(); 
        dm.insert(n);
        int count=0;
        while(!dm.cokesEmpty()&dm.getPrice()<=n){
            coke=dm.pressCoke();
            count=count+1;
            
        }
        //System.out.println("here I am: " +count);
        
       int change= dm.pressChange();
        if(count==1){
            System.out.println("I have " + change +"p" + " and " + count+ " can of Coke");
            
        }
        else
        {
            System.out.println("I have " + change +"p" + " and " + count+ " cans of Coke ");
          
        }
      
        
    }

    public static void main(String[]args)
    {
         
         DrinksMachine dm= new DrinksMachine(80,3,10);
         
         
         exercise3(dm);
         
        
    }
}
 