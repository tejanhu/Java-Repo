import java.util.*;

class UseArrayListsRec3
// Demonstrates a method which returns the largest integer in an ArrayList.
// The method is implemented using recursion which is not tail recursion,
// but treating ArrayLists like arrays.
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

 public static int biggest(ArrayList<Integer> a)
 {
  return biggest(a,0);
 }

 private static int biggest(ArrayList<Integer> a,int from)
 {
  int n=a.get(from);
  if(from==a.size()-1)
     return n;
  else
     {
      int biggestOfRest = biggest(a,from+1);
      if(n>biggestOfRest)
          return n;
      else
          return biggestOfRest;
     }
 }

}
