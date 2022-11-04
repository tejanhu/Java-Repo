/*
 * MR HUSSEIN AHMED TEJAN
 * The following program demonstrates a for loop in 
 * relation to an experiment made on 4 mice and 4 rats who have been tested on 5 different mazes, to test which species are better at mazes than the other and to also find the total of each species.
 */



import javax.swing.JOptionPane;    //library imports dialog boxes


public class for_loops {          

   
    public static void main(String[] args) {
   
        
        String n;                //string initialising mouse 
           
        int n1 = 1;              //*types declared as integers
        
        

        String rat1;                //string initialising rat 
        
        int rat_1 = 1;              //*types declared as integers
        
int mousetotal= 0;    //the type of the mouse total being initialised as an integer
 int rattotal= 0;      //the type of the rat total being initialised as an integer


       

       
       for(int i=1;i<=4;i++) {        //for loop
 n= JOptionPane.showInputDialog("How many mazes did mouse " + i  + " solve? ");    //*input dialog
       n1= Integer.parseInt(n);                   //string variable being converted into an integer variable
       
       JOptionPane.showMessageDialog(null,n1);     //*message dialog
       
 mousetotal=mousetotal+n1;      //sum of mice
       }
       


       
         for(int i=1;i<=4;i++) {             //for loop
   rat1= JOptionPane.showInputDialog("How many mazes did rat " + i  + " solve? "  );  //*input dialog
       rat_1= Integer.parseInt(rat1);              //string variable being converted into an integer variable
       
       JOptionPane.showMessageDialog(null, rat_1);     //*message dialog
      
         rattotal=rattotal +rat_1;     //sum of rats      
       }
      
         
        
         
         
         
         JOptionPane.showMessageDialog(null,"The mice solved" + mousetotal + " and the rats solved" + rattotal +".");
         
         if (mousetotal>rattotal){            //if statement comparing total of mice with total of rats
             JOptionPane.showMessageDialog(null,"Mice are better at mazes than rats.");   //*message dialog
         }
         
         else if (rattotal>mousetotal){       //else if statement comparing total of rats with total of mice
            JOptionPane.showMessageDialog(null,"Rats are better at mazes than mice.");    //*message dialog
         }
    }
    }

