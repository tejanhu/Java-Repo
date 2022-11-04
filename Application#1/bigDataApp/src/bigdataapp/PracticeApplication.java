/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bigdataapp;

import java.util.*;
import java.io.File;
import java.io.IOException;
import java.util.regex.Pattern;

/**
 *
 * @author LatinoWolofKid
 */
public class PracticeApplication {
    
    Scanner in;
    
    List<String> alist = new ArrayList();

    //first get input from file
    public void getInput() {
        try {
            in = new Scanner(new File("dummy.txt"));
        } catch (IOException e) {
            System.out.println("FILE NOT FOUND!");
        }
    }//END getInput

    //store it into a list, splitting the words
    public String[] addWords() {
        
        String arrayL[]=new String[1000];
        while (in.hasNext()) {
            String w1 = in.next();
            //System.out.printf("%s\n", w1);
            arrayL = w1.split(("\\W"));
            for (int i = 0; i < arrayL.length; i++) {
                 System.out.println(arrayL[i]);
            }//END for loop
        }//END while loop
        return arrayL;
    }//END addWords

    public void containWord(String[] arrayL) {
        for (int i = 0; i < arrayL.length; i++) {
            alist.add(arrayL[i]);
            
        }
        for (int j = 0; j < arrayL.length; j++) {
            System.out.println(alist.get(j));
        }
        
    }
    
    public void closeFile() {
        in.close();
    }

    //create a data structure to contain both word and a counter for the number of occurences for that word
    //iterate through the list ... and check if the word exists already in the data structure
    //if it does, increment the counter
    //else, set the counter to one
}//END PracticeApplication
