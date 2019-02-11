package lab_202.lab1_gumball_java_pattern;
import java.util.*;

public class GumballMachine {
	private State soldOutState;
	private State notEnoughState;
	private State valueEnoughState;
	private State soldState;

	private State state = soldOutState;
	private int count = 0;
	private int value = 0;
	private int price;
	private Set<Integer> accSet;
	private List<Integer> insertedCoinList;
 
	public GumballMachine(int count, int price, Set<Integer> accSet) {
		soldOutState = new SoldOutState(this);
		notEnoughState = new NotEnoughState(this);
		valueEnoughState = new ValueEnoughState(this);
		soldState = new SoldState(this);

		this.accSet = accSet;
		this.price = price;
		this.count = count;
		this.insertedCoinList = new LinkedList<>();
 		if (count > 0) {
			this.state = notEnoughState;
		} 
	}
 
	public void insertCoin(int coin) {
		this.state.insertCoin(coin);
	}
 
	public void ejectCoin() {
		this.state.ejectCoin();
	}
 
	public void turnCrank() {
		this.state.turnCrank();
		this.state.dispense();
	}

	void setState(State state) {
		this.state = state;
	}

	void releaseBall() {
		System.out.println("A gumball comes rolling out the slot...");
		this.count--;
	}

	public void refill(int count) {
		this.count = count;
		this.state = notEnoughState;
	}

	List<Integer> getInsertedCoinList() {
		return insertedCoinList;
	}

	void clearInsertedCoinList() {
		this.insertedCoinList.clear();
		this.value = 0;
	}

	void acceptCoin(int coin) {
		this.setValue(this.getValue()+coin);
		this.insertedCoinList.add(coin);
	}

	int getCount() {
		return this.count;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public int getValue() {
		return value;
	}

	public int getPrice() {
		return price;
	}

	public Set<Integer> getAccSet() {
		return accSet;
	}

	public State getState() {
        return this.state;
    }

    public State getSoldOutState() {
        return this.soldOutState;
    }

    public State getNotEnoughState() {
        return this.notEnoughState;
    }

    public State getValueEnoughState() {
        return this.valueEnoughState;
    }

    public State getSoldState() {
        return this.soldState;
    }
 
	public String toString() {
		StringBuffer result = new StringBuffer();
		String model;
		if(this.price == 25) {
			model = "ONE";
		}else if(this.accSet.size() == 1) {
			model = "TWO";
		}else {
			model = "THREE";
		}
		result.append("\nMighty Gumball, Inc.");
		result.append("\nJava-enabled Standing Gumball Model " + model);
		result.append("\nInventory: " + count + " gumball");
		if (count != 1) {
			result.append("s");
		}
		result.append("\n");
		result.append("Machine is " + state + "\n");
		return result.toString();
	}
}
