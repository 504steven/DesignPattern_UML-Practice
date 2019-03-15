package fiveguys; 

import java.util.*;

public class PackingOrderStrategy extends OrderStrategy {

    public PackingOrderStrategy(Component c) {
		super(c);
	}

	@Override
    public void reOrder(Burger burger) {  
        Collections.sort(burger.getComponents(), (c1, c2)->{
            if(c1.getClass().equals(c2.getClass())) {	return 0;}
            //OnTop, OnBottom, OnPattys
            if(c1.getClass() == OnTopBunDecorator.class ) {	return -1;}
            if(c1.getClass() == OnPattyDecorator.class ) {	return 1;}
            if(c2.getClass() == OnTopBunDecorator.class) {	return 1;}
            if(c2.getClass() == OnPattyDecorator.class ) {	return -1;}
            return 0;
        });   
    } 
	
	@Override
	public String getDescription(String usecase) {
		String str = "";
	    for(Component com : c.getComponents()) {
//	    	System.out.println(com.getClass());
	    	if(com.getClass() == Burger.class ) {
	    		this.reOrder((Burger)com);
	    	}
	        str += com.getDescription(usecase) + "\n";
	    }
	    return str;
	}
   
}