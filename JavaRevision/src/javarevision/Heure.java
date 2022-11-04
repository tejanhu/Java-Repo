/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javarevision;

/**
 *
 * toString method example
 */
public class Heure {

    private int month;
    private int day;
    private int year;

    public Heure(int m, int d, int yr) {
        month = m;
        day = d;
        year = yr;
        
        System.out.printf("The constructor for this is %s\n", this);
    }
    
    public String toString(){
        return String.format("%d/%d/%d", month, day, year);
    }
    
    

}
