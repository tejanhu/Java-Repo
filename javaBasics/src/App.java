public class App {
    static void test( int a[] ) {
        for ( int i = 0; i < a.length ; i++ ) {
              a[i] = 0;
        }
     }
     
 public static void main(String []args){

    int b [] = { 10, 20, 30 , 40 };
   test( b );
   for(int i=0; i<b.length;i++){
    System.out.println(b[i]);
   }
 }

  
}
