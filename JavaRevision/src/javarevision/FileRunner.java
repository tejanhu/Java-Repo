/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javarevision;

import java.io.File;

/**
 *
 * File Class Usage example HusseinATejan
 */
public class FileRunner {
    public static void main(String[] args) {
        File f = new File("/Users/HusseinATejan/Desktop/grukgb.rb");
        
        if(f.exists()){
            System.out.println("The file: '"+f.getName()+"' exist!");
        }
        else{
            System.out.println("The file: '"+f.getName()+"' DOES NOT EXIST!");
        }
    }
}
