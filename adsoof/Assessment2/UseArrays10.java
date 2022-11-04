package Assessment2;

 

import java.util.*;

class UseArrays10
// Demonstrates a method which removes a given item from an array
// (only one occurrence removed)
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
  System.out.print("\nEnter a number: ");
  int m = input.nextInt();
  int[] b = remove(a,m);
  System.out.println("The array obtained by removing "+m+" is");
  System.out.println(Arrays.toString(b));
  System.out.println("The original array is still");
  System.out.println(Arrays.toString(a));
 }

 public static int[] remove(int[] a, int n)
 // Returns a new array which is the result of removing the 
 // lowest indexed occurrence of integer n from array a, moving 
 // all subsequent integers down one place in the array.  
 // Returns a copy of array a if n does not occur in it.
 {
  int i=0;
  for(; i<a.length; i++)
     if(a[i]==n)
        break;
  if(i<a.length)
     {
      // This is the case where i gives the position of integer n in array a
      int[] b = new int[a.length-1];
      for(int j=0; j<i; j++)
         b[j]=a[j];
      for(int j=i+1; j<a.length; j++)
         b[j-1]=a[j];
      return b;
     }
  else
     {
      // This is the case where integer n does not occur in array a
      int[] b = new int[a.length];
      for(i=0; i<a.length; i++)
         b[i]=a[i];
      return b;
     }
 }

}
