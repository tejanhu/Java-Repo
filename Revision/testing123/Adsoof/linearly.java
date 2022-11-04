
public class linearly
{

    public static boolean isIn(String[] a,String str)
    {
        for(int i=0; i<a.length; i++)
        if(a[i].equals(str))
        return true;
        return false;
    }

   
    public static void main(String[] args)
    {
        String dict[]={"fish"};
        
        String word="fish";
        
        System.out.println(isIn(dict, word));
        
    }
}
