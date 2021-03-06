

public class SoldState implements State {

    GumballMachine gumballMachine;

    public SoldState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

	public void insertQuarter() {
		System.out.println("Please wait, we're already giving you a gumball");
	}

  public void insertNickel() {
    System.out.println("Please wait, we're already giving you a gumball");
  }

  public void insertDime() {
    System.out.println("Please wait, we're already giving you a gumball");
  }

	public void ejectAll() {
		System.out.println("Sorry, you already turned the crank");
	}

	public void turnCrank() {
		System.out.println("Turning twice doesn't get you another gumball!");
	}

	public void dispense() {
		gumballMachine.releaseBall();
		if (gumballMachine.getCount() > 0) {
      gumballMachine.coin -= gumballMachine.price_per_gumball;
			gumballMachine.setState(gumballMachine.getNotEnoughCoinState());
		} else {
			System.out.println("Oops, out of gumballs!");
			gumballMachine.setState(gumballMachine.getSoldOutState());
		}
	}

	public String toString() {
		return "dispensing a gumball";
	}
}
