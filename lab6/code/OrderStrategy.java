package fiveguys;  

public abstract class OrderStrategy {
    protected Component c;
    
    public OrderStrategy(Component c) {
        this.c = c;
    }
    
    public abstract void reOrder(Burger burger);    
    
    public abstract String getDescription(String usecase);
  
}
