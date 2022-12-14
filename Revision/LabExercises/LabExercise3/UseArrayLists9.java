import java.util.*;

class UseArrayLists9
// Shows adding an integer after all occurrences of an integer 
// constructively in an ArrayList, then doing the same with Strings.
// Uses a separate method for each type.
{
 public static void main(String[] args) throws Exception
 {
  Scanner input = new Scanner(System.in);
  System.out.println("Enter some numbers (all on one line, separated by spaces):");
  String line = input.nextLine();
  String[] numbers = line.split(" +");
  ArrayList<Integer> a = new ArrayList<Integer>();
  for(int i=0; i<numbers.length; i++)
      a.add(new Integer(numbers[i]));
  System.out.println("The numbers are stored in an ArrayList");
  System.out.println("The ArrayList is "+a);
  System.out.print("Enter two numbers: ");
  int p = input.nextInt(), q=input.nextInt();
  System.out.println("Add "+q+" after every "+p+" in the ArrayList");
  ArrayList<Integer> b=addAfter(a,p,q);
  System.out.println("The ArrayList created is "+b);
  System.out.println("\nEnter some words (all on one line, separated by spaces):");
  line = input.nextLine();
  line = input.nextLine();
  String[] words = line.split(" ");
  ArrayList<String> c = new ArrayList<String>();
  for(int i=0; i<words.length; i++)
      c.add(words[i]);
  System.out.println("The words are stored in an ArrayList");
  System.out.println("The ArrayList is "+c);
  System.out.print("Enter two words: ");
  String str1 = input.next(), str2=input.next();
  System.out.println("Add "+str1+" after every "+str2+" in the ArrayList");
  ArrayList<String> d=addAfter(c,str1,str2);
  System.out.println("The ArrayList created is "+d);
 }

 public static ArrayList<Integer> addAfter(ArrayList<Integer> a,Integer m,Integer n)
 // Adds n after every occurrence of m in a, constructively.
 {
  ArrayList<Integer> b = new ArrayList<Integer>();
  for(int i=0; i<a.size(); i++)
    {
     Integer k=a.get(i);
     b.add(k);
     if(k.equals(m))
       b.add(n);
    }
  return b;
 }

 public static ArrayList<String> addAfter(ArrayList<String> a,String m,String n)
 // Adds n after every occurrence of m in a, constructively.
 {
  ArrayList<String> b = new ArrayList<String>();
  for(int i=0; i<a.size(); i++)
    {
     String k=a.get(i);
     b.add(k);
     if(k.equals(m))
       b.add(n);
    }
  return b;
 }

}
