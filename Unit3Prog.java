/* Author: H A TEJAN
 * this program will display days of the week and months 
 * based on whatever integers the user types when prompted.
 */

import javax.swing.*;


public class Unit3Prog 
  {
    
    public static void main(String[] args) 
        {
            daysofweek();
            Monthofyear();
           
        }
    
     public static void daysofweek ()
        {
           String Week = null;
           String week;
           week=JOptionPane.showInputDialog("What day of the week is your flight to Hajj");
           int Weeknum=Integer.parseInt(week);
           
           if (Weeknum==1)
              { 
                  JOptionPane.showMessageDialog(null,"Monday");
                  Week.equals(Weeknum);
              } //End if statement
           
           else if (Weeknum==2)
              { 
                  JOptionPane.showMessageDialog(null,"Tuesday");
                  Week.equals(Weeknum);
              } //End else if statement
           
           else if (Weeknum==3)
              { 
                  JOptionPane.showMessageDialog(null,"Wednesday");
                  Week.equals(Weeknum);
              } //End else if statement
           
           else if (Weeknum==4)
              { 
                  JOptionPane.showMessageDialog(null,"Thursday");
                  Week.equals(Weeknum);
              } //End else if statement
            
           else if (Weeknum==5)
              { 
                  JOptionPane.showMessageDialog(null,"Friday");
                  Week.equals(Weeknum);
              } //End else if statement
           
           else if (Weeknum==6)
              { 
                  JOptionPane.showMessageDialog(null,"Saturday");
                  Week.equals(Weeknum);
              } //End else if statement
           
            else if(Weeknum==7)
              { 
                 JOptionPane.showMessageDialog(null,"Sunday");
                  Week.equals(Weeknum);
              } //End else if statement
           
          // return Week;
           
        } // END daysofweek
    
     
       public static void Monthofyear ()
        {
           String Month = null;
           String month;
           month=JOptionPane.showInputDialog("Which month is Hajj?");
           int Monthcount=Integer.parseInt(month);
           
           if (Monthcount==1)
              { 
                  JOptionPane.showMessageDialog(null,"January");
                  Month.equals(Monthcount);
              } //End if statement
           
           else if (Monthcount==2)
              { 
                  JOptionPane.showMessageDialog(null,"February");
                  Month.equals(Monthcount);
              } //End else if statement
           
           else if (Monthcount==3)
              { 
                  JOptionPane.showMessageDialog(null,"Wednesday");
                  Month.equals(Monthcount);
              } //End else if statement
           
           else if (Monthcount==4)
              { 
                  JOptionPane.showMessageDialog(null,"Thursday");
                  Month.equals(Monthcount);
              } //End else if statement
            
           else if (Monthcount==5)
              { 
                  JOptionPane.showMessageDialog(null,"Friday");
                  Month.equals(Monthcount);
              } //End else if statement
           
           else if (Monthcount==6)
              { 
                  JOptionPane.showMessageDialog(null,"Saturday");
                  Month.equals(Monthcount);
              } //End else if statement
           
            else if(Monthcount==7)
              { 
                 JOptionPane.showMessageDialog(null,"Sunday");
                  Month.equals(Monthcount);
              } //End else if statement
           
           //return Month;
           
        } // END Month
     
       
    
     
  } // END class




