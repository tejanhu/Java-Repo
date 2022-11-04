/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javarevision;

import java.util.EnumSet;

public class Runner {

    public static void main(String[] args) {
//        Heure timeObject = new Heure(6,6,6);
//        Heure dateObject = new Heure(15,1,17);

        for (Person people : Person.values()) {
            System.out.printf("%s\t%s\t%s\n", people, people.getPreference(), people.getDislike(), people.getAge());
        }
        
        /*
        EnumSet Example
        */
        System.out.println("\nAnd now for the range of constants!!!\n");

        for (Person people : EnumSet.range(Person.samsu, Person.mohamed)) {
            System.out.printf("%s\t%s\t%s\n", people, people.getPreference(), people.getDislike(), people.getAge());
        }
        
        
        Vehicle motors[]=new Vehicle[2];
        motors[0]= new Car();
        motors[1]= new Mercedes();
        
//        Vehicle mv=new Car();
//        mv.drive();

        System.out.println("\n");
        
        Store someStore = new Store ();
//        Product p = new Product("Kettle", 12.99, 1);
        Game g = new Game("Finding Nemo", 4.99, 3);
        Movie m = new Movie("Child's play II", 13.99, 5);
//        someStore.add(p);
        someStore.add(g);
        someStore.add(m);

        
//        VideoGameStore vgs = new VideoGameStore();
//        Videogame vg = new Videogame("Max Payne 3",2.99,3);
//        Videogame vg2 = new Videogame("WWE Smackdown Here comes the Pain!", 0.50, 1);
//        Videogame vg3 = new Videogame("Viva Pinata", 20.19, 19);
//        
//        vgs.add(vg);
//        vgs.add(vg2);
//        vgs.add(vg3);
//        
        System.out.println("\n");
//        
//        Cex store = new Cex();
//        store.add(vg);
//        store.add(vg2);
//        store.add(vg3);
        
        System.out.println("\nBreaking the line!\n");
        
        for (int i = 0; i <motors.length; ++i) {
            motors[i].drive();
        }
        
    }
}
