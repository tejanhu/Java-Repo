public class QuackFactory2 {
	public static Quackable createDuck(String name) {
		return new QuackDecorator(new Duck2(name));
	}
	
	public static Quackable createDuckCall(String name) {
		return new QuackDecorator(new DuckCall2(name));
	}
}