public class Example8 {
	public static void main(String[] args) {
		Goose goose = new Goose("Gertrude");
		Quackable wrappedGoose = new GooseAdapter(goose);
		wrappedGoose.quack();
	}
}