   /*****************************************
   /*AUTHOR: HUSSEIN AHMED TEJAN
	
   ****************************************/


import javax.swing.*;

	class making_d1 
		{
		    public static void main (String[] param)
		    {

				decision();  
		
				System.exit(0);
		
		    } // END main

	
			/* *****************************************************************************
			*This method is based on decisions in regards 
			*to what destination the user would be interested to know about	
			*so that they are prepared for any problems they may encounter with their trains.
			*/
	
		    public static void decision ()  
					              
		    {
		 
			String ans= JOptionPane.showInputDialog("What destination would you like to know about?");
		     
			if(ans.equals("Leeds")){

		       JOptionPane.showMessageDialog(null,"The trains to Leeds are REPLACED BY A BUS SERVICE.");
		}
		     else if

		       (ans.equals("Liverpool")){

		      System.out.println("The trains to Liverpool will have MINOR DELAYS.");
		}

		     else if (ans.equals("Manchester")){

		      JOptionPane.showMessageDialog(null,"The trains to Manchester have no problems.");
		}
		  
		     else {

		      System.out.println("I know nothing about "+ ans);  // if the user types anything other than these places, there will be a message saying how it is unknown

		}
		  

		 
		    } // END decision            
	
	
	
	
		} // END class making_d1  
			       
