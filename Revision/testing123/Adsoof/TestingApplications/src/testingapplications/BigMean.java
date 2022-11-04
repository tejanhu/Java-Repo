/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testingapplications;

import java.util.*;

/**
 *
 * @author LatinoWolofKid
 */
public class BigMean {

    static int biggest(int[] a) {
        int biggestSoFar = a[0];
        for (int i = 1; i < a.length; i++) {
            if (a[i] > biggestSoFar) {
                biggestSoFar = a[i];
            }
        }

        return biggestSoFar;

    }

    static int smallest(int[] a) {
        int smallestSoFar = a[0];
        for (int i = 1; i < a.length; i++) {
            if (a[i] < smallestSoFar) {
                smallestSoFar = a[i];
            }
        }

        return smallestSoFar;

    }

    static int mostOccurence(int[] a) {
        int count = 0;
        System.out.println("Enter a number.");
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();

        for (int i = 0; i < a.length; i++) {
            if (a[i] == n) {
                count = count + 1;
            }
        }

        return count;

    }

    public static void main(String[] args) {
        int a[] = {0, 1, 2, 2, 3, 3, 4, 4, 4, 4, 5};

        //System.out.println(biggest(a));
        //System.out.println(smallest(a));
        System.out.println("The number with most occurences:" + mostOccurence(a));
    }

}
