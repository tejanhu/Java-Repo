/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package polymorphisim;

/**
 *
 * @author sm312
 */
public class Polymorphisim {

   
    public static void main(String[] args) {
        
        Animal mammal = new Animal (2,10,"blue"); // An object of animal called mammal is created 
        
       mammal.move(); // in here we just invoke the move method. The move method of animal is invoked  
        
        //mammal.dostuff();
        
        Animal flamingo = new Bird (2,200,"orange");
        
        flamingo.move(); // Dynamic Binding. The Bird's version is called !!! 
        
        Bird somebird = (Bird)flamingo; // we downcast from animal to bird to actually use bird methods which aren't common in the animal 
        
        somebird.Scream(); // now we can actually use the scream method because somebird is a bird type now!. 
        
        
        
    
    }




}
