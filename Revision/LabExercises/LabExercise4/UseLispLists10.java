import java.util.Scanner;

class UseLispLists10
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
  if(oddLength(ls))
     System.out.println("The list is of odd length");
  else
     System.out.println("The list is of even length");
 }

 public static <T> boolean oddLength(LispList<T> ls)
 // Returns true if ls is of odd length, false otherwise
 {
  if(ls.isEmpty())
     return false;
  else if(ls.tail().isEmpty())
     return true;
  else
     return evenLength(ls.tail());
 }

 public static <T> boolean evenLength(LispList<T> ls)
 // Returns true if ls is of even length, false otherwise
 {
  if(ls.isEmpty())
     return true;
  else if(ls.tail().isEmpty())
     return false;
  else
     return oddLength(ls.tail());
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
