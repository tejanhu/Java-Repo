package Assessment2;


public class Exercise4
{
    
    
    public static int Ex4(int digitarr[],int target){
        
        int index = -1;
      
        
        int low=target-digitarr[0];
        for(int i=0;i<digitarr.length;i++){
        int  high=Math.abs(digitarr[i]-target); //array value - target until it reaches 0
        
         if(high<low)
         {
             index=i;
             low=high;
            
         }//END if statement
    }//END for loop
        
        
        
        
        
        
        return index;
       
}
        
    
    
    
    
    
    
    public static void main(String[] args){
        int target=21;
        int digitarr[]={19,9,30,47,5,10,20,36,21,11,13};
        
        
         int  index= Ex4(digitarr,target);
        
        System.out.println(index);
        
    }
    
    
    
    
    
}
