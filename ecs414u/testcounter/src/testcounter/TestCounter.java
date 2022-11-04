/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package testcounter;


public class TestCounter {

    
    
    public static void main(String[] args) {
        Counter ctr=new Counter(0);
        Counter ctr2=new Counter(1);
        
        System.out.println(ctr.getValue());
        ctr.increment();
        System.out.println(ctr.getValue());
        ctr.reset();
        System.out.println(ctr.getValue());
        System.out.println(ctr2.getValue());
        
    }
}
