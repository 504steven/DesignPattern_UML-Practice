 

/**
 * Enumeration class Coin - write a description of the enum class here
 *
 * @author (your name here)
 * @version (version number or date here)
 */
public enum Coin
{
    NICKEL(5),DIME(10),QUARTER(25),HALFDOLLAR(50), DOLLAR(100);
    
    private int value;
    
    private Coin(int val) {
        this.value = val;
    }
    
    public int getValue() {
        return this.value;
    }

}
