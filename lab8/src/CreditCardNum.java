/* (c) Copyright 2018 Paul Nguyen. All Rights Reserved */

public class CreditCardNum implements IDisplayComponent, IKeyEventHandler
{

	private IKeyEventHandler nextHandler ;
	private StringBuilder number;

	public CreditCardNum() {
		this.number = new StringBuilder();
	}

    public void setNext( IKeyEventHandler next) {
    	this.nextHandler = next ;
    }	

	public String display() {
			return  number.toString();
	}	

	public void key(String ch, int cnt) {
		if ( cnt <= 16 )
			if(ch.equals("X")) {
				if(cnt < 16) {
					number.deleteCharAt(number.length()-1);
				}else if ( nextHandler != null ) {
					nextHandler.key(ch, cnt);
				}
			}else {
				number.append(ch);
			}
		else if ( nextHandler != null ) {
			nextHandler.key(ch, cnt);
		}
	}	

	public void addSubComponent( IDisplayComponent c ) {
		return ; // do nothing
	}

}