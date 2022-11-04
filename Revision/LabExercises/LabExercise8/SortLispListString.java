import java.util.Scanner;

class SortLispListString
{

 public static void main(String[] args)
 {
  Scanner in = new Scanner(System.in);
  LispList<String> ls1,ls2;
  System.out.print("Enter a list (of words): ");
  String str = in.nextLine();
  ls1 = parseStringLispList(str);
  System.out.print("The list you entered is: ");
  System.out.println(ls1);
  ls2 = QuickSortLispLists.sort(ls1);
  System.out.print("The list sorted is: ");
  System.out.println(ls2);
 }

 public static LispList<String> parseStringLispList(String str)
 {
  String line = str.trim();
  String contents = line.substring(1,line.length()-1).trim();
  if(contents.length()==0)
     return LispList.empty();
  String[] words = contents.split(",");
  LispList<String> list = LispList.empty();
  for(int i=words.length-1; i>=0; i--)
      list = list.cons(words[i]);
  return list;
 }

}
