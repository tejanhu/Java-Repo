/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javarevision;

/**
 *
 * @author HusseinATejan
 */

import java.util.*;

public class FileCreatorRunner {

    public static void main(String[] args) {
        final Formatter FORMAT;
        
        try{  
            FORMAT=new Formatter("someFile.txt");
            System.out.println("Just created a file.");
        }
        catch(Exception e){
            System.out.println("You got a file error!");
        }
    }

}
