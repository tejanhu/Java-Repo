import java.util.Random; //be sure to write java.util and NOT javax.util.Random

public class example4{ //be careful with the way you write the opening curly bracket

public static void main(String[] param){
    
   
    kid_dice(); // cannot creatr a method containing a hyphen "-" dawg
    
    
    
    
    
    System.exit(0);
    
    
    
    
    
}

public static void kid_dice()

{
    
    Random kid= new Random(); // declares a new variable called kid of type Random
    
    int rolls = kid.nextInt(12) + 1; //used to roll a 10-sided dice
    
    System.out.println("You rolled " + rolls + " on a 12-sided dice.");
    
    
}
















}