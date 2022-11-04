
/**
 * Write a description of class week2i here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class week2i
{

    public static void pizza(String[] toppings){
        
        for(String topping: toppings){
        System.out.println(topping);
        }
    }

    public static void main(String[] args)
    {
        String[] toppings={"tomato","kebab","pepporoni","meatballs"}; //local variable

        pizza(toppings); //local variable is argument
        
        //local variable will be initialised to the above variable

    }
}
