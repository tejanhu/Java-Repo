package Assessment2;

import java.util.*;

class UseArrays6
// Demonstrates changing all occurrences of an integer in an 
// array of integers to another integer destructively, 
// showing difference between aliasing and copying
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
  int[] b=a;
  int[] c=copy(a);
  System.out.println("\nThe array is ");
  System.out.println(Arrays.toString(a));
  System.out.println("The array viewed through its alias is ");
  System.out.println(Arrays.toString(b));
  System.out.println("The copy of the array is ");
  System.out.println(Arrays.toString(c));
  System.out.print("\nEnter two numbers: ");
  int p = input.nextInt(), q=input.nextInt();
  System.out.println("Change "+p+" to "+q+" in the array");
  change(a,p,q);
  System.out.println("\nThe array is now");
  System.out.println(Arrays.toString(a));
  System.out.println("The array viewed through its alias is now");
  System.out.println(Arrays.toString(b));
  System.out.println("The copy of the array is now");
  System.out.println(Arrays.toString(c));
 }

 public static int[] copy(int[] a)
 {
  int[] b = new int[a.length];
  for(int i=0; i<a.length; i++)
     b[i]=a[i];
  return b;
 }

 public static void change(int[] a,int m,int n)
 {
  for(int i=0; i<a.length; i++)
    if(a[i]==m)
       a[i]=n;
 }
}
