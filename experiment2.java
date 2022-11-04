/* *****************************************
AUTHOR Paul Curzon
This program demonstrates 
 - arrays and assignments

 
******************************************** */


import javax.swing.*;


class experiment2 
{
    
    public static void main (String param[]) 
    {

        int a=0;
        JOptionPane.showMessageDialog(null,"a: "+a);


        int b=1;
        JOptionPane.showMessageDialog(null,"b: "+b);


        JOptionPane.showMessageDialog(null,"do b=a;");

        b=a;


        JOptionPane.showMessageDialog(null,"a: "+a);
        JOptionPane.showMessageDialog(null,"b: "+b);

        JOptionPane.showMessageDialog(null,"Change a: a=2;");

        a=2;


        JOptionPane.showMessageDialog(null,"a: "+a);
        JOptionPane.showMessageDialog(null,"b: "+b);

        JOptionPane.showMessageDialog(null,"Change b: b=3;");

        b=3;


        JOptionPane.showMessageDialog(null,"a: "+a);
        JOptionPane.showMessageDialog(null,"b: "+b);

    }
}
