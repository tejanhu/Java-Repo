import javax.swing.*;
class gardenwatcher
{
public static void main(String[] generis)
{
GardenWatch();
System.exit(0);
}
public static void GardenWatch()
{
int birdsB = 0;// declaring variable for birds
int i;
int[] birdscore = new int[5];// int array to take number of birds
boolean ans = true;// exits the program when condition is not met
String[] birds = new String[5];// array that stores the name of the birds

birds[0] = "Blue Tit";
birds[1] = "BlackBird";
birds[2] = "Robin";
birds[3] = "Wren";
birds[4] = "Greenfinch";

while (ans==true)// if condition is true enters loop
{
i = Integer.parseInt(JOptionPane.showInputDialog("What Bird arte you reporting?\n 0) Blue Tit \n 1)BlackBird \n 2)Robin \n 3)Wren \n 4)Greenfinsh \n or -1 to quit"));

if(i == -1)
{
ans = false; // if -1 entered , quits
watch(birds, birdscore);
break;
}
else // prints the line below
{
birdsB = Integer.parseInt(JOptionPane.showInputDialog("How many " + birds[i] +"'s are in your garden?"));
watch1(birds, birdscore,i,birdsB);
}
}
}
public static void watch(String[] birds, int[] birdscore) // method that prints out the result
{
System.out.println("Your Garden watch results are!");
for (int i = 0; i< birds.length; i++)
{
System.out.println("\t" + i + ")" + birds[i] + "\t" + birdscore[i]);
}
}
public static void watch1(String[] birds, int[] birdscore, int i,int birdsB)
{
if (birdsB >=birdscore[i])
{
birdscore[i] = birdsB;
}
}

}
