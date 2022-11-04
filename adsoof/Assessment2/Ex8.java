package Assessment2;


public class Ex8
{
    
    public static boolean Exercise8(int array[],int arr2[],boolean flag){
       
        boolean isset[]= new boolean[arr2.length];
        
        
       for (int i = 0; i < arr2.length; i++) {
             for (int a = 0; a < array.length; a++) {
          if (arr2[i] == array[a]) {
              isset[i]=true;
          
    }//END if statement
   
    for(int index=0;index<isset.length;index++){
    if(isset[index]){
        
        flag=true;
    }//END if statement
    
    else{
        flag=false;
        
    }//END else statement
    
    }//END forloop
    
    
  
        
    }//END forloop
} //END forloop
 return flag;
 }//END Exercise8
    
    
    public static void main(String[] args)
    {
       
        int array[]= {17,11,20,34,5,10,8,19,55,11,13};
        
        int arr2[]= {19,20,13,19,55,8};
        
        boolean flag=false;
                       
        flag=Exercise8(array,arr2,flag);
        
        System.out.println(flag);
        
        
    }//END Main
}//END Ex8
