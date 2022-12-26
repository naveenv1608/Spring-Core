package com.nv.flipkart;

import java.util.Arrays;
import java.util.Random;

import com.nv.courier.Courier;

public class Flipkart {
	private Courier courier;
	
	public Flipkart() {
		System.out.println("Flipkart.Flipkart() :: 0 param Constructor");
	}

	public Courier getCourier() {
		return courier;
	}

	public void setCourier(Courier courier) {
		this.courier = courier;
	}
	
	
	public String shopping(String items[],float prices[]) {
		
		float billamount =0.0f;
		
		for( int i=0;i<items.length;++i){
			billamount=billamount+prices[i];
		}
		int orderid=new Random().nextInt(1000000);
		String status=courier.deliver(orderid);
		String finalmsg=Arrays.toString(items)+" are purchased with prices "+Arrays.toString(prices)+". the Generated bill amount "+billamount;
        return finalmsg+" "+status;
}
}
