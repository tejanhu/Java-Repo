import java.util.*;

public class Ex2Const
{

    public static <T> Cell<T> removeOccurrence(T n, Cell<T> list1,Cell<T> list2){

        for(;list2!=null; list2=list2.next){
            if(list2.first.equals(n)){

                list2.first=list2.next.first;
                list2.next=list2.next.next;
                break;
            }     

        } 
        return list2;
    }

    public static <T> Cell<T> addAll(T n, Cell<T> list1){
         Cell<T>list2=null;
        for(;list1!=null;list1=list1.next){
            list2=new Cell<T>(list1.first,list1.next);
        }
        return list2;
    }
    
    
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        Cell<Integer> list1;

        int n,m1,m2;
        System.out.print("Enter a list (of integers): ");
        String line = input.nextLine();
        list1 = parseIntLinkedList(line);
        System.out.println("The list you entered is: ");
        System.out.println(linkedListToString(list1));
        System.out.print("Enter a number: ");
        n = input.nextInt();
        Cell<Integer>list2=addAll(n,list1);
        list1=removeOccurrence(n, list1,list2);
        System.out.println("Changing the original list to: ");
        System.out.println(linkedListToString(list2));
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
