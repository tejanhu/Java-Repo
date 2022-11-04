/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package testcounter;



class Counter 
	{
		
                private int count;

    
		public Counter (int initialCount)  
			{
		  		count = initialCount;
			}

		public Counter ()  
			{
			 count = 0;
			}

		public void increment () 
			{
		 		count +=1;
			}

		public void reset () 
			{
		 		count = 0;
			}

		public int getValue () 
			{
		 		return count;
			}

   } // END Counter