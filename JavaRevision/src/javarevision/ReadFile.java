/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javarevision;

import java.io.*;
import java.util.*;

/**
 *
 * @author HusseinATejan
 */
public class ReadFile {

    private Scanner input;

    public void openFile() {
        try {
            input = new Scanner(new File("annualReport.txt"));
        } catch (Exception e) {
            System.out.println("Could not find file!");
        }
    }

    public void readFile() {
        while (input.hasNext()) {
            String a = input.next();
            String b = input.next();
            String c = input.next();
            
            System.out.printf("%s %s %s\n", a,b,c);
        }
    }
    
    public void closeFile(){
        input.close();
    }
}
