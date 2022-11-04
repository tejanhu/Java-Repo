
public class Ex5
{
    
    public static int[] exercise5(int arr[], int m, int n){
         int arr2[]=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            
            if(arr[i] == m){
               
                arr2[i]=arr[i];
                
                if(arr[i]==n){
                    arr2[i]=arr[i];
                }
            }
            else{
               arr2[i]=arr[i]; 
                
            }
        }
        
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
            
        }
        
        return arr2;
    }
    
    
    public static void main(String[] args)
    {
        int arr[] ={7,11,13,8,5,10,8,27,30,11,5};
        int m=8;
        int n=27;
        
       int [] arr3=exercise5(arr, m, n);
       
       for(int i=0;i<arr3.length;i++){
            System.out.println(arr3[i]);
            
        }
        
    }
}
