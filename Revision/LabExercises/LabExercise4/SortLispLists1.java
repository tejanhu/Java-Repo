import java.util.Scanner;

class SortLispLists1
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

 public static LispList<Integer> sort(LispList<Integer> ls1)
 // Returns a list containing the elements of ls1 in numerical ascending order.
 // Sorts using insertion sort, expressed using iteration only.
 {
  LispList<Integer> ls2 = LispList.empty();
  for(;!ls1.isEmpty(); ls1=ls1.tail())
     ls2 = insert(ls1.head(),ls2);
  return ls2;
 }

 public static LispList<Integer> insert(Integer n,LispList<Integer> ls1)
 // Assumes ls1 is in ascending numerical order.
 // Returns a list consisting of n inserted into ls1 in the position
 // required to keep ascending numerical order.
 {
  LispList<Integer> ls2 = LispList.empty();
  for(;!ls1.isEmpty();ls1=ls1.tail())
     {
      Integer h=ls1.head();
      if(h.compareTo(n)>0)
         break;
      ls2=ls2.cons(h);
     }
  ls1=ls1.cons(n);
  for(;!ls2.isEmpty();ls2=ls2.tail())
     {
      Integer h=ls2.head();
      ls1=ls1.cons(h);
     }
  return ls1;
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
