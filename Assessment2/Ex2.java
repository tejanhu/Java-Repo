package Assessment2;


public class Ex2
{
   
    
    public static int Exercise2(int number[],int num){
        
        num=9;
        int count=0;
        
      for(int i=0;i<number.length;i++){
        if(number[i]<num){
            count++;
    }//END if statement
        
    } //END forloop
        return count ;
    }//END Exercise2
    
    
    
    public static void main(String[] args){
        
        int number[]={8,11,3,12,5,10,5};
        int num=0;
        
        Exercise2(number,num);
        
      
        System.out.println(Exercise2(number,num));
        
        
        
    }
    
    
    
    
}
