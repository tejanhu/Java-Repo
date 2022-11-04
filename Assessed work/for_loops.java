/*
 * MR HUSSEIN AHMED TEJAN
 * The following program demonstrates a for loop in 
 * relation to an experiment made on 4 mice and 4 rats who have been tested on 5 different mazes, to test which species are better at mazes than the other and to also find the total of each species.
 */



import javax.swing.JOptionPane;    //library imports dialog boxes


public class for_loops {          

   
    public static void main(String[] args) {
   
        
        String n;                //string initialising mouse 1
        String m;                //string initialising mouse 2
        String o;                //string initialising mouse 3
        String p;                //string initialising mouse 4
        int n1 = 1;              //*types declared as integers
        int n2 = 2;             //*
        int n3 = 3;             //*
        int n4 = 4;             //*
        
       
       for(int i=1;i<=1;i++) {        //for loop
 n= JOptionPane.showInputDialog("How many mazes did mouse 1 solve?");    //*input dialog
       n1= Integer.parseInt(n);                   //string variable being converted into an integer variable
       
       JOptionPane.showMessageDialog(null,n1);     //*message dialog
       }
       
       for(int i=1;i<=1;i++) {        //for loop
       m= JOptionPane.showInputDialog("How many mazes did mouse 2 solve?");   //*input dialog
       n2= Integer.parseInt(m);                       //string variable being converted into an integer variable
       
       JOptionPane.showMessageDialog(null,n2);       //*message dialog
       }
       
       for(int i=1;i<=1;i++) {      //for loop
       o= JOptionPane.showInputDialog("How many mazes did mouse 3 solve?");  //*input dialog
       n3= Integer.parseInt(o);                        //string variable being converted into an integer variable
       
       JOptionPane.showMessageDialog(null,n3);        //*message dialog
       }
       
       for(int i=1;i<=1;i++) {      //for loop
       p= JOptionPane.showInputDialog("How many mazes did mouse 4 solve?");  //*input dialog
       n4= Integer.parseInt(p);                         //string variable being converted into an integer variable
              
       JOptionPane.showMessageDialog(null,n4);        //*message dialog
       }
       
        String rat1;                //string initialising rat 1
        String oi;                  //string initialising rat 2
        String pi;                  //string initialising rat 3
        String qi;                  //string initialising rat 4
        int rat_1 = 1;              //*types declared as integers
        int o2 = 2;                 //*
        int p2 = 3;                 //*
        int q2 = 4;                 //*
       
         for(int i=1;i<=1;i++) {             //for loop
   rat1= JOptionPane.showInputDialog("How many mazes did rat 1 solve?" );  //*input dialog
       rat_1= Integer.parseInt(rat1);              //string variable being converted into an integer variable
       
       JOptionPane.showMessageDialog(null, rat_1);     //*message dialog
       }
       
         for(int i=1;i<=1;i++) {           //for loop
       oi= JOptionPane.showInputDialog("How many mazes did rat 2 solve?");  //*input dialog
       o2= Integer.parseInt(oi);                  //string variable being converted into an integer variable
        
       JOptionPane.showMessageDialog(null, o2);        //*message dialog
       }
       
         for(int i=1;i<=1;i++) {           //for loop
       pi= JOptionPane.showInputDialog("How many mazes did rat 3 solve?");  //*input dialog
       p2= Integer.parseInt(pi);                      //string variable being converted into an integer variable
       
       JOptionPane.showMessageDialog(null, p2);        //*message dialog
       }
         
         for(int i=1;i<=1;i++) {           //for loop
       qi= JOptionPane.showInputDialog("How many mazes did rat 4 solve?");   //*input dialog
       q2= Integer.parseInt(qi);                      //string variable being converted into an integer variable
        
       JOptionPane.showMessageDialog(null, q2);       //*message dialog
       }
      
         int mousetotal;    //the type of the mouse total being initialised as an integer
         int rattotal;      //the type of the rat total being initialised as an integer
         
         mousetotal=n1+n2+n3+n4;      //sum of mice
         rattotal=rat_1+o2+p2+q2;     //sum of rats
         
         JOptionPane.showMessageDialog(null,"The mice solved" +mousetotal+ "and the rats solved"+rattotal+".");
         
         if (mousetotal>rattotal){            //if statement comparing total of mice with total of rats
             JOptionPane.showMessageDialog(null,"Mice are better at mazes than rats.");   //*message dialog
         }
         
         else if (rattotal>mousetotal){       //else if statement comparing total of rats with total of mice
            JOptionPane.showMessageDialog(null,"Rats are better at mazes than mice.");    //*message dialog
         }
    }
    }

