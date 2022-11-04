//**AUTHOR: H A TEJAN**
//***
//***
//***

import javax.swing.JOptionPane;

	public class Exercise_seven {
	
		public static void main(String[] param){

	int Basicprice = 20000;
	int Priceofsolar =5000;
	int electric = 2000;
	int sum = 0;

			String desired =UserChose();
			String solar_panel = asksolar();
			int discountpromo = Discountpromo(solar_panel, desired);
			sum = Calculation(solar_panel, desired, discountpromo, Basicprice, Priceofsolar, electric, sum);
			Overall_cost(sum, solar_panel, desired, discountpromo, Basicprice, Priceofsolar, electric);
			
		} // END main
	
	
		public static String UserChose(){
			String desired = JOptionPane.showInputDialog("Hybrid or Electric");
			return desired;

		}// End UserChose()

		public static String asksolar(){
			String solar_panel = JOptionPane.showInputDialog("Solar Panel?");
		return solar_panel;

		 }// end asksolar()

		public static int Discountpromo(String solar_panel, String desired){
		
			int discountpromo =0;
			if((solar_panel.equalsIgnoreCase("yes"))&&((desired.equalsIgnoreCase("hybrid"))||(desired.equalsIgnoreCase("electric"))))
			{	discountpromo = 500;
		
			}// END else
			else{
				discountpromo=0;

			} // END else
			return discountpromo;

		} // END Discountpromo

		public static int Calculation(String solar_panel, String desired, int discountpromo, int Basicprice, int Priceofsolar, int electric, int sum){

	if ((desired.equalsIgnoreCase("electric"))&&(solar_panel.equalsIgnoreCase("yes")))
	{
	   sum = Basicprice + Priceofsolar + electric - discountpromo;

	}

	else if ((desired.equalsIgnoreCase("hybrid"))&&(solar_panel.equalsIgnoreCase("yes")))
	{
	   sum = Basicprice + Priceofsolar - discountpromo;

	}

	else if ((desired.equalsIgnoreCase("electric"))&&(solar_panel.equalsIgnoreCase("no")))
	{
	   sum = Basicprice + electric - discountpromo;

	}

	else if ((desired.equalsIgnoreCase("hybrid"))&&(solar_panel.equalsIgnoreCase("no")))
	{
	   sum = Basicprice - discountpromo;

	}

	return sum;
	}// END calculation


	public static void Overall_cost (int sum, String solar_panel, String desired, int discountpromo, int Basicprice, int Priceofsolar, int electric)
	{

		  if ((desired.equalsIgnoreCase("electric"))&&(solar_panel.equalsIgnoreCase("yes")))
		{ 
				System.out.println("Basic Price : " + Basicprice);
				System.out.println("desired model : " + desired);
				System.out.println("solar Panel : " + Priceofsolar);
				System.out.println("electric : " + electric);
				System.out.println("Discount : " + discountpromo);
				System.out.println("Overall cost : " + sum);
		
		}

		if ((desired.equalsIgnoreCase("hybrid"))&&(solar_panel.equalsIgnoreCase("yes")))
		{ 
				System.out.println("Basic Price : " + Basicprice);
				System.out.println("desired model : " + desired);
				System.out.println("solar Panel : " + Priceofsolar);
				System.out.println("Discount : " + discountpromo);
				System.out.println("Overall cost : " + sum);
		
		}

		if ((desired.equalsIgnoreCase("electric"))&&(solar_panel.equalsIgnoreCase("no")))
		{ 
				System.out.println("Basic Price : " + Basicprice);
				System.out.println("desired model : " + desired);
				System.out.println("electric : " + electric);
				System.out.println("Discount : " + discountpromo);
				System.out.println("Overall cost : " + sum);
		
		}

		if ((desired.equalsIgnoreCase("hybrid"))&&(solar_panel.equalsIgnoreCase("no")))
		{ 
				System.out.println("Basic Price : " + Basicprice);
				System.out.println("desired model : " + desired);
				System.out.println("Discount : " + discountpromo);
				System.out.println("Overall cost : " + sum);
		
		}


		} // END Overall_Cost



	 } // END Exercise_seven

