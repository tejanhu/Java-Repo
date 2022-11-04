import java.util.*;

class SortScrabble1
{
 public static void main(String[] args) throws Exception
 {
  Scanner input = new Scanner(System.in);
  System.out.println("Enter some words (all on one line):");
  String line = input.nextLine();
  String[] words = line.split(" ");
  ArrayList<ScrabbleWord> a = new ArrayList<ScrabbleWord>();
  for(int i=0; i<words.length; i++)
     a.add(new ScrabbleWord(words[i]));
  SelSort.sort(a);
  System.out.println("The words in order of their Scrabble score are:\n"+a);
 }
}
