public class Example9 {
	public static void main(String[] args) {
		QuackComposite flock = new QuackComposite(); 

		Goose goose = new Goose("Gertrude");
		Quackable wrappedGoose = new GooseAdapter(goose);
		flock.addQuacker(wrappedGoose);

		flock.addQuacker(new Duck2("Donald"));
		
		flock.addQuacker(new NullQuackable());
		
		flock.quack();
	}
}