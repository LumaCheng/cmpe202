

public class Main {

	public static void main(String[] args) {

		// GumballMachine(int gumballs, int machine_type)
		GumballMachine gumballMachine1 = new GumballMachine(5, 1);
		GumballMachine gumballMachine2 = new GumballMachine(5, 2);
		GumballMachine gumballMachine3 = new GumballMachine(5, 3);

		System.out.println("Machine Type1(25, quarter): " + gumballMachine1);
		gumballMachine1.insertQuarter( 2 );
		gumballMachine1.turnCrank();
		gumballMachine1.insertQuarter( 25 );
		gumballMachine1.turnCrank();

		System.out.println("Machine Type2(50, quarter): " + gumballMachine2);
		gumballMachine2.insertQuarter( 25 );
		gumballMachine2.turnCrank();
		gumballMachine2.insertQuarter( 25 );
		gumballMachine2.turnCrank();

		System.out.println("Machine Type3(50, anytype): " + gumballMachine3);
		gumballMachine3.insertQuarter( 49 );
		gumballMachine3.turnCrank();
		gumballMachine3.insertQuarter( 1 );
		gumballMachine3.turnCrank();

	}
}
