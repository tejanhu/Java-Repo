class ScrabbleWord implements Comparable<ScrabbleWord>
{
 private String str;
 private int score;
 public static final int[] scores = {1,3,3,2,1,4,2,4,1,8,5,1,3,1,1,3,10,1,1,1,1,4,4,8,4,10};

 public ScrabbleWord(String s)
 {
  str = s;
  String str1 = str.toUpperCase();
  score = 0;
  for(int i=0; i<str1.length(); i++)
     score+=scores[str1.charAt(i)-'A'];
 }

 public String getWord()
 {
  return str;
 }

 public int getScore()
 {
  return score;
 }

 public int compareTo(ScrabbleWord word)
 {
  return word.score-score;
 }

 public String toString()
 {
  return str+"("+score+")";
 }
}
