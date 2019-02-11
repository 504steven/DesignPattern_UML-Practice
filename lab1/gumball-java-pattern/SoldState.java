package lab_202.lab1_gumball_java_pattern;

public class SoldState implements State {
 
    GumballMachine gumballMachine;
 
    public SoldState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }
       
	public void insertCoin(int coin) {
		System.out.println("Please wait, as we already gave you a gumball");
	}
 
	public void ejectCoin() {
		System.out.println("No coins left in the machine");
	}
 
	public void turnCrank() {
		System.out.println("Turning twice won't get you another gumball!");
	}
 
	public void dispense() {
		this.gumballMachine.releaseBall();
		if (this.gumballMachine.getCount() > 0) {
			this.gumballMachine.setState(this.gumballMachine.getNotEnoughState());
		} else {
			System.out.println("Here is the last gumball!");
			this.gumballMachine.setState(this.gumballMachine.getSoldOutState());
		}
	}
 
	public String toString() {
		return "dispensing a gumball";
	}
}


