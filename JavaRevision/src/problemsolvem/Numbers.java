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
public class Numbers {

    public static int solution(int[] A) {
        String face = "";
        String[] faces = new String[A.length];
        int heads = 0;
        int tails = 0;
        int diff=0;
        System.out.println("Here is my array: ");
        for (int i = 0; i < A.length; i++) {
            System.out.println("position " + i + ": " + A[i]);
        }//END for1

        for (int i = 0; i < A.length; i++) {
            if (A[i] == 0) {
                face = "H";
                faces[i] = face;
            }
            if (A[i] == 1) {
                face = "T";
                faces[i] = face;
            }
            System.out.println("");
            System.out.println("In position " + i + " : " + faces[i]);
        }//END for2

        for (int i = 0; i < faces.length; i++) {
            if (faces[i] == "H") {
                heads++;
            } else {
                tails++;
            }

        }
        System.out.println("Number of heads: " + heads);
        System.out.println("Number of tails: " + tails);
        
        diff=Math.abs(heads-tails);
        System.out.println("The difference: "+diff);
        
        return diff;
    }

    public static void main(String[] args) {
        //create dummy array
        int A[] = {0, 0, 0, 1, 0, 0};

        System.out.println(solution(A));

    }

}
