/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package polymorphisim;


public class Animal {
    


private int eyes;

private int spots;

private String tone;

public Animal(int neweyes, int newspots, String newtone){
    
    eyes=neweyes;
    spots=newspots;
    tone=newtone;
    
}




public void dostuff(){

System.out.println("I'm doing stuff");
}



public void move() {

System.out.println("I'm moving yay");
 

}

    /**
     * @return the eyes
     */
    public int getEyes() {
        return eyes;
    }

    /**
     * @return the spots
     */
    public int getSpots() {
        return spots;
    }

    /**
     * @return the tone
     */
    public String getTone() {
        return tone;
    }




} // end Animal class








