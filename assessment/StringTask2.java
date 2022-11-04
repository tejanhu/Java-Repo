package com.example.demo;

public class StringTask2 {
    public static String buildSentence() {
        String sentence = "I am going to London";
        return sentence;
    }

    public static String countWords(String s){
        int count = 0;

        String words[] = {"I", "am", "going", "to", "London"};
        char letters[] = new char[s.length()];


        for (int i = 0; i < letters.length; i++) {
            letters = s.toCharArray();
            System.out.println(letters[i]);
        }

        String word = "going";

        char wordToCharArr[] = word.toCharArray();

        for (int i = 0; i <letters.length ; i++) {
            if(letters[i]==wordToCharArr[i]){
                count++;
                break;
            }
        }


        return count+" words";
    }

}
