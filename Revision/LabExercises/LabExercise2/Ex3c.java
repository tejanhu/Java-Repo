
public class Ex3c
{
   
    public static int[] exercise3(int arr[], int m, int n){
        m=12;
        n=5;
        int temp;
        int arr2[]=new int[arr.length];
        
         for(int i=0;i<arr.length;i++){
            
            System.out.println(arr[i]);
        }
        System.out.println();
        
        for(int i=0;i<arr.length;i++){
            if(arr[i]<m){
              temp=arr[i]*n;
              arr2[i]=temp;
            }
            else{
                arr2[i]=arr[i];
            }
            
        }
        
        
        
        return arr2;
        
    }
    
    
    public static void main(String[] args)
    {
        int arr[] = {7,11,13,8,5,10,20};
        
        int m=0;
        
        int n=0;
        
        int arr3[]=exercise3(arr,m, n);
        
        for(int i=0;i<arr3.length;i++){
            
            System.out.println(arr3[i]);
        }
    }
}
