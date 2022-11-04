import java.util.Scanner;

class SortLispListInt
{

 public static void main(String[] args)
 {
  Scanner in = new Scanner(System.in);
  LispList<Integer> ls1,ls2;
  System.out.print("Enter a list (of integers): ");
  String str = in.nextLine();
  ls1 = parseIntLispList(str);
  System.out.print("The list you entered is: ");
  System.out.println(ls1);
  ls2 = QuickSortLispLists.sort(ls1);
  System.out.print("The list sorted is: ");
  System.out.println(ls2);
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
