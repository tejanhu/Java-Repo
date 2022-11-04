/* *****************************************
AUTHOR Paul Curzon

  A program to demonstrate if statements on a string value Try
changing the assignment of ans to something else to see the
difference.  Notice that you do not use == to compare strings, but
rather use the more cumbersome equals. Using == for strings is a
common mistake so watch out for it...
   
******************************************** */

import javax.swing.*;

class insultornot
{
    public static void main (String[] param)
    { 
        insultme();
        System.exit(0);
        
    } // END main

/* *********************************
    A method that asks to insult you 
*/
    public static void insultme()
    {

       String ans= "no"; 
       ans = JOptionPane.showInputDialog("Can I insult you, please?");
       
       if (ans.equals("y"))
       {
           printInsultingMessage();
       }
       else
       { 
           printNiceMessage();
       }

       JOptionPane.showMessageDialog (null,"Bye!");
       return;

    } // END insultme
    

/* *********************************
    Print an insulting message 
*/
    public static void printInsultingMessage()
    {
       JOptionPane.showMessageDialog (null,"You smell!"); 
       JOptionPane.showMessageDialog (null,"I mean it!");
 
       return;

    } // END printInsultingMessage

/* *********************************
    Print a nicemessage 
*/
    public static void printNiceMessage()
    {
       JOptionPane.showMessageDialog(null,"You smell of roses!");
       JOptionPane.showMessageDialog (null,"Wow!!");
 
       return;

    } // END printNiceMessage
    
} // END class insultornot
