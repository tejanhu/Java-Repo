import java.util.*;

public class Ex7
{
    
    public static void raises (DrinksMachine dm1, DrinksMachine dm2, int p){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an integer.");
        p=input.nextInt();
        
        if(dm1.getPrice()>dm2.getPrice()){
          int originalprice=dm2.getPrice(); 
          int newprice=  dm2.getPrice() +p;
          System.out.println("Was :" + originalprice +" " + "Now :" + newprice);
        }
        else{
          int originalprice=dm1.getPrice();   
          int newprice=  dm1.getPrice() +p;
          System.out.println("Was :" + originalprice +" " + "Now :" + newprice);
        }
        
    }
    
    
    public static void main(String[] args)
    {
       DrinksMachine dm1= new DrinksMachine(50, 10, 10);
       DrinksMachine dm2= new DrinksMachine(80, 10, 10);
       int p=0;
        
       System.out.println(raises( dm1,  dm2,  p));
        
    }
}
