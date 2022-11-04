/* ***************************************
   AUTHOR: H A TEJAN 
	   

   ****************************************/

import javax.swing.*;


class ages3 
{



public static void main (String []param)
{
PASS ();

} // END main



public static void PASS ()
{

String again= "yes";


while (again.equals("yes"))
{
double age1,age2;
double averageAge=0;
String textinput;
 textinput = JOptionPane.showInputDialog("Give me primary age?");
age1=Double.parseDouble(textinput);
textinput=JOptionPane.showInputDialog("Give me the second age?");
age2= Double.parseDouble(textinput);

averageAge = calculateAverage (age1,age2);

System.out.println("Average:   "  + averageAge);

again = JOptionPane.showInputDialog("Continue? (yes/no)");

} 


}// End Pass
//return;

public static double calculateAverage(double age1, double age2) {
double av;
av=((age1+age2)/2);


return av;


} // END calculateAverage




} // END class age3
