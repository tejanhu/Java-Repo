
public class A3
{
    public static <T> LispList<T> truncate(LispList<T> ls1) {

        T n;
        T m;
        LispList<T> ls2 = LispList.empty();
        
        if(ls1.isEmpty()) {
            return LispList.empty();
        }//END if
        else {
              for(; !ls1.isEmpty(); ls1=ls1.tail())
     {

            n = ls1.head();
            m = ls1.head();
            if (n.equals(m)) {

            }
            else{
                ls2=ls2.cons(m);
                ls2=ls2.cons(n);

            }//END else
            truncate(ls1.tail());
        }
        }//END else 
//             else{
//                 ls2=ls2.cons(ls1.head());
//                 truncate(ls1.tail());
//             }//END else
            return ls2;
    }//END truncate

    public static void main(String [] args)
    {
       LispList<Integer> ls1= LispList.empty();
       
       ls1.cons(13);
        ls1.cons(11);
         ls1.cons(20);
          ls1.cons(36);
           ls1.cons(19);
            ls1.cons(10);
             ls1.cons(5);
              ls1.cons(47);
               ls1.cons(13);
                ls1.cons(9);
                     ls1.cons(21);
                     
              System.out.println(ls1);      
              
              System.out.println("  ");
       
        LispList <Integer> ls3=  LispList.empty(); 
        ls3=truncate(ls1);
        
        System.out.println(ls3);
        
    }
}
