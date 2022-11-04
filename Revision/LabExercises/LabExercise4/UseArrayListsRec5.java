import java.util.*;

class UseArrayListsRec5 
// Demonstrates a method which returns the largest integer in an array.
// Uses binary recursion.
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
  if(a.size()==1)
     return a.get(0);
  else
     {
      int mid=(a.size()+1)/2;
      int biggest1=biggest(a.subList(0,mid));
      int biggest2=biggest(a.subList(mid,a.size()));
      if(biggest1>biggest2)
         return biggest1;
      else
         return biggest2;
     }
 }

}
