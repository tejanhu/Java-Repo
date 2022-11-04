/* ***************************************
   AUTHOR HA TEJAN
   Suppose you have your name and address to print twice.
   You don't have to write the message out twice.
   Define a method to do it, then call the method 
   twice.
   *************************************** */

class NameandAddress
{
    public static void main (String[] param)
    {
        // You want to print out your name and address twice (without writing it out twice)
		
        NameandAddressMessage();
 
        System.exit(0);
		
    } // END main


/* ***************************************************
	   Define some commands of our own to use above
   *************************************************** */
	
	/*  *************************
	    Print a NameandAddressMessage
	*/
	
    public static void NameandAddressMessage()
    {
 
     System.out.println("Hello Hussein!");
     System.out.println("Barking");
     System.out.println("East London");
     System.out.println("Essex");
     System.out.println("IG11 9HY");

		
    } // END NameandAddressMessage
	
	
	
} // END class NameandAddressMessage
