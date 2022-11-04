import java.util.*;

public class Ex6
{
   
    public static <T> int firstOccurrence(T item, Cell<Integer> list1){
   int index=0;
        for(;list1!=null; list1=list1.next){
    if(list1.first.equals(item)){
        
        list1.first=list1.next.first;
        index=index+1;
        list1.next=list1.next.next;
        break;
    }     
       
} 
return index;
}


 public static void main(String[] args) 
 {
  Scanner input = new Scanner(System.in);
  Cell<Integer> list1,list2;
  int item,m1,m2;
  System.out.print("Enter a list (of integers): ");
  String line = input.nextLine();
  list1 = parseIntLinkedList(line);
  System.out.println("The list you entered is: ");
  System.out.println(linkedListToString(list1));
  System.out.print("Enter a number: ");
  item = input.nextInt();
  int index=firstOccurrence(item, list1);
  System.out.println(index);
  
}

 private static Cell<Integer> parseIntLinkedList(String str)
 {
  Cell<Integer> list=null;
  String line = str.trim();
  String contents = line.substring(1,line.length()-1).trim();
  if(contents.length()==0)
     return null;
  String[] nums = contents.split(",");

  for(int i=nums.length-1; i>=0; i--)
      {
       String num = nums[i].trim();
       list = new Cell<Integer>(new Integer(num),list);
      }
  return list;
 }

 private static <T> String linkedListToString(Cell<T> list)
 {
  String str="[";
  if(list!=null)
     {
      str+=list.first;
      for(Cell<T> ptr=list.next; ptr!=null; ptr=ptr.next)
         str+=","+ptr.first;
     }
  return str+"]";
 }

 private static class Cell <T>
 {
  T first;
  Cell<T> next;

  Cell(T f,Cell<T> n)
  {
   first=f;
   next=n;
  }
 }

}
