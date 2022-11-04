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
public class MoePro2 {

    public static ArrayList<String> select(ArrayList<String> list, String w1, String w2) {
        ArrayList<String> b = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equals(w1)) {
                // ArrayList<String> b = new ArrayList<>();
                String head = list.get(i);
                b.add(head);
            
//             System.out.println("I am here: "+ w2);
            if (list.subList(list.indexOf(head),list.size()).contains(w2)) {
               
                
                String tail = list.get(i + 1);
                String last=list.get(list.indexOf(tail)+1);
                
                b.add(tail);
                b.add(last);
            }//END if2
            return b;
            }//END if1
        }//END for loop

        ArrayList<String> c = new ArrayList<>(list);
        return c;
    }

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");

        System.out.println(list);

        String w1 = "B";
        String w2 = "C";

        System.out.println("w1:" + w1);
        System.out.println("w2:" + w2);

        System.out.println("  ");

        ArrayList<String> b = select(list, w1, w2);

        System.out.println(" Ya Bunayaa here is your ArrayList:  ");
        System.out.println(b);
    }

}
