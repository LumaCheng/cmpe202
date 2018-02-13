

import java.util.Random;

public class EnoughCoinState implements State {
	GumballMachine gumballMachine;

	public EnoughCoinState(GumballMachine gumballMachine) {
		this.gumballMachine = gumballMachine;
	}

	public void insertQuarter() {
		System.out.println("You can't insert another quarter");
	}

	public void insertNickel() {
		System.out.println("You can't insert another nickel");
	}

	public void insertDime() {
		System.out.println("You can't insert another dime");
	}

	public void ejectAll() {
		System.out.println("Money returned");
		gumballMachine.setState(gumballMachine.getNotEnoughCoinState());
	}
 
	public void turnCrank() {
		System.out.println("You turned...");
		gumballMachine.setState(gumballMachine.getSoldState());
	}

    public void dispense() {
        System.out.println("No gumball dispensed");
    }

	public String toString() {
		return "waiting for turn of crank";
	}
}
