import java.util.Scanner;

class UseLispLists5
{

 public static void main(String[] args) 
 {
  Scanner in = new Scanner(System.in);
  LispList<Integer> ls;
  System.out.print("Enter a list (of integers): ");
  String str = in.nextLine();
  ls = parseIntLispList(str);
  System.out.print("The list you entered is: ");
  System.out.println(ls);
  System.out.print("Enter two integers: ");
  int m = in.nextInt();
  int n = in.nextInt();
  LispList<Integer> ls1 = change(ls,m,n);
  System.out.println("Changing all occurrences of "+m+" to "+n+
                      " in the list (and reversing) gives:");
  System.out.println(ls1);
 }

 public static <T> LispList<T> change(LispList<T> ls1,T m,T n)
 // Changes all occurrences of m to n in ls1 and reverses it
 {
  LispList<T> ls2 = LispList.empty();
  for(; !ls1.isEmpty(); ls1=ls1.tail())
     {
      T h = ls1.head();
      if(h.equals(m))
         ls2 = ls2.cons(n);
      else
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
