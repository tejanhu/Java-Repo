import java.util.*;

public class Ex2
{
    public static int exercise2(int [] arr1, int n){
        
       Scanner input= new Scanner(System.in);
       System.out.println("Enter a digit");
       n=input.nextInt();
       int count=0;
       
       for(int i=0;i<arr1.length;i++){
           
           if(arr1[i]<n){
               count=count+1;
            }
           
        }
        return count;
    }
    
    public static void main(String args[])
    {
        int[] arr1= {8,11,3,12,5,10,5};
        
        int n=0;
        
        int counter=exercise2(arr1, n);
        
        System.out.println(counter);
    }
}
