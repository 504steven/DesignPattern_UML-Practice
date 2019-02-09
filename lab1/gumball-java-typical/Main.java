 

public class Main {

	public static void main(String[] args) {
		System.out.println("Show Case for gumballMachine type one, start with 5 gumball in the machine:");
		GumballMachine gumballMachineOne = new GumballMachineOne(5);
		System.out.println(gumballMachineOne);

		gumballMachineOne.insertCoin( 25 );
		gumballMachineOne.turnCrank();
		System.out.println(gumballMachineOne);

		gumballMachineOne.insertCoin( 25 );
		gumballMachineOne.turnCrank();
		gumballMachineOne.insertCoin( 25 );
		gumballMachineOne.turnCrank();
		System.out.println(gumballMachineOne);
		System.out.println("Show Case for gumballMachine type one end.");
		System.out.println();

		System.out.println("Show Case for gumballMachine type two, start with 5 gumball in the machine:");
		GumballMachine gumballMachineTwo = new GumballMachineTwo(5);
		System.out.println(gumballMachineTwo);

		gumballMachineTwo.insertCoin( 25 );
		gumballMachineTwo.turnCrank();
		System.out.println(gumballMachineTwo);

		gumballMachineTwo.insertCoin( 15 );
		//gumballMachineTwo.turnCrank();
		gumballMachineTwo.insertCoin( 25 );
		gumballMachineTwo.turnCrank();
		System.out.println(gumballMachineTwo);
		System.out.println("Show Case for gumballMachine type two end.");
		System.out.println();

		System.out.println("Show Case for gumballMachine type three, start with 5 gumball in the machine:");
		GumballMachine gumballMachineThree = new GumballMachineThree(5);
		System.out.println(gumballMachineThree);

		gumballMachineThree.insertCoin( 10 );
		System.out.println("current money value in the gumball machine = " + gumballMachineThree.getSum());
		gumballMachineThree.turnCrank();

		gumballMachineThree.insertCoin(50 );
		//gumballMachineTwo.turnCrank();
		gumballMachineThree.insertCoin(5 );
		System.out.println("current money value in the gumball machine = " + gumballMachineThree.getSum());
		gumballMachineThree.turnCrank();
		gumballMachineThree.insertCoin( 10 );
		gumballMachineThree.insertCoin( 25 );
		System.out.println("current money value in the gumball machine = " + gumballMachineThree.getSum());
		gumballMachineThree.turnCrank();
		System.out.println("Show Case for gumballMachine type three end.");
	}
}
