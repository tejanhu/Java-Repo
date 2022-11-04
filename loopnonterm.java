class loopnoterm
{

    //  a silly method that calls itself
    //  notice there is no if statement to give a base case to get out
    
    static void loop ()
    {
        loop();
    }

    public static void main (String param[]) 
    {

     System.out.println("starting...");
     loop();
     System.out.println("finished!");

    }
}
