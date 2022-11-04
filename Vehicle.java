public class Vehicle {
	
	public double horsepower;
	public double aerodynamics;
	public double weight;


  

	public double retrieve_horsepower() {
	return retrieve_horsepower;
	}
	public double retrieve_aerodynamics() {
	return retrieve_aerodynamics;
	}
	public double retrieve_weight() {
	return retrieve_weight;
	}

} // END class Vehicle

public class SportCar extends Vehicle {
	public double topspeed;
	public SportCar(double Horsepower, double Weight, double TS)
	{
	horsepower= Horsepower;
	aerodynamics= 0.5;
	weight= Weight;
	topspeed= TS;
	

	}// END SportCar method
} // END class SportCar

public class TestConsumption {
	public static void main (String [] args) {
	SportCar Ferari = new SportCar(200,1500,220);
	SportCar Porsche = new SportCar(100,1000,170);
	SportCar Lamborgini = new SportCar(135,1100.2,173);

	System.out.println("Ferari's" + "" + "Fuel consumption is:" + (1000+(Ferari.weight/5)) )*(Ferari.topspeed/100)*(Ferari.aerodynamics*Ferari.horsepower)/10000);
	System.out.println("Porsche's" + "" + "Fuel consumption is:" + (1000+(Porsche.weight/5)) )*(Porsche.topspeed/100)*(Porsche.aerodynamics*Porsche.horsepower)/10000);
	System.out.println("Lamborgini's" + "" + "Fuel consumption is:" + (1000+(Lamborgini.weight/5)) )*(Lamborgini.topspeed/100)*(Lamborgini.aerodynamics*Lamborgini.horsepower)/10000);
	}
}