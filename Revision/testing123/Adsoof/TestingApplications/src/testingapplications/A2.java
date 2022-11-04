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
public class A2 {

    public static <T> ArrayList<T> truncate(ArrayList<T> list) {

        T n;
        T m;
        ArrayList<T> list2 = new ArrayList<T>();

        for (int i = 0; i < list.size(); i++) {
            n = list.get(i);
            m = list.get(i + 1);
            if (list.get(i).equals(n)) {

                list2.add(n);
                for (int j = 1; j < list.size(); j++) {
                    list2.set(j, m);
                }

            }

        }

        return list2;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();

        list.add(21);
        list.add(9);
        list.add(13);
        list.add(47);
        list.add(5);
        list.add(10);
        list.add(19);
        list.add(36);
        list.add(20);
        list.add(11);
        list.add(13);

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));

        }

        System.out.println("   ");

        ArrayList<Integer> list3 = truncate(list);

        for (int i = 0; i < list3.size(); i++) {
            System.out.println(list3.get(i));

        }

    }

}
