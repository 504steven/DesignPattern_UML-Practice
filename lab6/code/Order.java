package fiveguys;

import java.util.*;

public class Order implements Component {
	private int orderNum;
    private List<Component> components;
    private OrderStrategy defaultOrderStrategy;
    private OrderStrategy packingOrderStrategy;
	
    public Order(int orderNum) {
    	this.orderNum = orderNum;
    	this.components = new LinkedList<>();
    }
	
    public void finish() {
    	this.defaultOrderStrategy = new DefaultOrderStrategy(this);
    	this.packingOrderStrategy = new PackingOrderStrategy(this);
    }
    
	public int getOrderNum() {
		return orderNum;
	}
	
	public double getPrice() {
		double total = 0.0;
		for(Component com : components) {
			total += com.getPrice();
		}
		return total;
	}

	@Override
	public String getDescription(String usecase) {
		if("Receipt".equals(usecase)) {
			return this.defaultOrderStrategy.getDescription(usecase);
		}
		if("PackingSlip".equals(usecase)) {
			return this.packingOrderStrategy.getDescription(usecase);
		}
        
        return null;
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
	public List<Component> getComponents() {
		return this.components;
	}

}
