public class Example4 {
	public static void main(String[] args) {
		Quackable quacker = QuackFactory1.createQuacker("Duck Call");
		quacker.quack();
	}
}