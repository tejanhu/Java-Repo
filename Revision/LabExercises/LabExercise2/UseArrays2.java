import java.util.*;

class UseArrays2
// Demonstrates testing whether a string is in an array of strings
{
 public static void main(String[] args) 
 {
  Scanner input = new Scanner(System.in);
  System.out.println("Enter some words (all on one line):");
  String line = input.nextLine();
  String[] a = line.split(" +");
  System.out.println("The words are stored in an array");
  System.out.print("Enter a word: ");
  String str = input.next();
  if(isIn(a,str))
     System.out.println("The word \""+str+"\" is in the array");
  else
     System.out.println("The word \""+str+"\" is not in the array");
 }

 public static boolean isIn(String[] a,String str)
 {
  for(int i=0; i<a.length; i++)
     {
      if(a[i].equals(str))
         return true;
     }
  return false;
 }
}
