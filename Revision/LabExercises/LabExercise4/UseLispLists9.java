import java.util.Scanner;

class UseLispLists9
{

 public static void main(String[] args) 
 {
  Scanner in = new Scanner(System.in);
  LispList<Integer> ls1,ls2,ls3;
  System.out.print("Enter a list (of integers): ");
  String str = in.nextLine();
  ls1 = parseIntLispList(str);
  System.out.print("The list you entered is: ");
  System.out.println(ls1);
  System.out.print("Enter another list (of integers): ");
  str = in.nextLine();
  ls2 = parseIntLispList(str);
  System.out.print("The list you entered is: ");
  System.out.println(ls2);
  ls3 = append(ls1,ls2);
  System.out.println("Appending the two lists gives: "+ls3);
 }

 public static <T> LispList<T> append(LispList<T> ls1,LispList<T> ls2)
 // Join ls1 to ls2 (implemented using iteration)
 {
  LispList<T> ls3 = LispList.empty();
  for(;!ls1.isEmpty(); ls1=ls1.tail())
     {
      T h = ls1.head();
      ls3 = ls3.cons(h);
     }
  for(;!ls3.isEmpty(); ls3=ls3.tail())
     {
      T h = ls3.head();
      ls2 = ls2.cons(h);
     }
  return ls2;
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

}
