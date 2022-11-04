public class Example5 {
	public static void main(String[] args) {
		Quackable quacker = new QuackDecorator(new Duck2("Donald"));
		quacker.quack();
		
		quacker = new QuackDecorator(new DuckCall2("Duck Call"));
		quacker.quack();
		
		quacker = new Duck2("Daisy");	// OOPS!
		quacker.quack();

		System.out.println("Total # of Quacks: " + QuackDecorator.getQuackCount());
	}
}