/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problemsolvem;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Stream;

/**
 *
 * @author HusseinATejan
 */
public class DuplicationProgram {

    public static long findDuplicate(String[] words) {

        int duplicate = 0;

//        for (int i = 0; i < words.length; i++) {
//            for (int j = 1; j < i; j++) {
//                if (words[i].equalsIgnoreCase(words[j])) {
//                    duplicate = duplicate + 1;
//
//                }
//
//            }
//        }
        Set<String> someset = new TreeSet<String>();
        Map<String, Integer> someHash = new HashMap<String, Integer>();

        for (int i = 0; i < words.length; i++) {
            someset.add(words[i]);
        }

        for (int j = 0; j < words.length; j++) {
            if (someset.contains(words[j])) {
                if (someHash.get(words[j])!=null) {
                    someHash.put(words[j], someHash.get(words[j] + 1));
                }

            } else {
                someHash.put(words[j], 1);
            }
        }

        long temp = someHash.values().stream().filter(integer -> integer > 1).count();

//        if (duplicate == 0) {
//            duplicate = -1;
//        }
        return temp;

    }



    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the size you wish to set the array:");
        int arr_size = input.nextInt();
        String[] words = new String[arr_size];

        String phrase = "";
        System.out.println("");

        for (int i = 0; i < words.length; i++) {
            System.out.println("Enter a word:");
            phrase = input.next();
            words[i] = phrase;
        }

        System.out.println(findDuplicate(words));

    }
}
