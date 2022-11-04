import java.util.*;

public class Replica 
{
 public static void main(String[] args)
 {
  DrinksMachineB machine = new DrinksMachineB(80,30,10);
  System.out.println("I insert 280p into the drinks machine");
  machine.insert(280);
  System.out.println("I press the button labelled \"Coke\"");
 Scanner check= new Scanner(System.in);
 String input= "";
 
 int rounds=0;
 
 
   Can myCoke;
       myCoke = machine.pressCoke();
       
  int myChange = machine.pressChange();
  System.out.println("I have "+myCoke+" and "+myChange+"p");
  
 while(!machine.cokesEmpty()){
       System.out.println("Do you wish to press the button?");
       input=check.next();
       if(input.equalsIgnoreCase("yes")){
         
           machine.pressCoke();
           rounds++;
                                
    }
   
        
  
      
       
 }

 System.out.println("I have "+myCoke+" and"+ rounds+ "of cans");
 



        
    }
     
}
