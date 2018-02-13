

public class NotEnoughCoinState implements State {
    GumballMachine gumballMachine;

    public NotEnoughCoinState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

	public void insertQuarter() {
		System.out.println("You inserted a quarter");
    gumballMachine.coin += 25;
    if(gumballMachine.getCoin() >= gumballMachine.price_per_gumball)
        gumballMachine.setState(gumballMachine.getEnoughCoinState());
	}

  public void insertNickel() {
    if(gumballMachine.must_quarter){
      System.out.println("Unaccepetd Nickel! You must insert a quarter");
    }
    else{
   		System.out.println("You inserted a nickel");
      gumballMachine.coin += 5;
      if(gumballMachine.getCoin() >= gumballMachine.price_per_gumball)
          gumballMachine.setState(gumballMachine.getEnoughCoinState());
    }
 	}

  public void insertDime() {
    if(gumballMachine.must_quarter){
      System.out.println("Unaccepetd Dime! You must insert a quarter");
    }
    else{
      System.out.println("You inserted a dime");
      gumballMachine.coin += 10;
      if(gumballMachine.getCoin() >= gumballMachine.price_per_gumball)
          gumballMachine.setState(gumballMachine.getEnoughCoinState());
    }
  }

	public void ejectAll() {
    if(gumballMachine.coin == 0){
		  System.out.println("You haven't inserted any coin");
    }
    else{
      gumballMachine.coin = 0;
      System.out.println("Money returned");
    }
	}

	public void turnCrank() {
		System.out.println("You turned, but there's not enough coin");
	 }

	public void dispense() {
		System.out.println("You need to pay enough coin");
	}

	public String toString() {
		return "waiting for enough coin";
	}
}
