package Assessment2;

 

import java.util.*;

class UseArrays16
// Demonstrates finding the longest string in an array of strings
{
 public static void main(String[] args) 
 {
  Scanner input = new Scanner(System.in);
  System.out.println("Enter some words (all on one line):");
  String line = input.nextLine();
  String[] a = line.split(" +");
  String mostlong = longest(a);
  System.out.println("The longest word is \""+mostlong+"\"");
 }

 static String longest(String[] a)
 {   
  String longestSoFar=a[0];   
  for(int i=1; i<a.length; i++)        
    {         
     if(a[i].length()>longestSoFar.length())
        longestSoFar=a[i];
    }
  return longestSoFar;
 }
}
