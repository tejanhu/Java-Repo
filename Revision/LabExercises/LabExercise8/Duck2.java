public class Duck2 implements Quackable {
	private String myName;
	
	public Duck2(String theName) {
		myName = theName;
	}

	public void quack() {
		System.out.println(myName + ": Quack!");
	}
}