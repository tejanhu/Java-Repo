class ScrabbleWord1 implements PricedObject
{
 private String str;
 public static final int[] scores = {1,3,3,2,1,4,2,4,1,8,5,1,3,1,1,3,10,1,1,1,1,4,4,8,4,10};

 public ScrabbleWord1(String s)
 {
  str = s;
 }

 public String getWord()
 {
  return str;
 }

 public int getPrice()
 {
  String str1 = str.toUpperCase();
  int score = 0;
  for(int i=0; i<str1.length(); i++)
     score+=scores[str1.charAt(i)-'A'];
  return score;
 }

 public String toString()
 {
  return str;
 }
}
