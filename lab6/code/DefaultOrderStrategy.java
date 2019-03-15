package fiveguys;

public class DefaultOrderStrategy extends OrderStrategy  {

    public DefaultOrderStrategy(Component c) {
		super(c);
	}

	@Override
	public void reOrder(Burger burger) {  }  // doNothing

	@Override
	public String getDescription(String usecase) {
		String str = "";
	    for(Component com : c.getComponents()) {
	        str += com.getDescription(usecase) + "\n";
	    }
		return str;
	}
}