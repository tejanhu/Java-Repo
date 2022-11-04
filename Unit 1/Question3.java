import javax.swing.*;

public class Question3
{
   
    public static void main(String []args)
    {
        String eyecolour;
        eyecolour=JOptionPane.showInputDialog("What colour are your eyes?");
        JOptionPane.showMessageDialog(null, "So your eyes are"+ " "+ eyecolour + " are they. I like" + " " +eyecolour+".");
        
        if(eyecolour=="brown"){
            
            JOptionPane.showMessageDialog(null, "So your eyes are"+ " "+ eyecolour + " are they. I like" + " " +eyecolour+".");
        
            
        }
    }
}
