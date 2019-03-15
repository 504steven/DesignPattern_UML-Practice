package fiveguys;

import java.util.List;

public class Topping implements Component {
	String description;
	double price = 0;
	
	public Topping(String desc) {
		this.description = desc;
	}
	
	public Topping(String desc, double price) {
		this.description = desc;
		this.price = price;
	}
	
	@Override
	public double getPrice() {
		return this.price;
	}
	
	@Override
	public String getDescription(String usecase) {
		return this.description;
	}
	
	@Override
	public void addComponent(Component c) {}
	
	@Override
	public void removeComponent(Component c) {}

	@Override
	public List<Component> getComponents() {
		return null;
	}

}
