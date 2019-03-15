package fiveguys;

import java.util.List;

public class OnPattyDecorator extends ToppingDecorator {
    
	public OnPattyDecorator(Component component) {
		super(component);
	}
	
	
	@Override
	public String getDescription(String usecase) {
    		return "{{{{ " + this.component.getDescription(usecase) + " }}}}";
	}


	@Override
	public double getPrice() {
		return this.component.getPrice();
	}


	@Override
	public List<Component> getComponents() {
		// TODO Auto-generated method stub
		return null;
	}
}
