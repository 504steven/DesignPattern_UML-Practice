public class PremiumCheese extends Cheese
{
    public PremiumCheese( String d )
    {
        super(d) ;
    }
    
    public void setOptions( String[] options )
    {
        this.options = options ;
        this.price += options.length * 1.50 ;
        
    }
    
}
