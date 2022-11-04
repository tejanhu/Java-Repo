import java.util.Scanner;

class SortLispListScrabble
{

 public static void main(String[] args)
 {
  Scanner in = new Scanner(System.in);
  LispList<ScrabbleWord> ls1,ls2;
  System.out.print("Enter a list (of words): ");
  String str = in.nextLine();
  ls1 = parseScrabbleLispList(str);
  System.out.println("The list you entered (with Scrabble scores) is: ");
  System.out.println(ls1);
  ls2 = QuickSortLispLists.sort(ls1);
  System.out.println("The list sorted is: ");
  System.out.println(ls2);
 }

 public static LispList<ScrabbleWord> parseScrabbleLispList(String str)
 {
  String line = str.trim();
  String contents = line.substring(1,line.length()-1).trim();
  if(contents.length()==0)
     return LispList.empty();
  String[] words = contents.split(",");
  LispList<ScrabbleWord> list = LispList.empty();
  for(int i=words.length-1; i>=0; i--)
      list = list.cons(new ScrabbleWord(words[i]));
  return list;
 }

}
