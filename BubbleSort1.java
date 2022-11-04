import java.util.*;

class BubbleSort1
// Bubble sort on a given array of integers
{
 public static void main(String[] args) throws Exception
 {
  Scanner input = new Scanner(System.in);
  System.out.println("Enter some numbers (all on one line):");
  String line = input.nextLine();
  String[] numbers = line.split(" +");
  Integer[] a = new Integer[numbers.length];
  for(int i=0; i<a.length; i++)
      a[i]=new Integer(numbers[i]);
  System.out.println("The numbers are stored in an array as:");
  System.out.println(Arrays.toString(a));
  sort(a);
  System.out.println("After sorting the array is:");
  System.out.println(Arrays.toString(a));
 }

 public static void sort(Integer[] a)
 {
  for(int i=0; i<a.length-1; i++)
     for(int j=0; j<a.length-1-i; j++)
       if(a[j+1].compareTo(a[j])<0)
          swap(a,j,j+1);
 }
 
 private static void swap(Integer[] a,int pos1,int pos2)
 {
  Integer temp = a[pos1];
  a[pos1]=a[pos2];
  a[pos2]=temp;
 }

}
