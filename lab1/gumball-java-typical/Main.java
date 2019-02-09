 

public class Main {

	public static void main(String[] args) {
		System.out.println("Show Case for gumballMachine type one, start with 5 gumball in the machine:");
		GumballMachineOne gumballMachineOne = new GumballMachineOne(5);
		System.out.println(gumballMachineOne);

		gumballMachineOne.insertQuarter( 25 );
		gumballMachineOne.turnCrank();
		System.out.println(gumballMachineOne);

		gumballMachineOne.insertQuarter( 25 );
		gumballMachineOne.turnCrank();
		gumballMachineOne.insertQuarter( 25 );
		gumballMachineOne.turnCrank();
		System.out.println(gumballMachineOne);
		System.out.println("Show Case for gumballMachine type one end.");
		System.out.println();

		System.out.println("Show Case for gumballMachine type two, start with 5 gumball in the machine:");
		GumballMachineTwo gumballMachineTwo = new GumballMachineTwo(5);
		System.out.println(gumballMachineTwo);

		gumballMachineTwo.insertQuarter( 25 );
		gumballMachineTwo.turnCrank();
		System.out.println(gumballMachineTwo);

		gumballMachineTwo.insertQuarter( 15 );
		//gumballMachineTwo.turnCrank();
		gumballMachineTwo.insertQuarter( 25 );
		gumballMachineTwo.turnCrank();
		System.out.println(gumballMachineTwo);
		System.out.println("Show Case for gumballMachine type two end.");
		System.out.println();

		System.out.println("Show Case for gumballMachine type three, start with 5 gumball in the machine:");
		GumballMachineThree gumballMachineThree = new GumballMachineThree(5);
		System.out.println(gumballMachineThree);

		gumballMachineThree.insertCoin( Coin.DIME );
		System.out.println("current money value in the gumball machine = " + gumballMachineThree.getSum());
		gumballMachineThree.turnCrank();

		gumballMachineThree.insertCoin( Coin.DOLLAR );
		//gumballMachineTwo.turnCrank();
		gumballMachineThree.insertCoin( Coin.NICKEL );
		System.out.println("current money value in the gumball machine = " + gumballMachineThree.getSum());
		gumballMachineThree.turnCrank();
		gumballMachineThree.insertCoin( Coin.DIME);
		gumballMachineThree.insertCoin( Coin.QUARTER);
		System.out.println("current money value in the gumball machine = " + gumballMachineThree.getSum());
		gumballMachineThree.turnCrank();
		System.out.println("Show Case for gumballMachine type three end.");
	}
}
