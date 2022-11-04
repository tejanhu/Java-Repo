//**AUTHOR: H A TEJAN**
//***
//***
//***

import javax.swing.JOptionPane;

public class methods_witharrays
{





public static void main (String [] param)
{
	String [] show= shows();
	boolean []ArrayB=boolee ();
	boolean ArrayB2[]=chosen (show,ArrayB);
	String[] theatre=theatre1();
	print(ArrayB2,theatre,show);

} // END main




public static  void theatre ()
{
	String [] chosentheatre = new String [5];
	chosentheatre[0] = "Queens Theatre";
	chosentheatre[1] = "Kings Theatre";
	chosentheatre [2] = "Prince Theatre";
	chosentheatre[3] = "Garrick Theatre";
	chosentheatre [4] = "Princess Theatre";
	
}// end theatre


public static String[] shows ()
{

String [] show = {"Phantom of the Opera","Les Miserables", "Cats", "Chicago", "Mamma Mia"};
return show;

} // END shows

public static boolean[] boolee ()
{
	boolean [] ArrayB = new boolean [5];
	ArrayB[0] = false;
	ArrayB[1]= false;
	ArrayB[2]= false;
	ArrayB[3]= false;
	ArrayB[4]= false;
	
	return ArrayB;
} // END boolee

public static boolean[] chosen (String [] show, boolean [] ArrayB)
{

String [] chosenshow = new String[5];

JOptionPane.showMessageDialog(null, "Please type yes if you're interested in any of the following shows.");


for(int i=0; i<5; i++){
	chosenshow[i] = JOptionPane.showInputDialog(show [i]);
	if(chosenshow[i].equals("yes")){
		
		System.out.println(show [i] + " "+ chosenshow[i]);
		ArrayB[i]=true;
	}
	else if( chosenshow[i].equals("no")){
		System.out.println(show [i] + " "+ chosenshow[i]);
		ArrayB[i]=false;
	}
}// End for

	return ArrayB;


}


public static String[] theatre1()
{

String [] theatre = {"Queens Theatre", "Garrick Theatre","Hussein", "Ahmed", "U"};
return theatre;
} // END theatres


public static void print (boolean[] ArrayB2,String[] theatre,String[]show)
{
	for(int i=0; i<5; i++){
		if(ArrayB2[i]){
			System.out.println(show[i]+": "+ theatre[i]);
		}
	}
} // END print






} // END methods_witharrays
