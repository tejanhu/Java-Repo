import java.util.Vector;
import java.util.Enumeration;

public class QuackComposite implements Quackable {
	private Vector myQuackers = new Vector();
	
	public void addQuacker(Quackable quacker) {
		myQuackers.addElement(quacker);
	}
	
	public void quack() {
		Enumeration enumeration = myQuackers.elements();
		
		while (enumeration.hasMoreElements()) {
			Quackable quacker = (Quackable)(enumeration.nextElement());
			quacker.quack();
		}
	}
}