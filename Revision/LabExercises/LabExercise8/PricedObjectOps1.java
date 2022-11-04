import java.util.*;

class PricedObjectOps1
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

}
