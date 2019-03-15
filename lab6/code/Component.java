package fiveguys;  

import java.util.*;

public interface Component {

	public void addComponent(Component c);
	
	public void removeComponent(Component c);

	public String getDescription(String usecase);
	
	public double getPrice();
	
	public List<Component> getComponents();
}
