public class Example3 {
	public static void main(String[] args) {
		Quackable quacker;

		quacker = new Duck2("Donald");
		quacker.quack();
		
		quacker = new DuckCall2("Duck Call");
		quacker.quack();
	}
}