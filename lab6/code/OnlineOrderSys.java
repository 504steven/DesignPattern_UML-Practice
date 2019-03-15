package fiveguys;

import java.text.DecimalFormat;
import java.util.Calendar;

public class OnlineOrderSys {
	static int nextOrderNum = 1;
	static Calendar calendar = Calendar.getInstance();
	static double taxRate = 0.09;
	static DecimalFormat fmt = new DecimalFormat("0.00");
	
	public static void main(String[] args) {
//		System.out.println(new OnlineOrderSys().getClass() == OnlineOrderSys.class);
		demo();
	}
	
	private static void demo() {
		Order order = new Order(45);
		
		Burger burger = new Burger("LBB");
		burger.addTopping("LETTUCE", "OnTopBun");
		burger.addTopping("TOMATO", "OnTopBun");
		burger.addTopping("G ONION", "OnBottomBun");
		burger.addTopping("JALA Grilled", "OnBottomBun");
		
//		Burger.Builder builder = new Burger.Builder("LBB");
//		builder.addTopping("LETTUCE", "OnTopBun");
//		builder.addTopping("TOMATO", "OnTopBun");
//		builder.addTopping("G ONION", "OnBottomBun");
//		builder.addTopping("JALA Grilled", "OnBottomBun");
		
		order.addComponent( burger);
		order.addComponent( new Fries("LTL CAJ"));
		order.finish();
		
		printReceipt(order);
		System.out.println();
		System.out.println("-----------------------------------");
		System.out.println();
		printPackingSlip(order);
	}
	
	private static void printReceipt(Order order) {
		calendar.set(2016,12,1);
		System.out.println("       12/1/2016  1:46:54 PM");
		System.out.println("         FIVE GUYS Receipt");
		System.out.println();
		System.out.println("Order Number: " + order.getOrderNum());
		System.out.println();
		System.out.println(order.getDescription("Receipt"));
		System.out.println("   Sub.Total:             $" + fmt.format( order.getPrice()));
		System.out.println("   Tax:                   $" + fmt.format( taxRate * order.getPrice()));
		System.out.println("   Total:                 $" + fmt.format( (1+taxRate)*order.getPrice()));
		
	}

	private static void printPackingSlip(Order order) {
		System.out.println("Order Number: " + order.getOrderNum());
		System.out.println("      12/1/2016  1:46:54 PM");
		System.out.println("      FIVE GUYS Packing Slip");
		System.out.println();
		System.out.println("Sandwich# 1");
		System.out.println(order.getDescription("PackingSlip"));	
	}
}
