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
public class FileWriterRunner {
    public static void main(String[] args) {
        FileWritter fw = new FileWritter();
        
        fw.openFile();
        fw.writeRecords();
        fw.closeFile();
    }
}
