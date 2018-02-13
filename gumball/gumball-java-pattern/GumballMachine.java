

public class GumballMachine {

	State soldOutState;
	State notEnoughCoinState;
	State enoughCoinState;
	State soldState;

	State state = soldOutState;
	int count = 0;
  int coin;
  int type;
  int price_per_gumball;
  boolean must_quarter;

	public GumballMachine(int numberGumballs, int type) {
		soldOutState = new SoldOutState(this);
		notEnoughCoinState = new NotEnoughCoinState(this);
		enoughCoinState = new EnoughCoinState(this);
		soldState = new SoldState(this);
		this.count = numberGumballs;
    this.coin = 0;
    this.type = type;
    this.must_quarter = type < 3 ? true : false;
    this.price_per_gumball = type < 2 ? 25 : 50;
    this.state = state;
 		if (numberGumballs > 0) {
			state = notEnoughCoinState;
		}
	}

	public void insertQuarter() {
		state.insertQuarter();
	}

  public void insertNickel() {
    state.insertNickel();
  }

  public void insertDime() {
    state.insertDime();
  }

	public void ejectAll() {
		state.ejectAll();
	}

	public void turnCrank() {
		state.turnCrank();
		state.dispense();
	}

	void setState(State state) {
		this.state = state;
	}

	void releaseBall() {
		System.out.println("A gumball comes rolling out the slot...");
		if (count != 0) {
			count = count - 1;
		}
	}

	int getCount() {
		return count;
	}

  int getCoin() {
    return coin;
  }

	void refill(int count) {
		this.count = count;
		state = notEnoughCoinState;
	}

    public State getState() {
        return state;
    }

    public State getSoldOutState() {
        return soldOutState;
    }

    public State getNotEnoughCoinState() {
        return notEnoughCoinState;
    }

    public State getEnoughCoinState() {
        return enoughCoinState;
    }

    public State getSoldState() {
        return soldState;
    }

	public String toString() {
		StringBuffer result = new StringBuffer();
		result.append("\nMighty Gumball, Inc." + type);
    result.append("( price: " + price_per_gumball);
    result.append(", must quarter: " + must_quarter+ " )");
		//result.append("\nJava-enabled Standing Gumball Model #2004");
		result.append("\nInventory: " + count + " gumball");
		if (count != 1) {
			result.append("s");
		}
		result.append("\n");
		result.append("Machine is " + state + "\n");
		return result.toString();
	}
}
