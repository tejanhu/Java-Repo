package Assessment2;

import java.util.*;

class UseArrays8
// Demonstrates adding an integer to the end of an array of integers 
// (can only be done constructively) 
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
  System.out.println("\nThe array is ");
  System.out.println(Arrays.toString(a));
  System.out.print("\nEnter a number: ");
  int p = input.nextInt();
  int[] b = add(a,p);
  System.out.println("\nAdding the number to the end of the array gives ");
  System.out.println(Arrays.toString(b));
  System.out.println("The original array is still ");
  System.out.println(Arrays.toString(a));
 }

 public static int[] add(int[] a,int n)
 {
  int[] b = new int[a.length+1];
  for(int i=0; i<a.length; i++)
     b[i]=a[i];
  b[a.length]=n;
  return b;
 }

}
