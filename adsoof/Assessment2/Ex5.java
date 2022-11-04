package Assessment2;

 

import java.util.*;


public class Ex5
{
        
    public static int[] Exercise5(int array[],int nombre,int numero){
        
        
        int start=0;
        int end=0;
        
        ArrayList<Integer>stupid=new ArrayList<Integer>();
               
                
        for(int i=0;i<array.length;i++){
            
            if(array[i]==nombre){
                
                start=i;
                break; //prevents start from being initialised at the scond 8
                                
            }
            
        }
          for(int j=0;j<array.length;j++){
                          
                            
            if(array[j]==numero){
                
                end=j;
                break;
                                                                               
            }
            
        }
        for(int index=start;index<=end;index++){
            
                 stupid.add(array[index]); //add array elements to list from start to end
            
        }
                
            
            int array2[]=new int [stupid.size()]; //array2 has the length size of count
            for(int k=0;k<stupid.size();k++){
                
                array2[k]=stupid.get(k);
                
                
            }//END for loop
        
                      
        return array2; 
        
    }
    
    
    
    public static void main(String[] args)
    {
        
        int array[]= {7,11,13,8,5,10,8,27,30,11,5};
        int nombre=8;
        int numero=27;
        
        int array2[]=Exercise5(array,nombre,numero);
              
        array2=Exercise5(array,nombre,numero);
        
        for(int indexe=0;indexe<array2.length;indexe++){
        System.out.print(array2[indexe]+ "| ");
    }//END for loop
    
    
    }
}
