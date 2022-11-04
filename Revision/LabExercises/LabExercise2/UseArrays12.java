import java.util.*;

class UseArrays12
// Demonstrates a method which removes the item from a 
// given position an an array
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
  System.out.print("\nEnter an array position: ");
  int p = input.nextInt();
  int[] b = removePos(a,p);
  System.out.println("The array obtained by removing the item"+
                     " at position "+p+" is");
  System.out.println(Arrays.toString(b));
  System.out.println("The original array is still");
  System.out.println(Arrays.toString(a));
 }

 public static int[] removePos(int[] a,int pos)
// Returns the array resulting from removing the integer
// indexed by pos from the array a, moving all subsequent
// integers down one place.
// Throws an ArrayIndexOutOfBoundsException if pos is less than 0
// or if pos is equal to or greater than a.length
{
 int[] b = new int [a.length-1];
 for(int i=0; i<pos; i++)
    b[i]=a[i];
 for(int i=pos+1; i<a.length; i++)
    b[i-1]=a[i];
 return b;
}

}
