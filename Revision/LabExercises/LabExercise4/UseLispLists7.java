import java.util.Scanner;

class UseLispLists7
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
                      " in the list gives:");
  System.out.println(ls1);
 }

 public static <T> LispList<T> change(LispList<T> ls,T m,T n)
 // Changes all occurrences of m to n in ls1
 // uses recursion.
 {
  if(ls.isEmpty())
    return LispList.empty();
  else
     {
      LispList<T> t = change(ls.tail(),m,n);
      T h = ls.head();
      if(h.equals(m))
         return t.cons(n);
      else
         return t.cons(ls.head());
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
