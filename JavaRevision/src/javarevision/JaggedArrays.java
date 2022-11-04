package javarevision;



public class JaggedArrays {



             public static void main(String[] args) {

                    int jagged[][] = new int [5][];

                   

                    jagged[0] = new int[2];

                    jagged[1] = new int[4];
                    
                    jagged[2] = new int[6];
                    
                    jagged[3] = new int[8];
                    
                    jagged[4] = new int[10];

                   

                    int count =0;

                    for(int i=0; i<jagged.length; i++) {

                          for(int j=0; j<jagged[i].length; j++) {

                                 jagged[i][j] = count++;

                          }

                    }

                   

//                 for(int i=0; i>jagged.length; i++) {

//                        for(int j=0; j<jagged[i].length; j++) {

//                               System.out.println(jagged[i][j] + "");

//                        }

//                        System.out.println();

//                 }

                   

                    for(int i[] : jagged) {

                    for(int j:i) {

                          System.out.println(j + "");

                    }

                    System.out.println("");

             }

                   

      }

     

}

