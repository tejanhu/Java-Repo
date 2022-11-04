/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testingapplications;

import java.util.ArrayList;

/**
 *
 * @author LatinoWolofKid
 */
public class PageTwentyEight {

    public static <T> ArrayList<T> constChange(ArrayList<T> alist, T m, T n) {
        ArrayList<T> b = new ArrayList<T>();

        for (int i = 0; i < alist.size(); i++) {
            T next = alist.get(i);

            if (next.equals(m)) {
                b.add(n);
            } else {
                b.add(m);
            }

        }//END for loop
        return b;
    }

    public static void main(String[] args) {

//        ArrayList<String> alist = new ArrayList<String>();
//        String m = "Putaar";
//        String n = "Betaah";
//
//        alist.add(m);
//        System.out.println(alist);
//        System.out.println("Changed to:     ");
//        ArrayList<String> b = constChange(alist, m, n);
//        System.out.println(b);
        
        
        
        ArrayList<Integer> numlist= new ArrayList<Integer>();
        int multiple=500;
        int number=300;
        
        numlist.add(multiple);
        
         System.out.println(numlist);
        System.out.println("Changed to:     ");
        ArrayList<Integer> listInt = constChange(numlist, multiple, number);
        System.out.println(listInt);
    }

}
