import java.util.Scanner;

class SortLispLists5
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
  System.out.print("The list sorted is: ");
  System.out.println(sort(ls));
 }

 public static LispList<Integer> sort(LispList<Integer> ls)
 // Returns a list containing the elements of ls in numerical ascending order
 // Sorts using quick sort.
 {
  if(ls.isEmpty()||ls.tail().isEmpty())
    return ls;
  Integer pivot = ls.head();
  ls = ls.tail();
  LispList<Integer> smaller = LispList.empty();
  LispList<Integer> greater = LispList.empty();
  for(; !ls.isEmpty(); ls=ls.tail())
     {
      Integer h = ls.head();
      if(h.compareTo(pivot)<0)
         smaller = smaller.cons(h);
      else
         greater = greater.cons(h);
     }
  smaller = sort(smaller);
  greater = sort(greater);
  greater = greater.cons(pivot);
  return append(smaller,greater);
 }

 public static <T> LispList<T> append(LispList<T> ls1,LispList<T> ls2)
 // Join ls1 to ls2
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
