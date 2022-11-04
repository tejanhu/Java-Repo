package Assessment2;

 


public class Ex3
{
   
    
    public static void Destructive(int number[],int num,int numeral){
        
        
        
      for(int i=0;i<number.length;i++){
        if(number[i]<num){
           number[i]=number[i]*numeral;
    }//END if statement
        
    } //END forloop
        
    }//END Destructive
    
    
       public static int[] Constructive(int number[],int num,int numeral){
        
      
        
        int numarr[]=new int [number.length];
        num=5;
        
      for(int i=0;i<number.length;i++){
        numarr[i]=number[i];
          if(numarr[i]<num){
            numarr[i]=numarr[i]*numeral;
    }//END if statement
        
    } //END forloop
        return numarr;
    }//END Constructive
    
    
    
    public static void main(String[] args){
        
        int number[]={7,11,13,8,5,10,20};
        int num=12;
        int numeral=5;
        
        Destructive(number,num,numeral);
        int numarr[]=Constructive(number,num,numeral);
        
       /* for(int i=0;i<number.length;i++){
            
            System.out.println(number[i]);
        }
       
        */
        
        
        
        for(int i=0;i<number.length;i++){
            
            System.out.print(numarr[i]+"| ");
        }
      
        
        
    }
    
    
    
    
}
