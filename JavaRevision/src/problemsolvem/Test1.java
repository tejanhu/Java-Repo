/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problemsolvem;

/**
 *
 * @author HusseinATejan
 */
public class Test1 {
    // you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int[] A) {
    String face ="";
    String[] faces = new String[A.length];
    int heads = 0;
    int tails = 0;
    int diff = 0;
    
    for( int i=0; i<A.length;i++){
        if(A[i] ==0){
         face = "H";
         faces[i] = face;
        }//END if
        
        if(A[i]==1){
         face = "T";
         faces[i]=face;
        }//END if
        
      
    }//END for2
    
        for(int j=0; j<faces.length; j++){
            if(faces[j] =="H"){
                heads++;
            }
            else{
             tails++;   
            }
        }//END for3
         
        
        diff = Math.abs(heads-tails);
    return diff;
   
    }//END method
}//END class
}
