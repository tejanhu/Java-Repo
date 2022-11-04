import java.util.*;

class UseArrayListsRec1
// Demonstrates a method which returns the largest integer in an ArrayList of
// integers. This method shows the use of tail recursion where the algorithm
// would normally be implemented using iteration.
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
  return biggest(a,a.get(0),1);
 }

 private static int biggest(ArrayList<Integer> a,int biggestSoFar,int i)
 {
  if(i<a.size())
     {
      int n = a.get(i);
      if(n>biggestSoFar)
         return biggest(a,n,i+1);
      else
         return biggest(a,biggestSoFar,i+1);
     }
  else
     return biggestSoFar;
 }

}
