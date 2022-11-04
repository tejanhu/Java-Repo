

public class ex4
{
   
    public static void main(String[] args)
    {
        
        
          int l= args.length; //must be initialised before array a
        
        int [] a = new int [l]; //a = array of size l
             
        
        //read args (array of strings) into array of integers:
        
        for(int i=0; i<l; i++){
            
           a[i] = Integer.parseInt(args[i]);
                      
            
        }
       
        //print in reverse order:
        
         for(int i=(l-1); i>=0; i--){
             
              System.out.println( args[i] + " ");
              
             //break line // System.out.println("\n");
              
            }
            

        
        
        System.exit(0);
    }
    
    
   
    
}
