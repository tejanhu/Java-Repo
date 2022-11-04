import java.util.Scanner;

class UseDrinksMachines7
{
 public static void main(String[] args)
 {
  Scanner input = new Scanner(System.in);
  System.out.print("Enter an identifier for a drinks machine: ");
  String id = input.next();
  System.out.print("Enter its price: ");
  int p = input.nextInt();
  DrinksMachine mach1 = new DrinksMachine(id,p);
  System.out.print("Enter an identifier for another drinks machine: ");
  id = input.next();
  System.out.print("Enter its price: ");
  p = input.nextInt();
  DrinksMachine mach2 = new DrinksMachine(id,p);
  DrinksMachine mach3 = (DrinksMachine) PricedObjectOps.cheaper(mach1,mach2);
  System.out.println("The cheaper machine is "+mach3.getIdentity());
 }

}
