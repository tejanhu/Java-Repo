public class QuackFactory1 {
	public static Quackable createQuacker(String name) {
		return new DuckCall2(name);
	}
}