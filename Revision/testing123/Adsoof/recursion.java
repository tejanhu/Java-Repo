
public class recursion
{

    public static boolean startsWith(String str1,String str2)
    // Returns true if str1 starts with str2, false otherwise!
    {
        if(str2.length()==0)
            return true;
        else if(str1.length()==0)
            return false;
        else if(str1.charAt(0)!=str2.charAt(0))
            return false;
        else
            return
            startsWith(str1.substring(1),str2.substring(1));
    }

    public static void main(String[]args)
    {
       String str1="a";
       
       String str2="abc";
       
       System.out.println(startsWith(str1, str2));
        

    }
}
