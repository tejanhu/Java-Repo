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
public class ExampleClass {

    public static void main(String[] args) {

        String[] items = {"oranges", "cornbeef", "guava", "grapes", "crAnBeRRy"};
        List<String> l1 = new LinkedList<String>();
        for (String s : items) {
            l1.add(s);
        }

        String[] items2 = {"fruitnfibre", "frosties", "cornflakes", "cranberry", "cows"};
        List<String> l2 = new LinkedList<String>();

        for (String text : items2) {
            l2.add(text);
        }

        l1.addAll(l2);
        l2 = null;

        System.out.println("Before:");
        print(l1);
        System.out.println("");
        removeItems(l1, 2, 5);
        System.out.println("After:");
        print(l1);
        System.out.println("");
        reverse(l1);

    }

    //print method
    private static void print(List<String> list) {
        for (String element : list) {
            System.out.printf("%s ", element);
            System.out.println("");
        }
    }

   //removeItems method
    private static void removeItems(List<String> list, int from, int to) {
        list.subList(from, to).clear();
    }

    //reverse method
    private static void reverse(List<String> list) {
        ListIterator<String> li = list.listIterator(list.size());
        while(li.hasPrevious()){
            System.out.printf("%s ", li.previous());
        }
    }
}
