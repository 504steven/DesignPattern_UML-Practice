package lab_202.lab1_gumball_java_pattern;
import java.util.*;


public class Main {

	public static void main(String[] args) {
		Set<Integer> accSet = new HashSet<>();
		accSet.add(25);

		GumballMachine gumballMachineOne = new GumballMachine(5, 25, new HashSet<>(accSet));
		GumballMachine gumballMachineTwo = new GumballMachine(5, 50, new HashSet<>(accSet));
		accSet.add(5);
		accSet.add(10);
		GumballMachine gumballMachineThree = new GumballMachine(5, 50, new HashSet<>(accSet));

		//gumballMachineOne
		System.out.println(gumballMachineOne);
		gumballMachineOne.insertCoin(25);
		gumballMachineOne.turnCrank();

		System.out.println(gumballMachineOne);
		gumballMachineOne.insertCoin(25);
		gumballMachineOne.ejectCoin();
		gumballMachineOne.insertCoin(5);
		gumballMachineOne.insertCoin(25);
		gumballMachineOne.turnCrank();

		System.out.println(gumballMachineOne);

		System.out.print("------------------------------------");
		//gumballMachineTwo
		System.out.println(gumballMachineTwo);
		gumballMachineTwo.insertCoin(25);
		gumballMachineTwo.turnCrank();

		System.out.println(gumballMachineTwo);
		gumballMachineTwo.insertCoin(25);
		gumballMachineTwo.turnCrank();
		gumballMachineTwo.insertCoin(5);
		gumballMachineTwo.insertCoin(25);
		gumballMachineTwo.ejectCoin();

		System.out.println(gumballMachineTwo);

		System.out.print("------------------------------------");
		//gumballMachineThree
		System.out.println(gumballMachineThree);
		gumballMachineThree.insertCoin(25);
		gumballMachineThree.turnCrank();

		System.out.println(gumballMachineThree);
		gumballMachineThree.insertCoin(15);
		gumballMachineThree.insertCoin(5);
		gumballMachineThree.insertCoin(5);
		gumballMachineThree.insertCoin(10);
		gumballMachineThree.insertCoin(10);

		gumballMachineThree.turnCrank();

		System.out.println(gumballMachineThree);
	}
}
