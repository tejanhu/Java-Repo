/* *****************************************
AUTHOR Paul Curzon
This program demonstrates 
 - arrays and assignments

 
******************************************** */

import javax.swing.*;
class experiment4
{
    public static String print_array (int[] array) 
    {
	  int length = array.length;
	  String array_string = "";
	  for (int i=0; i<length-1; i++)
	  {
	    array_string = array_string + array[i] + " ";
	  }
	  array_string = array_string + array[length-1];
	  return array_string;
    }

    public static void main (String param[]) 
    {
        int lgth = 4;
        
        // create and fill the array a

        int a[] = new int[lgth];
        
	    for (int i=0; i<lgth; i++) 
	    {
	      a[i] = i;
	    }
	
	    JOptionPane.showMessageDialog(null, "a: "+print_array(a));

        // create and fill the array b so is exactly the same

        int b[] = new int[lgth];
        for (int i=0; i<lgth; i++)
        {
           b[i] = i;
        }
	    JOptionPane.showMessageDialog(null, "b: "+print_array(b));

        JOptionPane.showMessageDialog(null, "Is a==b?  "+(a==b));


        JOptionPane.showMessageDialog(null, "Now do b=a; then check if they are still ==");
        
        b=a;

        JOptionPane.showMessageDialog(null, "Is a==b?  "+(a==b));

	    
	    JOptionPane.showMessageDialog(null, "a: "+print_array(a));
	    JOptionPane.showMessageDialog(null, "b: "+print_array(b));

        

    }
}
