/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testingapplications;

/**
 *
 * @author LatinoWolofKid
 */
public class TestingArraysLab {

    public static String[] remove(String[] arr, String mot) {
        int i = 0;

        for (; i < arr.length; i++) 
            if (arr[i].equals(mot)) {
                System.out.println("We coming out this baby!");
                System.out.println("Yeah. Yeah!!!");
                break;
            }
        
        if (i < arr.length) {
            String[] b = new String[arr.length - 1];
            System.out.println("We shrunk arr by the value of -1");
            for (int j = 0; j < i; j++) 
                b[j] = arr[j];
            
            for (int j = i + 1; j < arr.length; j++) 
                b[j - 1] = arr[j];
                return b;
            
        }
        else {
            String[] b = new String[arr.length];
            for (int index = 0; index < arr.length; index++) 
                b[index] = arr[index];
            

            return b;
        }
    }

    public static void main(String[] args) {

        String[] arr = {"Hussein", "Ahmed", "Tejan", "Bukhatir", "Dahir", "Peter", "Sulaiman", "Samuel", "Yacqoub"};

        String mot = "Peter";
        
       
        String b[]=remove(arr,mot);
        
        for (String element : b) {
            System.out.println(element);
        }
            
        

    }

}
