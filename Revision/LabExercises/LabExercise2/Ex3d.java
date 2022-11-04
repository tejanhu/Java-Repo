
public class Ex3d
{
   
    public static void exercise3(int arr[], int m, int n){
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
              arr[i]=temp;
            }
            else{
                arr[i]=arr[i];
            }
            
        }
        
        
        
        
        
    }
    
    
    public static void main(String[] args)
    {
        int arr[] = {7,11,13,8,5,10,20};
        
        int m=0;
        
        int n=0;
        
        exercise3(arr,m, n);
        
        
    }
}
