public class helloargs
{
    
    public static void main(String[] args)
    {
        
       String nom_un=args[0];
       String nom_2=args[1];
       
        hello(nom_un, nom_2);
    }
    
    static void hello(String nom_un, String nom_2)
    {
        System.out.println("Hello " + nom_un);
        System.out.println("Hello " + nom_2);
    }
    
}
