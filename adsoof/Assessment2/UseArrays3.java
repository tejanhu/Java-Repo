package Assessment2;

import java.util.*;

class UseArrays3
// Demonstrates finding the position of an integer in an array of integers
// Checks from lowest indexed to highest.
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
  System.out.print("Enter a number: ");
  int n = input.nextInt();
  int pos = position(a,n);
  if(pos==-1)
     System.out.println("The number "+n+" is not in the array");
  else
     System.out.println("The number "+n+" is in position "+pos+
                        " in the array");
 }

 public static int position(int[] a,int n)
 {
  for(int i=0; i<a.length; i++)
     {
      if(a[i]==n)
         return i;
     }
  return -1;
 }
}
