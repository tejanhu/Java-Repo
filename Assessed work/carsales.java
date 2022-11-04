/*AUTHOR: MATEUSZ STOKLOSA     DATE: 12/11/2013*/
import javax.swing.*;

class carsales
{
 public static void main(String[]param)
	{
	String eh = type();
	String ps = panel();
	int discountp = discount(eh, ps);
	int totals = total(discountp, eh, ps);
	optionschosen(totals, eh, ps, discountp);
	System.exit(0);
	}

 public static String type ()
	{
	String he = JOptionPane.showInputDialog("Hybrid or Electric?");
	
	return he;
	}

 public static String panel()
	{
	String sp = JOptionPane.showInputDialog("Solar panel? (Yes/No)");

	return sp;
	}

 public static int discount(String eh, String ps)
	{
	int discountp = 0;

		if ((eh.equals("Electric")) && (ps.equals("Yes")))
			{
			discountp = -500;
			}
		else
			{
			discountp = 0;
			}
	return discountp;
	}

 public static int total(int discountp, String eh, String ps)
	{
	int totalp = 0; 
	int additional = 0;
	totalp = (20000 + discountp);

		if(eh.equals("Electric") && ps.equals("Yes"))
		{
		additional = 5000 + 2000;
		}
		else if (eh.equals("Electric"))
		{
		additional = 2000;
		}
		else if (ps.equals("Yes"))
		{
		additional = 5000;
		}
	totalp = totalp + additional;

	return totalp;

	}

public static void optionschosen(int totals, String eh, String ps, int discountp)
	{

	String message = " ";

	if(eh.equals("Electric") && ps.equals("Yes"))
		{
		message = "Electric model: 2000\nSolar Panel: 5000\n";
		}
		else if (eh.equals("Electric"))
		{
		message = "Electric model: 2000\n";
		}
		else if (ps.equals("Yes"))
		{
		message = "Solar Panel: 5000\n";
		}

JOptionPane.showMessageDialog(null, "Basic Price: 20000\n" + message + "Discount: " + discountp + "\n\nTotal: " + totals);
	}

}//END class
