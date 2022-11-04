import java.util.ArrayList;

class Transformers
{
 public static <T> ArrayList<T> applyConst(Transformer<T> tran,ArrayList<T> a)
 {
  ArrayList<T> b = new ArrayList<T>();
  for(int i=0; i<a.size(); i++)
      b.add(tran.transform(a.get(i))); 
  return b;
 }
}
