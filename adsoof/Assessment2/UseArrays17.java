package Assessment2;

 

import java.util.*;

class UseArrays17
// Demonstrates a method which returns the largest integer in an array.
// This method shows the use of tail recursion where normally the algorithm
// would be implemented using iteration.
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
  return biggest(a,a[0],1);
 }

 private static int biggest(int[] a,int biggestSoFar,int i)
 {
  if(i<a.length)
     if(a[i]>biggestSoFar)
        return biggest(a,a[i],i+1);
     else
        return biggest(a,biggestSoFar,i+1);
  else
     return biggestSoFar;
 }

}
