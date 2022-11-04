import javax.swing.*;


public class Question1
{

       
  
    public static void main(String [] args)
    {
       String name= JOptionPane.showInputDialog("What is your name?");
       String response="Hello "+ name;
       JOptionPane.showMessageDialog(null, response);
    }
}
