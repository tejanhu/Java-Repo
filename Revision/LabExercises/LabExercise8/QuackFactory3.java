public class QuackFactory3 
{
 private String surname;

 public QuackFactory3(String theName)
 {
  surname=theName;
 }

 public void setName(String theName)
 {
  surname=theName;
 }
       
 public Quackable createDuck(boolean fake,String name) 
 {
  if(fake)
    return new DuckCall2(name+" "+surname);
  else
    return new Duck2(name+" "+surname);
 }
}
