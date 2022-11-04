import java.util.*;

class Exercise5
{
// Front end code for the problem set as Exercise 5

 public static void main(String[] args)
 {
  Scanner input = new Scanner(System.in);
  System.out.println("Enter some numbers (all on one line, separated by commas):");
  String line = input.nextLine();
  String[] numbers = line.split(",");
  int[] array = new int[numbers.length];
  for(int i=0; i<array.length; i++)
      array[i]=Integer.parseInt(numbers[i].trim());
  int highSum = highestSum(array);
  System.out.println("The highest sum of a sublist of the numbers is: "+highSum);
 }

 public static int highestSum(int[] a)
 {

  // ... To be filled in ... 

 }

}
