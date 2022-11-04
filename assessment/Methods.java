//**AUTHOR: H A TEJAN**
//***
//***
//***


import javax.swing.JOptionPane;


public class Methods {


public static void main (String[] args)
{

String hybbie=hybrid();
String electric=electric();
String thesolar_panel=solar_panel();
int theprice=price();
int thecalc=calculation(theprice, thesolar_panel, hybbie, electric);
print(price,solarpanel,calculation);


} // END MAIN

public static String hybrid()

{

String hybrid= JOptionPane.showInputDialog("Do you want a hybrid car? " +  ((y/n)));
 

 if (hybrid.equalsIgnoreCase ("y")) 
{

JOptionPane.showMessageDialog(null,"You chose a hybrid car.");
return hybrid;

} // END if statement



} // END hybrid



public static String electric()

{


String electric= JOptionPane.showInputDialog("Do you want a electric car? " +  ((y/n)));
 

 if (electric.equalsIgnoreCase ("y")) 
{

JOptionPane.showMessageDialog(null,"You chose an electric car.");
return electric;

} // END if statement


} // END electric



public static String solar_panel()

{

String solar= JOptionPane.showInputDialog("Do you want a solar panel? " +  ((y/n)));
 
if (solar.equalsIgnoreCase ("n")) 
{
JOptionPane.showMessageDialog(null,"You don't require a solar panel on your roof.");

return solar;



} // END if statement

else if (hybrid.equalsIgnoreCase ("y")) 
{

JOptionPane.showMessageDialog(null,"You chose a solar panel on your roof to be fitted onto your roof.");
return solar;
} // END else if statement




} // END solar_panel


public static int price()
{
String userinput= JOptionPane.showInputDialog("How much are you selling the car?");

int cost=Integer.parseInt(userinput);


return cost;


} // END price


public static int calculation(int theprice, String solarpanel, String hybbie, String electric)
{
int disc=0;
int sumof_electro_price;
int sumof_hybbie_pricey;
int sum=0;
electro_price=0;
hybbie_pricey=0;

if (electric.equals("y"))
{
int sumof_electro_price=2000;
} // END if statement

else if (hybbie.equals("y"))
{
int sumof_hybbie_pricey=70000;
} // END if statement


while (!hybbie_pricey.equals("y"))
{
if (solarpanel.equals ("y") & electro_price.equals ("n"))
{
disc = 500;

final int sum1=price+sumof_hybbie_pricey-disc;

} // END if statement

} // END while 1

while (!electro_price.equals("y"))
{
if (solarpanel.equals ("y") & hybbie_pricey.equals ("n"))
{
disc = 500;

final int sum2=price+sumof_electro_price-disc;

} // END if statement

} // END while2





} // END price






public static int print(int price,String solarpanel,int calculation)
{

int sum1 =0;
int sum2=0;

System.out.println("The basic price:  " +theprice);
if (hybbie.equals ("y") & electric.equals ("n"))
{
System.out.println("Hybrid model:  " + hybrid_price);
}

else if (hybbie.equals ("n") & electric.equals ("y"))
{
System.out.println("The Electric model:  " + elect_price);
}


System.out.println("The solar panel price:   " + price);

System.out.println("The discount price:    " + disc);

if (hybbie.equals ("y") & electric.equals ("n"))
{
System.out.println("The total is:    " + sum1);
}

else if (electric.equals ("y") & hybbie.equals ("n"))
{
System.out.println("The total is:    " + sum2);
}

return sum1;
return sum2;

} // END print



} // END Methods class
