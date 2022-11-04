/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package polymorphisim;


public class Bird extends Animal {

    
public Bird (int neweyes, int newspots, String newtone){

super (neweyes,newspots,newtone);


}


public void move() {


System.out.println(" I am a bird and i can move");

}

public void Scream (){

System.out.println("EEEEEk!");


}




} // end bird class
