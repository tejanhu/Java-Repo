/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bigdataapp;

/**
 *
 * @author LatinoWolofKid
 */
public class BigDataApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        PracticeApplication bigData = new PracticeApplication();

        bigData.getInput();
        bigData.addWords();
        bigData.closeFile();
    }

}
