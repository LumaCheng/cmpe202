

public class Main {

	public static void main(String[] args) {

		// GumballMachine(int gumballs, int machine_type)
		GumballMachine gumballMachine1 = new GumballMachine(5, 1);
		GumballMachine gumballMachine2 = new GumballMachine(5, 2);
		GumballMachine gumballMachine3 = new GumballMachine(5, 3);

		System.out.println(gumballMachine1);
		gumballMachine1.insertCoin( 2 );
		gumballMachine1.turnCrank();
		gumballMachine1.insertCoin( 25 );
		gumballMachine1.turnCrank();

		System.out.println(gumballMachine2);
		gumballMachine2.insertCoin( 25 );
		gumballMachine2.turnCrank();
		gumballMachine2.insertCoin( 25 );
		gumballMachine2.turnCrank();

		System.out.println(gumballMachine3);
		gumballMachine3.insertCoin( 49 );
		gumballMachine3.turnCrank();
		gumballMachine3.insertCoin( 1 );
		gumballMachine3.turnCrank();
	}
}
