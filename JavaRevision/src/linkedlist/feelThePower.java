/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linkedlist;

import java.util.*;

/**
 *
 * @author HusseinATejan
 */
public class feelThePower {

    public static void test() {
        //original String array
        String[] somestuff = {"crayons", "pens", "paint", "whiteboards", "monkeys", "jellyfishes", "crayfish"};

        //Linkedlist array
        LinkedList<String> list = new LinkedList<String>(Arrays.asList(somestuff));

        //added elements to linkedlist
        list.add("peanut butter");
        list.add("jelly");
        list.addFirst("cucumber");
        list.addLast("water");

        //reinitialized array with linkedlist items
        somestuff = list.toArray(new String[list.size()]);

        //printed each element within linkedlist
        for (String element : somestuff) {
            System.out.printf("%s ", element);
        }

    }

    public static void main(String[] args) {
        test();
    }
}
