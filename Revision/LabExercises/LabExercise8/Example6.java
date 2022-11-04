public class Example6 {
	public static void main(String[] args) {
		Quackable quacker = QuackFactory2.createDuck("Donald");
		quacker.quack();

		quacker = QuackFactory2.createDuckCall("Duck Call");
		quacker.quack();
		
		quacker = QuackFactory2.createDuck("Daisy");
		quacker.quack();
		
		System.out.println("Total # of Quacks: " + QuackDecorator.getQuackCount());
	}
}