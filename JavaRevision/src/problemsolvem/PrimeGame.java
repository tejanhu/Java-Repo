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
public class PrimeGame {

    public static void checkPrime() {
        for (int i = 2; i <= 100; i++) {
            for (int j = 2; j <= i; j++) {
                if (j == i) {
                    System.out.println(j + " is a prime!");
                }//END if
                if (i % j == 0) {
                    break;
                }//END if

            }//END for2

        }//END for1
    }

    public static void verifyPrime() {
        int counter = 0;
        for (int j = 2; j < 100; j++) {

            for (int i = 1; i <= j; i++) {
                double res = (double) j/i;
//                System.out.println(res);
                if (res == (Math.ceil(res))) {
                    counter = counter + 1;
                }
            }//END for1
            if (counter == 2) {
                System.out.println(j + " is a prime!");
            }
            counter = 0;
        }

    }

    public static void main(String[] args) {
        checkPrime();
//        verifyPrime();
    }
}
