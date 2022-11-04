import java.util.*;

class PricedObjectOps
{
 public static PricedObject cheaper(PricedObject m1,PricedObject m2)
 {
  if(m1.getPrice()<m2.getPrice())
     return m1;
  else
     return m2;
 }

 public static boolean isCheaper(PricedObject m1,PricedObject m2)
 {
  return m1.getPrice()<m2.getPrice();
 }


 public static boolean samePrice(PricedObject m1,PricedObject m2)
 {
  return m1.getPrice()==m2.getPrice();
 }


 public static <T extends PricedObject> T mostExpensive(ArrayList<T> a)
 {
  T highestSoFar = a.get(0);
  for(int i=1; i<a.size(); i++)
     {
      T next = a.get(i);
      if(isCheaper(highestSoFar,next))
         highestSoFar = next;
     }
  return highestSoFar;
 }

}
