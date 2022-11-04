//Author: Iqbal Hussain

//The program is called 'Chatbot' which is a simulated bot which can talk and reply to humans. 
import javax.swing.*; // import the swing library for I/O

class chatbot2
	{
    	public static void main (String[] param)
    	{
        
        hello();
        askForFact();
        
        System.exit(0);
    	} // END main
	
	
    	public static void hello()
		{ 
		JOptionPane.showMessageDialog(null, "Hello Human, I am a 			chatbot." );
		return;
		}// Basic dialogue message

        public static void askForFact()
		{

       		String userfact = JOptionPane.showInputDialog("Hi, what's your 			name?");

       		JOptionPane.showInputDialog(null, "Hi there " +  userfact + ". 			How are you?"); 
       
      	String userfact1 = JOptionPane.showInputDialog("I'm glad to hear it " + 	userfact + ". Do you like Football? ");
		//Here are the first set of decision's, which give out a 			response depending on what the user previously inputs.
     		if(userfact1.equalsIgnoreCase("Yes"))
        	{
           
    	 	String userfact2 = JOptionPane.showInputDialog(null, "I like 			football "+ "too " + userfact + ". Who do you support?");       
        	}
  
        	else 
        	{
	 	String userfact3 = JOptionPane.showInputDialog(null, "How can 			you not like football. It's amazing" + userfact + ". You must 			have a team that you support?"); 
		}

      	JOptionPane.showInputDialog("Really? Why is that then?");
	JOptionPane.showMessageDialog(null, "I'm glad to hear that but I have 		to go now.  I've enjoyed talking with you " + userfact + ".");

  	} // END askForFact
	}// END class chatbot


       
