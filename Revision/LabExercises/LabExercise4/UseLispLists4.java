import java.util.Scanner;

class UseLispLists4
{

 public static void main(String[] args) 
 {
  Scanner in = new Scanner(System.in);
  System.out.print("Enter a list of integers: ");
  String str = in.nextLine();
  LispList<Integer> lsi = parseIntLispList(str);
  System.out.print("The list you entered is: ");
  System.out.println(lsi);
  System.out.print("Enter an integer: ");
  int n = in.nextInt();
  int pos = indexOf(lsi,n);
  if(pos==-1)
     System.out.println("The integer "+n+" is not in the list");
  else
     System.out.println("The integer "+n+" is in position "+pos+" in the list");
  System.out.print("Enter a list of words: ");
  str = in.nextLine();
  str = in.nextLine();
  LispList<String> lss = parseStringLispList(str);
  System.out.print("The list you entered is: ");
  System.out.println(lss);
  System.out.print("Enter a word: ");
  String word = in.next();
  pos = indexOf(lss,word);
  if(pos==-1)
     System.out.println("The word "+word+" is not in the list");
  else
     System.out.println("The word "+word+" is in position "+pos+" in the list");
 }

 public static LispList<Integer> parseIntLispList(String str)
 {
  String line = str.trim();
  String contents = line.substring(1,line.length()-1).trim();
  if(contents.length()==0||line.charAt(0)!='['||line.charAt(line.length()-1)!=']')
     return LispList.empty();
  String[] nums = contents.split(",");
  LispList<Integer> list = LispList.empty();
  for(int i=nums.length-1; i>=0; i--)
      {
       String num = nums[i].trim();
       list = list.cons(Integer.parseInt(num));
      }
  return list;
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
      {
       String word = words[i].trim();
       list = list.cons(word);
      }
  return list;
 }

 public static <T> int indexOf(LispList<T> ls,T item)
 {
  int pos=0;
  for(; !ls.isEmpty()&&!ls.head().equals(item); ls=ls.tail(),pos++) {}
  if(ls.isEmpty())
     return -1;
  else
     return pos;
 }

}
