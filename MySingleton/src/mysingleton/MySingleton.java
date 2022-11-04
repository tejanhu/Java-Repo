/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mysingleton;

/**
 *
 * @author ht304
 */
public class MySingleton {

    //placeholder for singleton object
    private static MySingleton __me=null;
    
    //nobody can instantiate this class from outside
    private MySingleton(){
        
    }  
    
    public static MySingleton getInstance(){
        //do I exist?
        if(__me==null){
            //if not, instantiate and store a new MySingleton object
            __me=new MySingleton();
        }
        return __me;
    }
    
    public void search(){
        //..
    }
    
    
    public static void main(String[] args) {
        
        //valid to just call the getInstance method on MySingleton itself and just call the procedure 
        MySingleton.getInstance().search();
        
        
        //valid to create an object of type MySingleton that has acces to the getInstance method
        MySingleton mono=MySingleton.getInstance();
        //finally that object can use the method       
        mono.search();
        
        
        
    }
}
