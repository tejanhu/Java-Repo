package com.example.demo;

public class StringTask1 {
    public static String buildSentence() {
        String sentence = "I am going to London";
        return sentence;
    }

    public static String countWords(String s){
        int count = 0;

        String words[] = {"I", "am", "going", "to", "London"};

        String firstWord = s.substring(0,2);
        String secondWord = s.substring(1,4);
        String thirdWord = s.substring(4,10);
        String fourthWord = s.substring(10,13);
        String fifthWord = s.substring(13,20);


        for (int j = 0; j <words.length; j++) {
            for (count = 0; count < s.length(); count++) {
                for (int i = 1; i <= s.length() - count; i++) {
                    if (!s.substring(count, count + i).equals(words[j])){
                        continue;
                    }

                    else{
                        count++;
                    }
                }
            }
        }
        return count+" words";
    }

}
