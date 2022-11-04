
import javax.swing.*;

class experiment5
{
    public static void main (String param[])
    {
         String string1="aaa";
         String string2="aaa";

	     JOptionPane.showMessageDialog(null, "string1 = \""+string1+"\"");
	     JOptionPane.showMessageDialog(null, "string2 = \""+string2+"\"");

	     JOptionPane.showMessageDialog(null, "string1 == string2: "+(string1 == string2));
	     JOptionPane.showMessageDialog(null, "Oh dear, didn't expect that!");
	     JOptionPane.showMessageDialog(null, "Must be down to optimisation!");

         String string3 = JOptionPane.showInputDialog("Enter string3 (type in aaa): ");

	     JOptionPane.showMessageDialog(null, "string1 = \""+string1+"\"");
	     JOptionPane.showMessageDialog(null, "string3 = \""+string3+"\"");
	     JOptionPane.showMessageDialog(null, "string1 == string3: "+(string1 == string3));
	     JOptionPane.showMessageDialog(null, "As we expect");
	     JOptionPane.showMessageDialog(null, "and just in case you think they really are different:");
	     JOptionPane.showMessageDialog(null, "string1.equals(string3): "+string1.equals(string3));
	     JOptionPane.showMessageDialog(null, "string3.equals(string1): "+string3.equals(string1));
    }
}

