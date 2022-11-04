/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javarevision;

import java.lang.*;
import java.util.*;
import java.io.*;

/**
 *
 * @author HusseinATejan
 */
public class FileWritter {
    
    private Formatter f;
    
    public void openFile() {
        try{
            f=new Formatter("annualReport.txt");
//            System.out.println("GENERATED FILE!");
        }
        catch(Exception e){
            System.out.println("FILE ERROR!");
        }
    }

    public void writeRecords() {
        f.format("%s\t%s\t%s\t%s", "United Kingdom|","IBM|","Software Engineer|","£23,000\n");
        f.format("%s\t%s\t%s\t%s", "United Kingdom|","MagenTys|","Software Engineer|","£23,000\n");
        f.format("%s\t%s\t%s\t%s", "United Kingdom|","Skype|","Software Engineer|","£21,000");
    }

    public void closeFile() {
        f.close();
    }
}
