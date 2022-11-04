/* ***************************************
   AUTHOR Paul Curzon
   Suppose we have a long message to print twice.
   We don't have to write the message out twice.
   Define a method to do it, then call the method 
   twice.
   *************************************** */

class hellotwice
{
    public static void main (String[] param)
    {
        // We want to print out the long message twice (without writing it out twice)
		
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
 
        System.out.println("Hello Hussein!");
System.out.println("Barking");
System.out.println("East London");
System.out.println("Essex");
System.out.println("IG11 9HY");

		
    } // END longHelloMessage
	
	
	
} // END class hellotwice
