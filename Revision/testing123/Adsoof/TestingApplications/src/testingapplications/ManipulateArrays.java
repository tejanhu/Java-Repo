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
public class ManipulateArrays {

    public static String[] removePos(String[] a, int pos) {

        String[] b = new String[a.length - 1];
        for (int i = 0; i < pos; i++) {
            b[i] = a[i];
        }
        for (int i = pos + 1; i < a.length; i++) {
            b[i - 1] = a[i];
        }
        return b;
    }

    public static boolean isPosinArray(String[] a, int pos) {

        for (int i = pos; i < a.length; i++) {
            //pos = i;
            if (a[i] == a[pos]) {
                System.out.println("pos is in A");
                return true;
            } else {
                throw new ArrayIndexOutOfBoundsException();

            }

        }
        return false;

    }
    public static boolean isPosinArray2(String[] a, int pos) {
        boolean checkIn=false;
        try {
            
        if (a[pos]==a[pos]) {
            return true;
        }
        
        } 
        
        catch (Exception e) {
           return checkIn;
        }  
        return checkIn;          
    }

    public static void main(String[] args) {

        String[] a = {"Hussein", "Ahmed", "Tejan", "Bukhatir", "Dahir", "Sulaiman"};
        int pos = 0;
        System.out.println("Output:");
//        String[] c = removePos(a, 3);
//        for (String element : c) {
//            System.out.println(element);
//        }
        System.out.println(isPosinArray(a, 3));

    }

}
