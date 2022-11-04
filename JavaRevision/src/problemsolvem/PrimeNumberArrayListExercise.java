/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problemsolvem;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author HusseinATejan
 */
public class PrimeNumberArrayListExercise {

    public static void main(String[] args) {

        List <Integer> num_list = new ArrayList <Integer>(100);
        System.out.println("List of integers from 2-100:\n");

        for (int i = 2; i <=100; i++) {
            num_list.add(i);
        }
        System.out.println(num_list);
        
        System.out.println("");

        for (int i = 2; i < num_list.size(); i++) {
            for (int j = 2; j <=i; j++) {
                if(j==i){
                    System.out.println(j+" is a prime!");
                }//END if statement
                if(i%j==0){
                    break;
                }//END if statement
                
            }//END secondFor
        }//END firstFor

    }//END main
}//END class

