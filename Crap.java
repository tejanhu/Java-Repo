public class Crap{

 //static boolean contains(char c, char[] array) {
 //       for (char x : array) {
 //           if (x == c) {
 //               return true;
 //           }
 //       }
 //       return false;
 //   }


public static void main(String[] args){
String s="AGCTTTTCATTCTGACTGCAACGGGCAATATGTCTCTGTGTGGATTAAAAAAAGAGTGTCTGATAGCAGC";

int foundA=0;
int foundC=0;
int foundG=0;
int foundT=0;

char sArray[]=s.toCharArray();


//String A="A";
//String C="C";
//String G="G";
//String T="T";

for(int i=0;i<sArray.length;i++){

if(sArray[i]==('A')){

foundA=foundA+1;

}
if(sArray[i]==('C')){

foundC=foundC+1;

}
if(sArray[i]==('G')){

foundG=foundG+1;

}
if(sArray[i]==('T')){

foundT=foundT+1;

}



}
System.out.println("Guess who's back?" + " Back Again.."); 
System.out.println(foundA+" "+foundC+" "+foundG+" "+foundT);


//
//for(char letter:sArray){
//if(letter==('A')){
//
//foundA=foundA+1;
//
//}
//if(letter==('C')){
//
//foundC=foundC+1;
//
//}
//if(letter==('G')){
//
//foundG=foundG+1;
//
//}
//if(letter==('T')){
//
//foundT=foundT+1;
//
//}
//
//
//
//
//System.out.println("Guess who's back?" + " Back Again..");
//System.out.println(foundA+" "+foundC+" "+foundG+" "+foundT);
//
//}



}

// public static boolean contains(char c, char[] sArray) {
//    for (char l : sArray) {
//        if (l == c) {
//            return true;
//        }
//    }
//    return false;
//}


}