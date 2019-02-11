package lab_202.lab1_gumball_java_pattern;

public class NotEnoughState implements State {
    GumballMachine gumballMachine;
 
    public NotEnoughState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }
 
	public void insertCoin(int coin) {
    	if(this.gumballMachine.getAccSet().contains(coin)) {
			System.out.println("You inserted a coin with value of " + coin + " cents");
			this.gumballMachine.acceptCoin(coin);
			if(this.gumballMachine.getValue() >= this.gumballMachine.getPrice()) {
				gumballMachine.setState(gumballMachine.getValueEnoughState());
			}
		}else {
    		StringBuilder sb = new StringBuilder();
    		for(int val : this.gumballMachine.getAccSet()) {
    			sb.append(val);
				sb.append(',');
			}
			sb.deleteCharAt(sb.length()-1);
			System.out.println("Sorry, ONLY coins with value of " + sb.toString() + " cents accepted");
		}
	}
 
	public void ejectCoin() {
		if(this.gumballMachine.getValue() == 0) {
			System.out.println("You haven't inserted a quarter");
		}else {
			StringBuilder sb = new StringBuilder();
			for(int val : this.gumballMachine.getInsertedCoinList()) {
				sb.append(val);
				sb.append(',');
			}
			sb.deleteCharAt(sb.length()-1);
			System.out.println("Here are returned coins with value of " + sb.toString() + " cents");
			this.gumballMachine.clearInsertedCoinList();
		}

	}
 
	public void turnCrank() {
		System.out.println("You turned failed, since there's not enough coins. The price for a gumball is " + this.gumballMachine.getPrice() + " cents.");
	 }
 
	public void dispense() {
		System.out.println("You need to pay first.");
	} 
 
	public String toString() {
		return "waiting for coins. The price for a gumball is " + this.gumballMachine.getPrice() + " cents.";
	}
}
