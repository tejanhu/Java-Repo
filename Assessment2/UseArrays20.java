package Assessment2;

 

import java.util.*;

class UseArrays20
// Demonstrates a method which returns the largest integer in an array.
// Uses binary recursion, and demonstrates the conditional operator.
{
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
  int max = biggest(a);
  System.out.println("The largest integer in the array is "+max);
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
     return a[from]>a[from+1] ? a[from] : a[from+1];
  else
     {
      int mid=(from+to+1)/2;
      int biggest1=biggest(a,from,mid);
      int biggest2=biggest(a,mid,to);
      return biggest1>biggest2 ? biggest1 : biggest2;
     }
 }

}
