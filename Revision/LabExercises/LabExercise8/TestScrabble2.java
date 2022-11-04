import java.util.*;

class TestScrabble2
{
 public static void main(String[] args)
 {
  Scanner input = new Scanner(System.in);
  System.out.print("Enter some words: ");
  String line = input.nextLine();
  String[] words = line.split(" ");
  ArrayList<ScrabbleWord> a = new ArrayList<ScrabbleWord>();
  for(int i=0; i<words.length; i++)
     a.add(new ScrabbleWord(words[i]));
  ScrabbleWord highest = (ScrabbleWord) PricedObjectOps.mostExpensive(a);
  System.out.println("The word with highest Scrabble score \""+highest+"\"");
 }
}
