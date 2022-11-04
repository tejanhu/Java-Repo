/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testingapplications;

import java.util.Scanner;

/**
 *
 * @author LatinoWolofKid
 */
public class RecCheck {

    public static boolean startsWith(String w1, String w2) {
        if (w2.length() == 0) {
            return true;
        } else if (w1.length() == 0) {
            return false;
        } else if (w1.charAt(0) != w2.charAt(0)) {
            return false;
        } else {
            return startsWith(w1.substring(1), w2.substring(1));
        }

    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a String:");
        String str1 = input.next();
        System.out.println("    ");
        System.out.println("Enter another String");
        String str2 = input.next();

        boolean flag = false; 
      //  System.out.println("    ");
        flag=startsWith(str1, str2);
        
        System.out.println(flag);
    }

}
