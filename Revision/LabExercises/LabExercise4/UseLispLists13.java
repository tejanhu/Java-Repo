import java.util.Scanner;

class UseLispLists13
{

 public static void main(String[] args) 
 {
  Scanner in = new Scanner(System.in);
  LispList<Integer> ls1,ls2;
  System.out.print("Enter a list (of integers): ");
  String str = in.nextLine();
  ls1 = parseIntLispList(str);
  System.out.println("The list you entered is: "+ls1);
  ls2 = reverse(ls1);
  System.out.println("The reverse of the list is: "+ls2);
 }

 public static <T> LispList<T> reverse(LispList<T> ls)
 {
  return reverse(ls,LispList.<T>empty());
 }

 public static <T> LispList<T> reverse(LispList<T> ls1, LispList<T> ls2)
 // Reverse list ls1 onto ls2
 {
  while(!ls1.isEmpty())
     {
      ls2=ls2.cons(ls1.head());
      ls1=ls1.tail();
     }
  return ls2;
 }

 public static LispList<Integer> parseIntLispList(String str)
 {
  String line = str.trim();
  String contents = line.substring(1,line.length()-1).trim();
  if(contents.length()==0)
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

}
