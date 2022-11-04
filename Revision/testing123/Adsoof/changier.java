import java.util.*;
/**
 * Write a description of class changier here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class changier
{

    public static <T> ArrayList<T>testconstChange(ArrayList<T> uno, T primary, T secondary){

        ArrayList<T> douze = new ArrayList<T>();
        for(int i=0; i<uno.size(); i++)
        {
            T next = uno.get(i);
            if(next.equals(primary))
                douze.add(secondary);
            else
                douze.add(next);
        }
        return douze;

        
    }//END testconstChange

    public static void main(String[] param)
    {
        ArrayList<Integer> uno=new ArrayList<Integer>();
        
        Integer primary= 100;
        
        Integer secondary=200;
        
        uno.add(primary);
        //uno.add("uno");
        uno.add(secondary);
        //uno.add("douze");
        uno.add(primary);
        //uno.add("treize");
        System.out.println(uno);
        
        System.out.println(testconstChange(uno, primary, secondary));

    }//END main
    
}//END changier
