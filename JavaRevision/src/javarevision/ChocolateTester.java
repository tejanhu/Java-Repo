package javarevision;

import javarevision.Chocolate;

public class ChocolateTester{

	   public static void main (String[] args){

	      //Create an object of chocolate

	          Chocolate choc = new Chocolate(101, "Cadbury", 12, 10);

	      //Use getter methods to display the values

	          choc.getBarCode();

	          choc.getCost();

	          choc.getName();

	          choc.getWeight();

	      //Use setter methods to modify the values

	          choc.setBarCode(201);

	          choc.setCost(20);

	          choc.setName("Twix");

	          choc.setWeight(18);

	      //Use getter methods to display the modified values

	          choc.getBarCode();

	          choc.getCost();

	          choc.getName();

	          choc.getWeight();

	  }

	}
