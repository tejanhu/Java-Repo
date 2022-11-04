package miniprojectadsoof;

import java.util.*;

class WordTest4
{
 public static void main(String[] args)
 {
  Scanner input = new Scanner(System.in);
  WordGen.initialise(input);
  System.out.print("Enter the number of words you wish to generate initially: ");
  int n = input.nextInt();
  WordStoreImp words = new WordStoreImp(n);
  for(int i=0; i<n; i++){
     words.add(WordGen.make());
  }
//  words.printItems();
  System.out.print("Enter number of words you wish to remove: ");
  n = input.nextInt();
  String[] testWords = new String[n];
  for(int i=0; i<n; i++){
     testWords[i]=WordGen.make();
  }
  List<String> somewords=Arrays.asList(testWords);
//     System.out.println("Words that are being tested to remove"+somewords);
     long time1,time2;
   int count;
  time1 = new Date().getTime();
  for(int i=0; i<n; i++){
     words.remove(testWords[i]);
  }
  time2 = new Date().getTime();
  System.out.print("Time taken to remove "+n+" words ");
  System.out.println("is "+(time2-time1)+"ms");
//  words.printItems();
 }
}

