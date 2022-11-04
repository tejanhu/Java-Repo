
import java.util.*;

public class Ex9
{
    
//     public String toString(){
//         
//         return this + "";
//         
//     }
    
    
    public  int exercise9(){
        DrinksMachine vm= new DrinksMachine(80, 10, 10);
        
        Scanner input = new Scanner(System.in);
        System.out.println("How many cans would you like to buy?");
        int numdrinks=input.nextInt();
        
        System.out.println("Do you want Coke or Fanta?");
        String chosen=input.next();
        
        int cashdrinksmach=0;
        
        for(int i=0;i<numdrinks;i++){
            if(chosen.equalsIgnoreCase("Coke")){
            if(!vm.cokesEmpty()){
                vm.pressCoke();
               
            }
            int change= vm.pressChange();
            if(change<vm.getPrice()){
                System.out.println("Coke is out of stock!");
            }
        }
        else if(chosen.equalsIgnoreCase("Fanta")){
            if(!vm.fantasEmpty()){
                vm.pressFanta();
               
            }
              int change= vm.pressChange();
             if(change<vm.getPrice()){
                System.out.println("Fanta is out of stock!");
            }
            
        }
        }
         cashdrinksmach=vm.collectCash();
         return cashdrinksmach;
    }
    
    
    public static void main(String[] args)
    {
      
        Ex9 obj= new Ex9();
        
        obj.exercise9();
        
        System.out.println(obj);
    }
}
