import java.util.Scanner;

class SortLispLists6
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
 // Sorts using quick sort onto an accumulator.
 {
  return sort(ls,LispList.<Integer>empty());
 }

 private static LispList<Integer> sort(LispList<Integer> ls1,LispList<Integer> ls2)
 // Returns a list containing the elements of ls1 in numerical ascending order
 // joined to ls2.
 {
  if(ls1.isEmpty())
    return ls2;
  Integer pivot = ls1.head();
  ls1 = ls1.tail();
  LispList<Integer> smaller = LispList.empty();
  LispList<Integer> greater = LispList.empty();
  for(; !ls1.isEmpty(); ls1=ls1.tail())
     {
      Integer h = ls1.head();
      if(h.compareTo(pivot)<0)
         smaller = smaller.cons(h);
      else
         greater = greater.cons(h);
     }
  greater = sort(greater,ls2);
  return sort(smaller,greater.cons(pivot));
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
