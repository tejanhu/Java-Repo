package com.example.demo;


public class DemoApplication {

    public static void main(String[] args) {
        StringTask1 st1 = new StringTask1();

//        System.out.println(st1.buildSentence());
//        String ws = st1.buildSentence();
//        System.out.println(st1.countWords(ws));

        StringTask2 st2 = new StringTask2();
        System.out.println(st2.buildSentence());
        String ws2 = st2.buildSentence();
        System.out.println(st2.countWords(ws2));
//
//        String s = "I am going to London";
//
//        String words[] = {"I", "am", "going", "to", "London"};
//
//        System.out.println(s.substring(13,20));
    }
}
