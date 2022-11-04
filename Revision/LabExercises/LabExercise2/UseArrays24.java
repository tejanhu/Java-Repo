import java.util.*;

class UseArrays24
// Demonstrates a method which returns the largest integer in an array.
// Uses binary recursion inefficiently due to duplication,
// and counts the numbers of comparisons.
{

 static int count=0; 

 public static void main(String[] args) 
 {
  Scanner input = new Scanner(System.in);
  System.out.println("Enter some numbers (all on one line, separated by spaces):");
  String line = input.nextLine();
  String[] numbers = line.split(" +");
  int[] a = new int[numbers.length];
  for(int i=0; i<a.length; i++)
      a[i]=Integer.parseInt(numbers[i]);
  System.out.println("The numbers are stored in an array");
  System.out.println("The array is");
  System.out.println(Arrays.toString(a));
  count=0;
  int max = biggest(a);
  System.out.println("The largest integer in the array is "+max);
  System.out.println("The number of comparisons made was "+count);
 }

 public static int biggest(int[] a)
 {
  return biggest(a,0,a.length);
 }

 private static int biggest(int[] a,int from,int to)
 {
  if(to==from+1)
     return a[from];
  else if(to==from+2)
     {
      count++;
      if(a[from]>a[from+1])
         return a[from];
      else
         return a[from+1];
     }
  else
     {
      int mid=(from+to+1)/2;
      count++;
      if(biggest(a,from,mid)>biggest(a,mid,to))
         return biggest(a,from,mid);
      else
         return biggest(a,mid,to);
     }
 }

}
