import java.util.*;

class Exercise5a
{
// Front end code for the problem set as Exercise 5
// Randomly generates numbers to test solutions on large amounts of data 

 public static void main(String[] args)
 {
  int[] array;
  int n,max,highSum;
  long seed,time1,time2;
  Scanner input = new Scanner(System.in);
  System.out.print("Enter a seed: ");
  seed = input.nextInt();
  Random rand = new Random(seed);
  System.out.print("Enter the number of integers in the list: ");
  n = input.nextInt();
  array = new int[n];
  System.out.print("Enter highest integer value: ");
  max = input.nextInt();
  for(int i=0; i<n; i++)
     array[i] = (rand.nextInt()%max);
  time1 = new Date().getTime();
  highSum = highestSum(array);
  time2 = new Date().getTime();
  System.out.println("The highest sum of a sublist of the numbers is: "+highSum);
  System.out.println("Time taken to find it: "+(time2-time1)+"ms");
 }

 public static int highestSum(int[] a)
 {

  // ... To be filled in ... 

 }

}
