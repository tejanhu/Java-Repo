import java.util.*;

class SortIntegers2
{
 public static void main(String[] args) throws Exception
 {
  Scanner input = new Scanner(System.in);
  System.out.println("Enter some integers (all on one line):");
  String line = input.nextLine();
  String[] words = line.split(" ");
  ArrayList<Integer> a = new ArrayList<Integer>();
  for(int i=0; i<words.length; i++)
     a.add(Integer.parseInt(words[i]));
  QuickSort.sort(a);
  System.out.println("Sorting the integers gives:\n"+a);
 }
}
