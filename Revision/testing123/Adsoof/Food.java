import java.util.*;

public class Food
{
    int num;

    Food(int n){
        num=n;

    }

    public String toString()
    {

        //  return "Magherita";
        return ""+num+"";
    }

    public static void main(){

        ArrayList <Food> alist=new ArrayList();

        
        Food pizza= new Food(0);
        Food punisher= new Food(0);
        Food reggarto=new Food(0);
        
        alist.add(pizza);
        alist.add(reggarto);
        alist.add(punisher);

        for(int i=0;i<alist.size();i++){
            
            System.out.println(alist.get(i));
            
        }

        //System.out.println(pizza);

        //System.out.println(pizza.toString());
        //System.out.println(reggarto.toString());

        //System.out.println(pizza);
        //System.out.println(reggarto);
    }

}
