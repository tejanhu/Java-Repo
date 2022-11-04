/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problemsolvem;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author HusseinATejan
 */
public class PassValidationProgram {

    public static int solution(String S) {
        //creates substring array
        String someSubStrings[] = new String[S.length()];

        //regular expression to match password format
        String pattern = "([A-Z]+\\D*)";

        //create a pattern object
        Pattern r = Pattern.compile(pattern);
int biggestLength = -1;
        //create array to store each substrings' length
        int[] lengths = new int[someSubStrings.length];

        

        //iterate through String S to store substring
        for (int i = 0; i < S.length(); i++) {
            for (int j = 1; j <= someSubStrings.length - i; j++) {
                //store each substring of String S from position 1 to the last substring
                someSubStrings[i] = S.substring(i, i + j);
                //checks through array to find substrings that match format
                Matcher m = r.matcher(someSubStrings[i]);

                //if it matches store each substrings' length
                if (m.matches()) {
                    lengths[i] = someSubStrings[i].length();
                }
            }
        }

        for (int i = 0; i < lengths.length; i++) {
            if (lengths[i] > biggestLength) {
                biggestLength = lengths[i];
            }
           
        }
        
        if(biggestLength==0){
            biggestLength=-1;
        }

        return biggestLength;
    }

    public static void main(String[] args) {

        //alphanumeric text
        String S = "a0Ba";

        System.out.println(solution(S));

    }
}
