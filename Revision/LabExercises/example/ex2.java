

public class ex2
{
    int age;
    String name;
    String degree;
    public ex2(int ageyr,String nameofperson, String course)
    {
       
        age=ageyr;
        name=nameofperson;
        degree=course;
        
    }

    public void setAge(int n){
        
        age=n;
        
    }
    
     public void setName(String nom){
        
         name=nom;
        
    }
    
     public void setDegree(String cours){
        
        degree=cours;
        
    }
    
    
    public int getAge(){
        
        return age;
        
    }
    
    
     public String getName(){
        
        return name;
        
    }
    
    
    public String getDegree(){
        
        return degree;
    }
    
    public String toString(){
        
        return age + " ";
        
        
    }
    
    
}
