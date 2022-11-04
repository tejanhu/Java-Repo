/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javarevision;

/**
 *
 * @Enumeration class example HusseinATejan
 */
public enum Person {
    
    ebrima("morroccans", "O.G.java","26"),
    samsu("beans & rice", "assembly", "24"),
    hussein("habeshas", "crime", "21"),
    mohamed("dajaj & shipz", "react.js", "27"),
    usman("bariis & lahma", "chicken jalfrezi", "25");
  
    private final String like;
    private final String dislike;
    private final String age;
    
    Person(String preference, String disgust, String number){
        like = preference;
        dislike = disgust;
        age = number;
        
    }
    
    public String getPreference(){
        return like;
    }
    
    public String getDislike(){
        return dislike;
    }
    
    public String getAge(){
        return age;
    }


}
