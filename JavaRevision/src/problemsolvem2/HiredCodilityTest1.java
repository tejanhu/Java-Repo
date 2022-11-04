/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problemsolvem2;

/**
 *
 * @author HusseinATejan
 */
public class HiredCodilityTest1 {

    public static int solution(int A, int B) {
        int n = 0;
        int square[] = new int[B - A];
        int count = 0;

        for (int i = 1; i < 6; i++) {
            n++;
            square[i] = n * n;
            System.out.println(square[i]);
        }

        for (int i = 1; i < square.length; i++) {
            for (int j = A; j <= B; j++) {
                if ((square[i]) == A) {
                    count = count + 1;

                } else {
                    count = -1;
                }

            }
        }

        return count;

    }

    public static void main(String[] args) {
        int A = 4;
        int B = 17;
        int n = 1;

        System.out.println(solution(A, B));
    }
}
