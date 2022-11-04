import java.util.Scanner;

class SortLispLists7
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
 // Returns a list containing the elements of ls in numerical ascending order.
 // Sorts using merge sort.
 {
  if(ls.isEmpty()||ls.tail().isEmpty())
    return ls;
  LispList<Integer> ls1 = LispList.empty();
  LispList<Integer> ls2 = LispList.empty();
  for(;!ls.isEmpty(); ls=ls.tail())
     {
      ls1 = ls1.cons(ls.head());
      ls = ls.tail();
      if(!ls.isEmpty())
         ls2 = ls2.cons(ls.head());
      else
         break;
     }
  ls1 = sort(ls1);
  ls2 = sort(ls2);
  return merge(ls1,ls2);
 }

 public static LispList<Integer> merge(LispList<Integer> ls1,LispList<Integer> ls2)
 {
  if(ls1.isEmpty())
     return ls2;
  else if(ls2.isEmpty())
     return ls1;
  else
     {
      Integer h1 = ls1.head();
      Integer h2 = ls2.head();
      if(h1.compareTo(h2)<0)
         {
          LispList<Integer> ls3 = merge(ls1.tail(),ls2);
          return ls3.cons(h1);
         }
      else
         {
          LispList<Integer> ls3 = merge(ls1,ls2.tail());
          return ls3.cons(h2);
         }
     }
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
