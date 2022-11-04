//Author: Iqbal Hussain

//The program is called 'Chatbot' which is a simulated bot which can talk and reply to humans. 
import javax.swing.*; // import the swing library for I/O

class chatbot1
	{
    	public static void main (String[] param)
    	{
        
        hello();
        askForFact();
        
        System.exit(0);
    	} // END main

	public static void hello()
	{ 
	JOptionPane.showMessageDialog(null, "Hello Human, I am a chatbot." );

	}// Basic dialogue message
    

        public static void askForFact()
		{

       String userfact = JOptionPane.showInputDialog("Hi, what's your name?");
        

	{
       JOptionPane.showInputDialog(null, "Hi there " + userfact + ". How are 		you?");
	//Basic input diagoue message and response
	
}}
	}// End program 
