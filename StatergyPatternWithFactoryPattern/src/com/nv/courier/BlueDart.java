package com.nv.courier;

public class BlueDart implements Courier{

	
	public BlueDart() {
		System.out.println("BlueDart.BlueDart() :: 0 - param Constructor");
	}
	@Override
	public String deliver(int orderid) {
		return orderid+" id delivered by BlueDart";
	}

}
