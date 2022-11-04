import java.util.*;
public class Exercise3
{
   
    
//     public Exercise3()
//     {
//         
//         
//     }
    
    public static void exercise3(DrinksMachine dm){
        Can coke;
        System.out.println("I will now insert" + " n"+" p into the drinks machine");
        System.out.println("    ");
        System.out.println("Enter how much money you wish to insert into the DrinksMachine.");
        Scanner scan= new Scanner(System.in);
        int n=scan.nextInt(); 
        dm.insert(n);
        int i=0;
        if(!dm.cokesEmpty()){
            coke=dm.pressCoke();
            i=i+1;
        }
        
        else
        {
            
        }
        
       int change= dm.pressChange();
       
       System.out.println("I have " + change +"p" + " and " + i+ " cans " + "of" +" Coke");
        
    }

    public static void main(String[]args)
    {
        DrinksMachine dm = new DrinksMachine(80,10,10);
       
        exercise3(dm);
     
         
        
    }
}
 