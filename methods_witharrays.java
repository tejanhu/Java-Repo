//**AUTHOR: H A TEJAN**
//***
//***
//***

import javax.swing.JOptionPane;

public class methods_witharrays
{





public void main (String [] param)
[
String [] show= shows ();
chosen (show);





} // END main


public void chosen (String [] show)
{

String [] chosenshow = new String [5]
String [0] = JOptionPane.showInputDialog("show?");
String [1] = JOptionPane.showInputDialog("show?");
String [2] = JOptionPane.showInputDialog("show?");
String [3] = JOptionPane.showInputDialog("show?");
String [4] = JOptionPane.showInputDialog("show?");

String [] chosentheatre = new String [5]
String [0] = JOptionPane.showInputDialog("theatre?");
String [1] = JOptionPane.showInputDialog("theatre?");
String [2] = JOptionPane.showInputDialog("theatre?");
String [3] = JOptionPane.showInputDialog("theatre?");
String [4] = JOptionPane.showInputDialog("theatre?");

System.out.println(show [0] + ""+ chosen [0]);
System.out.println(show [1] + ""+ chosen [1]);
System.out.println(show [2] + ""+ chosen [2]);
System.out.println(show [3] + ""+ chosen [3]);
System.out.println(show [4] + ""+ chosen [4]);

}


public String[] shows (String [] param)
{
String interest;

interest= JOptionPane.showInputDialog("Please type yes if you're interested in any of the following shows.");

String [] show = {"Phantom of the Opera","Les Miserables", "Cats", "Chicago", "Mamma Mia"};
return show;

} // END shows



public static void theatre (String [] param)
{

String [] theatre = {"Queens Theatre", "Garrick Theatre"}



} // END theatres


public static void print (String [] param)
{
System.out.println("1.  chosen show :" + chosen [0]);
System.out.println("2.  chosen show :" + chosen [1]);
System.out.println("3.  chosen show :" + chosen [2]);
System.out.println("4.  chosen show :" + chosen [3]);
System.out.println("5.  chosen show :" + chosen [4]);


public static void boolee ()
{
boolean [] ArrayB = new boolean [5];
ArrayB[0] = false;
ArrayB[1]= false;
ArrayB[2]= false;
ArrayB[3]= false;
ArrayB[4]= false;

return ArrayB;
} // END boolee




} // END methods_witharrayschosen_show
