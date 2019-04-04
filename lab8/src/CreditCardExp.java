/* (c) Copyright 2018 Paul Nguyen. All Rights Reserved */

public class CreditCardExp implements IDisplayComponent, IKeyEventHandler
{

	protected IKeyEventHandler nextHandler ;
	protected StringBuilder date;

	public CreditCardExp() {
		this.date = new StringBuilder();
	}

    public void setNext( IKeyEventHandler next) {
    	this.nextHandler = next ;
    }	

	public String display() {
			return date.toString();
	}	

	public void key(String ch, int cnt) {
		if ( cnt >= 16 && cnt <= 20  ) {
			if(!ch.equals("X")) {
				date.append(ch);
			}else {
				if(cnt < 20 ) {
					date.deleteCharAt(date.length()-1);
				}else if ( nextHandler != null ) {
					nextHandler.key(ch, cnt) ;
				}
			}
		}else if ( nextHandler != null ) {
			nextHandler.key(ch, cnt);
		}
	}	

	public void addSubComponent( IDisplayComponent c ) {
		return ; // do nothing
	}

}