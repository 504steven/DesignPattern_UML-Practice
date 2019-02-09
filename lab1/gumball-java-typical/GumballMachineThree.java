 

public class GumballMachineThree
{
    private int num_gumballs;
    private int sum;

    public int getSum() {
        return sum;
    }

    public GumballMachineThree(int size )
    {
        // initialise instance variables
        this.num_gumballs = size;
        this.sum = 0;
    }

    public void insertCoin(Coin coin)
    {
        if ( Coin.NICKEL.equals(coin) || Coin.DIME.equals(coin) || Coin.QUARTER.equals(coin)) {
            this.sum += coin.getValue();
        }else {
            System.out.println( "Invalid coin. Only Nickel, Dime, Quarter are accepted." ) ;
        }
    }
    
    public void turnCrank()
    {
        if ( this.sum>=50 )
        {
            if ( this.num_gumballs > 0 )
            {
                this.num_gumballs-- ;
                this.sum -= 50 ;
                System.out.println( "Thank you for your purchase.  Gumball Ejected!" ) ;
            }
            else {
                System.out.println( "No More Gumballs!  Sorry, can't return your coin." ) ;
            }
        }else {
                System.out.println( "Please insert coins. 1 Gumball for 50 cents." ) ;
        }        
    }
}

