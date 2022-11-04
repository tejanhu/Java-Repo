import java.util.*;

class SortStrings1
{
 public static void main(String[] args) throws Exception
 {
  Scanner input = new Scanner(System.in);
  System.out.println("Enter some words (all on one line):");
  String line = input.nextLine();
  String[] words = line.split(" ");
  ArrayList<String> a = new ArrayList<String>();
  for(int i=0; i<words.length; i++)
     a.add(words[i]);
  SelSort.sort(a);
  System.out.println("The words sorted are: "+a);
 }
}
