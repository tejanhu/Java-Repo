//**AUTHOR: H A TEJAN**
//***
//***
//***

import javax.swing.JOptionPane;

public class exercise7 {
	
	public static void main(String[] param){
		String desired =UserChose();
		String asksolar =solarPanelAsk();
		int electricPrice =electric();
		int Hybridprice =Hybrid();
		int discount = Discount(asksolar, desired);
		int solarPrice	=solarPanel();	
		int basicPrices =BasicPrice();
		int total = calculation(basicPrices, electricPrice, Hybridprice, discount, solarPrice, asksolar, desired);
		print(desired, basicPrices, electricPrice, Hybridprice, discount, solarPrice, total);
		
	} // END main
	
	
	public static String UserChose(){
		String desired = JOptionPane.showInputDialog("Hybrid or Electric");
		return desired;
	}// End UserChose()

	public static int electric(){
		final int electricPrice = 2000;
		return electricPrice;
	}// end electric()

