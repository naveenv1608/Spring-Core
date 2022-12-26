package com.nv.courier;

public class DTDC implements Courier{
    public DTDC() {
    	System.out.println("DTDC.DTDC() :: 0 param Constructor ");
    }
	@Override
	public String deliver(int orderid) {
		return orderid+" is delivered by DTDC";
	}

}
