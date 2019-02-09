 

public class GumballMachineTwo
{

    private int num_gumballs;
    private int numOfQuarter;

    public GumballMachineTwo( int size )
    {
        // initialise instance variables
        this.num_gumballs = size;
        this.numOfQuarter = 0;
    }

    public void insertQuarter(int coin)
    {
        if ( coin == 25 )
            this.numOfQuarter++;
        else 
            System.out.println( "Invalid coin. Quarter ONLY." ) ;
    }
    
    public void turnCrank()
    {
    	if ( this.numOfQuarter>=2 )
    	{
    		if ( this.num_gumballs > 0 )
    		{
    			this.num_gumballs-- ;
    			this.numOfQuarter -= 2 ;
    			System.out.println( "Thanks for your quarter.  Gumball Ejected!" ) ;
    		}
    		else
    		{
    			System.out.println( "No More Gumballs!  Sorry, can't return your quarter." ) ;
    		}
    	}
    	else 
    	{
    		System.out.println( "Please insert quarter. 2 quarters are needed." ) ;
    	}        
    }
}
