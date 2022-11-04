public class DuckCall2 implements Quackable {
	private String myName;
	
	public DuckCall2(String theName) {
		myName = theName;
	}

	public void quack() {
		System.out.println(myName + ": Fake Quack!");
	}
}