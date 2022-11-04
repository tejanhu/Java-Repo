class QuickSortLispLists
{

 public static <T extends Comparable<? super T>> LispList<T> sort(LispList<T> ls)
 // Returns a list containing the elements of ls in natural order
 // Sorts using quick sort onto an accumulator.
 {
  return sort(ls,LispList.<T>empty());
 }

 private static <T extends Comparable<? super T>> LispList<T> sort(LispList<T> ls1,LispList<T> ls2)
 // Returns a list containing the elements of ls1 in natural order joined to ls2.
 {
  if(ls1.isEmpty())
    return ls2;
  T pivot = ls1.head();
  ls1 = ls1.tail();
  LispList<T> smaller = LispList.empty();
  LispList<T> greater = LispList.empty();
  for(; !ls1.isEmpty(); ls1=ls1.tail())
     {
      T h = ls1.head();
      if(h.compareTo(pivot)<0)
         smaller = smaller.cons(h);
      else
         greater = greater.cons(h);
     }
  greater = sort(greater,ls2);
  return sort(smaller,greater.cons(pivot));
 }

}
