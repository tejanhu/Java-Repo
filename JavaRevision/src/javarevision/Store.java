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
public class Store {
    
    private String name="";
    private int i = 0;    
    private Product [] itemList = new Product[5];
    
    public void sell(Product item){
        System.out.println("Selling: "+item.getTitle()+" for"+item.getPrice());
    }
    
    public void add(Product item){
        if(i<itemList.length){
             itemList[i]=item;
             System.out.println(item.getTitle()+" Item added at Store in index "+i);
             i++;
        }
       
               
    }
    

}
