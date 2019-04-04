/* (c) Copyright 2018 Paul Nguyen. All Rights Reserved */

public class CreditCardCVC implements IDisplayComponent, IKeyEventHandler
{

	protected IKeyEventHandler nextHandler ;
	protected StringBuilder cvc;

	public CreditCardCVC() {
		this.cvc = new StringBuilder();
	}

    public void setNext( IKeyEventHandler next) {
    	this.nextHandler = next ;
    }	

	public String display() {
			return  cvc.toString();
	}	

	public void key(String ch, int cnt) {
		if (cnt >= 20) {
			if (!ch.equals("X")) {
				cvc.append(ch);
			} else {
				cvc.deleteCharAt(cvc.length() - 1);
			}
		} else if (nextHandler != null) {
			nextHandler.key(ch, cnt);
		}
	}	

	public void addSubComponent( IDisplayComponent c ) {
		return ; // do nothing
	}

}