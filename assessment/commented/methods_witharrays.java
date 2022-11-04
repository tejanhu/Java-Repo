//**AUTHOR: H A TEJAN**
//***
//***
//***

import javax.swing.JOptionPane;

		public class methods_witharrays
		{


			public static void main (String [] param)
			{
				String [] show= shows();
				boolean[]ArrayB=boolee (show.length);
				boolean[] ArrayB2=chosen (show,ArrayB);
				String[] theatre=theatre();
				print(ArrayB2,theatre,show);

			} // END main



			public static  String[] theatre ()
			{
				String [] chosentheatre = new String [5];
				chosentheatre[0] = "Queens Theatre";
				chosentheatre[1] = "Kings Theatre";
				chosentheatre [2] = "Prince Theatre";
				chosentheatre[3] = "Garrick Theatre";
				chosentheatre [4] = "Princess Theatre";
	               return chosentheatre;
			}// end theatre


			public static String[] shows ()
			{

			String [] show = {"Phantom of the Opera","Les Miserables", "Cats", "Chicago", "Mamma Mia"};
			return show;

			} // END shows

			public static boolean[] boolee (int n)
			{
				boolean [] ArrayB = new boolean [n];
				for(int i=0;i<n;i++)
				{
					ArrayB[i] = false;
				}// END for loop	

				return ArrayB;

					

			} // END boolee

			public static boolean[] chosen (String [] show, boolean [] ArrayB)
			{

			String [] chosenshow = new String[show.length];

			JOptionPane.showMessageDialog(null, "Please type yes if you're interested in any of the following shows.");


			for(int i=0; i<show.length; i++){
				chosenshow[i] = JOptionPane.showInputDialog(show [i]);
				if(chosenshow[i].equals("yes")){
		
					System.out.println(show [i] + " "+ chosenshow[i]);
					ArrayB[i]=true;
				}
				else if( chosenshow[i].equals("no")){
					System.out.println(show [i] + " "+ chosenshow[i]);
					ArrayB[i]=false;
				}
			}// End for

				return ArrayB;


			}// END boolean[]


			

			public static void print (boolean[] ArrayB2,String[] theatre,String[]show)
			{
				for(int i=0; i<show.length; i++){
					if(ArrayB2[i]){
						System.out.println(show[i]+": "+ theatre[i]);
					} //END if

				}//END for 

			} // END print


		} // END methods_witharrays
