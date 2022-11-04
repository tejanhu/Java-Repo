import java.util.ArrayList;

public class Example10 {
	public static void main(String[] args) {

                QuackFactory3 factory = new QuackFactory3("Smith");

		Quackable quacker1 = factory.createDuck(false,"Donald");
		quacker1.quack();

		Quackable quacker2 = factory.createDuck(true,"Artificial");
		quacker2.quack();

                factory.setName("Jones");
		
		Quackable quacker3 = factory.createDuck(false,"Daisy");
		quacker3.quack();

                Quackable quacker4 = factory.createDuck(false,"Daniel");
                quacker4.quack();
                
                System.out.println();

                ArrayList<Quackable> quackers = new ArrayList<Quackable>();
                quackers.add(quacker4);
                quackers.add(quacker3);
                quackers.add(quacker2);
                quackers.add(quacker1);
                for(int i=0; i<quackers.size(); i++)
                    quackers.get(i).quack();
      
	}
}
