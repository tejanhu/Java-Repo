import java.util.Scanner;

class TestScrabble1
{
 public static void main(String[] args)
 {
  Scanner input = new Scanner(System.in);
  System.out.print("Enter a word: ");
  ScrabbleWord1 word1 = new ScrabbleWord1(input.next());
  System.out.print("Enter another word: ");
  ScrabbleWord1 word2 = new ScrabbleWord1(input.next());
  if(PricedObjectOps1.samePrice(word1,word2))
     System.out.println("They have equal Scrabble scores");
  else
     {
      ScrabbleWord1 word3 = (ScrabbleWord1) PricedObjectOps.cheaper(word1,word2);
      System.out.println("The word with lower Scrabble score is \""+word3+"\"");
     }
 }
}
