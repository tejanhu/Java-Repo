class WelcomeTwice
{
    public static void main (String[] param)
    {
        // We want to print out the long message twice (without writing it out twice)
		
        longHelloMessage();
        longHelloMessage();
        System.exit(0);
		
    } // END main


/* ***************************************************
	   Define some commands of our own to use above
   *************************************************** */
	
	/*  *************************
	    Print a long welcome message
	*/
	
    public static void longHelloMessage ()
    {
 
        System.out.println("HELLO EVERYBODY THE WORLD IS MY OYSTER :D");
		
    } // END longHelloMessage
	
	
	
} // END class hellotwice
