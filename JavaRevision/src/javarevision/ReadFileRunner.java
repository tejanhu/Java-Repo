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
public class ReadFileRunner {

    public static void main(String[] args) {
        ReadFile rf = new ReadFile();
        
        rf.openFile();
        rf.readFile();
        rf.closeFile();
    }
}
