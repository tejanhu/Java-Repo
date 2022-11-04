/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testingapplications;

/**
 *
 * @author Hussein Ahmed Tejan
 */
public class LinearSearch {

    
    //isIn returns a boolean as to whether an item is in the array or not.
    
    public static boolean isIn(String dict[], String word) {

        for (int i = 0; i < dict.length; i++) {
            if (word.equals(dict[i])) {
                return true;
            }
        }

        return false;

    }

//    isInPos returns the position where the item is located.
  

    public static int isInPos(String dict[], String word) {

        for (int i = 0; i < dict.length; i++) {
            if (word.equals(dict[i])) {
                return i;
            }
        }

        return -1;

    }

    public static void main(String[] args) {
        String words[] = {"a", "b", "c", "d", "e", "f", "g,", "h", "i,", "j", "k", "l", "m", "n", "o", "p", "q", "a", "r", "c", "b"};
        String str = "q";

        System.out.println(isIn(words, str));
        System.out.println(isInPos(words, str));
    }

}
