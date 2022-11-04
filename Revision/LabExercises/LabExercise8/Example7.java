public class Example7 {
	public static void main(String[] args) {
		QuackComposite quackers = new QuackComposite();
		quackers.addQuacker(new Duck2("Donald"));
		quackers.addQuacker(new Duck2("Daisy"));
		quackers.addQuacker(new Duck2("Daffy"));
		quackers.addQuacker(new DuckCall2("Duck Call"));
		
		quackers.quack();
	}
}