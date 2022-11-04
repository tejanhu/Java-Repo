//**AUTHOR: H A TEJAN**
//***
//***
//***


import javax.swing.JOptionPane;

public class unit8 {
	
	public static void main(String[] param){
		String desired =UserChose();
		String asksolar =solarPanelAsk();
		int electricPrice =electric();
		int Hybridprice =Hybrid();
		int disc = disc(asksolar, chose);
		int solarPrice	=solarPanel();	
		int basicPrices =BasicPrice();
		int total = calculation( basicPrices,electricPrice,Hybridprice, disc,solarPrice, chose);
		print(desired, basicPrices,electricPrice,Hybridprice, disc,solarPrice, total,asksolar);
		
	} // END main
	
	
	public static String UserChose(){
		String desired = JOptionPane.showInputDialog("Hybrid or Electric");
		
		return desired;
	}// End UserChose()

	public static int electric(){
		final int electricPrice = 2000;
		return electricPrice;
	}// end electric()

	public static int Hybrid(){
		final int Hybridprice = 500;
		return Hybridprice;
		
	} // END Hybrid

	public static String solarPanelAsk(){
		String asksolar = JOptionPane.showInputDialog("Solar panel?");
		return asksolar;
	} // END solarPanelAsk

	public static int disc(String asksolar, String desired){
		
		int disc =0;
		if((chose.equalsIgnoreCase("Hybrid ")) || (chose.equalsIgnoreCase("Electric")) && (asksolar.equalsIgnoreCase("yes"))){
			disc=500;
		} // END if statement
		
		
		else{
			disc=0;
		} // END else statement
		return disc;
	} // END disc

	public static int solarPanel(){
		final int solarPrice =5000;
		return solarPrice;
	} // END solarPanel

	public static int BasicPrice(){
		final int basicPrices =20000;
		return basicPrices;
	} // END BasicPrice

	public static int calculation(int  basicPrices, int electricPrice, int Hybridprice, int disc, int solarPrice, String desired){
		int total =0;
		
		if(chose.equalsIgnoreCase("Hybrid")){
			if(disc ==0){
				total = (basicPrices + Hybridprice)-disc;

			} // END if statement
			else if(disc ==500){
				total = (basicPrices + Hybridprice +solarPrice)-disc;
			} // END else if 
		} // END if statement
 
		else if(chose.equalsIgnoreCase("electric")){
			
			if(disc == 0){
				
				total = (basicPrices + electricPrice)-disc;
			} // END if statement

			else if(disc ==500){
				total = (basicPrices + electricPrice +solarPrice)-disc;
			} // END else if
		
		} // END if statement
		
		return total;
	} // END calculation

	public static void print(String desired,  int basicPrices, int electricPrice,int Hybridprice, int disc,int solarPrice,int total, String asksolar){
		System.out.println("Basic Price :" +basicPrices);
				
		if (chose.equalsIgnoreCase("Electric"))
		{			
		System.out.println(chose + " :" +electricPrice);
		} // END if statement

		else if (chose.equalsIgnoreCase("Hybrid"))

			{			
		System.out.println(chose + " :" +Hybridprice);
		} // END elseif
		
		if (asksolar.equalsIgnoreCase("Yes"))
		{ 			
		System.out.println("solar Panel :" +solarPrice);
		} // END if statement

		System.out.println("disc :" + disc);
		System.out.println();
		System.out.println("Total :" + total);
		
	} // END print

} // END unit8

