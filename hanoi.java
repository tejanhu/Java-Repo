// A program to solve the Towers of Hanoi Puzzle
// (Its this simple with recursion)
// See slides for rules


import javax.swing.*;

class hanoi
{
    // Print out text
    static void report (String txt) 
    {
        System.out.println(txt);
    }

    // Recursively solve the Tower of Hanoi puzzle
    
    static void hanoi (int discs, char source, char target, char using)
    {
      if (discs==1)
      {
          report("move disc 1 from "+source+" to "+target);
	  }
      else
      {
        hanoi(discs-1,source,using,target);
        report("move disc "+discs+" from "+source+" to "+target);
        hanoi(discs-1,using,target,source);
      }
    }

    public static void main (String param[]) 
    {
	  String s = JOptionPane.showInputDialog("Enter number of discs: ");
	  int discs = Integer.parseInt(s); 

	  hanoi(discs,'A','C','B');
    }
}
