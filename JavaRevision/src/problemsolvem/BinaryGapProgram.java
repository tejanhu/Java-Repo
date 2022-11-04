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
public class BinaryGapProgram {

    public static String convertInttoBin(int n) {
        String m = Integer.toBinaryString(n);
        return m;
    }

    public static void checkBinLength(String m) {
        int count = 0;
        int max = 0;

        int numarr[] = new int[m.length()];

        for (int i = 0; i < m.length(); i++) {
            numarr[i] = m.charAt(i) - '0';
        }
        for (int i = 0; i < numarr.length; i++) {
            if (numarr[i] == 0) {
                count++;
            } else {
                if (count > max) {
                max = count;
                count = 0;
            }
            }
            System.out.println(numarr[i]);

        }
        System.out.println("");
        System.out.println("Highest binary gap: " + max);
    }

    public static void main(String[] args) {
        int n = 41;
        String m = convertInttoBin(n);
        System.out.println(convertInttoBin(n));
        checkBinLength(m);
    }
}
