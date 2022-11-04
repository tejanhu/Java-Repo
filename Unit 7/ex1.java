

public class ex1
{
    
    public static void main(String []param)
    {
        
       
        
        int number=0;
        
        for(int index=0;index<param.length;index++){
         number=Integer.parseInt(param[index]);
        
    }//END for loop
     
    square(number);
    
     System.out.println(square(number));
    
    System.exit(0);
    
    }
    
    static int square(int num)
    {
        return (num*num);
        
        
    }
}
