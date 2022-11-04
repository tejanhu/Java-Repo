package Assessment2;

import java.util.*;

public class Ex6
{
   
    public static int[] Exercise6(int array[], int num){
    
          
    ArrayList <Integer> list= new ArrayList <Integer>();
   ArrayList <Integer> list2= new ArrayList <Integer>();
   
     int arr[]= {1,2,3,4,5,6,7,8,9,10,11};
    
    for(int i=0;i<array.length;i++){
         list.add(array[i]);
       //  System.out.println(list.get(i) );
        }//END for loop
        for(int o=0;o<arr.length;o++){
         list2.add(arr[o]);
        }//END for loop
        for(int w=0;w<list.size();w++){
        if(list.contains(list2.get(w))){
            //list.get(w)<num;
            //System.out.println("It is in arr");
        }
    }  
        
   //   for(int v=0;v<list.size();v++){
                  
         //System.out.println(list.get(j)+" This is in the list" );
 //       if(list.get(v)==10){
            //System.out.println(list.get(j)+" is getting removed");
                  
     //       list.remove(list.get(v));
            
            
   //     }//END if statement
        
                
   // }//END for loop
   // System.out.println(list.size());
      for(int j=0;j<list.size();j++){
                  
      //  System.out.println(list.get(j));
        if((list.get(j))<(num)){
            //System.out.println(list.get(j)+" is getting removed");
                  
            list.remove(list.get(j));
            
            
        }//END if statement
        
                
    }//END for loop
    
    for(int u=0;u<list.size();u++){
        
        if (list.get(u)==10 ){
            
            list.remove(u);
        }
    }
    
    int array2[]= new int[list.size()];
    
    for(int k=0;k<array2.length;k++)
    {
    
    array2[k]=list.get(k);
     
    }//END for loop
  
    return array2;
        
 }//END Exercise6
    
    
    public static void main(String[] args)
    {
        
        int array[]={17,11,20,34,5,10,8,19,55,11,13};
        int num=12;
        
        
        int array2[]=Exercise6(array,num);
        
        for(int indexe=0;indexe<array2.length;indexe++){
        System.out.println(array2[indexe]);
    }//END for loop
       
   
        
    }//END main
}//END Ex6
