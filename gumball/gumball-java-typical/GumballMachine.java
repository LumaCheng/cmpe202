
public class GumballMachine
{

    private int num_gumballs;
    private int total_coin;
    private boolean must_quarter;
    private int price_per_gumball;

    public GumballMachine( int size , int type )
    {
        // initialise instance variables
        this.num_gumballs = size;
        this.total_coin = 0;
        this.must_quarter = type < 3 ? true : false;
        this.price_per_gumball = type < 2 ? 25 : 50;
    }

    public void insertQuarter( int coin )
    {
        if ( checkCoin(coin, must_quarter) ){
            this.total_coin += coin;
            System.out.println( "Coin Accepted! Total coin is:" +  this.total_coin) ;
        }
    }

    public boolean checkCoin( int coin, boolean must_quarter )
    {
        if (must_quarter && coin != 25){
            System.out.println( "Coin Unaccepted! Please insert quarter!" ) ;
            return false;
        }
        return true;
    }

    public void turnCrank()
    {
    	if ( this.total_coin ==  this.price_per_gumball )
    	{
    		if ( this.num_gumballs > 0 )
    		{
    			this.num_gumballs-- ;
    			this.total_coin = 0 ;
    			System.out.println( "Thanks for your coins.  Gumball Ejected!" ) ;
    		}
    		else
    		{
    			System.out.println( "No More Gumballs!  Sorry, can't return your coin." ) ;
    		}
    	}
    	else
    	{
    		System.out.println( "Please insert enough coin" ) ;
    	}
    }
}
