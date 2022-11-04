/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author HusseinATejan
 */
public class SomeProgram {
    
    
    public static int add(int n, int m) {
        
        //initialise sum to initial value
        int sum = 0;
        
        //process called assignment
        sum = n+m;
        
        return sum;
        
    }
    
    public static void print(int sum, int n, int m) {
        System.out.println("The Sum of "+ n + " and " + m + " is " + sum);
    }
    
    public static void main(String[] args) {
        
        //initialises integer variables
       int n;
       int m;
       
       n=2;
        m=3;
        
       int sum = add(n, m);
        
       print(sum, n, m);
    }
    
}
