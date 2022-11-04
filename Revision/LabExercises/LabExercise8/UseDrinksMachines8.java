import java.util.*;

class UseDrinksMachines8
{
 public static void main(String[] args)
 {
  Scanner input = new Scanner(System.in);
  ArrayList<DrinksMachine> a = new ArrayList<DrinksMachine>();
  int p;
  char ch;
  String str;
  do {
      System.out.print("Enter the name of a machine: ");
      str = input.next();
      System.out.print("Enter the price of drinks from "+str+": ");
      p = input.nextInt();
      a.add(new DrinksMachine(str,p));
      System.out.print("Do you want to enter more machines? (y/n) ");
      str = input.next();
      ch = str.charAt(0);
      do {
          if(ch!='y'&&ch!='Y'&&ch!='n'&&ch!='N')
             {
              System.out.print("Please enter y(es) or n(o): ");
              str = input.next();
              ch = str.charAt(0);
             }
         }
      while(ch!='y'&&ch!='Y'&&ch!='n'&&ch!='N');
     }
  while(ch!='n'&&ch!='N');
  DrinksMachine mach = (DrinksMachine) PricedObjectOps.mostExpensive(a);
  System.out.println("The most expensive machine is "+mach.getIdentity());
 }

}
