import java.util.*;

class UseArrays11
// Demonstrates a method which removes a given item from an array
// (all occurrences removed)
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
  int[] b = removeAll(a,m);
  System.out.println("The array obtained by removing "+m+" is");
  System.out.println(Arrays.toString(b));
  System.out.println("The original array is still");
  System.out.println(Arrays.toString(a));
 }

 public static int[] removeAll(int[] a,int n)
 // Returns the array resulting from removing all occurrences of
 // integer n from array a, keeping the remaining contents of the
 // array in the same order.
 {
  int count=0;
  for(int i=0; i<a.length; i++)
     if(a[i]==n)
        count++;
  // Here count gives the number of times n occurs in a
  int[] b = new int[a.length-count];
  for(int i=0, j=0; i<a.length; i++)
     if(a[i]!=n)
        {
         b[j]=a[i];
         j++;
        }
  return b;
 }
}
