
public class ex2II
{
    
        public static void main(String [] args)
    {
        
        
       String var=variable();
     var=BIG(var);
        printName(var);
                
    }
       
    public static String variable()
    {
        String var= "hussein";
        
        return var;
    }
    
    
    public static String BIG(String var)
    {
        return  var.toUpperCase();
           //printName(var2);
    }
    
    public static void printName(String var)
    {
        System.out.println(var);
    }
    
}
