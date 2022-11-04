package Assessment2;

 


public class Ex7
{
   
    public static boolean Exercise7(int array[], boolean flag){
    
      
        
      for(int i=0;i<array.length-1;i++){
        
        if(array[i]<array[i+1]){
            
            
           
             flag= true;
        }//END if statement
        else if(array[i] > array[i]+1){
            
            
            flag=false;
        }
                
    }//END for loop
    return flag;
        
    }//END Exercise7a
    
    
    
    public static void main(String[] args)
    {
        
        int array[]={3,8,13,16,16,19,27,30};
        //int array[]={30,27,19,16,16,13,8,3};
        boolean flag=false;
        
        
        flag= Exercise7(array,flag);
       
        System.out.println(Exercise7(array,flag));
       
        
    }//END main
}//END Ex7
