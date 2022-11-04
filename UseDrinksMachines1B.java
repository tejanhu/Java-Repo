class UseDrinksMachines1B
{
 public static void main(String[] args)
 {
  DrinksMachineB machine = new DrinksMachineB(80,0,10);
  System.out.println("I insert 50p into the drinks machine");
  machine.insert(80);
  System.out.println("I press the button labelled \"Coke\"");
  try {
       Can myCan;
       myCan = machine.pressCoke();
       System.out.println("I press the button labelled \"change\"");
       int myChange = machine.pressChange();
       System.out.println("I have "+myCan+" and "+myChange+"p");
      }
  catch(EmptyMachineException e)
      {
       System.out.println("The machine is empty");
       System.out.println("I press the button labelled \"change\"");
       int myChange = machine.pressChange();
       System.out.println("I have "+myChange+"p");
      }
  catch(NotEnoughMoneyException e)
      {
       System.out.println("I did not put enough money in");
       System.out.println("I needed another "+e.getMessage()+"p");
       System.out.println("I press the button labelled \"change\"");
       int myChange = machine.pressChange();
       System.out.println("I have "+myChange+"p");
      }
  System.out.println("I have finished");
  
  
 }
}
