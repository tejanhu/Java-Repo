import java.util.ArrayList;

class QuickSort
{
 public static <T extends Comparable<? super T>> void sort(ArrayList<T> a)
 {
  sort(a,0,a.size());
 }

 private static <T extends Comparable<? super T>> void sort(ArrayList<T> a,int from,int to)
 {
  if(to>from+1)
     {
      T pivot = a.get(from);
      int low=from+1,high=to-1;
      while(low<high)
         {
          while(low<high&&a.get(low).compareTo(pivot)<0)
              low++;
          while(pivot.compareTo(a.get(high))<0)
              high--;
          if(low<high)
            {
             swap(a,high,low);
             low++;
             high--;
            }
         }
      while(pivot.compareTo(a.get(high))<0)
         high--;
      swap(a,from,high);
      sort(a,from,high);
      sort(a,high+1,to);
     }
 }

 private static <T> void swap(ArrayList<T> a,int pos1,int pos2)
 {
  T temp = a.get(pos1);
  a.set(pos1,a.get(pos2));
  a.set(pos2,temp);
 }
}
