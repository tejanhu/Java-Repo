public class GooseAdapter implements Quackable {
	private Goose myGoose;
	
	public GooseAdapter(Goose aGoose) {
		myGoose = aGoose;
	}
	
	public void quack() {
		myGoose.honk();
	}
}