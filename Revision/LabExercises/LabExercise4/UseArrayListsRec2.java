import java.util.*;

class UseArrayListsRec2
// Demonstrates a method which returns the largest integer in an ArrayList of
// integers, using iteration to find it. 
// Tail recursion is used to take the numbers from a representation as an
// array of Strings and add them to the ArrayList.
{
 public static void main(String[] args) throws Exception
 {
  Scanner input = new Scanner(System.in);
  System.out.println("Enter some numbers (all on one line, separated by spaces):");
  String line = input.nextLine();
  String[] numbers = line.split(" +");
  ArrayList<Integer> a = new ArrayList<Integer>();
  addAll(numbers,a);
  System.out.println("The numbers are stored in an ArrayList as\n"+a);
  int max = biggest(a);
  System.out.println("The largest integer in the ArrayList is "+max);
 }

 public static void addAll(String[] nums,ArrayList<Integer> a)
 {
  addAll(0,nums,a);
 }

 private static void addAll(int i,String[] nums,ArrayList<Integer> a)
 {
  if(i<nums.length)
     {
      a.add(new Integer(nums[i]));
      addAll(i+1,nums,a);
     }
 }

 public static int biggest(ArrayList<Integer> a)
 {
  int biggest = a.get(0);
  for(int i=1; i<a.size(); i++)
     {
      int n = a.get(i);
      if(n>biggest)
         biggest=n;
     }
  return biggest;
 }

}
