package Assessment2;

 

import java.util.*;

class UseArrays18
// Demonstrates a method which returns the largest integer in an array.
// The method is implemented using recursion which is not tail recursion.
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
  return biggest(a,0);
 }

 private static int biggest(int[] a,int from)
 {
  if(from==a.length-1)
     return a[from];
  else
     {
      int biggestOfRest = biggest(a,from+1);
      if(a[from]>biggestOfRest)
          return a[from];
      else
          return biggestOfRest;
     }
 }

}
