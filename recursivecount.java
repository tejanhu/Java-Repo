// A simple recursive program 
class recursivecount
{
    //just report current iteration
    
    static void report (String n) 
    {
       System.out.println(n);
    }

    // recursive method - calls itself
    //equivalent to a simple for loop
    // Try editing out the report statements one at a time
    // - can you explain what is happening over them
    static void loop (int n) 
    {
       report("Entering.." + n);
       if (n==0)
       {
         return; // base case
       }
       else
       {
         report("Do some work .." + n);
         loop(n-1); // step case
       }
       report("Leaving .." + n);
       return;

    }

    public static void main (String param[]) 
    {
       System.out.println("starting...");
       loop(10);
       System.out.println("finished!");
    }
}
