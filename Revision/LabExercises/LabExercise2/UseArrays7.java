import java.util.*;

class UseArrays7
// Demonstrates changing all occurrences of an integer in an 
// array of integers to another integer constructively. 
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
  System.out.println("\nThe array is ");
  System.out.println(Arrays.toString(a));
  System.out.println("The array viewed through its alias is ");
  System.out.println(Arrays.toString(b));
  System.out.print("\nEnter two numbers: ");
  int p = input.nextInt(), q=input.nextInt();
  System.out.println("Change "+p+" to "+q+" in the array constructively");
  int[] c=change(a,p,q);
  System.out.println("\nThe array is now");
  System.out.println(Arrays.toString(a));
  System.out.println("The array viewed through its alias is now");
  System.out.println(Arrays.toString(b));
  System.out.println("The array representing the change is");
  System.out.println(Arrays.toString(c));
 }

 public static int[] change(int[] a,int m,int n)
 {
  int[] a1 = new int[a.length];
  for(int i=0; i<a.length; i++)
    if(a[i]==m)
       a1[i]=n;
    else
       a1[i]=a[i];
  return a1;
 }
}
