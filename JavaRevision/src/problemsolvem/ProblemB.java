/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problemsolvem;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Exercise Task: Find the differences between two arrays of a similar size
 */
public class ProblemB {

    public static int getDifference(ArrayList<Integer> l1, ArrayList<Integer> l2, int n) {
        int diff = 0;
        int m = 0;
        Scanner input = new Scanner(System.in);

        /**
         * fill up array lists with some elements
         *
         */
        for (int i = 0; i < n; i++) {
            System.out.println("List1:");
            System.out.println("Please enter an integer: ");
            m = input.nextInt();
            l1.add(m);
        }

        for (int i = 0; i < n; i++) {
            System.out.println("\nList2:");
            System.out.println("Please enter an integer: ");
            m = input.nextInt();
            l2.add(m);

        }

        /**
         * calculate absolute difference between both arrays
         *
         */
        for (int i = 0; i < l1.size(); i++) {
            diff += Math.abs(l1.get(i) - l2.get(i));
        }
        return diff;
    }

//    public static int getTotalDiff(ArrayList<Integer> l1, ArrayList<Integer> l2,int n) {
//        int size = l1.size();
//        if (size == 0) {
//            return 0;
//        }
//        int lastElementDiff=Math.abs(l1.get(size-1)-l2.get(size-1));
//        int diff=getTotalDiff(l1, l2, size-1)+lastElementDiff;
//        return diff;
//    }


public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        ArrayList<Integer> list2 = new ArrayList<Integer>();

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a single integer: ");
        int n = input.nextInt();

        System.out.println("");
        System.out.println("\nTotal difference: " + getDifference(list, list2, n));
    }
}
