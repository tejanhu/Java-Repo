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
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.*;

/**
 *
 * @author HusseinATejan
 */
public class Problem2 {

    //
    public static int solution(String S) {
        //creates substring array
        String someSubStrings[] = new String[S.length()];

        //regular expression to match
//        String pattern = "([a-z.A-Z+])[^//d]";
        String pattern = "(^[A-Z]|[$A-Za-z.[^0-9]]\\w)";
        //create a pattern object
        Pattern r = Pattern.compile(pattern);

        int[] lengths = new int[someSubStrings.length];

//        ArrayList<String> someStrings= new ArrayList<>()
        int biggestLength = -1;

        for (int i = 0; i < S.length(); i++) {
            for (int j = 1; j <= someSubStrings.length - i; j++) {
//                String someSubString = someSubStrings[j];
                someSubStrings[i] = S.substring(i, i + j);
                System.out.println("All possible substrings: " + someSubStrings[i]);

                Matcher m = r.matcher(someSubStrings[i]);
                if (m.matches()) {
                    System.out.println(someSubStrings.length + " AND WHAT");
                    lengths[i] = someSubStrings[i].length();
                    biggestLength = Math.max(lengths[i], lengths[j]);
                    System.out.println("Whats up HT?");
                    System.out.println(lengths[i]);
                    System.out.println(someSubStrings[i] + " - Oh YES it does!");
                } else {
                    System.out.println(someSubStrings[i] + " - Oh NO it doesn't!");
                    biggestLength = -1;
                }
            }
        }
        for (int i = 0; i < lengths.length; i++) {
            System.out.println("Hey sugar: "+ someSubStrings[i]+ " " + lengths[i]);
            if(lengths[i]>biggestLength){
                biggestLength=lengths[i];
            }
        }

//        for (int i = 0; i < lengths.length; i++) {
//            for (int j = 1; j <= lengths.length; j++) {
//                if(lengths[i]>lengths[j]){
//                    biggestLength=lengths[i];
//                }
//                else{
//                    biggestLength=lengths[j];
//                }   
//            }
//        }
        System.out.println("");
//        for (int i = 0; i < someSubStrings.length; i++) {
//            System.out.println("here we go: " + someSubStrings[i]);
//
//        }
        System.out.println("");
        //regular expression to match
//        String pattern = "[a-z.A-Z+][^//d]";

        //create a pattern object
//        Pattern r = Pattern.compile(pattern);
//        int biggestLength = 0;
        //acceptable substrings
//        ArrayList<String> subStr = new ArrayList<String>();
//
//        for (int i = 0; i < someSubStrings.length; i++) {
//            Matcher m = r.matcher(someSubStrings[i]);
//            if (m.matches()) {
//                subStr.add(m.group());
//                System.out.println(someSubStrings[i] + " - Oh YES it does!");
//            } else {
//                System.out.println(someSubStrings[i] + " - Oh NO it doesn't!");
//            }
//        }
//        boolean biggestFound = false;
//
//        ArrayList<Integer> lengths = new ArrayList<>();
//        for (int j = 0; j < subStr.size(); j++) {
//            System.out.println("Here I am :" + subStr.get(j));
//            lengths.add(subStr.get(j).length());
//            System.out.println("My size is: " + lengths.get(j));
//            biggestLength = lengths.get(j);
//        }
//        for (int j = 0; j < lengths.size(); j++) {
//
//            if (lengths.get(j) > lengths.get(j + 1)) {
//                biggestLength = lengths.get(j);
//                System.out.println("You can't see me or do you?");
//            } else if (lengths.get(j + 1) > lengths.get(j)) {
//                biggestLength = lengths.get(j + 1);
//                System.out.println("Hey!");
//
//            } else {
//                biggestLength = -1;
//                System.out.println("OIII!");
//            }
////                biggestLength = Math.max(lengths.get(j), lengths.get(k));
////                System.out.println(biggestLength);
//            biggestFound = true;
//
//        }
//        System.out.println(subStr);
        return biggestLength;
    }

    public static void main(String[] args) {

        //alphanumeric text
        String S = "a0Ba";
        int biggestLength = 0;

        System.out.println(solution(S));

    }

//    private static void matchPassFormat(String[] someSubStrings) {
//        //regular expression pattern
//        String pattern = "[a-zA-Z+][^//d]";
////        /([a-z+][^0-9])/i
//        //([+(a-zA-Z)^\\d])
//        //create a pattern object
//        Pattern r = Pattern.compile(pattern);
//        
//        ArrayList <String> subStr=new ArrayList<String>();
//
//        for (int i = 0; i < someSubStrings.length; i++) {
//            Matcher m = r.matcher(someSubStrings[i]);
//            if (m.matches()) {
//                subStr.add(m.group());
//                System.out.println(someSubStrings[i]+" - Oh YES it does!");
//            } else {
//                System.out.println(someSubStrings[i]+" - Oh NO it doesn't!");
//            }
//            
//        }
//        System.out.println(subStr);
//        //create a matcher object
//
////        String temp = "";
//    }//END findLongestSubString
}//END class

