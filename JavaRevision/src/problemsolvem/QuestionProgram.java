/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problemsolvem;

import java.util.Scanner;

/**
 *
 * @author HusseinATejan
 */
public class QuestionProgram {

    public static void solution(int list[]) {

        int evenCount = 0;
        int oddCount = 0;
        int biggest = 0;

        for (int i = 0; i < list.length; i++) {
            //check if list element is an even number
            if (list[i] % 2 == 0) {
                evenCount++;
            } //check if list element is an odd number
            else {
                oddCount++;
            }

        }

        biggest = evenCount;

        if (evenCount > oddCount) {
            biggest = evenCount;
            System.out.println("There are " + biggest + " even numbers.");
        } else if (evenCount == oddCount) {
            System.out.println("There are " + biggest + " odd and " + biggest + " even numbers.");
        } else {
            biggest = oddCount;
            System.out.println("There are " + biggest + " odd numbers.");

        }

    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("");

        System.out.println("Set your array size limit please");
        int m = input.nextInt();

        System.out.println("");
        int[] list = new int[m];

        for (int i = 0; i < list.length; i++) {
            System.out.println("Enter a digit.");
            int n = input.nextInt();
            list[i] = n;
        }

        solution(list);

    }
}
