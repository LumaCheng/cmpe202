

public class Main {

	public static void main(String[] args) {

		// test type 1
		GumballMachine gumballMachine1 = new GumballMachine(1, 1);
		System.out.println(gumballMachine1);
		gumballMachine1.insertNickel();
		gumballMachine1.insertDime();
		gumballMachine1.turnCrank();
		gumballMachine1.insertQuarter();
		gumballMachine1.turnCrank();
		gumballMachine1.turnCrank();

		GumballMachine gumballMachine2 = new GumballMachine(2, 2);
		System.out.println(gumballMachine2);
		gumballMachine2.insertQuarter();
		gumballMachine2.turnCrank();
		gumballMachine2.insertQuarter();
		gumballMachine2.turnCrank();

		GumballMachine gumballMachine3 = new GumballMachine(2, 3);
		System.out.println(gumballMachine3);
		gumballMachine3.insertNickel();
		gumballMachine3.insertDime();
		gumballMachine3.insertDime();
		gumballMachine3.turnCrank();
		gumballMachine3.insertQuarter();
		gumballMachine3.turnCrank();

	}
}
