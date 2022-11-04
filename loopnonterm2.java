// another non-terminating program 
class loopnonterm2
{
    //just report current iteration
    
    static void report (int n) 
    {
       System.out.println(n);
    }

    // calls itself
    static void loop (int n) 
    {
       report(n);
       loop(n+1);
    }

    public static void main (String param[]) 
    {
       System.out.println("starting...");
       loop(1);
       System.out.println("finished!");
    }
}
