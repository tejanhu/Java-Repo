import java.util.*;

class UseArrays9
// Demonstrates a method which removes the last item from an array
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
  int[] b = remove(a);
  System.out.println("The array obtained by removing the last item is");
  System.out.println(Arrays.toString(b));
  System.out.println("The original array is still");
  System.out.println(Arrays.toString(a));
 }

public static int[] remove(int[] a)
{
 int[] b = new int[a.length-1];
 for(int i=0; i<a.length-1; i++)
    b[i]=a[i];
 return b;
}

}
