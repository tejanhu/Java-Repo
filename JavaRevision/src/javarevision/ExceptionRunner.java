/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javarevision;

import java.util.Scanner;

/**
 *
 * @author HusseinATejan
 */
public class ExceptionRunner {

    public static void main(String[] args) {
        int temp = 1;
        do{
        try {

            Scanner input = new Scanner(System.in);
            System.out.println("Enter first number: ");
            int n = input.nextInt();

            System.out.println("\nEnter second number: ");
            int m = input.nextInt();

            int num = n / m;
            System.out.println("\nCalculation: \n"+n + "/" + m);
            System.out.println("\nAnswer: \n" + num);
            temp=2;
        } catch (Exception e) {
            System.out.println("\nNon possible!\n");
        }
        }while(temp==1);

    }

}
