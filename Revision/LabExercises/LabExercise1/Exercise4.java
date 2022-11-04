import java.util.*;
public class Exercise4
{
    
    public static void main (String[]args)
    {
        Can mycan= new Can("Coke");
        int price=0;
        Scanner input = new Scanner(System.in);
        System.out.println("The price of a Coke can");
        price=input.nextInt();
        DrinksMachine vendorMachine= new DrinksMachine(price, 10, 10);
        
        int pocketmoney=0;
        System.out.println("How much do you have?");
        pocketmoney=input.nextInt();
        vendorMachine.insert(pocketmoney);
        
        int amount=0;
        
       
        mycan=vendorMachine.pressCoke();
        amount=amount+1;
    
        System.out.println("I have " + vendorMachine.pressChange() + " and " + amount + " cans.");
        System.out.println("I drink the can.");
        mycan.drink();
        if(!mycan.isFull()){
         amount=amount-1;
        }
        System.out.println("I now have " + amount + " cans.");
         
        
        
    }
}
