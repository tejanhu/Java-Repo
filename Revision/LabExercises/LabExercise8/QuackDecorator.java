public class QuackDecorator implements Quackable {
	private Quackable myQuackable;
	
	public QuackDecorator(Quackable theQuackable) {
		myQuackable = theQuackable;
	}
	
	public void quack() {
		ourQuackCount++;
		myQuackable.quack();
	}
	
	private static int ourQuackCount = 0;
	
	public static int getQuackCount() {
		return ourQuackCount;
	}
}