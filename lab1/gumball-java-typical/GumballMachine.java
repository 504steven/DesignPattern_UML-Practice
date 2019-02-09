 

/**
 * Created by wwwsteve on 2/8/2019.
 */
public abstract class GumballMachine {
    protected int num_gumballs;
    protected int sum;

    public abstract void insertCoin(int coin);

    public abstract void turnCrank();

    public int getSum() {
        return this.sum;
    }

}
