package fiveguys;

import java.util.List;

public class Fries implements Component {
	private String desc;
	private double price;
	private int quantity = 1;
	
	public Fries(String desc) {
		this.desc = desc;
		if(desc.startsWith("LTL")) {
			this.price = 2.79;
		}else if(desc.startsWith("Reg.")) {
			this.price = 3.79;
		}else if(desc.startsWith("Large")) {
			this.price = 5.09;
		}
	}
	
	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	@Override
	public String getDescription(String usecase) {
		String str = this.quantity + "  " + this.desc;
		if("PackingSlip".equals(usecase)) {
			//doNothing
		}
		if("Receipt".equals(usecase)) {
			str += "                 " + this.price;
		}
		return str;
	}
	
	public double getPrice() {
		return this.price;
	}
	
	@Override
	public void addComponent(Component c) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removeComponent(Component c) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Component> getComponents() {
		// TODO Auto-generated method stub
		return null;
	}

}
