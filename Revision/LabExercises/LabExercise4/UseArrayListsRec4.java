import java.util.*;

class UseArrayListsRec4
// Demonstrates a method which returns the largest integer in an ArrayList.
// The method is implemented using recursion which reduces the problem size 
// for the recursive call by calling subList.
{
 public static void main(String[] args) throws Exception
 {
  Scanner input = new Scanner(System.in);
  System.out.println("Enter some numbers (all on one line, separated by spaces):");
  String line = input.nextLine();
  String[] numbers = line.split(" +");
  ArrayList<Integer> a = new ArrayList<Integer>();
  for(int i=0; i<numbers.length; i++)
      a.add(new Integer(numbers[i]));
  System.out.println("The numbers are stored in an ArrayList as\n"+a);
  int max = biggest(a);
  System.out.println("The largest integer in the ArrayList is "+max);
 }

 public static int biggest(List<Integer> a)
 {
  int n = a.get(0);
  if(a.size()==1)
     return n;
  else
     {
      int biggestInRest = biggest(a.subList(1,a.size()));
      if(biggestInRest>n)
         return biggestInRest;
      else
         return n;
     }
 }

}
