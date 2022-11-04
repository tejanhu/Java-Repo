

public class ex5
{
   
    
        public static void main(String[] args)
    {
       int length=args.length;
       
       length = 145;
        
        for(int i=0; i<args.length; i++){
            
            args[i]=args[i];
       
          System.out.print("\t    "+    i );
                
            
        }
       System.out.print("\n");
         for(int i=0; i<10; i++){
             
             //  System.out.print( i );
             //System.out.print("\n");
                //System.out.print( i );
              System.out.print("\t"+"|   "+args[i]+"|");
            }
            

        
        
        System.exit(0);
    }
            
      
    
   
    
}
