/* *****************************************
AUTHOR Paul Curzon
This program  reads the contents of a text file "wombat.txt" and counts the number of 
times the words “a” and “the” each occur in it. 
It is assumed that the file contains one word per line.   
******************************************** */
import java.io.*;

class countwords
{

    public static void main(String[] params) throws IOException 
    {
        BufferedReader inStream = new BufferedReader(new FileReader("wombat.txt"));

        int thecount = 0;
        int acount = 0;
        String nextword = inStream.readLine();

        // Repeatedly check the current word and check if its the or a counting if so
        while (nextword != null)
        {
            if (nextword.equals("a"))
                acount = acount + 1;
            else if (nextword.equals("the"))
                thecount = thecount + 1;

            nextword = inStream.readLine();
        }
        
        // Print the results
        System.out.println("There are " + acount + " a's " + thecount + " the's");

        inStream.close();
        
        System.exit(0);

    }
} 