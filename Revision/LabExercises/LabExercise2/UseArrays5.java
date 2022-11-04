import java.util.*;

class UseArrays5
// Demonstrates finding the position of a string in an array of strings
// Checks from lowest indexed to highest.
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
  int pos = position(a,str);
  if(pos==-1)
     System.out.println("The string \""+str+"\" is not in the array");
  else
     System.out.println("The string \""+str+"\" is in position "+pos+
                        " in the array");
 }

 public static int position(String[] a,String n)
 {
  for(int i=0; i<a.length; i++)
     {
      if(a[i].equals(n))
         return i;
     }
  return -1;
 }
}
