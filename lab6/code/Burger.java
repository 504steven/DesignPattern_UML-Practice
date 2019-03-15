package fiveguys;

import java.util.*;

// composite
public class Burger implements Component {  
    private List<Component> components;
    private String desc;
    private double price;
    private int quantity = 1;
    
    public Burger(String desc) {
        this.components = new LinkedList<>();
        this.desc = desc;
        if(desc == null) {  
            return;
        }
        this.desc = desc;
            
        switch(desc) {
        	case "LHB":
        		this.price = 4.29;
        		break;
        	case "LCB":
        		this.addComponent( this.createTopping("CHEESE", "OnPatty"));
        		this.price = 4.99;
        		break;
        	case "LBB":
        		this.addComponent( this.createTopping("BACON", "OnPatty"));
        		this.price = 5.59;
        		break;
        	case "LBCB":
        		this.addComponent( this.createTopping("BACON", "OnPatty"));
        		this.addComponent( this.createTopping("CHEESE", "OnPatty"));
        		this.price = 5.29;
        		break;
        	default:
        		System.out.println("No Such Burger");
        }
    }
    
    @Override
    public void addComponent(Component c) {
        this.components.add(c);
    }
	
    @Override
    public void removeComponent(Component c) {
        this.components.remove(c);
    }    
    
    @Override
    public String getDescription(String usecase) {
    	String str = this.getQuantity() + "  " + this.getDesc();
    	if("PackingSlip".equals(usecase)) {
    		//doNothing
    	}
    	if("Receipt".equals(usecase)) {
    		str += "                     " + this.getPrice();	
    	}
    	for(Component c : this.getComponents()) {
    		str +=  "\n    " + c.getDescription(usecase);
    	}
    	
    	return str;
    }
    
    @Override
    public double getPrice()  {
    	double burgerTotal = this.price;
    	for(Component c : components) {
    		burgerTotal += c.getPrice();
    	}
    	return burgerTotal;
    }    
    

        
    public void addTopping(String toppingName, String position) {
    	this.addComponent( this.createTopping(toppingName, position));
    }
        
    public void removeTopping(String toppingName) {
    	Iterator<Component> iter = this.components.iterator();
    	while(iter.hasNext()) {
    		if(iter.next().getDescription(null).equals(toppingName)) {
    			iter.remove();
    			break;
    		}
    	}
    }
        
        
    // can use a ToppingFactory
    public ToppingDecorator createTopping(String toppingName, String position) {
    	if(toppingName == null || position == null) {
    		return null;
    	}
    	
    	Topping top = new Topping(toppingName);
    	ToppingDecorator topDecorator = null;
    	switch(position) {
    		case "OnTopBun":
    			topDecorator = new OnTopBunDecorator(top);
    			break;
    		case "OnBottomBun":
    			topDecorator = new OnBottomBunDecorator(top);
    			break;
    		case "OnPatty":
    			topDecorator = new OnPattyDecorator(top);
    			break;
    		default:
    	}
    	
    	return topDecorator;
    }
        
    public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}	
    
    public List<Component> getComponents() {
		return this.components;
	}

    public String getDesc() {
		return this.desc;
	}
    	


    

}
