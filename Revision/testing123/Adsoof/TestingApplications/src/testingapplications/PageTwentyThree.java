/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testingapplications;

import java.util.ArrayList;
import java.util.Vector;

/**
 *
 * @author LatinoWolofKid
 */
public class PageTwentyThree {

    public static void addAfter(ArrayList<String> a, String w1, String w2) {

        for (int i = 0; i < a.size(); i++) {
            if (a.get(i).equals(w1)) {
                a.add(i + 1, w2);
                //i++;
            }//END if statement
        }//END for loop

        System.out.println(a);

    }//END addAfter

    public static void main(String[] args) {
        ArrayList<String> a = new ArrayList<>();

        String w1 = "a b c";
        //String w2 = "a, b, c";
        String w2 = "d, e, f";
        a.add(w1);
        addAfter(a, w1, w2);

    }

}
