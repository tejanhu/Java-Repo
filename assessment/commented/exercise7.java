//**AUTHOR: H A TEJAN**
//*** The below program displays two types of cars available for sale,
//*** the user must pick the car they wish to buy between 
//*** an electric mobile or a hybrid and they must choose whether they want solar panel with it;therefore getting discount or hence not being eligible for discount due to rejecting to buy a solar panel along with the car.

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

				public static int Hybrid(){
					final int Hybridprice = 500;
					return Hybridprice;
		
				} // END Hybrid

				public static String solarPanelAsk(){
					String asksolar = JOptionPane.showInputDialog("Solar panel?");
					return asksolar;  // returning string
				} // END solarPanelAsk

				public static int Discount(String asksolar, String chose){
		
					int discount =0;
					if(asksolar.equalsIgnoreCase("yes"))
					{	discount = 500;
		
					}// END else
					else{
						discount=0;
					} // END else
					return discount;
				} // END Discount

				public static int solarPanel(){
					final int solarPrice =5000;
					return solarPrice;
				} // END solarPanel

				public static int BasicPrice(){
					final int basicPrices =20000;
					return basicPrices;
				} // END BasicPrice

				public static int calculation(int  basicPrices, int electricPrice, int Hybridprice, int discount, int solarPrice, String asksolar, String desired){
					int total =0;
	

			if ((asksolar.equals("yes")))

			{
			total = basicPrices + solarPrice-discount;
			}

			else if ((asksolar.equals("no")))
			{
			total = basicPrices;
			}

			if (desired.equals("hybrid"))
			{
			total = total+Hybridprice;
			}
			else if (desired.equals("electric"))
			{
			total = total+electricPrice;
			}


					return total;
				} // END calculation

				public static void print(String desired,  int basicPrices, int electricPrice,int Hybridprice, int discount,int solarPrice,int total){

			int desiredPrice=0;		
			if (desired.equals("hybrid")){
			desiredPrice= Hybridprice;
			}

			else {
			desiredPrice=electricPrice;
			}
					System.out.println("Basic Price :" +basicPrices);
					System.out.println(desired + " :" +desiredPrice);
					System.out.println("solar Panel :" +solarPrice);
					System.out.println("Discount :" + discount);
					System.out.println();
					System.out.println("Total :" + total);
		
				} // END print
		} // END exercise7

