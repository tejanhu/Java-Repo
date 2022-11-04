/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testingapplications;

/**
 *
 * @author LatinoWolofKid
 */
public class A1 {

   
    public static int[] truncate(int[] arr){
        
        int n=0;
        int m=0;
         int arr3[] = new int[arr.length];
        
        for (int i = 0; i < arr.length; i++) {
            n=arr[i];
            int arr2[]= new int[arr.length];
            arr2[i]=arr[i];
            m=arr[i+1];
            if(arr[i]==n){
               
                arr3[i]=n;
                arr3[i+1]=m;
            }
            
        }
        
        return arr3;
    }
    
    public static void main(String[] args) {
        int arr[]= {21,9,13,47,5,10,19,36,20,11,13};
        
        
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
            
        }
        
         System.out.println("   ");
        
       int arr3[]= truncate( arr);
        
        for (int i = 0; i < arr3.length; i++) {
            System.out.println(arr3[i]);
            
        }
       
    }
    
}
