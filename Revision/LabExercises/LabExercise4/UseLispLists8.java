import java.util.Scanner;

class UseLispLists8
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
 // Join ls1 to ls2 (implemented using recursion)
 {
  if(ls1.isEmpty())
     return ls2;
  else
     {
      T h = ls1.head();
      LispList<T> ls3 = append(ls1.tail(),ls2);
      return ls3.cons(h);
     }
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
