
public class exercise1
{
   
    public static void main(String[] args)
    {
        example1();
        
        System.exit(0);
    }
    
    
    public static void example1(){
        
        int entry[]=new int [13];
        for(int i=0; i<entry.length; i++){
            
            entry[i] = i*2;
       
                
            
        }
       
         for(int i=0; i<entry.length; i++){
               System.out.println("The 2 times table answers are as follows: " + entry[i]);
            }
        }
    
    
}
