package lab_202.lab1_gumball_java_pattern;

import java.util.Random;

public class ValueEnoughState implements State {
	GumballMachine gumballMachine;
 
	public ValueEnoughState(GumballMachine gumballMachine) {
		this.gumballMachine = gumballMachine;
	}
  
	public void insertCoin(int coin) {
		System.out.println("You can't insert another coin, as your inserted coins are already worthy for a gumball");
	}
 
	public void ejectCoin() {
		StringBuilder sb = new StringBuilder();
		for(int val : this.gumballMachine.getInsertedCoinList()) {
			sb.append(val);
			sb.append(',');
		}
		sb.deleteCharAt(sb.length()-1);
		System.out.println("Here are returned coins with value of " + sb.toString() + " cents");
		this.gumballMachine.clearInsertedCoinList();
		gumballMachine.setState(gumballMachine.getNotEnoughState());
	}
 
	public void turnCrank() {
		System.out.println("You turned successfully.");
		int remain = this.gumballMachine.getValue()-this.gumballMachine.getPrice();
		if(remain > 0) {
			System.out.println("Here are returned coins with value of " + remain + " cents");
		}
		this.gumballMachine.clearInsertedCoinList();
		gumballMachine.setState(gumballMachine.getSoldState());
	}

    public void dispense() {
        System.out.println("No gumball dispensed yet. Please turn crank.");
    }
 
	public String toString() {
		return "waiting for turning crank";
	}
}
