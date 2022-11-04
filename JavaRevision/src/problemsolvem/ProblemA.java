/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problemsolvem;

/**
 *
 * @author HusseinATejan
 */
public class ProblemA {

    public static int[] solution(int[] A, int k) {
        //construct new array same size as first array
        int[] B = new int[A.length];

        //registers swap operation 
        boolean swapped = false;

        for (int i = 0; i < A.length; i++) {
            for (int j = 3; j < A.length; j++) {
                if (swapped == false) {
//                    B = sort(A, k);
                    swapped = true;
                }
                swapped = false;
            }

        }
        return B;
    }

    private static int[] sort(int[] A, int k) {

        return A;
    }

    public static void main(String[] args) {
//        int[] A = new int[5];
        int[] A = {3, 8, 9, 7, 6};
        for (int i = 0; i < A.length; i++) {
            System.out.println(A[i]);
        }

        System.out.println("");

        int k = 3;

        int[] B;

        B = solution(A, k);

        for (int i = 0; i < B.length; i++) {
            System.out.println(B[i]);
        }

    }

}
