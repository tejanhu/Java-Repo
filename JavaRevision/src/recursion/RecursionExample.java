/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recursion;

import java.util.Scanner;

/**
 *
 * @author HusseinATejan
 */
public class RecursionExample {

    public static boolean hasPrayed(boolean flag) {

        Scanner input = new Scanner(System.in);

        System.out.println("Have you prayed yet?");
        String response = input.next();

        if (response.equalsIgnoreCase("Yes") || response.equalsIgnoreCase("YES") || response.equalsIgnoreCase("yes")) {
            flag = true;
            return flag;
        } else {
            hasPrayed(flag);
            if(flag==true){
            flag=true;
            }
        }
        return flag;
    }

    public static void main(String[] args) {
        boolean flag = false;
        System.out.println(hasPrayed(flag));
    }
}
